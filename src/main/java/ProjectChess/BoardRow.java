package ProjectChess;

import java.util.ArrayList;

public class BoardRow {

    ArrayList<BoardFigure> theRow = new ArrayList<>();

    public ArrayList<BoardFigure> getTheRow() {
        return theRow;
    }

    public void setThisRow(ArrayList<BoardFigure> theRow) {
        this.theRow = theRow;
    }
}
