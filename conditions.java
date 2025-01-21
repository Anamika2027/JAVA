//1st program

import java.util.Scanner;
public class conditions{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int age= ob.nextInt();
        if(age>18)
        {
           System.out.println("Adult"); 
        }
        else{
            System.out.println("Not Adult");
        }
    }
}

//2nd program;

// import java.util.Scanner;
// public class conditions{
//     public static void main(String[] args)
//     {
//         Scanner ob=new Scanner(System.in);
//         int num=ob.nextInt();
//         if(num%2==0)
//         {
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }

// 3rd program

// import java.util.Scanner;
// public class conditions{
//     public static void main(String[] args)
//     {
//         Scanner ob=new Scanner(System.in);
//         int num1=ob.nextInt();
//         int num2=ob.nextInt();
//         if(num1==num2){
//             System.out.println("Equal");
//         }
//         else if(num1>num2){
//             System.out.println("num1 is greater");
//         }
//         else{
//             System.out.println("num2 is greater");
//         }
//     } 
// }

// 4th program

import java.util.Scanner;
public class conditions{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int button=ob.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }
    }
}
