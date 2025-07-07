//create a class bulb with a field brand .create a parameterized constructor to initialoze brand and a display function to display brand.Derive a class CFL ,which has two fields watts and price .create a parameterized  constructor to initialize both fields ,also use super keyboard  to call parent class constructor.create a function display  to show all the information and call parent class display function with in it using super keyword.
class  Bulb{ 
String brand ;
Bulb(String brand){
    this.brand = brand;
}
 void display(){
    System.out.println("Brand:" +brand);
    
    }    
}
 public class CFL extends Bulb{
    private int watts;
     private float price;
    CFL (String brand ,int watts,float price ){
        super (brand);
        this.watts=watts;
        this.price =price;
    }

void display (){
    super.display();
System.out.println("watts:"+ watts);
System.out.println("price:" +price);
    }

 }

/* Main class moved to Main.java */