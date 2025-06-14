public class Temperaturas {
    public static int contarDiasCalurosos(int[][] matriz) {
    int contador = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > 30) {
                contador++;
            }
        }
    }
    return contador;
    }

    public static double promedioDiasFrescos(int[][] matriz) {
    int contador = 0;
    int suma = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] < 20) {
                suma += matriz[i][j];
                contador++;
            }
        }
    }
    return (contador > 0) ? (double) suma / contador : 0;
    }

    public static void imprimirTemperaturasExtremas(int[][] matriz) {
    System.out.println("Temperaturas Extremas:");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] < 10 || matriz[i][j] > 35) {
                System.out.println("Temperatura: " + matriz[i][j] + "°C en posición [" + i + "][" + j + "]");
            }
        }
    }
    }

    public static int[] posicionTemperaturaMasAlta(int[][] matriz) {
    int max = Integer.MIN_VALUE;
    int[] posicion = {-1, -1}; 
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > max) {
                max = matriz[i][j];
                posicion[0] = i;
                posicion[1] = j;
            }
        }
    }
    return posicion;
    }
}
