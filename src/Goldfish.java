public class Goldfish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("The goldfish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("This goldfish is hunting");
    }
}
