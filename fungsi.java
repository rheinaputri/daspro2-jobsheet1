public class fungsi {
    public static void penjualan(int[][] stokBunga, int[] hargaBunga) {
        System.out.println("Pendapatan perCabang");
        System.out.println("============================");
        System.out.println("============================");

        for (int i = 0; i < stokBunga.length; i++) {
            int hasilJual = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                hasilJual += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Royal Garden " + (i + 1) + ": Rp. " + hasilJual);
        }
    }

    public static void scanStock(int [][] stokBunga) {
        System.out.println("============================");
        System.out.println("Pengecekan stock Royal Gadren 4");
        System.out.printf(" %-10s  %-10s  %-10s  %-10s  %n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        
        int penguranganStok[] = { 1, 2, 0, 5 };
        for (int i = 3; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                stokBunga[i][j] = stokBunga[i][j] - penguranganStok[j];
            
                System.out.printf(" %-10s ", stokBunga[i][j]);
            } }

    }
    
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        
        // fungsi pertama
        penjualan(stokBunga, hargaBunga);
        System.out.println();
        // fungsi kedua
        scanStock(stokBunga);
    }
}