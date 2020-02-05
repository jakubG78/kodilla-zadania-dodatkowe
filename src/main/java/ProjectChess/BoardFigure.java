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
}
