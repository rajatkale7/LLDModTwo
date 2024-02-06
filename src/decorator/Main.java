package decorator;

public class Main {
        public static void main(String[] args) {
            IceCream ic = new ChocoChip(
                    new ChocoScoop(
                            new OrangeCone(
                                    new ChocoSyrup(
                                            new ChocoCone()))));

            System.out.println("Price is "+ ic.getCost());
            System.out.println(ic.getDescription());
        }
}
