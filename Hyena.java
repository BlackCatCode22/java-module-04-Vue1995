package hello.zoo.com;

public class Hyena extends hello.zoo.com.Animal {
    // Create a static int that keeps track of the number of hyenas created
    static int numOfHyenas = 0;

    // Create a constructor
    public Hyena(String somName){
        super(somName);
        numOfHyenas++;
    }





}
