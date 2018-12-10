import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Aufgabe 3
        Date released = new Date ();
        Book buch = new Book (200, released, "My Book", "isbn");

        System.out.println("Das Buch hat " + buch.getPages()+" Seiten, wurde am " +buch.getReleased()+" veröffentlicht und hat den Titel " +buch.getTitle());

        //Aufgabe 4

        List<Book> meineListe=new ArrayList<>();
        meineListe.add(new Book(200,released ,"My Book 1", "123215-12521-73473"));
        meineListe.add(new Book(200,released,"My Book 2", "6437-623623-24254"));
        meineListe.add(new Book(200,released,"My Book 3", "26326-734737-732473"));
        meineListe.add(new Book(200,released,"My Book 4", "745854-124412-3487438348"));
        meineListe.add(new Book(200,released,"My Book 5", "627-5236236-123483475125"));

        for (Book item:meineListe)
        {
            System.out.println(item.getTitle()+" hat " +item.getPages() +" Seiten und folgende ISBN: " +item.getIsbn());
        }
    }

}
