package nullObjectPattern;

public class ProfileImage {
    private double size;

    public ProfileImage(double s) {
        this.size = s;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void display(){
        System.out.println("The uploaded picture ... ");
    }
}
