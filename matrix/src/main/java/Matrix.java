
class Matrix {
    int[][] matrix;
    int noRows;

    Matrix(String matrixAsString) {
        String[] arrayStrings = matrixAsString.split("\\n");
        noRows = arrayStrings.length;
        matrix = new int[noRows][];
        for (int i = 0; i < noRows; i++) {
            String[] row = arrayStrings[i].split(" ");
            int matrixRow[] = new int[row.length];
            for (int j = 0; j < row.length; j++) {
                matrixRow[j] = Integer.parseInt(row[j]);
            }
            matrix[i] = matrixRow;
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[noRows];
        for (int i = 0; i < noRows; i++) {
            col[i] = matrix[i][columnNumber - 1];
        }
        return col;
    }
}
