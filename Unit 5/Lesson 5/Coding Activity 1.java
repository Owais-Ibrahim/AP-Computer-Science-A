public class Post
{
 private String user;
 private String contents;
 private int favorited;

 public  Post(String u, String c, int f)
 {
    user = u;
    contents = c;
    favorited = f; 
 }
 
 public String toString ()
 {
  
   return (user +"\n"+contents +"\n\tFavorited by "+favorited+" users");
 }
 
}
