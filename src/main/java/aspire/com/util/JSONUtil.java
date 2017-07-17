/**
 * 
 */
package aspire.com.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.lang3.StringUtils;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

/**
 * @author aabusharar
 *
 */
public class JSONUtil {

	private static Configuration configuration;
	private String jsonpath = "$.[%s].%s";
	static {
		try {
			configuration = Configuration.builder().jsonProvider(new JacksonJsonNodeJsonProvider())
					.mappingProvider(new JacksonMappingProvider()).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readJsonFile(InputStream is, String path) {
		DocumentContext dc = JsonPath.using(configuration).parse(is);
		int length = dc.read("$.length()");
		String browserType = System.getProperty("name");
		if (StringUtils.isNotBlank(browserType)) {

			try {
				for (int i = 0; i < length; i++) {
					String name = dc.read("$.[" + i + "].name").toString();
					name = StringUtils.remove(name, "\"");
					if (browserType.equalsIgnoreCase(name)) {
						readProperties(dc, i);
					} else {
						dc.set("$.[" + i + "].execute", "false");
					}

				}

				overWrtieFile(path, dc.jsonString());
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}

	/**
	 * 
	 * @param dc
	 * @return
	 */
	private DocumentContext readProperties(DocumentContext dc, int treeLevel) {
		dc.set("$.[" + treeLevel + "].execute", "true");
		for (Object key : System.getProperties().keySet()) {
			String value = (String) key;
			try {
				dc.read("$.[" + treeLevel + "]." + value);
				dc.set("$.[" + treeLevel + "]." + value, System.getProperty(value));
			} catch (Exception e) {

			}
		}
		return dc;
	}

	/**
	 * 
	 * @param path
	 * @param jsonObj
	 * @throws IOException
	 */
	private void overWrtieFile(String path, String jsonObj) throws IOException {
		FileWriter fw = null;
		try {
			File driver = new File(path);
			fw = new FileWriter(driver, false);
			fw.write(jsonObj);
		} finally {
			if (fw != null) {
				fw.close();
			}
		}

	}

}
