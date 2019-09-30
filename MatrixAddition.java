import java.util.Scanner;

class MatrixAddition{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] firstMatrix = matrix(row,column);
        int[][] secondMatrix = matrix(row,column);
        int[][] addedMatrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                addedMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(addedMatrix[i][j]);
            }
        }

    }

    static int[][] matrix(int row, int column){
        Scanner scanner = new Scanner(System.in);
        int[][] matrixFinal = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrixFinal[i][j] = scanner.nextInt();
            }
        }
        return matrixFinal;
    }
}