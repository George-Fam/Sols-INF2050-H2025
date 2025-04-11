package ca.uqam.info;

/**
 * Hello world!
 *
 */
public class Launcher
{
    public static void main( String[] args )
    {
        // Sample use of tag counter (tag counter depends on ServerFileDownloader)
        TagCounter tagCounter = new TagCounter(new ServerFileDownloader());

        // Calling the countTags
        int amountOfTags = tagCounter.countTags();
        System.out.println("Found "+amountOfTags+" tags on webpage.");

    }
}
