import java.util.Scanner ;
public class job8
{public static void main( String [] args)
    {
        int n;
        int sum=0;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("tapez le nombre n");
        n = scanner.nextInt();

        for(i=1;i<=n;i++)
        {sum= sum + i*i*i;}

        System.out.println("la somme de cubes  est  "+ sum);


    }
}