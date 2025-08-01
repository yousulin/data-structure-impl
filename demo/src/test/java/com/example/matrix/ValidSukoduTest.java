package com.example.matrix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ValidSukoduTest {

    @Test
    public void testIsValidSudokuWithValidInput() {
        char [][] validInput = {{'5','3','.','.','7','.','.','.','.'},
                                {'6','.','.','1','9','5','.','.','.'},
                                {'.','9','8','.','.','.','.','6','.'},
                                {'8','.','.','.','6','.','.','.','3'},
                                {'4','.','.','8','.','3','.','.','1'},
                                {'7','.','.','.','2','.','.','.','6'},
                                {'.','6','.','.','.','.','2','8','.'},
                                {'.','.','.','4','1','9','.','.','5'},
                                {'.','.','.','.','8','.','.','7','9'}};
        boolean result = ValidSukodu.isValidSudoku(validInput);
        assertEquals(true, result);
    }

    @Test
    public void testIsValidSudokuWithInvalidInput() {
    char [][] inValidInput =   {{'8','3','.','.','7','.','.','.','.'},
                                {'6','.','.','1','9','5','.','.','.'},
                                {'.','9','8','.','.','.','.','6','.'},
                                {'8','.','.','.','6','.','.','.','3'},
                                {'4','.','.','8','.','3','.','.','1'},
                                {'7','.','.','.','2','.','.','.','6'},
                                {'.','6','.','.','.','.','2','8','.'},
                                {'.','.','.','4','1','9','.','.','5'},
                                {'.','.','.','.','8','.','.','7','9'}};
        boolean result = ValidSukodu.isValidSudoku(inValidInput);
        assertEquals(false, result);
    }

    @Test
    public void testIsValidSudokuWithInvalidInput2() {
    char [][] inValidInput = {{'.','.','.','.','5','.','.','1','.'},
                              {'.','4','.','3','.','.','.','.','.'},
                              {'.','.','.','.','.','3','.','.','1'},
                              {'8','.','.','.','.','.','.','2','.'},
                              {'.','.','2','.','7','.','.','.','.'},
                              {'.','1','5','.','.','.','.','.','.'},
                              {'.','.','.','.','.','2','.','.','.'},
                              {'.','2','.','9','.','.','.','.','.'},
                              {'.','.','4','.','.','.','.','.','.'}};
        boolean result = ValidSukodu.isValidSudoku(inValidInput);
        assertEquals(false, result);
    }
}