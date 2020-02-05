package ProjectChess;

class Application
{
    public static void main (String[] args) throws Exception {
        ChessBoard thisBorad = new ChessBoard();
        for(int i=0; i < 8; i++) {
            thisBorad.theBoard.add(i, new BoardRow());
            for(int j=0; j < 8; j++){
                thisBorad.theBoard.get(i).theRow.add(j,null);
            }
        }

        thisBorad.setFigure(0,0,new BoardFigure("Q","w"));
        thisBorad.setFigure(7,7,new BoardFigure("P","b"));
        BoardFigure result = thisBorad.getFigure(0,0);
//        System.out.println(result.getValueOfFigure()+result.getColor());
        thisBorad.displayBoard();
    }
}