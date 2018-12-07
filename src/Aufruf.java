import java.util.Date;

public class Aufruf
{
    public static void main(String[] args)
    {

        Date released = new Date ();
        Book Buch = new Book (200, released, "My Book", "isbn");

        System.out.println("Das Buch hat " + Buch.getPages()+" Seiten, wurde am " +Buch.getReleased()+" veröffentlicht und hat den Titel " +Buch.getTitle());
    }

}
