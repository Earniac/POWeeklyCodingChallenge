public class ArragingColors{
  
public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
  
    int k1 = scan.nextInt();
    int k2 = scan.nextInt();
  
    System.out.println(arrange(k1,k2));
  
}
  
    public static void arrange(int k1, k2){
    //All variations with 1 k2 and any number of k1 have 1 solution since dupes
    if (k2 == 1) {return 1;}
    //Variations with just 1 k1 always have k2 permutations
    else if (k1 == 1) {return k2;}
    //Otherwise, sum of sub-problems with 1 less item
    else {
      int result = place2Items(k1-1, k2) + place2Items(k1, k2-1);
      return result;
    }
  
  scan.close();
}
}
