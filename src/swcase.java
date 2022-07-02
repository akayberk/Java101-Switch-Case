import java.util.Scanner;
public class swcase {
    public static void main(String[] args) {
    String symbol; float a,b;
        System.out.print("Isleme girecek ilk sayiyi yaziniz");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("Isleme girecek ikinci sayiyi yaziniz");
        b = sc.nextInt();
        System.out.println("Yapmak istediginiz islemin " +  "cinsi icin \n toplama = + \n " +
                "cikarma" +  " = -" + " \n bolme = / \n carpma = * \n olacak " +  "sekilde giris " +
                "yapiniz");
        symbol = sc.next();
        switch (symbol){
            case "+":
                System.out.println("Islemin sonucu = " + (a+b));
                break;
            case "-":
                System.out.println("Islemin sonucu = " + (a-b));
                break;
            case "/":
                System.out.println("Islemin sonucu = " + (a/b));
                break;
            case "*":
                System.out.println("Islemin sonucu = " + (a*b));
                break;
            default:
                System.out.println("Lutfen islem icin yazmis oldugunuz operatoru kontrol ediniz.");

        }


    }



}
