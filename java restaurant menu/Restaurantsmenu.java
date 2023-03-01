/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsmenu;
import java.util.Scanner;

/**
 *
 * @author students
 */
public class Restaurantsmenu {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List of food and drinks sold in the restaurant
        System.out.println("Food Menu and their prices:");
        System.out.println("1. Ugali=50");
        System.out.println("2. Plain rice=40");
        System.out.println("3. Stew=50");
        
        System.out.println("Drinks and their prices:");
        System.out.println("4. Coca Cola=60");
        System.out.println("5. Fanta=60");
        System.out.println("6. Afia=70");
        
            
        //Allow user to order food or drink of his/her choice
        Scanner input= new Scanner(System.in);
        System.out.println("Name of the food you would like to add?");
            String food= input.next();
        System.out.println("Food price:");
            double foodprice= input.nextDouble();
        System.out.println("Name of drink you would like to add?");
            String drink= input.next();
        System.out.println("Drink price:");
            double drinkprice= input.nextDouble();
    
       //Order
        int foodnumber= input.nextInt();
        int drinknumber= input.nextInt();
        System.out.println("How much would you like to order");
        int totalnumber= input.nextInt();
        
         //Total amount to pay
        double Total = 0;
        if (foodnumber==1){
            Total=totalnumber*50;
        }
        else if (foodnumber==2){
            Total=totalnumber*40;
        }
        else if (foodnumber==3){
            Total=totalnumber*50;
        }
        else if (drinknumber==4){
            Total=totalnumber*60;
        }
        else if (drinknumber==5){
            Total=totalnumber*60;
        }
         else if (drinknumber==6){
            Total=totalnumber*70;
        }
        System.out.println("Total bill=" +Total );
        
        //Pay via mobile money
        System.out.println("Enter Paybill number:");
            double PaybillNumber = input.nextDouble();
        System.out.println("Enter amount to pay:");
            Double amount = input.nextDouble();
        System.out.println("Enter pin number:");
            Double PinNumber = input.nextDouble();
            
        //Payment successful
        System.out.println("Payment Successful");
        
        // TODO code application logic here
    }
    
}
