package ProjectChess;

import java.util.ArrayList;

public class ChessBoard {
    ArrayList<BoardRow> theBoard = new ArrayList<>();

    BoardFigure getFigure(int row, int col){
        return theBoard.get(row).theRow.get(col);
    }

    void setFigure(int row, int col, BoardFigure figure){
        theBoard.get(row).theRow.set(col,figure);
    }

    @Override
    public String toString() {
        String result = "";
        for(int y= 0; y<theBoard.size(); y++){
            for(int x=0; x<theBoard.get(y).theRow.size(); x++){
                if(getFigure(y,x)!=null){
                    result = result + " "+ getFigure(y,x).getColor() + getFigure(y,x).getValueOfFigure()+" ";
                } else {
                    result = result + " 00 ";
                }
            }
            result = result +"\n";
        }
        return result;
    }
}
