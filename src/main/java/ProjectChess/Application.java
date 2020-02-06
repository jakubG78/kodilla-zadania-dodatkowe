package ProjectChess;

class Application
{
    public static void main (String[] args) throws Exception {
        ChessBoard thisBorad = new ChessBoard();
        thisBorad.initBoard();

        thisBorad.setFigure(0,0,new PawnFigure(FigureColor.WHITE));
        thisBorad.setFigure(7,7,new QueenFigure(FigureColor.BLACK));
        System.out.println(thisBorad.toString());
        thisBorad.setFigure(3,3,new PawnFigure(FigureColor.BLACK));
        System.out.println(thisBorad.toString());

    }
}