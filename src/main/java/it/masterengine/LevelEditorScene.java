package it.masterEngine;

import java.awt.Color;
import java.awt.Graphics2D;

import it.components.BoxBounds;
import it.components.Player;
import it.components.Spritesheet;
import it.dataStructure.AssetPool;
import it.dataStructure.Transform;
import it.util.Constants;
import it.util.Vector2;

public class LevelEditorScene extends Scene{

    GameObject player;

    public LevelEditorScene(String name) {
        super.Scene(name);
    }

    @Override
    public void init() {
        player = new GameObject("Some Game Object", new Transform(new Vector2(500.0f, 300.0f)));
        Spritesheet layerOne = new Spritesheet("assets/player/layerOne.png",
             42, 42, 2, 13, 13*5);
        Spritesheet layerTwo = new Spritesheet("assets/player/layerTwo.png",
             42, 42, 2, 13, 13*5);
        Spritesheet layerThree = new Spritesheet("assets/player/layerThree.png",
             42, 42, 2, 13, 13*5);         
        Player playerComp = new Player(
            layerOne.sprites.get(0), 
            layerTwo.sprites.get(0), 
            layerThree.sprites.get(0), 
            Color.RED, Color.BLUE);
        player.addComponent(playerComp);
    }

    @Override
    public void update(double dt) {
        player.update(dt);
        player.transform.rotation += dt * 1f;
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        player.draw(g2);
    }

}
