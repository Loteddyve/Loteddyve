public class Switch {

    public static void main(String[] args) {

        int number = 0;

        switch (number) {
            case 0:
                System.out.println("Number 0");
                break;
            case 1:
            case 2:
            case 9:
                System.out.println("Awesome Number");
                break;
            default:
                System.out.println("What is this???");
        }

        if (number == 0) {
            // Number 0
        } else if (number == 1 || number == 2) {
            // Awesome Number
        } else {
            // What is this???
        }
    }
}
