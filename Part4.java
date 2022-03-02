package StringsFirstAssignments;


/**
 * Write a description of Part4 here.
 * Part 4: Finding Web Links
 * @author Tareq Khammash 
 * @version (a version number or a date)
 */
import edu.duke.URLResource;
public class Part4 {

public void findingweblinks(){
    // create URLresource for the web page to be testex
    URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
    //http://www.dukelearntoprogram.com/course2/data/manylinks.html 
    
    for (String word : ur.words())
    {
        String word1;
        word1 = word.toLowerCase();
        int index1 = word1.indexOf("youtube.com");
        if(index1 > -1)
        {
            int indexleft = word.lastIndexOf("\"",index1);
            int indexright = word1.indexOf("\"", indexleft+1);
            String word2 = word.substring(indexleft,indexright+1); 
            //System.out.println(word);
            System.out.println(word2);
        }
    }
}
public void test(){
    findingweblinks();
}
}
