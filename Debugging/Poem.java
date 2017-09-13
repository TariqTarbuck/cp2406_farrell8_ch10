public class Poem{

    private String title;
    private int numOfLines;

    public Poem(String name, int lines){

        title = name;
        numOfLines = lines;
    }

    public String getTitle(){
        return title;
    }

    public int getNumOfLines() {
        return numOfLines;
    }
}