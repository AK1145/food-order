import java.util.*;
class foodorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tomato your online kitchen");
        System.out.println("Choose between the categories\n\t1.Veg \n\t2.Non-veg");
        int a = sc.nextInt();
        int q;
        float p;
        if(a == 1){
            while(true) {
                System.out.println("\nYou have choosed veg.\nPlease select the variety you want to continue the order with");
                System.out.println("\t1.Vegetable biryani \n\t2.Mushroom biryani \n\t3.Fried rice \n\t4.Noodles \n\t5.Pizza");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("\nYou have choosen Vegetable biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break; 
    
                    case 2:
                    System.out.println("\nYou have choosen Mushroom biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
    
                    case 3:
                    System.out.println("\nYou have choosen Fried rice.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
    
                    case 4:
                    System.out.println("\nYou have choosen Noodles.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
    
                    case 5:
                    System.out.println("\nYou have choosen Pizza.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
                }
                System.out.println("\nDo you want to order any other items\n\t1.yes \n\t2.no");
                int any = sc.nextInt();
                if(any == 1){
                    continue;
                }
                else{
                    System.out.println("\nThanks for ordering.\nSelect the hotel you want to continue the order with");
                }
                break;
            }
            
        }
        else {
           while(true) {
                System.out.println("\nYou have choosed Non-veg.\nPlease select the variety you want to continue the order with");
                System.out.println("\t1.Chicken biryani \n\t2.Mutton biryani \n\t3.fried rice \n\t4.Tandoori \n\t5.Grill");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("\nYou have choosen Chicken biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break; 
    
                    case 2:
                    System.out.println("\nYou have choosen Mutton biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
    
                    case 3:
                    System.out.println("\nYou have choosen Fried rice.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
    
                    case 4:
                    System.out.println("\nYou have choosen Tandoori.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
    
                    case 5:
                    System.out.println("\nYou have choosen Grill.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("\nYour selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
                }
                System.out.println("\nDo you want to order any other items\n\t1.yes \n\t2.no");
                int any = sc.nextInt();
                if(any == 1){
                    continue;
                }
                else{
                    System.out.println("\nThanks for ordering.\nSelect the hotel you want to continue the order with");
                }
                break;
            }    
            
        }
        System.out.println("\t1.Annapoorna \n\t2.Gowri Krishna \n\t3.Hotel Surya \n\t4.Food Khalifa");
        int hotel = sc.nextInt();
        if(hotel == 1){
            System.out.println("\nYou have choosen Hotel Annapoorna.\nYour order will be delivered shortly.");
        }
        else if(hotel == 2){
            System.out.println("\nYou have choosen Hotel Gowri Krishna.\nYour order will be delivered shortly.");
        }
        else if(hotel == 3){
            System.out.println("\nYou have choosen Hotel Surya.\nYour order will be delivered shortly.");
        }
        else{
            System.out.println("\nYou have choosen Food Khalifa.\nYour order will be delivered shortly.");
        }


        sc.close();

    }
}
