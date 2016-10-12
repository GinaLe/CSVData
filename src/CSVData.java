/***
 * A class to read/write numerical CSV files and allow easy access
 *  
 * @author gle771
 *
 */
public class CSVData {
	private String[] columnNames;
	private double[][] data;

		public CSVData(String[] columnNames, double[][] data) {
		super();
		this.columnNames= columnNames;
		this.data = data;
	}
		public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames) {
			return null;
		}
		/***
		 * returns a new CSVData object for a file ignoring lines at the top.
		 * It uses the first row as the column names.All other data is stored
		 * as doubles
		 * @param filename the file to read
		 * @param numLinesToIgnore number of lines at the top to ignore
		 * @return a CSVData object for that file
		 */
		public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
			return null;
		}

	


}
