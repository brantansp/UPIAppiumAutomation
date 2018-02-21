package testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessOutputExample {
	public static void main(String[] arguments) {
		String Output = getProcessOutput();	
		String Output1=getData("adb shell dumpsys input_method | grep mInputShown");
		System.out.println(Output1);
		if(Output1.contains("true"))
		{
			System.out.println("Present");
			
		}
		else
		{
			System.out.println("Not present");
		}
		System.out.println(Output.substring(Output.indexOf("level:")+7,Output.indexOf("level:")+9));
		System.out.println(Output1);
	}

	public static String getProcessOutput() {
		StringBuilder processOutput = null;
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("adb", "shell","dumpsys","battery");
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			processOutput = new StringBuilder();
			try (BufferedReader processOutputReader = new BufferedReader(
					new InputStreamReader(process.getInputStream()));) {
				String readLine;
				while ((readLine = processOutputReader.readLine()) != null) {
					processOutput.append(readLine + System.lineSeparator());
				}
				process.waitFor();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return processOutput.toString().trim();
	}
	

public static String getData(String command) {
	StringBuilder processOutput = null;
	try {
		//String command = "adb shell dumpsys battery";
		Process process = Runtime.getRuntime().exec(command);
		processOutput = new StringBuilder();
		try (BufferedReader processOutputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));) {
			String readLine;
			while ((readLine = processOutputReader.readLine()) != null) {
				processOutput.append(readLine + System.lineSeparator());
			}
		} catch (IOException e) {
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	return processOutput.toString().trim();
}
}