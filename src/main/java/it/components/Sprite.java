package it.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import it.dataStructure.AssetPool;
import it.masterEngine.Component;

public class Sprite extends Component {
    
    public BufferedImage image;
    public String pictureFile;
    public int width;
    public int height;

    public Sprite(String pictureFile) {
        this.pictureFile = pictureFile;
        try {
            File file = new File(pictureFile);
            if (AssetPool.hasSprite(pictureFile)) {
                throw new Exception("Asset Already Exist: " + pictureFile);
            }
            this.image = ImageIO.read(new File(pictureFile));
            this.width = image.getWidth();
            this.height = image.getHeight();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public Sprite(BufferedImage image) {
        this.image = image;
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.drawImage(image, (int) gameObject.transform.position.x, (int) gameObject.transform.position.y, width, height, null);
    }

}
