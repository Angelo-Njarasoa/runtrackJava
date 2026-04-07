import java.util.Scanner;
public class job5
{public static void main (String [] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1er nb ");
    double nb1 = scanner.nextDouble();
    System.out.println("2e nb ");
    double nb2 = scanner.nextDouble();
    System.out.println(" 3e nb ");
    double nb3 = scanner.nextDouble();
    if (nb1 >= nb2 && nb1 >nb3 )
    {
    System.out.println("le nombre le plus grand est " + nb1);
}
    else if (nb2>= nb1 && nb2 >=nb3 )
{
    System.out.println("le nombre le plus grand est " + nb2);
}
    else {
    System.out.println("le nombre le plus grand est " + nb3);};
        }
    }
 