public class Main {

    public static void main(String[] args) {
        PezDispenser pd = new PezDispenser();

        pd.fill();
        System.out.print(pd.PezAmount());

        pd.dispense();

    }
}
