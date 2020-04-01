/**
 * @(#)JamesSCY1BBCA1.java
 * @author Shari James
 * @version 1.00 2020/02/29 11:04 AM
 * 
 * PROGRAM PURPOSE: To show proof of candy purchases via a receipt, while also allowing customers to purchase more than one candy and type.
 * 
*/
import java.util.Scanner; // program uses Scanner
import java.util.Calendar; // program uses Calendar

public class JamesSCY1BBCA1 {
   public static void main(String[] args) {
   // create Scanner to obtain inputs
   Scanner input = new Scanner(System.in);
   
   System.out.printf("%nDo you want to proceed with your candy purchase?
                       \ 'Y\' or \ 'N\'  : ");
   Proceed = input.nextLine().chartAt(0);
/**
 *while proceed = 'Y'
*/
   while(character.toUpperCase(proceed) == 'Y')
     
    System.out.printf("%nFAIRYTALE SWEETS
                    + "%n%n1. Arabian Nights Chocolate Coins - 1 lb. Bag %5s%,7.2f"
                    + "%n2. Beauty and the Beast Lollipops - 1 lb. Bag %,12.2f"
                    + "%n3. Mad Hatter Jelly Beans - 1 lb. Bag %,20.2f"
                    + "%n4. Pinocchio's Candy Cones - Each %,23.2f" 
                    + "%n5. Sleeping Beauty Caramel Apples - Each %,17.2f"
                    + "%n%nEnter your choice: ", "$", 2.25, 2.50, 1.75, 0.75, 1.25"); 
    if(choice > 0)
    if(choice < 6)
    if(choice == 1)
    {
      System.out.printf("%n%n1. Arabian Nights Chocolate Coins  %5s%,7.2f") ;
                          }
    else
    {
      if(choice == 2)
      {
        System.out.printf("%n2. Beauty and the Beast Lollipops  %,12.2f") ;
                            }
    else
    {
      if(choice == 3)
      {
        System.out.printf("%n3. Mad Hatter Jelly Beans %,20.2f") ;
                            }
    else
    {
      if(choice == 4)
      {
        System.out.printf("%n4. Pinocchio's Candy Cones %,23.2f") ;
                            }
      else
      {
        System.outprintf("%n5. Sleeping Beauty Caramel Apples  %,17.2f") ;
        
      }//END else choice == 5
    }//END else choice < 3
    }//END else choice > 2
    }//END else choice > 1
     
         
/**
 * Ask customer how many candies are they buying.
*/
   System.out.printf(“%nQuantity for %s:  “,  candy) ;
     itemTotal = quantity * price
     Subtotal = subtotal + itemTotal;
     
     if(formatFirstItem == 1) 
     
     { salesReceipt += String.format("%n%s" 
                    + "%n %d @ $%.2f ea. %-24s $%,10.2f%n", candy,
                       quantity, price, " ", itemTotal); 
   
       } formatFirstItem = 0; 
       else
         
         { salesReceipt += String.format("%s"
                        + "%n %d @ $%.2f ea. %-25s %,10.2f%n", candy, quantity
                                  price, " ", itemTotal);
       
       }//END if formatFirstItem is 1 OR else formatFirstItem NOT 1 
       
        else
        {
          System.printf("%nInvalid choice! Try again.") ;
          
        }//END if choice < 6 else print error
        else
          {
          System.printf("%nInvalid choice! Try again.") ;
          
        }//END if choice > 0 else print error

salesReceipt += String.format("%n%36s %-6s $%,10.2f" 
             + "%n%36s %-7s %,10.2f"
             + "%n%n%36s %-6s $%,10.2f%n", "SUBTOTAL:    ", " ", 
                              
               subtotal, "TAX @ 8.125%:  ", " ", taxAmount, 
               "TOTAL: ", " ", total);

System.out.printf("%s", salesReceipt);
                                           
/**
 * Ask customer if they want to make another purchase.
*/
   System.out.printf("%nWould you like to make another purchase? 
                       \ 'Y\' or \ 'N\'  :  ");
    
}//END while proceed = 'Y'

  taxAmount = TAX_RATE * subtotal;
Total = taxAmount + subtotal;
  String candy = %s
System.out.printf("%s", salesReceipt);
  

System.out.printf("%n
                      
                      “FAIRYTALE SWEETS”
                      "North Star Mall"
                      "San Antonio, TX"
                      
                      Calendar dateTime = Calendar.getInstance();
                  
                  
                  
                                                                       subtotal, "TAX @ 8.125%:  ", " ", taxAmount,
                  
                                                                                        "TOTAL: ", " ", total);
                  ");
                                                    
                                               
   
  }//END main()
 }//END APPLICATION CLASS JamesSCY1BBCA1