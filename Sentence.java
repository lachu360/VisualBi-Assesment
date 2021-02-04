import java.util.*;
public class Sentence {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = Integer.toString(n);
      HashMap<Integer,String> hs = new HashMap<Integer,String>();
      hs.put(1,"one");
      hs.put(2,"two");
      hs.put(3,"three");
      hs.put(4,"four");
      hs.put(5,"five");
      hs.put(6,"six");
      hs.put(7,"seven");
      hs.put(8,"eight");
      hs.put(9,"nine");
      
      HashMap<Character,Integer> freq = new HashMap<Character,Integer>();
      
      
      for (int i = 0; i < s.length(); i++) { 
  
            int count = 1; 
            
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) { 
                i++; 
                count++; 
            } 
            
            if (freq.containsKey(s.charAt(i))){
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + count); 
            }
            else{
                freq.put(s.charAt(i), count); 
            }
            System.out.print(hs.get(count)+ " ");
                             
            if(count != 1){
                System.out.print(s.charAt(i) + "'s ");
            }
            else{
                System.out.print(s.charAt(i)+" ");
            }
            
            if(i != s.length()-1){
                System.out.print("and ");
            }
        }
        
        System.out.print("\nTotal: ");
        for(int i = 0;i < s.length();i++){
            if(freq.containsKey(s.charAt(i))){
            if(i != s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                continue;
            }
             System.out.print(hs.get(freq.get(s.charAt(i)))+" ");
            
            if(freq.get(s.charAt(i)) != 1){
                System.out.print(s.charAt(i) + "'s ");
            }
            else{
                System.out.print(s.charAt(i)+" ");
            }
            
            if(i != s.length()-1 && (s.charAt(s.length()-1) == s.charAt(i))){
                System.out.print("and ");
            }
            
            freq.remove(s.charAt(i));
        }}
        
  
    
      
      
      
    }
}