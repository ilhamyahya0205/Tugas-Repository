import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("");
    int angka = input.nextInt();
    String salam = ("Selamat datang di jurusan ");
    String jurusan1 = ("Teknik Informatika");
    String jurusan2 = ("Sistem Informasi");
    String jurusan3 = ("Teknik Elektro");
    String jurusan4 = ("Teknik Industri");
    String jurusan5 = ("Matematika Terapan");
    switch ( angka ) {
      case 1:
        System.out.println(salam+jurusan1);
        break;
        case 2: 
          System.out.println(salam+jurusan2);
          break;
          case 3:
            System.out.println(salam+jurusan3);
            break;
            case 4:
            System.out.println(salam+jurusan4);
            break;
            case 5:
              System.out.println(salam+jurusan5);
    }
  }
}