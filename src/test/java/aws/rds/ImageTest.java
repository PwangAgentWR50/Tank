package aws.rds;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ImageTest {

    @Test
    public void test() {
        try {
            BufferedImage image = ImageIO.read(new File("/Users/peidingw/IdeaProjects/Tank/src/main/images/bulletD.gif"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
