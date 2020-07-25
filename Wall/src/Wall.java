public class Wall {
    private double width;
    private double height;




    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            width = 0;
            this.width = width;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0 ){
           height = 0;
           this.height = height;
        }
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public Wall(double width,double height){
        if (width < 0){
            width = 0;
            this.height = height;
            this.width = width;
        }
        if (height < 0 ){
            height = 0;
            this.height = height;
            this.width = width;
        } else {
            this.height = height;
            this.width = width;
        }
    }
    public Wall(){
    }

}
