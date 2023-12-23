package it.dataStructure;

import it.util.Vector2;

public class Transform {
    
    public Vector2 position;

    public Transform(Vector2 position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "[PositionX= " + position.x + " PositionY= " + position.y +"]";
    }

}
