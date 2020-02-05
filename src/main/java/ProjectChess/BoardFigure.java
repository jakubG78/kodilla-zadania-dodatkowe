package ProjectChess;

class BoardFigure extends Figure {

    String valueOfFigure;

    public BoardFigure(String valueOfFigure, String color) {
        super(color);
        this.valueOfFigure = valueOfFigure;
    }

    public String getValueOfFigure() {
        return valueOfFigure;
    }

    public void setValueOfFigure(String figure) {
        if(figure.equals("P")||figure.equals("Q")){
            this.valueOfFigure = figure;
        } else {
            this.valueOfFigure = "0";
        }
    }
}
