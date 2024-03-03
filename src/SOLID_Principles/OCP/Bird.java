package SOLID_Principles.OCP;

public class Bird {
    public int weight;
    public String colour;
    public String type;
    public int numberOfWings;
    public String name;

    public void fly(){
        if(name.equals("sparrow")){
            System.out.println("sparrow is flying");
        }
        else if(name.equals("pegion")){
            System.out.println("pegion is flying");
        }
    }

    public void makeSound(){
        if(name.equals("sparrow")){
            System.out.println("sparrow is making sound");
        }
        else if(name.equals("crow")){
            System.out.println("crow is making sound");
        }
        //If new bird comes to role again I have to add one more else-if() here
        //Means I am editing existing method--> Violation of OCP
    }

    public static void main(String[] args) {
        Bird b1= new Bird();
        b1.name="sparrow";
        b1.fly();

        Bird b2= new Bird();
        b2.name="crow";
        b2.makeSound();
    }

}

//OCP-Code should be open for extension and closed for modification
