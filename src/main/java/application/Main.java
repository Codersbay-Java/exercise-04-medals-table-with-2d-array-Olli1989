package application;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final int NUMB_OF_COUNTRIES = 8;
		final int NUMB_OF_MEDAlS = 3;
		String[] countries = {"Deutschland", "Vereinigte Staaten", "Österreich",
				"Russland","Kanada","Schweden","Südkorea","Schweiz"};
		int[][] medals = {{11, 12, 6}, {9, 9, 7}, {9, 7, 7}, {8, 6, 8},
				{7, 10, 7}, {7, 2, 5}, {6, 3, 2}, {5, 4, 5}};

		int sum;

		for (int i = 0; i < countries.length; i++) {
			sum=0;
			System.out.print((i+1) + "." + countries[i] + ": ");
			for (int j = 0; j < medals[i].length; j++) {
				if(j!=medals[i].length-1){
					System.out.print(medals[i][j] + ",");
				} else {
					System.out.print(medals[i][j]);
				}
				sum+=medals[i][j];
			}
			System.out.print(" -> Medals in total: "+sum);
			System.out.println();
		}

		int[] newArr = getAllSilverMedals(medals);
		System.out.println(Arrays.toString(newArr));
	}

	public static int[] getAllSilverMedals(int[][] medals){
		int[] silverMedals = new int[medals.length];
		for (int i = 0; i < medals.length; i++) {
			silverMedals[i] = medals[i][1];
		}
		return silverMedals;
	}

}
