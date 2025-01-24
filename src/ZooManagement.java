import java.util.Scanner;

 class ZooManagement {
    public static void main(String[] args) {
        int nbrCages;
        String zooName;
        Scanner input = new Scanner(System.in);
        // Input for number of cages
        while (true) {
            System.out.println("Saisir le nombre de cages: ");
            if (input.hasNextInt() || input.nextInt()<0) {
                nbrCages = input.nextInt();
                break; // Exit loop if valid integer is entered
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                input.next(); // Consume invalid input
            }
        }
        // Input for zoo name
        while (true) {
            System.out.println("Saisir le nom du zoo: ");
            if (input.hasNextLine()) {
                zooName = input.next();
                if (!zooName.isEmpty()) break; // Exit loop if valid string is entered
            } else {
                System.out.println("Veuillez entrer un nom valide.");
                input.next(); // Consume invalid input
            }
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
