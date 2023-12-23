package it.masterengine;

import java.awt.Graphics2D;

public abstract class Scene {
    
    private String name;

    public void Scene(String name) {
        this.name = name;
    }

    public abstract void init();

    public abstract void update(double dt);

    public abstract void draw(Graphics2D g2);

}
