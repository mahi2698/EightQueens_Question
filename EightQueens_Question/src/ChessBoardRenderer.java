public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int row=(square/8);
		int column=(square%8);
		if(row%2==0&&column%2==0)
			return false;
		else if(row%2==0&&column%2!=0)
			return true;
		else if(row%2!=0&&column%2==0)
			return true;
		else
			return false;
	}
}
