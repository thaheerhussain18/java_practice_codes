
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void generatePermutations(char[] chars, int start) {
    	if(start==chars.length-1) {
    		printArrya(chars);
    		return;
    	}
    	for(int i=start;i<chars.length;i++) {
    		swap(chars,start,i);
    		generatePermutations(chars, start+1);
    		swap(chars,start,i);
    	}
    }
    
    public static void printArrya(char [] n) {
    	for(char i:n) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    }

    public static void main(String[] args) {
        String s = "abcd";
        generatePermutations(s.toCharArray(), 0);
    }
}
