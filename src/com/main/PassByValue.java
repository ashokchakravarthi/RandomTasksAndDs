public class PassByValue
{
    public static void main(String[] args)
    {
        Invoice invoice = new Invoice();
        Item eggItem= new Item();
        invoice.item = eggItem;

        eggItem.itemName = "egg";
        setItemName(invoice.item);
        System.out.println(invoice.item.itemName);

    }

    public static void setItemName(Item item)
    {
        item.itemName = "bread";

    }
}

class Invoice
{
    int unit;
    int total;
    Item item;
}

class Item
{
    String itemName;
}


