package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] table = new  int[3][3];
        int i;
        int j = 0;

       for (i = 0; i < 3; i++){
           for (j = 0; j < 3; j++){

               table[i][j] = i*3 + j + 1;
               System.out.print(" " + table[i][j] + " ");
           }
           System.out.println();
       }
    }
}
