import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bilangan = 0;
    int ganjil = 0;
    try {
      while(true){
        bilangan = input.nextInt();
        if (bilangan % 2 != 0) {
          ganjil++;
        }
      }
    }
    catch(NumberFormatException ex){
      System.out.println( ganjil);
    }
    catch(Exception ex) {
      System.out.println( ganjil);
    }
  }
}