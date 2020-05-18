public class PezDispenser {

    private final int MAX_PEZ = 10;
    private int pezAmount = 0;

    // fills pez dispenser
    public void fill() {
        if (isEmpty()) {
            pezAmount = MAX_PEZ;
        }
    }

    // returns pez amount
    public int PezAmount() {
        return  pezAmount;
    }

    // dispenses pez
    public void dispense() {
        while (!isEmpty()) {
            pezAmount--;
            System.out.println("-1 pez, " + pezAmount + " left");

        }
    }

    // checks to see if there is any pez
    public boolean isEmpty() {
        return pezAmount == 0;
    }
}
