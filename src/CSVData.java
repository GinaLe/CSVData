import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/***
 * A class to read/write numerical CSV files and allow easy access
 * 
 * @author gle771
 *
 */
public class CSVData {
	private static String[] columnNames;
	private static double[][] data;
	private int numRows;
	private String filePathToCSV;

	public CSVData(String filepath, String[] columnNames, int startRow) {
		this.filePathToCSV = filepath;

		String dataString = readFileAsString(filepath);
		String[] lines = dataString.split("\n");

		// number of data points
		int n = lines.length - startRow;
		this.numRows = n;
		int numColumns = columnNames.length;

		// create storage for column names
		this.columnNames = columnNames;

		// create storage for data
		this.data = new double[n][numColumns];
		for (int i = 0; i < lines.length - startRow; i++) {
			String line = lines[startRow + i];
			String[] coords = line.split(",");
			for (int j = 0; j < numColumns; j++) {
				if (coords[j].endsWith("#"))
					coords[j] = coords[j].substring(0, coords[j].length() - 1);
				double val = Double.parseDouble(coords[j]);
				data[i][j] = val;
			}
		}
	}

	private String readFileAsString(String filepath) {
		StringBuilder output = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
	}

	/***
	 * returns a new CSVData object for a file ignoring lines at the top. It
	 * uses the first row as the column names.All other data is stored as
	 * doubles
	 * 
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {

		
		return null;
	}

	/***
	 * returns a row specified by the input
	 * 
	 * @param rowIndex
	 *            row index to get row from
	 * @return a row specified by the input
	 */
	public double[] getRow(int rowIndex) {
		double[] row = new double[data.length];
		for (int i = 0; i < data[0].length; i++) {
			row[i] = data[rowIndex][i];
		}
		return row;
	}

	/***
	 * returns a column specified by the input
	 * 
	 * @param colIndex
	 *            column index to get column from
	 * @return a column specified by the input
	 */
	public double[] getColumn(int colIndex) {
		double[] column = new double[data[0].length];
		for (int i = 0; i < data.length; i++) {
			column[i] = data[i][colIndex];
		}
		return column;
	}

	/***
	 * returns multiple rows specified by the input
	 * 
	 * @param rowIndexes
	 *            row indexes to get rows from
	 * @return rows specified by input
	 */
	public static double[][] getRows(int[] rowIndexes) {
		double[][] rows = new double[rowIndexes.length][data[0].length];
		for(int i = 0; i < rowIndexes.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				rows[i][j] = data[rowIndexes[i]][j];
			}
		}
		return rows;
	}

	/***
	 * returns multiple columns specified by the input
	 * 
	 * @param colIndexes
	 *            column indexes to get columns from
	 * @return columns specified by input
	 */
	public double[][] getColumns(int[] colIndexes) {
		double[][] columns = new double[colIndexes.length][data.length];
		for(int i = 0; i < colIndexes.length; i++) {
			for(int j = 0; j < data.length; j++) {
				columns[j][i] = data[j][colIndexes[i]];
			}
		}
		return columns;
	}

	/***
	 * returns multiple columns specified by the input
	 * 
	 * @param colNames
	 *            column Names to get columns from
	 * @return columns specified by their titles
	 */
	public double[][] getColumns(String[] colNames) {
		return null;
	}

	/***
	 * sets new values for individual entries
	 * 
	 * @param rowIndex
	 *            row index where new value will be set
	 * @param colIndex
	 *            column index where new value will be set
	 * @param maxValue
	 *            maximum value of the newm value
	 */

	public void setValue(int rowIndex, int colIndex, double maxValue) {

	}

	/***
	 * sets new values in a row
	 * 
	 * @param row
	 *            row that new values will be set in
	 */
	public void setRow(int row) {

	}

	/***
	 * sets new values in a column
	 * 
	 * @param col
	 *            column that new values will be set in
	 */
	public void setColumn(int col) {

	}

	/***
	 * returns all the column titles
	 * 
	 * @return column titles
	 */
	public String[] getColumnTitles() {
		return null;
	}

	/***
	 * saves the current state of the object back into a CSV file
	 * 
	 * @param filename
	 *            file name that object will be saved into
	 */
	public void saveToFile(String filename) {

	}

}
