import java.util.Arrays;

public class Store {

    private Guitar[] guitarList;
    private static int guitarCreated = 0;


    public Store() {
        this.guitarList = new Guitar[100];
    }


    public void addGuitar(Guitar guitar){
        if(guitarCreated <= guitarList.length)
        guitarList[guitarCreated++] = new Guitar(guitar);
        else
        System.out.println("there's no more space in the store to store more guitars.");
    }
    // self making guitars
    public void selfAddGuitar(){
        if(guitarCreated <= guitarList.length){
            guitarList[guitarCreated++] = new Guitar();
        }
        else
        System.out.println("there's no more space in the store to store more guitars.");
    }

    public void BuyGuitar(int serialNumber){
        if (serialNumber - 1000 > guitarCreated || serialNumber - 1000 < 0){
            System.out.println("there is no item with this serial number.");
        }
        else if(guitarList[serialNumber - 1000] == null){
            System.out.println("this item is out of stock.");
        }
        
        else{
            System.out.println("the price is: " + guitarList[serialNumber - 1000].getPrice() + "$");
            guitarList[serialNumber - 1000] = null;
            System.out.println("thanks for shopping with us.");
        }
        
    }

    public void printByType(String type){
        int index = 0;
        while(guitarList[index] != null){
            if(guitarList[index].getType().equals(type)){
                System.out.println(guitarList[index]);
            }
            index++;
        }
    }
    public void printByCompanyName(String companyName){
        int index = 0;
        while(guitarList[index] != null){
            if(guitarList[index].getCompanyName().equalsIgnoreCase(companyName)){
                System.out.println(guitarList[index]);
            }
            index++;
        }
    }


    public static int getGuitarCreated() {
        return guitarCreated;
    }




    @Override
    public String toString() {
        return "Store: guitarList=\n" + Arrays.toString(guitarList);
    }
    
}
