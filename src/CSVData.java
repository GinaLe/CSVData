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
		 * @param rowIndex row index to get row from
		 * @return a row specified by the input
		 */
		public double[] getRow(int rowIndex) {
			return null;
		}
		
		/***
		 * returns a column specified by the input
		 * @param colIndex column index to get column from
		 * @return a column specified by the input
		 */
		public double[] getColumn(int colIndex) {
			return null;
		}
		
		/***
		 * returns multiple rows specified by the input 
		 * @param rowIndexes row indexes to get rows from
		 * @return rows specified by input
		 */
		public static double[][] getRows(int[] rowIndexes) {
			return null;
		}
		
		/***
		 * returns multiple columns specified by the input
		 * @param colIndexes column indexes to get columns from
		 * @return columns specified by input
		 */
		public double[][] getColumns(int[] colIndexes) {
			return null;
		}
		
		/***
		 * returns multiple columns specified by the input
		 * @param colNames column Names to get columns from
		 * @return columns specified by their titles
		 */
		public double[][] getColumns(String[] colNames) {
			return null;
		}
		
		/***
		 * sets new values for individual entries
		 * @param rowIndex row index where new value will be set
		 * @param colIndex column index where new value will be set
		 * @param maxValue maximum value of the newm value
		 */
		
		public void setValue(int rowIndex, int colIndex, double maxValue) {
			
		}
		
		/***
		 * sets new values in a row
		 * @param row row that new values will be set in
		 */
		public void setRow(int row) {
			
		}
		
		/***
		 * sets new values in a column
		 * @param col column that new values will be set in
		 */
		public void setColumn(int col) {
			
		}
		
		/***
		 * returns all the column titles
		 * @return column titles
		 */
		public String[] getColumnTitles() {
			return null;
		}
		
		/***
		 * saves the current state of the object back into a CSV file 
		 * @param filename file name that object will be saved into
		 */
		public void saveToFile(String filename) {
			
		}

}
