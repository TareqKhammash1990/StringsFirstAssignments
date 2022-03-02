package StringsFirstAssignments;


/**
 * Write a description of Part1 here.
 * Finding a Gene - Using the Simplified Algorithm
 * @author (Tareq Khammash) 
 * @version (a version number or a date)
 */
public class Part1 {

    public String findSimpleGene(String dna){
        String s = dna;
        String result = "";
        int startindex = s.indexOf("ATG");
        if(startindex == -1){
            result = "";
        }
        int endindex = s.indexOf("TAA",startindex+3);
        
        if(endindex == -1){
            result = "";
        }
        
        
        if(startindex != -1 && endindex != -1){
        String gene = s.substring(startindex, endindex+3);
        String geneinbetween = gene.substring(startindex+3, endindex-3);
        int multipleofthree = (geneinbetween.length()%3);
            if (multipleofthree==0){
            result = gene;
            }
            else{
            result = "";
            }
        }
        
        
        return result;
    }
    
    public void testSimpleGene(){
        String s1 = "GGTTTGGAATAAAGTTTGGG"; // without ATG
        System.out.println("The dna is "+ s1);
        String gene1 = findSimpleGene(s1);
        System.out.println("The gene is " +gene1);
        String s2 = "AAAGGGATGGGGGGTTTTAGTGGG"; // without TAA
        System.out.println("The dna is "+ s2);
        String gene2 = findSimpleGene(s2);
        System.out.println("The gene is "+ gene2);
        String s3 = "AAGGAAAGGTTGGGGAAA"; // without ATG or TAA
        System.out.println("The dna is "+ s3);
        String gene3 = findSimpleGene(s3);
        System.out.println("The gene is "+gene3);
        String s4 = "GGGATGGGTTTGGGATAATTT"; // with ATG and TAA and multiple of 3
        System.out.println("The dna is " + s4);
        String gene4 = findSimpleGene(s4);
        System.out.println("The gene is "+gene4);
        String s5 = "GGGATGGGTTTGATAATTT"; // with ATG and TAA and not multiple of 3 
        System.out.println("The dna is " +s5);
        String gene5 = findSimpleGene(s5);
        System.out.println("The gene is "+gene5);
    }
   public static void main (String[] args) {
        Part1 pr = new Part1();
        //pr.testPerimeter();
        pr.testSimpleGene();
        
   }
}

