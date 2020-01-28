import java.util.ArrayList;

public class Testing
{
    public static void main(String[] args)
    {
        String link = "https://projects.zoho.com/portal/books#buginfo/81276000002889096/bugs/23423423423";
        link = link.substring(link.lastIndexOf("bugs/")+5);
        System.out.println(link);
    }
}
