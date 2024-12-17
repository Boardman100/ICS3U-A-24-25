package pract;

public class Book {
    //Attributes
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    //Overloaded constructors -> depending on input parameters, 1 is used
    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.yearPublished = 2000;
        this.price = 9.99;
    }

    public Book(String title){
        this.title = title;
        this.author = "Unknown Author";
        this.yearPublished = 2000;
        this.price = 9.99;
    }

    //Overloaded Methods -> depending on input parameters, 1 is used
    public void displayDetails(){
        System.out.println("Title: " + title + "Author: " + author + "Published: " + yearPublished + "Price: " + price);
    }

    public void displayDetails(boolean showTitleAndAuthorOnly){
        if(showTitleAndAuthorOnly == false){
            displayDetails();
        }else{
            System.out.println("Title: " + title + "Author: " + author);
        }
    }

    public void displayDetails(String showTitleOnly){
        if(showTitleOnly.equals("title")){
            System.out.println("Title: " + title);
        } else {
            displayDetails();
        }
    }

    //Setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }

    public void price(double price){
        this.price = price;
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    public Double getPrice(){
        return price;
    }
}
