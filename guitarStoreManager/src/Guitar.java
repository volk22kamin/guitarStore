import java.util.Random;

public class Guitar {
    
    private String companyName;
    private String type;
    private int price;
    private int serialNumber;
    private static int serialCount = 1000;
    Random random = new Random();


    
    public Guitar(String companyName, String type, int price) {
        this.companyName = companyName;
        this.type = type;
        this.price = price;
        serialNumber = serialCount++;
        
    }
    // self making
    public Guitar(){
        String[] names = {"Gibson", "Fender","PRS", "Rickenbacker", "Ibanez", "Jackson", "ESP"};
        String[] types = {"electric", "acoustic", "classic"};
        String type = types[random.nextInt(types.length)];
        String name = names[random.nextInt(names.length)];
        
        this.type = type;
        this.companyName = name;
        this.price = random.nextInt(3500 - 650) + 650;
        serialNumber = serialCount++;
        
    }


    public Guitar(Guitar guitar){
        this.companyName = guitar.companyName;
        this.type = guitar.type;
        this.price = guitar.price;
        serialNumber = serialCount++;
        
    }


    public String getCompanyName() {
        return companyName;
    }


    public String getType() {
        return type;
    }


    

    public int getPrice() {
        return price;
    }


    

    
    
    public int getSerialNumber() {
        return serialNumber;
    }
    @Override
    public String toString() {
        return "Guitar: companyName=" + companyName  + ", type=" + type + ", price=" + price + "$ serialNumber= " + serialNumber + "\n";
    }



    
}
