import java.util.*;



public class DemoPoems{

    public static void main(String[] args) {

        Poem poemOne = new Poem("Lord of the flies", 22);
        Couplet poemTwo = new Peom("The best book in the world");
        Limerick poemThree = new Peom("In the beggining")
        Haiku poemFour = new Poem("Ebola");

        display(poemOne);
        display(poemTwo);
        display(poemThree);
        display(poemFour);
    }


    public static void display(Poem po){
        System.out.println("Poem:     " + po.getTitle()+ "Has: " +poem.getLines()+ "lines.");
    }
}