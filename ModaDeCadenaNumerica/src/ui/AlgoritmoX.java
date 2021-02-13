package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AlgoritmoX {
	
	public static int resolver(int[] nums) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < nums.length; i++) {
			int c = nums[i];
			int d = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[j]==c) {
					d++;
				}
			}
			if (d>b) {
				b = d;
				a = c;
			}
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String linea = br.readLine();
		String[]vals = linea.split(" ");
		int[] nums = new int[vals.length];
		for (int i = 0; i < vals.length; i++) {
			nums[i] = Integer.parseInt(vals[i]);
		}
		
		int x = resolver(nums);
		bw.write(x + "\n");
		
		br.close();
		bw.close();
		
	}

}
