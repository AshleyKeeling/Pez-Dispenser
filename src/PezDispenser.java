public class PezDispenser {

    private final int MAX_PEZ = 10;
    private int pezAmount = 0;

    final private String PEZHead;

    public PezDispenser(String PEZHead) {   // constructor
        this.PEZHead = PEZHead;
    }

    public String getPEZHead() {
        return PEZHead;
    }

    // fills pez dispenser
    public void fill() {
        if (isEmpty()) {
            pezAmount = MAX_PEZ;
        }
    }

    // returns pez amount
    public int pezAmount() {
        return  pezAmount;
    }

    // dispenses pez
    public void dispense() {
        while (!isEmpty()) {
            System.out.println("\n\n" + pezAmount() + " PEZ inside of " + PEZHead + " PEZ Dispenser");
            pezAmount--;
            System.out.println("-1 pez, " + pezAmount + " left");

        }
    }

    // checks to see if there is any pez
    public boolean isEmpty() {
        return pezAmount == 0;
    }
}
