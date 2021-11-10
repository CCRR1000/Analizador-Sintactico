
package analisisLexico;

public class MatrizLexico {
    
    private final static char[][] SIGMA = {
        /*  0 */ {'L'}, // letra
        /*  1 */ {'0'},
        /*  2 */ {'1', '2', '3', '4', '5', '6', '7', '8', '9'},     
        /*  3 */ {'_'},            
        /*  4 */ {'"'},            
        /*  5 */ {'/'},            
        /*  6 */ {'-'},            
        /*  7 */ {'+'},            
        /*  8 */ {'*'},            
        /*  9 */ {'='},            
        /* 10 */ {'('},            
        /* 11 */ {')'},        
        /* 12 */ {',', ';', ':', '\'', '<', '>'},      
        /* 13 */ {'\n'},
        /* 14 */ {' '}, 
        /* 15 */ {'\r', '\t', '\f'}
    };

    private final static int[][] MATRIZ = {
        //        ---0---1---2---3---4---5---6---7---8---9--10--11--12--13--14--
        /*  S0 */ {  4,  6,  5,  4,  1,  2,  7,  8,  9, 10, 11, 12, -1, -1, -1 },
        /*  S1 */ { 13, 13, 13, 13, -1, 13, 13, 13, 13, 13, 13, 13, 13, -1, 13 },
        /*  S2 */ { -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /*  S3 */ {  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 15,  3 },
        /*  S4 */ {  4,  4,  4,  4, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1 },
        /*  S5 */ { -1,  5,  5, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /*  S6 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /*  S7 */ { -1, -1,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /*  S8 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /*  S9 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /* S10 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /* S11 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /* S12 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /* S13 */ { 13, 13, 13, 13, 14, 13, 13, 13, 13, 13, 13, 13, 13, -1, 13 },
        /* S14 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        /* S15 */ { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    //fjañsdjflñasjdfjalñsdjfasiejñkj  jfñalskd jjalsj jjl asldj ñdj ñasd j ñasldjj ñasl j 

    public static int nuevoEstado(char ch, int estadoActual) {
        
        int nSimbol = MatrizLexico.getNumSimbolo(ch);
        
        if (nSimbol == -5) {
            return nSimbol;
        } else {
            return MatrizLexico.MATRIZ[estadoActual][nSimbol];
        }
    }

    public static int getNumSimbolo(char ch) {
        
        if (Character.isLetter(ch)) {
            return 0;  // 0 = letras

        } else {

            for (int i = 1; i < SIGMA.length; i++) {
                
                for (int j = 0; j < SIGMA[i].length; j++) {
                    
                    if (ch == SIGMA[i][j]) {
                        return i;  // retorna el numero de fila en que se encuentra el símbolo en la matriz sigma 
                    } // fin if
                    
                } // fin for-j
                
            } // fin for-i
            
        } // fin if-else

        return -5; // El caracter no pertenece al alfabeto del autómata
    }
    
}
