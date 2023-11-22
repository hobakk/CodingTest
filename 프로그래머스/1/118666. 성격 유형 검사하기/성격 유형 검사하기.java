import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
		int[][] arrs = new int[4][2];
		for (int i=0; i < survey.length; i++) {
			int point = 0;
			String str = "";
			switch(choices[i]) {
				case 1: str = Character.toString(survey[i].charAt(0)); point = 3; break;
				case 2: str = Character.toString(survey[i].charAt(0)); point = 2; break;
				case 3: str = Character.toString(survey[i].charAt(0)); point = 1; break;
				case 5: str = Character.toString(survey[i].charAt(1)); point = 1; break;
				case 6: str = Character.toString(survey[i].charAt(1)); point = 2; break;
				case 7: str = Character.toString(survey[i].charAt(1)); point = 3; break;
			}

			switch(str) {
				case "R": arrs[0][0] += point; break;
				case "T": arrs[0][1] += point; break;
				case "C": arrs[1][0] += point; break;
				case "F": arrs[1][1] += point; break;
				case "J": arrs[2][0] += point; break;
				case "M": arrs[2][1] += point; break;
				case "A": arrs[3][0] += point; break;
				case "N": arrs[3][1] += point; break;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i=0; i < arrs.length; i++) {
			int[] arr = arrs[i];

			if (arr[0] < arr[1] && i == 0) sb.append("T");
			else if (arr[0] >= arr[1] && i == 0) sb.append("R");

			if (arr[0] < arr[1] && i == 1) sb.append("F");
			else if (arr[0] >= arr[1] && i == 1) sb.append("C");

			if (arr[0] < arr[1] && i == 2) sb.append("M");
			else if (arr[0] >= arr[1] && i == 2) sb.append("J");

			if (arr[0] < arr[1] && i == 3) sb.append("N");
			else if (arr[0] >= arr[1] && i == 3) sb.append("A");
		}

		return sb.toString();
	}
}