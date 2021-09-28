import java.util.Scanner;
class Arraydemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[];
        int n,i,sum=0;
        System.out.println("Enter array size");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements are ");
        for(i=0;i<n;i++)
        {
            System.out.println(""+arr[i]);
        }
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average of elements is "+(float)sum/n);

    }
}
