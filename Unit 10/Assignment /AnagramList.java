import java.util.ArrayList;

public class AnagramList
{
  private final ArrayList<String> anagrams;
  private final ArrayList<String> duplicates;

  public AnagramList(String word)
  {
    anagrams = new ArrayList<String>();
    duplicates = new ArrayList<String>();
    // Add appropriate call to completeAnagrams here
    completeAnagrams("",word);
    for (String i : duplicates){
      if(!anagrams.contains(i)){
        anagrams.add(i);
      }
    }
    sortAnagrams();
  }

  private void completeAnagrams(String start, String end)
  {
    if(end.length()==0)
      duplicates.add(start);
    else{
      for(int i = 0; i < end.length(); i++){
        completeAnagrams(start + end.substring(i,i+1), 
        end.substring(0,i) + end.substring(i+1, end.length()));
      }
    }
  }

  private void sortAnagrams(){
    for (int i = 0; i<anagrams.size();i++){
      for(int j = i+1; j<anagrams.size();j++){
        if(anagrams.get(i).compareTo(anagrams.get(j))>=0){
          //bigger than
          anagrams.add(i, anagrams.remove(j));
        }
      }
    }
  }
  public int search(ArrayList<String> x, String y, int start, int end){
    int z = (start+end)/2;
    if(end<start)
      return -1;
    if(y.compareTo(x.get(z))==0){
      return z;
    }
    else if(y.compareTo(x.get(z))<0){
      return search(anagrams, y, start, (z-1));
    }
    else if(y.compareTo(x.get(z))>0){
      return search(anagrams, y, z+1, end);
    }
    else
      return -1;
    
  }

  public int searchAnagrams(String target){
    return(search(anagrams, target, 0, anagrams.size()-1));
  }
  

  // Used to get list of anagrams externally, do not remove
  public ArrayList<String> getAnagrams()
  {
    return anagrams;
  }
}
