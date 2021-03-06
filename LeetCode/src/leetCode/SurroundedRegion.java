package leetCode;
import java.util.*;

public class SurroundedRegion {
	
	public static void main(String[] args){
		Stack<Integer> s = new Stack<Integer>();
		
	}
	public void solve(char[][] board) {
		
		if (board==null||board.length==0){
			return;
		}
		for (int j=0;j<board[0].length;j++){
			if (board[0][j]=='O'){
				checkNeighbor(0,j,board);
			}
			if (board[board.length-1][j]=='O'){
				checkNeighbor(0,j,board);
			}
		}
		for (int i=0;i<board.length;i++){
			if (board[i][0]=='O'){
				checkNeighbor(i,0,board);
			}
			if (board[i][board[0].length-1]=='O'){
				checkNeighbor(i,board[0].length-1,board);
			}
			
		}
		
		for (int i=0;i<board.length;i++){
			for (int j=0;j<board[0].length;j++){
				if (board[i][j]=='Y'){
					board[i][j]='X';
				}
			}
		}
	}
	
	public void checkNeighbor(int row,int col, char[][] board){
		if (board[row][col]=='O'){
			board[row][col] = 'Y';	
		}
		else{
			return;
		}
		if (row-1>0){
			checkNeighbor(row-1,col,board);
		}
		if (col-1>0){
			checkNeighbor(row,col-1,board);
		}
		if (row+1<board.length){
			checkNeighbor(row+1,col,board);
		}
		if (col+1<board[0].length){
			checkNeighbor(row,col+1,board);
		}
	}
}
