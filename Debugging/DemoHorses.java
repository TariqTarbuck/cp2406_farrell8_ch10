/**
 * Created by jc320680 on 12/09/17.
 */
public class DemoHorses extends RaceHorse {

    public DemoHorses(String name, String colour, int birthYear, int racesCompleted) {
        super(name, colour, birthYear, racesCompleted);
    }

    public void display(){
    System.out.println("The name of the horse is" + name + "The colour of the horse is" + colour + "The year the horse born was"+
          birthYear+ " The horse has completed" +racesCompleted+ "races");



}
}
