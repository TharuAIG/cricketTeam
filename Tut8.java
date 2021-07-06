import java.util.ArrayList; // import the ArrayList class

class PlayerSection {
    static ArrayList<String> playerNames = new ArrayList<String>(); // Create an ArrayList object
    //static String[] playerNames = {"Sanath Jayasooriya", "Kumara sangakkara", "Kaluwitharana", "Virat Kohli", "Rassie van der Dussen", "Lokesh Rahul", "Glenn Maxwell", "Martin Guptill", "Evin Lewis"};

    private static void addPlayer() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter Player name to add:");
        String x = inputName.nextLine();
        playerNames.add(x);
    }

    private static void viewAllPlayers() {
        for (int i=0; i<playerNames.size(); i++) {
            System.out.println(playerNames.get(i));
        }
    }

    public static void main(String[] args) {
        boolean flag;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 'A' to add a player or 'V' to view all players");
            String userInput = input.next();
            if (userInput.equals("A")) {
                addPlayer();
                flag = false;
            }
            else if (userInput.equals("V")) {
                viewAllPlayers();
                flag = false;
            }
            else {
                System.out.println("Invalid input!");
                flag = true;
            }
        }
        while (flag);

    }
}