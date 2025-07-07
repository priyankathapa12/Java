
public abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal(String name){
        this.name = name; //constructor

    }//concrete method
    public String getName(){
        return name;

    } 
    //abstract method
    public abstract void makeSound();
       
    }

    class Snake extends AbstractAnimal{
        public Snake(String name){
            super(name);

        }
        @Override
        public void makeSound(){
             System.out.println("shhh....");
            
        }
    
    public static void main(String[] args){
        Snake s = new Snake("python");
        System.out.println("snake is :" +s.getName());
        s.makeSound();

    }
}
