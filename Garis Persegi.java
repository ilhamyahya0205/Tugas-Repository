import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        
        for(int i=0;i<angka;i++){
            System.out.print("#");
        }
        System.out.println();
        for(int i=0;i<angka-2;i++){
            System.out.print("#");
            for(int j=0;j<angka-2;j++){
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int i=0;i<angka;i++){
            System.out.print("#");
        }
        System.out.println();
    }
}