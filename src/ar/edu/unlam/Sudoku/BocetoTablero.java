package ar.edu.unlam.Sudoku;

public class BocetoTablero {
    public static void main(String [] args) {
    		   
    		
    		   int [][]tablero=
    		  {{5,3,9,1,4,6,8,7,2},
    		   {8,4,7,9,2,5,3,1,6,},
    		   {2,6,1,3,7,8,9,5,4},
    		   {6,7,5,4,8,1,2,9,3},
    		   {9,1,2,6,3,7,5,4,8,},
    		   {4,8,3,5,9,2,7,6,1},
    		   {3,2,6,7,1,9,4,8,5,},
    		   {7,5,8,2,6,4,1,3,9},
    		   {1,9,4,8,5,3,6,2,7}};

    		        boolean chequeoColumna = true;

    		 

    		    for (int i = 0; i < 9; i++) {
    		         int[] v = new int[9];
    		         if (chequeoColumna == true) {
    		                for (int j = 0; j < resolucion.length; j++) {

    		 

    		                    v[j] = resolucion[i][j];
    		                }
    		                
    		                if (chequearArraySudoku(v) == true)
    		                    chequeoColumna = true;
    		                else {
    		                    chequeoColumna = false;
    		                    break;

    		 

    		                }
    		            } else
    		                break;
    		        }
    		      
	
	
	
	
	
	
	
	
	
	
}
}
