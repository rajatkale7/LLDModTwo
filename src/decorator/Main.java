package decorator;

public class Main {
        public static void main(String[] args) {
            IceCream ic = new ChocoChip(
                                 new ChocoScoop(
                                       new OrangeCone(
                                                new ChocoSyrup(
                                                        new ChocoCone()))));

            //As a user, my process to make the ice cream is starting from most inner constructor

            System.out.println("Price is "+ ic.getCost());
            System.out.println("My Icecream is--> "+ic.getDescription());


            /*
            The very first outermost constructor will get called.


             */
        }
}
