package excelpages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import aspire.com.util.EnvironmentVariables;
import jo.aspire.automation.logger.EnvirommentManager;

/// test
public class WriteXLSX {
	public static void WriteOrderID(String orderID) {
		try {
			String line = orderID;
			BufferedWriter bw = null;
			EnvironmentVariables.local = EnvirommentManager.getInstance()
					.getProperty("LOCAL").toUpperCase();

			File file = new File("reports/" + EnvironmentVariables.local
					+ "_OrdersID.txt");

			bw = new BufferedWriter(new FileWriter(file, true));

			try {

				bw.write(line);
				bw.newLine();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void WriteRegisteID(String registerID) {
		try {
			String id = registerID;
			BufferedWriter bw = null;
			File file = new File("reports/" + EnvironmentVariables.local
					+ "_Register.txt");// src/test/resources/register.txt

			bw = new BufferedWriter(new FileWriter(file, true));

			try {

				bw.write(id);
				bw.newLine();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
