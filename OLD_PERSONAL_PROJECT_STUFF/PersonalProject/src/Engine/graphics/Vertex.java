package Engine.graphics;

import Engine.maths.Vector2f;
import Engine.maths.Vector3f;

public class Vertex {
    private Vector3f position, color;
    private Vector2f textureCoord;
    private float textureIndex;

    public Vertex(Vector3f position, Vector3f color, Vector2f textureCoord, float textureIndex){
    this.position = position;
    this.color = color;
    this.textureCoord = textureCoord;
    this.textureIndex = textureIndex;
    }

    public Vector3f getPosition(){
        return position;
    }
    public Vector3f getColor(){return color;}
    public Vector2f getTextureCoord(){
        return textureCoord;
    }
    public float getTextureIndex(){return textureIndex;}
}
