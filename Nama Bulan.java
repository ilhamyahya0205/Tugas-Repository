import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] namaBulan = {
        " Januari ",
        " Februari ",
        " Maret ",
        " April ",
        " Mei ",
        " Juni ",
        " Juli ",
        " Agustus ",
        " September",
        " Oktober",
        " November ",
        " Desember ",
    };
        System.out.print("");
        int nomor = input.nextInt();
        
try {
            String hasil = namaBulan[nomor-1];
            System.out.println(hasil);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nomor tidak valid");
        }

    }
}