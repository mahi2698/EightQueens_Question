public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int column=(cellId%8);
		return column;	
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int row=(cellId/8);
		return row;	
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;
		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
			
		//is there a queen in the same row
		for(int i=0;i<8;i++) {
			if(placedQueens[row][i]==true) {
				return false;
			}
		}
		//is there a queen in the same col
		for(int i=0;i<8;i++) {
			if(placedQueens[i][col]==true) {
				return false;
			}
		}
		//is there a queen on the first diagonal
		int x=row+1;
		int y=col+1;
		while(x<8&&y<8) {
			if(placedQueens[x][y]==true) {
				return false;
			}
			x++;
			y++;
		}
		
		x=row-1;
		y=col-1;
		while(x>=0&&y>=0) {
			if(placedQueens[x][y]==true) {
				return false;
			}
			x--;
			y--;
		}
		//is there a queen in the second diagonal
		x=row+1;
		y=col-1;
		while(x<8&&y>=0) {
			if(placedQueens[x][y]==true) {
				return false;
			}
			x++;
			y--;
		}
		x=row-1;
		y=col+1;
		while(x>=0&&y<8) {
			if(placedQueens[x][y]==true) {
				return false;
			}
			x--;
			y++;
		}
		if(isValid) {
			placedQueens[row][col]=true;
			numQueens++;
		}
		return isValid;
	}
}














