
public class CSVDataTester {
	public static void main(String[] args) {
		String[] columnNames ={"time", "gyro-x", "gyro-y", "gyro-z"};
		String filePath = CSVData.readFileAsString("E:/Gina APCS/GyroTest2out.csv");
		CSVData file = new CSVData(filePath, columnNames, 0);
		
		System.out.println(file);
	}

}
