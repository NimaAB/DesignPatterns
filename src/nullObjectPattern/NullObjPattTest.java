package nullObjectPattern;

import java.util.ArrayList;

public class NullObjPattTest {
    public static void main(String[] args) {
       ProfileImage [] pImgs = {new ProfileImage(1000),new ProfileImage(0),new NoProfileImage()};
        for (ProfileImage img:pImgs) {
            img.display();
        }
    }
}
