//sV 24Sep2024
//ArrayList.java
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello and welcome!\n");

//Create an array list of strings
        ArrayList<String> friendsArrayList = new ArrayList<>();

//Add a few elements in the array list
        friendsArrayList.add("first");
        friendsArrayList.add("second");
        friendsArrayList.add("third");

//output the array list
        System.out.println("\nMy friendsArrayList is: " + friendsArrayList);

//Remove an element
        friendsArrayList.remove(0);

//Output the array list proving that index 0 has been removed
        System.out.println("\nMy friendsArrayList after removing index 0 is: " + friendsArrayList);

//Remove an element
        friendsArrayList.remove("third");

        //Output the array list proving that object "third" has been removed
        System.out.println("\nMy friendsArrayList after removing object third is: " + friendsArrayList);

        //Use a for loop to add some things to our list
        String toAdd = "";
        for (int i = 0; i < 10; i++) {
            toAdd = toAdd + "adding.." + Integer.toString(i);
            friendsArrayList.add(toAdd);
        }

        //output the array list
        System.out.println("\nMy friendsArrayList after adding a bunch of stuff is: " + friendsArrayList);

        //Use a for loop to output each element of our array list
        for (int i = 0; i < friendsArrayList.size(); i++) {
            System.out.println("\nAn element in my list is: " + friendsArrayList.get(i));
        }

    }
}