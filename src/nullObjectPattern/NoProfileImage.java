package nullObjectPattern;

public class NoProfileImage extends ProfileImage{
    public NoProfileImage(){
        super(200);
    }

    @Override
    public void display(){
        System.out.println("A default image, for the profile picture ...");
    }
}
