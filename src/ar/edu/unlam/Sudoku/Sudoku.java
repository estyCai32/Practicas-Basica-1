package ar.edu.unlam.Sudoku;

public class Sudoku {
   public static void main(String[] args) {
	   
	   int [][]tablero=
	  {{5,3,9,1,4,6,8,7,2},
	   {8,4,7,9,2,5,3,1,6,},
	   {2,6,1,3,7,8,9,5,4},
	   {6,7,5,4,8,1,2,9,3},
	   {9,1,2,6,3,7,5,4,8,},
	   {4,8,3,5,9,2,7,6,1},
	   {3,2,6,7,1,9,4,8,5,},
	   {7,5,8,2,6,4,1,4,9},
	   {1,9,4,8,5,3,6,2,7}};
	   
	   
	   boolean check_fila=check_fila(tablero);
	   boolean check_columna=check_columnas(tablero);
	   boolean check_cuadrantes=check_cuadrantes(tablero);
     
	   if (check_cuadrantes && check_columna && check_fila) {
		System.out.println("El sudoku es correcto");
	   }
	   else
		   System.out.println("ERROR");
	   
	   
  }



   	  private static boolean check_siSeRepite(int[] tablero) {
		  
		  for (int i = 1; i <= 9; i++) {
			int contadorDeRepetidos=0;
			
			  for (int j = 0; j < tablero.length; j++) {
			    if(tablero[j] == i) {
			    	contadorDeRepetidos++;
			    }
			   }
			 
			  if(contadorDeRepetidos != 1) {
				  return false;
			  }
			 
		  }
		  
		return true;
	  }

	  private static boolean check_fila(int[][] tablero) {
   
    	  for (int i = 0; i < tablero.length; i++) {
    		  boolean corroborarFila=check_siSeRepite(tablero[i]);
    		  if(corroborarFila==false){
    			  return false;
    		  }
		  }
 
	    return true;
      }
   
      private static boolean check_columnas(int[][] tablero) {
	      
    	  int []arrayaux= new int [9];
   	      
    	  for (int j = 0; j < arrayaux.length; j++) {
				
   	      for (int i=0; i < tablero.length; i++) {	   
   	    	  arrayaux[i]=tablero[i][j];   	
   	      }
   	      
   	      boolean check=check_siSeRepite(arrayaux);
   	      if(check==false)
   	    	  return false;
   	      
    	  }
	   
       return true;
      }

      private static boolean check_cuadrantes(int[][] tablero) {
	     int [] c1= {tablero[0][0],tablero[0][1],tablero[0][2],
	    		       tablero[1][0],tablero[1][1],tablero [1][2],
	    		       tablero[2][0],tablero[2][1],tablero [2][2]};
	     if(check_siSeRepite(c1)==false)
	    	 return false;
	     
	     
	     int[]c2= {tablero[0][3],tablero[0][4],tablero[0][5],
  		             tablero[1][3],tablero[1][4],tablero [1][5],
  		             tablero[2][3],tablero[2][4],tablero [2][5]};
	     
	     if(check_siSeRepite(c2)==false)
	    	 return false;
	     
	     int []c3={tablero[0][6],tablero[0][7],tablero[0][8],
		             tablero[1][6],tablero[1][7],tablero [1][8],
		             tablero[2][6],tablero[2][7],tablero [2][8]};
	     if(check_siSeRepite(c3)==false)
	    	 return false;
	     
	     int []c4={tablero[3][0],tablero[3][1],tablero[3][2],
  		           tablero[4][0],tablero[4][1],tablero [4][2],
  		           tablero[5][0],tablero[5][1],tablero [5][2]};
	     if(check_siSeRepite(c4)==false)
	    	 return false;
	     
	     int[]c5= {tablero[3][3],tablero[3][4],tablero[3][5],
		           tablero[4][3],tablero[4][4],tablero [4][5],
		           tablero[5][3],tablero[5][4],tablero [5][5]};
	     if(check_siSeRepite(c5)==false)
	    	 return false;
	     
	     int []c6={tablero[3][6],tablero[3][7],tablero [3][8],
	               tablero[4][6],tablero[4][7],tablero [4][8],
	               tablero[5][6],tablero[5][7],tablero [5][8]};
	     if(check_siSeRepite(c6)==false)
	    	 return false;
	     
	     int []c7={tablero[6][0],tablero[6][1],tablero[6][2],
		           tablero[7][0],tablero[7][1],tablero [7][2],
		           tablero[8][0],tablero[8][1],tablero [8][2]};
	     if(check_siSeRepite(c7)==false)
	    	 return false;
	     
	     int[]c8= {tablero[6][3],tablero[6][4],tablero [6][5],
		           tablero[7][3],tablero[7][4],tablero [7][5],
		           tablero[8][3],tablero[8][4],tablero [8][5]};
	     if(check_siSeRepite(c8)==false)
	    	 return false;
	     
	     int []c9={tablero[6][6],tablero[6][7],tablero [6][8],
	               tablero[7][6],tablero[7][7],tablero [7][8],
	               tablero[8][6],tablero[8][7],tablero [8][8]};
	     if(check_siSeRepite(c9)==false)
	    	 return false;
	     
	     
	   return true;
      } 

      
      private static void imprimirArray(int[] arrayaux) {
		for (int i = 0; i < arrayaux.length; i++) {
			System.out.println(arrayaux[i]);
		}
		
	}
	  
}