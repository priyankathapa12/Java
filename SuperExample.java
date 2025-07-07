class parent{
 String name ="priyanka";
 void display(){
    System.out.println("Display method in parent");

 }
}
class Child extends parent{
    String name= "kaviya";
 void display (){
    System.out.println("Display method in Child");

 }
 void show(){
    System.out.println("Name from Child:" +name);
    System.out.println("Name from Parent:" +super.name); //Acessing the parent class field
    display();// calls the display method in parent
    super.display();//calls the display method in parent
 }
}
public class SuperExample{
    public static void main ( String[] args){
        Child child = new Child();
        child.show();
    }
}
    

