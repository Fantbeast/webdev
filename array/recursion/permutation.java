package recursion;

import java.util.ArrayList;

// subset methods ,/ multiple function call and depends on the size of the process .
public class permutation {
    public static void main(String[] args) {
        System.out.println("using the permuataion ");
        permu("","sid");
    }
    static void permu(String p/*initional of the permutaion on the substring 0*/, String up/*the words for the permutaion in the string*/){
      if  (up.isEmpty()){
          System.out.println(p);
          return;
        }
        ArrayList<String> ans= new ArrayList<>();//defining the list to contain the answer of the permutation n
      char ch =up.charAt(0);
      for(int i=0;i<=p.length();i++){
          String f= p.substring(0,i);
          String s=p.substring(i,p.length());
          permu(f+ch+s, up.substring(1));
      }
    }
}
