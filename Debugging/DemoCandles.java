/**
 * Created by jc320680 on 12/09/17.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle candleOne = new Candle();
        ScentedCandle sentedCandle = new SentedCandle();


        candleOne.setColour("Black");
        candleOne.setHeight(10);



        sentedCandle.setColour("Red");
        sentedCandle.setHeight(65);
        sentedCandle.setScent("Chocolate");

        System.out.println("A" + candleOne.getHieght + "inch"  +  candleOne.getColour() +  "candle will cost: $"
                +candleOne.getPrice);

        System.out.println("A" + sentedCandle.getHieght + "inch"  +  sentedCandle.getColour() +  "candle will cost: $"
                +sentedCandle.getPrice);


    }

}
