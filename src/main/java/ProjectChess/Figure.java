package ProjectChess;

class Figure{
    public String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("b")||color.equals("w")){
            this.color = color;
        } else {
            this.color = "0";
        }
    }
}
