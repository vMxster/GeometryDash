package it.components;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.Color;

import it.masterEngine.Component;
import it.util.Constants;

public class Player extends Component{

    public Sprite layerOne;
    public Sprite layerTwo;
    public Sprite layerThree;
    public int width;
    public int height;
    
    public Player(Sprite layerOne, Sprite layerTwo, Sprite layerThree,
            Color colorOne, Color colorTwo) {
        this.layerOne = layerOne;
        this.layerTwo = layerTwo;
        this.layerThree = layerThree;
        this.width = Constants.PLAYER_WIDTH;
        this.height = Constants.PLAYER_HEIGHT;
        int threshold = 200;
        for (int y=0 ; y < layerOne.image.getWidth() ; y++) {
            for (int x=0 ; x < layerOne.image.getHeight() ; x++) {
                Color color = new Color(layerOne.image.getRGB(x, y));
                if (color.getRed() > threshold && color.getGreen() > threshold && color.getBlue() > threshold) {
                    layerOne.image.setRGB(x, y, colorOne.getRGB());
                }
            }
        }

        for (int y=0 ; y < layerTwo.image.getWidth() ; y++) {
            for (int x=0 ; x < layerTwo.image.getHeight() ; x++) {
                Color color = new Color(layerTwo.image.getRGB(x, y));
                if (color.getRed() > threshold && color.getGreen() > threshold && color.getBlue() > threshold) {
                    layerTwo.image.setRGB(x, y, colorTwo.getRGB());
                }
            }
        }
    }

    @Override
    public void draw(Graphics2D g2) {
        AffineTransform transform = new AffineTransform();
        transform.setToIdentity();
        transform.translate(gameObject.transform.position.x, gameObject.transform.position.y);
        transform.rotate(gameObject.transform.rotation, 
            width / 2.0, height / 2);
        transform.scale(gameObject.transform.scale.x, gameObject.transform.scale.y);
        g2.drawImage(layerOne.image, transform, null);
        g2.drawImage(layerTwo.image, transform, null);
        g2.drawImage(layerThree.image, transform, null);
    }
    
}
