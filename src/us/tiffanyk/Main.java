package us.tiffanyk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<UserInfo> zoo = new ArrayList<>();
        UserInfo[]animals = new UserInfo[1];
        Scanner input = new Scanner(System.in);

        System.out.println("How many animals would you like to enter? ");
        for (int i = 0; i < animals.length; i++){
            System.out.println("Enter animal type to add: ");
            String animalType = input.nextLine();
            zoo.add(new UserInfo(animalType));
        }



        // Lines to Replace Begin Here


        System.out.println(zoo);

        // End Lines to Replace

//        for (Talkable thing : zoo) {
//            printOut(thing);
//        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
