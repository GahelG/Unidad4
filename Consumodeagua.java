package consumodeagua;


public class Consumodeagua {

    public static void main(String[] args) {
        int[][] casas = {
            {100, 50, 30, 120, 60},
            {32, 122, 16, 80, 90},
            {45, 100, 56, 26, 36},
            {6, 110, 72, 33, 40}
        };
        System.out.println("Promedio de consumo de agua  por casa:");
        Consumodeagua.PromPorCasa(casas);
        System.out.println("Consumo por dia");
        Consumodeagua.PromPorDia(casas);
    }

    public static void PromPorCasa(int[][] casas) {
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            for (int j = 0; j < 5; j++) {
                suma += casas[i][j];
            }
            System.out.println(suma);
        }

    }

    public static void PromPorDia(int[][] dias) {
        for (int columnas = 0; columnas < 5; columnas++) {
            int suma = 0;
            for (int filas = 0; filas < 4; filas++) {
                suma += dias[filas][columnas];

            }
            System.out.println(suma);
        }

    }

}

