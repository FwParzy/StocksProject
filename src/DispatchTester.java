import java.util.Scanner;
import java.util.ArrayList;

public class DispatchTester {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> Truck1 = new ArrayList<>();
        ArrayList<String> truck2 = new ArrayList<>();
        ArrayList<String> truck3 = new ArrayList<>();
        
        Dispatch menu = new Dispatch();
        
        
        /**while or for w/counter(i!=0, 1++){
         * choose truck to update info
         * 123
         * if statements
         * } 
         *add choose 4 to return top of menu
         */
        
        int choice=1;
        while(choice != 4 && choice >= 1){
        System.out.println("""
                                                Dispatch Menu 
                           
                           1. Truck1  |   2. Truck2   |  3. Truck3  |  4. Exit Dispatch Menu
                           
                           Which truck will you update:
                           """);
        
        choice = in.nextInt();
        
        
        
            if(choice==1 | choice==2 | choice ==3){

                //Dispatch Menu
                System.out.println("""
                                                                    Dispatch Menu 

                                   1.Truck Status  |  2.Time & Location  |  3.Loading  |  4. Exit Dispatch Menu

                                   Choose an area to update:
                                   """);



                menu.scan(in.nextInt());

                //Truck status
                if(menu.getScan()==1){
                    System.out.println("""
                                                             Update Truck Status

                                                           1. Here        2. Gone       3. Exit Dispatch Menu""");

                    menu.scan(in.nextInt());
                    if(menu.getScan()>3 | menu.getScan()<1){
                        System.out.println("Error: Invalid Option\n(Enter 1, 2 or 3)");
                        menu.scan(in.nextInt());
                    }
                    else if(menu.getScan()==1){
                        menu.setStatus("Here");            
                    }
                    else if(menu.getScan()==2){
                        menu.setStatus("Gone");
                    }           
                    else if(menu.getScan()==3){
                        menu.setStatus("Status: Not updated");
                        break;
                    }
                    
                    else{
                        break;}
                    System.out.println("Status: " + menu.getStatus());
                }
                //Time and Location
                else if(menu.getScan()==2){
                    System.out.println("Time & Location Tracking");
                    System.out.println(menu.getObjective());
                }
                //Loading
                else if(menu.getScan()==3){
                    System.out.println("Loading");
                }
                
                else{
                    break;}

            }
            /**else if(choice != (1|2|3|4)){
                System.out.println("Error: Invalid Option\n Enter 1-4");
                break;
            }*/
            else if(choice == 4){
                break;}
            else{
                break;
                }
        
        }
        System.out.println("System Closed");
        
    
    }
        
    
}
