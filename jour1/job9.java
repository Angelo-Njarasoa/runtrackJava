import java.util.Scanner; 
public class job9
{
    public static void main( String [] args)
    {
        int age;
        Scanner scanner= new Scanner(System.in);
        System.out.println("donnez un age ");
        age= scanner.nextInt();
        if (age<18)
        {System.out.println("utlisateur mineur");}
        else 
        {System.out.println("utilisateur majeur");}
    }
}