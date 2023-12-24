package it.masterEngine;

import java.awt.Color;
import java.awt.Graphics2D;

import it.components.BoxBounds;
import it.dataStructure.AssetPool;
import it.dataStructure.Transform;
import it.util.Constants;
import it.util.Vector2;

public class LevelEditorScene extends Scene{

    GameObject testObj;

    public LevelEditorScene(String name) {
        super.Scene(name);
    }

    @Override
    public void init() {
        testObj = new GameObject("Some Game Object", new Transform(new Vector2(0.0f, 0.0f)));
        testObj.addComponent(new BoxBounds("Box"));
        testObj.addComponent(AssetPool.getSprite("assets/pic.png"));
    }

    @Override
    public void update(double dt) {
        System.out.println(testObj.getComponent(BoxBounds.class).name);
        testObj.update(dt);
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        testObj.draw(g2);
    }

}
