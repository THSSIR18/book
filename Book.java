public class Book
{
     
       String author;
       String title;
       
       Book(String a, String t){
              author = a;
              title = t;
       }
       
       public String getTitle(){
              return title;
       }
       
       public String getAuthor(){
              return author;
       }

       public String toString(){
          String str;
          str = "Author:\t" + author + "\n" +
                "Title:\t" + title + "\n" ;
       return str;   
       }
}