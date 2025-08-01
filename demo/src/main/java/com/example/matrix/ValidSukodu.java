package com.example.matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSukodu {

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> uniqueValRow = new HashSet<>();
        Set<Character> uniqueVaCol = new HashSet<>();
        Set<Character> uniqueValBox = new HashSet<>();
        // MatrixTerm[] cells = new MatrixTerm[81];
        // int index = 0;
        //iterate through two dimensional array 'board' to 'cells'
        for(int slow = 0; slow < 9; slow++){
            for(int fast = 0; fast < 9; fast++){
                // take action only when cell's value is not '.'
                // Check duplicates for the same row and same  column
                //     if unique value appears then save into set, 
                //     if duplicate appear then return false
                // System.out.println("uniqueValRow: "+uniqueValRow.toString());
                // System.out.println("uniqueValRow: "+uniqueVaCol.toString());
                if(board[slow][fast] != '.' && !uniqueValRow.contains(board[slow][fast])){
                    // save the row, col and value to a new MatrixTerm object, then place into 'cells'
                    // MatrixTerm term = new MatrixTerm(slow, fast, board[slow][fast]);
                    // System.out.println(term.toString());
                    // cells[index] = term;
                    // index++;
                    uniqueValRow.add(board[slow][fast]);
                }else if(uniqueValRow.contains(board[slow][fast])){
                    System.out.println("Found duplicates in board["+slow+"]["+fast+"]");
                    return false;
                }
                if(board[fast][slow] != '.' && !uniqueVaCol.contains(board[fast][slow])){
                    uniqueVaCol.add(board[fast][slow]);
                }else if(uniqueVaCol.contains(board[fast][slow])){
                    System.out.println("Found duplicates in board["+fast+"]["+slow+"]");
                    return false;
                }
                if(slow % 3 == 0 && fast % 3 == 0){
                    // check for 3x3 sub-boxes
                    System.out.println("Checking box at ["+slow+"]["+fast+"]");
                    for(int i = slow; i < slow + 3; i++){
                        for(int j = fast; j < fast + 3; j++){
                            if(board[i][j] != '.' && !uniqueValBox.contains(board[i][j])){
                                uniqueValBox.add(board[i][j]);
                            }else if(uniqueValBox.contains(board[i][j])){
                                System.out.println("Found duplicates in box at ["+i+"]["+j+"]");
                                return false;
                            }
                        }
                    }
                    uniqueValBox.clear();
                }
            }
            uniqueValRow.clear();
            uniqueVaCol.clear();
        }
        // System.out.println("All cells: ");
        // for (int i = 0; i < cells.length; i++) {
        //     if (cells[i] != null) {
        //         System.out.println(i+" "+cells[i].toString());
        //     }
        // }
        return true;
    }
}

// class MatrixTerm {
//     int row;
//     int col;
//     char value;

//     public MatrixTerm(int row, int col, char value){
//         this.row = row;
//         this.col = col;
//         this.value = value;
//     }

//     @Override
//     public String toString() {
//         return "MatrixTerm [row=" + row + ", col=" + col + ", value=" + value + "]";
//     }
// } 