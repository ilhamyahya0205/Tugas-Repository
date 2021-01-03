class Main {
   public static void main(String[] args) {
       int[] angka = {4,2,3,3,2,4,6,7,3,9};
       
        System.out.println(ujian(angka));

    }

    public static int ujian(int[] angka) {

        int hitung =1, hitung1 =1;
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > angka[i - 1]) {
               hitung++;
            } else {
                hitung = 1;
            }
            if (hitung >= hitung1) {
                hitung1 = hitung;
            }
        }
        return hitung1;
    }
}
