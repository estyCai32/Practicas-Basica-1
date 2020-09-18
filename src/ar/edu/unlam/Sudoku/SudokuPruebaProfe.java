public class SudokuPruebaProfe {

 

    public static void main(String[] args) {

 

        int[][] resolucion = {
                // 0 1 2 3 4 5 6 7 8
                { 5, 3, 9, 1, 4, 6, 8, 7, 2 }, // 0
                { 8, 4, 7, 9, 2, 5, 3, 1, 6, }, // 1
                { 2, 6, 1, 3, 7, 8, 9, 5, 4 }, // 2
                { 6, 7, 5, 4, 8, 1, 2, 9, 3 }, // 3
                { 9, 1, 2, 6, 3, 7, 5, 4, 8, }, // 4
                { 4, 8, 3, 5, 9, 2, 7, 6, 1 }, // 5
                { 3, 2, 6, 7, 1, 9, 4, 8, 5, }, // 6
                { 7, 5, 8, 2, 6, 4, 1, 3, 9 }, // 7
                { 1, 9, 4, 8, 5, 3, 6, 2, 7 } // 8
        };

 

        boolean filasOk = comprabarFilas(resolucion);
        boolean columnasOk = comprobarColumnas(resolucion);
        boolean cuadrantesOk = comprobarCuadrantes(resolucion);

 

        if (filasOk && columnasOk && cuadrantesOk) {
            System.out.println("El Sudoku es correcto");
        } else
            System.out.println("El Sudoku es incorrecto");

 

    }

 

    private static boolean comprobarCuadrantes(int[][] resolucion) {

 

        boolean chequeoCuadrante = true;

 

        for (int a = 0; a < 9; a = a + 3) {
            for (int b = 0; b < 9; b = b + 3) {
                //Entrada por cada cuadrante
                int contador = 0;
                int[] v = new int[9];

 

    
                for (int i = 0 + a; i < 3 + a; i++) {

 

                    for (int j = 0 + b; j < 3 + b; j++) {

 

                        v[contador] = resolucion[i][j];
                        contador++;

 

                    }

 

                }
                //proceso
                if (chequearArraySudoku(v) == false)
                //salida
                    return false;

 

            }

 

        }
        return chequeoCuadrante;

 

    }

 

    private static boolean comprobarColumnas(int[][] resolucion) {
        boolean chequeoColumna = true;

 

        for (int i = 0; i < 9; i++) {
            int[] v = new int[9];
            if (chequeoColumna == true) {
                for (int j = 0; j < resolucion.length; j++) {

 

                    v[j] = resolucion[i][j];
                }

 

                if (chequearArraySudoku(v) == false)
                    return false;

 

            }
        }
        return chequeoColumna;
    }

 

    private static boolean comprabarFilas(int[][] resolucion) {

 

        boolean chequeoFila = true;
        for (int i = 0; i < 9; i++) {

 

            int[] v = resolucion[i];
//        
            if (chequearArraySudoku(v) == false) 
                return false;

 

        }
        return chequeoFila;
    }

 

    public static boolean chequearArraySudoku(int[] v) {

 

        boolean encontrado = false;
        boolean cumpleTodas = false;
        for (int n = 1; n < 10; n++) {
            for (int i = 0; i < v.length; i++) {
                if (n != v[i])
                    encontrado = false;
                else {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado == true)
                cumpleTodas = true;
            else {
                cumpleTodas = false;
                break;
            }
        } // fin primer for

 

        return cumpleTodas;

 

    }

 

}
 