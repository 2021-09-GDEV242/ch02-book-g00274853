/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Yixuan Sun
 * @version 9/20/2021
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = isCourseText;
    }
    //set Referance Number
    public void setRefNumber(String ref)
    {
        if(refNumber.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System .out.println("Error");
            System.out.println("Reference number at least three!");
        }
    }
    //This book has been borrowed more and more times
    public String getRefNumber()
    {
        return refNumber;
    }
    //Author
    public String getAuthor()
    {
        return author;
    }
    //Title
    public String getTitle()
    {
        return title;
    }
    //Pages
    public int getPages()
    {
        return pages;
    }
    //the number of times this book has been borrowed
    public int getBorrowed()
    {
        return borrowed;
    }
    //Is this book a textbook for a certain course
    public boolean isCourseText()
    {
       return courseText;
    }
    //Print out the author 
    public void printAuthor()
    {
        System.out.println("Author" + author);
    }
    //Print out thr Title
    public void printTitle()
    {
        System.out.println("Title" + title);
    }
    //Print out Details
    public void printDetails()
    {
        System .out.println("Title" + title + "Aouthor" + author + "Pages" +pages);
        if(refNumber.length() > 0)
        {
            System.out.println("Referance Number" + refNumber);
        }
        else
        {
            System .out.println("Referance Number: ZZZ");
        }
        System.out.println("Borrowed" + borrowed);
    }
    //The number of times it's borrowed plus 1  
    public void borrowed()
    {
        borrowed++;
    }
    // Add the methods here ...
}
