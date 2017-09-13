/**
 * Created by jc320680 on 12/09/17.
 */
public class Candle {

    private String colour;
    private int height;
    private int price;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHeight(int height) {
        int PricePerInch = 2
        this.height = height;
        price = (height * PricePerInch)
    }

}

