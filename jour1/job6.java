import java.util.Scanner;
public class job6 {
    public static void main(String[] args) {
        int somme=0;
        int nb ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("1er entier: ");
        nb= scanner.nextInt();
        somme= somme + nb ;

        System.out.println("2e entier: ");
        nb= scanner.nextInt();
        somme= somme + nb ;

        System.out.println("3e entier: ");
        nb= scanner.nextInt();
        somme= somme + nb ;

        System.out.println("4e entier: ");
         nb= scanner.nextInt();
         somme= somme + nb ;
        
        System.out.println("5e entier: ");
        nb= scanner.nextInt();
        somme= somme + nb ;

        System.out.println("la moyenne est " + somme/5.0);

    
        
    }
}
