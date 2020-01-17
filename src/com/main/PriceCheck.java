import java.util.*;

public class PriceCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int productArraySize = Integer.parseInt(scanner.nextLine());
        Map<String, Double> productPriceMap = new LinkedHashMap<>();
        Set<String> productSoldSet = new LinkedHashSet<>();
        for(int i=0; i<productArraySize; i++)
        {
            String product = scanner.nextLine();
            productPriceMap.put(product, 0.0);
        }

        productArraySize = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<String, Double> entry : productPriceMap.entrySet())
        {
            Double price = Double.parseDouble(scanner.nextLine());
            entry.setValue(price);
        }

        int productSoldSize = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<productSoldSize; i++)
        {
            String product = scanner.nextLine();
            productSoldSet.add(product);
        }

        productSoldSize = Integer.parseInt(scanner.nextLine());
        int wronglySoldProdCount = 0;
        for (String productSoldItem : productSoldSet)
        {
            Double soldPrice = Double.parseDouble(scanner.nextLine());
            if(Double.compare(productPriceMap.get(productSoldItem), soldPrice) != 0)
            {
                wronglySoldProdCount++;
            }
        }

        System.out.println(wronglySoldProdCount);
        /*for (Map.Entry<String, Double> entry : productPriceMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());*/
    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice)
    {
        int wronglySoldProdCount = 0;
        int index=0;
        for (String productSoldItem : productSold)
        {
            if(Double.compare(productPrices.get(products.indexOf(productSoldItem)), soldPrice.get(index)) !=0)
            {
                wronglySoldProdCount++;
            }

            index++;
        }

        return wronglySoldProdCount;
    }
}
