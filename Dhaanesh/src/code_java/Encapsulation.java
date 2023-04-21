package code_java;
import java.util.Scanner;
class Encapsulation{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Price of a ticket :");
        float price=sc.nextFloat();
        System.out.println("Enter Number for Persons :");
        int num=sc.nextInt();
        int count=1;
        
        while(count<=num){
            System.out.printf("Enter Details of Person %d :",count);
            System.out.println("\nName :");
            String name=sc.next();
            System.out.println("Gender (M or F) :");
            char gender=sc.next().charAt(0);
            System.out.println("Age :");
            int age=sc.nextInt();
            
            Ticket t=new Ticket(name,gender,age,price,num);
            
            if(count==num) {
            	t.display();
            }
            count++;
            
        }
        sc.close();
    }
}