import java.util.*;

public class DemoItems{

    public static void main(String[] args) {

        ItemSold itemOne = new ItemSold();
        ItemSold itemTwo = new ItemSold();

        PetSold petOne = new PetSold();
        PetSold petTwo = new PetSold();

        itemOne.setInvoiceNumber(100);
        itemOne.setDescription("Chew toy");
        itemOne.setPrice(20);

        itemTwo.setInvoiceNumber(100);
        itemTwo.setDescription("Rope")
        itemTwo.setPrice(5);
        itemTwo.setisVaccinated(true);
        itemTwo.setisNuetered(false);
        itemTwo.setisHousebroken(true);

        display(itemOne);
        display(itemTwo);
        display(petOne);
        displayPetData(petOne);
        display(petTwo);
        displayPetData(petTwo);



        public static void dispaly(itemSold item){

        System.out.println("The invoice num is:  " +item.getInvoiceNumber());
        System.out.println("The description is:" + item.getDescription());
        System.out.println("The price is: " +item.getPrice());
    }

    public static void displayPetInfo(PetSold item){
        System.out.println("The pet is vaccinated:  " +item.getIsVaccinated());
        System.out.println("The pet is neutered:" + item.getIsNeutered());
        System.out.println("The pet is housebroken: " +item.getIsHousebroken());
    }


    }
}