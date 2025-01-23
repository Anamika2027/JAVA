problem 1: print given string
import java.util.Scanner;
public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name); //function call
    }
}

problem2: calculate sum
import java.util.Scanner;
public class functions{
    public static int printSum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=printSum(num1,num2);
        System.out.println(sum);
    }
}

problem3: return the product of given two numbers

import java.util.Scanner;
public class functions{
    public static int printProduct(int num1,int num2){
        int product=num1*num2;
        return product;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int product = printProduct(num1,num2);
        System.out.println(product);
    }
}

problem 4: find the factorial

import java.util.Scanner;
public class functions{
    public static void printFactorial(int num){
        if(num<0){
            System.out.println("Invalid number.");
            return;
        }
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
}
