package os;
import java.util.*;
public class MVT {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int ms, temp, n = 0;
	        int[] mp = new int[10];
	        char ch = 'y';
	        
	        System.out.print("\nEnter the total memory available (in Bytes)-- ");
	        ms = scanner.nextInt();
	        temp = ms;
	        
	        for (int i = 0; ch == 'y'; i++, n++) {
	            System.out.print("\nEnter memory required for process " + (i + 1) + " (in Bytes) -- ");
	            mp[i] = scanner.nextInt();
	            
	            if (mp[i] <= temp) {
	                System.out.println("\nMemory is allocated for Process " + (i + 1));
	                temp = temp - mp[i];
	            } else {
	                System.out.println("\nMemory is Full");
	                break;
	            }
	            
	            System.out.print("\nDo you want to continue(y/n) -- ");
	            ch = scanner.next().charAt(0);
	        }
	        
	        System.out.println("\n\nTotal Memory Available -- " + ms);
	        System.out.println("\n\tPROCESS\t\t MEMORY ALLOCATED ");
	        for (int i = 0; i < n; i++) {
	            System.out.println("\n \t" + (i + 1) + "\t\t" + mp[i]);
	        }
	        
	        System.out.println("\n\nTotal Memory Allocated is " + (ms - temp));
	        System.out.println("Total External Fragmentation is " + temp);
	        
	        scanner.close();
	    }
	}