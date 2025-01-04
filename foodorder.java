import java.util.*;
class foodorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tomato your online kitchen");
        System.out.println("Choose between the categories\n1.Veg \n2.Non-veg");
        int a = sc.nextInt();
        int q;
        float p;
        if(a == 1){
            while(true) {
                System.out.println("You have choosed veg.\nPlease select the variety you want to continue the order with");
                System.out.println("1.Vegetable biryani \n2.Mushroom biryani \n3.Fried rice \n4.Noodles \n5.Pizza");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("You have choosen Vegetable biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break; 
    
                    case 2:
                    System.out.println("You have choosen Mushroom biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
    
                    case 3:
                    System.out.println("You have choosen Fried rice.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
    
                    case 4:
                    System.out.println("You have choosen Noodles.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
    
                    case 5:
                    System.out.println("You have choosen Pizza.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 100;
                    System.out.println("Price of 1 quantity = 100\nYour total price = "+p);
                    break;
                }
                System.out.println("Do you want to order any other items\n1.yes \n2.no");
                int any = sc.nextInt();
                if(any == 1){
                    continue;
                }
                else{
                    System.out.println("Thanks for ordering.\nSelect the hotel you want to continue the order with");
                }
                break;
            }
            
        }
        else {
           while(true) {
                System.out.println("You have choosed Non-veg.\nPlease select the variety you want to continue the order with");
                System.out.println("1.Chicken biryani \n2.Mutton biryani \n3.fried rice \n4.Tandoori \n5.Grill");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("You have choosen Chicken biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break; 
    
                    case 2:
                    System.out.println("You have choosen Mutton biryani.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
    
                    case 3:
                    System.out.println("You have choosen Fried rice.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
    
                    case 4:
                    System.out.println("You have choosen Tandoori.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
    
                    case 5:
                    System.out.println("You have choosen Grill.\nPlease enter the quantity");
                    q = sc.nextInt();
                    System.out.println("Your selected quantity : " +q);
                    p = q * 150;
                    System.out.println("Price of 1 quantity = 150\nYour total price = "+p);
                    break;
                }
                System.out.println("Do you want to order any other items\n1.yes \n2.no");
                int any = sc.nextInt();
                if(any == 1){
                    continue;
                }
                else{
                    System.out.println("Thanks for ordering.\nSelect the hotel you want to continue the order with");
                }
                break;
            }    
            
        }
        System.out.println("1.Annapoorna \n2.Gowri Krishna \n3.Hotel Surya \n4.Food Khalifa");
        int hotel = sc.nextInt();
        if(hotel == 1){
            System.out.println("You have choosen Hotel Annapoorna.\nYour order will be delivered shortly.");
        }
        else if(hotel == 2){
            System.out.println("You have choosen Hotel Gowri Krishna.\nYour order will be delivered shortly.");
        }
        else if(hotel == 3){
            System.out.println("You have choosen Hotel Surya.\nYour order will be delivered shortly.");
        }
        else{
            System.out.println("You have choosen Food Khalifa.\nYour order will be delivered shortly.");
        }


        sc.close();

    }
}