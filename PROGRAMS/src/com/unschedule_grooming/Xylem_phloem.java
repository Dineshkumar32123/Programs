import java.util.Scanner;

public class Xylem_phloem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i=0,meansum=0,last,first_and_last=0;
        System.out.println("Enter the number: ");
        for ( i = sc.nextInt(),last=i%10,i=i/10;i>9;i=i/10){
            meansum=meansum+i%10;
        }
        first_and_last=i+last;
        String res=(meansum==first_and_last)?"Xylem":"Phloem";
        System.out.println(res);
    }
}
