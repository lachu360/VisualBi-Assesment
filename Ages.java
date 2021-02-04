import java.util.*;
public class Ages {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] ages = new int[n];
      int[] freq = new int[10];
      
      for(int i = 0;i < n;i++){
          ages[i] = sc.nextInt();
      }
      
      for(int i = 0;i < n;i++){
          if(ages[i] >= 1 && ages[i] <= 10){
              freq[0]++;
          }
          else if(ages[i] >= 11 && ages[i] <= 20){
              freq[1]++;
          }
          else if(ages[i] >= 21 && ages[i] <= 30){
              freq[2]++;
          }
          else if(ages[i] >= 31 && ages[i] <= 40){
              freq[3]++;
          }
          else if(ages[i] >= 41 && ages[i] <= 50){
              freq[4]++;
          }
          else if(ages[i] >= 51 && ages[i] <= 60){
              freq[5]++;
          }
          else if(ages[i] >= 61 && ages[i] <= 70){
              freq[6]++;
          }
          else if(ages[i] >= 71 && ages[i] <= 80){
              freq[7]++;
          }
          else if(ages[i] >= 81 && ages[i] <= 90){
              freq[8]++;
          }
          else if(ages[i] >= 91 && ages[i] <= 100){
              freq[9]++;
          }
      }
      
      System.out.println("Age Group \t Total Number of People");
      System.out.println("1-10      \t "+freq[0]);
      System.out.println("11-20     \t "+freq[1]);
      System.out.println("21-30     \t "+freq[2]);
      System.out.println("31-40     \t "+freq[3]);
      System.out.println("41-50     \t "+freq[4]);
      System.out.println("51-60     \t "+freq[5]);
      System.out.println("61-70     \t "+freq[6]);
      System.out.println("71-80     \t "+freq[7]);
      System.out.println("81-90     \t "+freq[8]);
      System.out.println("91-100    \t "+freq[9]);
      
    }
}