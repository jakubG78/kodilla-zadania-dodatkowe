package ProjectChess;

class Application
{
    public static void main (String[] args) throws Exception {
        ChessBoard thisBorad = new ChessBoard();
        thisBorad.initBoard();
        System.out.println(thisBorad.toString());

    }
}