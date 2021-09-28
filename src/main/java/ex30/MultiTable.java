package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class MultiTable
{
    public static void main(String[] args)
    {
        int i, j, row = 1, column = 1;
        int[][] matrix1 = new int[12][12];

        for(i = 0; i < matrix1.length; i++)
        {
            for (j = 0; j < matrix1[i].length; j++)
            {
                matrix1[i][j] = row * column;
                System.out.printf("%6d", matrix1[i][j]);
                column += 1;
            }
            System.out.print("\n");
            row += 1;
            column = 1;
        }
    }
}
