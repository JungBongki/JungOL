
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binary_len {

   public static void main(String[] arg){

      Scanner sc = new Scanner(System.in);
      List<Integer> arr = new ArrayList<Integer>();
      
      int N = sc.nextInt();
      int N_D;
      sc.close();
      /*
      String strN = Integer.toBinaryString(N);
      System.out.println(N); // ������ ������ String���� ��ȯ�ȴ�...!
      */
      while(N/2!=0){
         N_D = N%2;
         N = N/2;
         arr.add(N_D);
      }
      if(N/2==0){
         N_D = N%2;
         arr.add(N_D);
      } // ������ ��������
      
      int count = 0;
      int temp=0;
      int temp2=0;
      for(int i=arr.size()-1; i>=0; i--){
         if(arr.get(i)==0){
            count++;
            System.out.println("count����");
         } else if (arr.get(i)==1){
            temp = count;
            if(temp > temp2){
               temp2 = temp;
            }
            count = 0;
            System.out.println("count��ȯ");
         }
      }
      
      
      System.out.println(arr.toString());
      System.out.println(temp2);
   }
}