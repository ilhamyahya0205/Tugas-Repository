import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("");
    int nilai = input.nextInt();
    
    if (nilai > 75) {
      System.out.println("Sangat Bagus");
    } else if (nilai >= 55) {
      System.out.println("Bagus");
    } else {
      System.out.println("Kurang");
    }
    
  }
}