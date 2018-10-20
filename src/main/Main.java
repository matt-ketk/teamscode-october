package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\mketk\\Desktop\\SampleFiles\\";
		Scanner file = new Scanner(new File(path + "word.txt"));
		
		/*
		int num = file.nextInt();
		String word = file.next();
		String line = file.next();
		
		System.out.println(num);
		System.out.println(word);
		System.out.println(line);
		*/
		
		problem7(file);
		//problem2(file);
	}
	
	public static void swap(int[] i, int a, int b) {
		int temp = i[a];
		i[a] = i[b];
		i[b] = temp;
	}
	public static void sortincrease(int[] a) {
		int maxpos;
		int max;
		for (int i = 0; i < a.length - 1; i++) {
			max = a[i];
			maxpos = i;
			for (int j = i + 1; j < a.length; j++) {
				if ( max > a[j]) {
					max = a[j];
					maxpos = j;
				}
			}
			swap(a, i, maxpos);
		}
	}
	
	public static void practice(Scanner s) {
		int numLines = s.nextInt();
		s.nextLine(); // NOTE
		// System.out.println(numLines);
		int x = 0;
		for (int i = 0; i < numLines; i++) {
			int sum = 0;
			String[] nums = s.nextLine().split(" ");
			
			for (int j = 0; j < nums.length; j++) {
				if (!nums[j].equals(" ")) {
					x = Integer.parseInt(nums[j]);
					/*
					String num = nums[j];
							= Integer.parseInt(nums[j]);
					System.out.println(x);
					*/
					sum += x; 
				}
				
			}
			System.out.println(sum);
		}
	}
	
	public static void problem1(Scanner s) {
		System.out.println("          __     __");
		System.out.println("         /  \\~~~/  \\");
		System.out.println("   ,----(     ..    )");
		System.out.println("  /      \\__     __/");
		System.out.println(" /|         (\\  |(");
		System.out.println("^ \\   /___\\  /\\ |");
		System.out.println("  |__|    |__|  -");
		
	}
	
	public static void problem3(Scanner s) {
		int num = s.nextInt();
		s.nextLine();
		
		// your code here
		for (int i = 0; i < num; i++) {
			String orgStr = s.nextLine();
			String newStr = s.nextLine();
			String changes = "";
			for (int j = 0; j < orgStr.length(); j++) {
				if (orgStr.charAt(j) != newStr.charAt(j)) {
					changes += newStr.charAt(j);					
				}
			}
			if (changes.equals("")) {
				System.out.println("No change");
			}
			else {
				System.out.println(changes);
		}
		
		}
	}
	
	public static void problem2(Scanner s) {
		int numLines = s.nextInt();
		s.nextLine(); 
		for (int i = 0; i < numLines; i++) {
			String[] nums = s.nextLine().split(" ");
			double a = Double.parseDouble(nums[0]);
			double p = Double.parseDouble(nums[1]);
			double t = Double.parseDouble(nums[2]);
			double r = (a*p)*(1-t);
			System.out.println(r);
		}
	}
	
	public static void problem4(Scanner s) {
		int numlevels = s.nextInt();
		s.nextLine();
		for (int i = 0; i < numlevels; i++) {
			int sumArea = 0;
			int levels = Integer.parseInt(s.nextLine());
			for (int j = 1; j <= levels; j++) {
				sumArea += j * j;
			}
			System.out.println(sumArea);
		}
	}
	
	public static void problem5(Scanner s) {
		int num = s.nextInt();
		s.nextLine();
		// your code here
		for (int i = 0; i < num; i++) {
			String[] nums = s.nextLine().split(" ");
			int ocounter = 0;
			int ecounter = 0;
		
			for (int j = 0; j < nums.length; j++) {
				int nextInt = Integer.parseInt(nums[j]);
				if (nextInt % 2 == 0) {
					ecounter++;
				} else {
					ocounter++;
				}
			}
			int[] oddarr = new int[ocounter];
			int[] evenarr = new int[ecounter];
			ocounter = 0;
			ecounter = 0;
			for (int j = 0; j < nums.length; j++) {
				int nextInt = Integer.parseInt(nums[j]);
				if (nextInt % 2 == 0) {
					evenarr[ecounter] = nextInt;
					ecounter++;
				} else {
					oddarr[ocounter] = nextInt;
					ocounter++;
				}
			}
			
			sortincrease(oddarr);
			sortincrease(evenarr);
			
			for (int j = 0; j < oddarr.length; j++) {
				System.out.print(oddarr[j] + " ");
			}
			for (int j = 0; j < evenarr.length; j++) {
				System.out.print(evenarr[j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void problemx(Scanner s) {
		int num = s.nextInt();
		s.nextLine();
		// your code here
		for (int i = 0; i < num; i++) {
			
		}
	}
	
	public static void problem6 (Scanner s) {
		int numLines = s.nextInt();
		s.nextLine();
		for (int i = 0; i < numLines; i++) {
			int x = s.nextInt();
			int num = 0;
			while (x != 1) {
				if (x%2 == 0) {
					x = x/2;
					num++;
				}
				else {
					x = 3*x +1;
					num++;
				}
			}
			System.out.println(num);
		}
	}
	
	public static int searchkey(String[] a, String key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	public static void problem7(Scanner s) {
		int num = s.nextInt();
		s.nextLine();
		// creating arrays of words to be changed
		String[] find = new String[num];
		String[] replace = new String[num];
		
		//putting words to be changed in the arrays
		for (int i = 0; i < num; i++) {
			String[] split = s.nextLine().split(" ");
			find[i] = split[1];
			replace[i] = split[0];
		}
		
		int num2 = s.nextInt();
		s.nextLine();
		for (int i = 0; i < num2; i++) { //going through each line
			String[] split = s.nextLine().split(" "); //splitting each sentences into individual words
			for (int j = 0; j < split.length; j++) { //iterating thru each word
				String word = split[j];
				if (searchkey(find, word) != -1) {
			
					
					split[j] = replace[searchkey(replace, split[j])];
				} else if (searchkey(replace, split[j]) != -1) {
					if (split[j].charAt(split[j].length() - 1) == ',') {
						split[j] = find[searchkey(find, split[j])] + ",";
					} else if (split[j].charAt(split[j].length() - 1) == '.') {
						split[j] = find[searchkey(find, split[j])] + ".";
					} else {
						split[j] = find[searchkey(find, split[j])];
					}
				}
			}
			for (int j = 0; j < split.length; j++) {
				System.out.print(split[j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void problem8 (Scanner s) {
		int numLines = s.nextInt();
		s.nextLine();
		for (int i = 0; i < numLines; i++) {
	
			int[] dim = new int[2];
			dim[0] = s.nextInt();
			dim[1] = s.nextInt();
			int minRow = dim[0];
			int minCol = dim[1];
			int maxRow = 0;
			int maxCol = 0;
			int row = 0;
			int col = 0;
			s.nextLine();
			for (int q = 0; q < dim[0]; q++) {
				String line = s.nextLine();
				for (int k = 0; k <dim[1]; k++) {
					if ((line.charAt(k) == 'x') || (line.charAt(k) == 'X')) {
						if (q < minRow)
							minRow = q;
						if (q > maxRow)
							maxRow = q;
						if (k < minCol)
							minCol = k;
						if (k > maxCol)
							maxCol = k;
					}
				}
			}
			//System.out.println(minRow);
			//System.out.println(maxRow);
			//System.out.println(minCol);
			//System.out.println(maxCol);
			row = Math.abs(maxRow - minRow) + 1;
			col = Math.abs(maxCol - minCol) + 1;
			System.out.print(row + " ");
			System.out.println(col); 
		}
	}
			
}
