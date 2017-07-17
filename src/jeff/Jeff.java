
package jeff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jeff {
    
    public static void main(String[] args) {
        int g=0;
        do{
        Character [][] A = new Character[30][26];;
         for(int n=0 ;n < 30; n++){
            List<Character> sequence = new ArrayList<>();
            for (char c = 'A' ; c <= 'Z' ; c++) {
                sequence.add(c);
            }
            int x =0;
            Collections.shuffle(sequence);
            for (Character c : sequence) {
                     A[n][x] = c;
                     x++;
            }
        }
         for(int i = 0 ; i<10 ; i++){
            for (int j=0 ; j<26 ; j++)
                System.out.print(A[i][j]+"   ");
            System.out.println("");
        }
        //---------------------------------------------------
        System.out.println("");
        System.out.println("\tWELCOME :)");
        
        System.out.println("Enter word to encrypt");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println("");
        
        //----------------------------------------------------
        for(int i = 0 ; i<word.length() ; i++){
            for (int j=0 ; j<26 ; j++)
                if ( Character.toString(A[i][j]).equalsIgnoreCase(Character.toString(word.charAt(i)) ) ){
                   
                    for (int b=j ; b<26 ; b++)
                        System.out.print(A[i][b]+"   ");
                    for (int b=0 ; b<j ; b++)
                        System.out.print(A[i][b]+"   ");
                   System.out.println("");
                   
                }
        }
        //-------------------------------------------------------
        
        //-------------------------------------------------------
        System.out.println("Enter number of rolls");
        Scanner s1 = new Scanner(System.in);
        int rolls = s1.nextInt();
        System.out.println("");
        //-------------------------------------------------------
        int [] index = new int[word.length()];
        
        for(int i = 0 ; i<word.length() ; i++){
            for (int j=0 ; j<26 ; j++)
                if ( Character.toString(A[i][j]).equalsIgnoreCase(Character.toString(word.charAt(i)) ) ){
                    index[i] = j;
                    break;
                }
        }
        //--------------------------------------------------------
        System.out.println("");
        System.out.println("");
        System.out.println("THE ENCRYPTION OF " + word + " IS : ");
        //
        for(int  i = 0 ; i<word.length() ; i++){
            System.out.print( A[i][(index[i]+rolls)%26] + "   ");
        }
        
        //-----------------DECREPTION----------------------------   
      
        System.out.println("");
        System.out.println("");
        System.out.println("Press 1 to Decrypt");
        System.out.println("Press any key to Exit");
        
        Scanner s4 = new Scanner(System.in);
        int q = s4.nextInt();
        
        if (q==1){

        System.out.println("");
        System.out.println("Enter word to decrypt");
        Scanner s2 = new Scanner(System.in);
        String word2 = s2.nextLine();
        System.out.println("");
        //---------------------------------------------------------
        for(int i = 0 ; i<word2.length() ; i++){
            for (int j=0 ; j<26 ; j++)
                if ( Character.toString(A[i][j]).equalsIgnoreCase(Character.toString(word2.charAt(i)) ) ){
                   
                    for (int b=j ; b<26 ; b++)
                        System.out.print(A[i][b]+"   ");
                    for (int b=0 ; b<j ; b++)
                        System.out.print(A[i][b]+"   ");
                   System.out.println("");
                   
                }
        }
        //-------------------------------------------------------
        
        //--------------------------------------------------------
        
        int [] index2 = new int[word2.length()];
        
        for(int i = 0 ; i<word2.length() ; i++){
            for (int j=0 ; j<26 ; j++)
                if ( Character.toString(A[i][j]).equalsIgnoreCase(Character.toString(word2.charAt(i)) ) ){
                    index2[i] = j;
                    break;
                }
        }
        //---------------------------------------------------------
        System.out.println("Enter number of rolls");
        Scanner s3 = new Scanner(System.in);
        int rolls2 = s3.nextInt();
        System.out.println("");
        //---------------------------------------------------------
        System.out.println("");
        System.out.println("");
        System.out.println("THE DECRYPTION OF " + word2 + " IS : ");
        //
        for(int  i = 0 ; i<word2.length() ; i++){
            int d = index2[i]-rolls2 ;
            if (d<0) d=d+26;
            System.out.print( A[i][d] + "   ");
        }
        }else break;
        System.out.println("");
        System.out.println("");
        System.out.println("Press 1 to encrypt again");
        System.out.println("Press any key to Exit");
        Scanner s5 = new Scanner(System.in);
        g = s5.nextInt();
        }while(g==1);
    }   
}
