package it.dataStructure;

import it.util.Vector2;

public class Transform {
    
    public Vector2 position;
    public Vector2 scale;
    public float rotation;

    public Transform(Vector2 position) {
        this.position = position;
        this.scale = new Vector2(1.0f, 1.0f);
        this.rotation = 0.0f;
    }

    @Override
    public String toString() {
        return "[PositionX= " + position.x + " PositionY= " + position.y +"]";
    }

}
