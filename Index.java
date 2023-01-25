import java.util.Scanner;

class Index{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name ");
        String name = scanner.nextLine();

        System.out.println("Enter the age of the student ");
        int age = Integer.parseInt(scanner.nextLine());


        System.out.println("The name os the student is : "+ name);

        System.out.println("The age of the student is : "+ age);

        int a = 10;
        int b = 30;

        System.out.println(a);
        System.out.println(b);
    }
}
