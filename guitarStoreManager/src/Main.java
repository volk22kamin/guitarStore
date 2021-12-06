import java.util.Scanner;

public class Main {


    public static void menu(){
        System.out.println("here's our catalog:");
        System.out.println();
        System.out.println("see by company name(1)");
        System.out.println("see by type of guitar(2)");
        System.out.println("or see the whole catalog(3)");
        System.out.println("to leave(4)");
    }
    public static void main(String[] args) {
        boolean fContinue = true;
        Scanner s = new Scanner(System.in);
        // String acoustic = "acoustic", electric = "electric", classic = "classic";
        // String Gibson = "Gibson", Fender = "Fender", PRS ="PRS",  Rickenbacker ="Rickenbacker", Ibanez = "Ibanez",  Jackson = "Jackson", ESP = "ESP";
        Store myStore = new Store();
        for(int i = 0; i < 50; i++){
            myStore.selfAddGuitar();
        }
        
        
     
        while(fContinue){

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            menu();
            int userChoice = s.nextInt();

            System.out.println();
            System.out.println();
            System.out.println();
            switch(userChoice){
                case 1: 
                System.out.println("enter the company name:");
                System.out.println("Gibson, Fender, PRS, Rickenbacker, Ibanez, Jackson, ESP");
                String companyName = s.next();
                myStore.printByCompanyName(companyName);
                break;
                case 2:
                System.out.println("enter the type:");
                String type = s.next();
                myStore.printByType(type);
                break;
                case 3:
                System.out.println(myStore);
                break;
                case 4:
                fContinue = false;
                System.out.println("bye bye.");
                break;
                
                    default:
                    break;
                }
                
                if(fContinue){
                    System.out.println("enter serial number of what you want to buy:");
                int serialNumber = s.nextInt();
                
                
                if(myStore.getGuitarCreated() < 5){
                    System.out.println("sorry we can't sell any guitars yet");
                } else {
                    myStore.BuyGuitar(serialNumber);
                }
                System.out.println("do you want to see how many guitars created in our store? y/n");
                char choice = s.next().charAt(0);
                if(choice == 'y'){
                    System.out.println(myStore.getGuitarCreated());
                }
                System.out.println();
            }
        }
        
        
        
        
    }
    
}
