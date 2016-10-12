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
		/***
		 * returns a row specified by the input
		 * @param rowIndex what row to get
		 * @return a row specified by the input
		 */
		public double[] getRow(int rowIndex) {
			return null;
		}
		
		/***
		 * returns a column specified by the input
		 * @param colIndex what column to get
		 * @return a column specified by the input
		 */
		
		public double[] getColumn(int colIndex) {
			return null;
		}
		
		public static double[][] getRows(int[] rowIndexes) {
			return null;
		}
		
		public double[][] getColumns(int[] colIndexes) {
			return null;
		}
		
		public double[][] getColumns(String[] colNames) {
			return null;
		}
		
		public void setValue(int rowIndex, int colIndex, double maxValue) {
			
		}
		
		public void setRow(int row) {
			
		}
		
		public void setColumn(int col) {
			
		}
		
		public String[] getColumnTitles() {
			return null;
		}
		
		public void saveToFile(String filename) {
			
		}

}
