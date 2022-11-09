package Engine.objects;

import Engine.graphics.Material;
import Engine.graphics.Mesh;
import Engine.maths.Vector3f;

public class GameObject {
    private Vector3f position, rotation, scale;
    private Mesh mesh;

    public GameObject(Vector3f position, Vector3f rotation, Vector3f scale, Mesh mesh){
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
        this.mesh = mesh;
    }

    public void update(){
        position.setz(position.getz() - 0.05f);
    }

    public Vector3f getPosition(){
        return position;
    }

    public void moveObjectPosition(float x, float y, float z){
        position = Vector3f.add(position, new Vector3f(x, y, z));
    }

    public Vector3f getRotation(){
        return rotation;
    }

    public void rotateObject(float x, float y, float z){
        rotation = Vector3f.add(rotation, new Vector3f(x, y, z));
    }

    public Vector3f getScale(){
        return scale;
    }

    public void scaleObject(float x, float y, float z){
        scale = Vector3f.add(scale, new Vector3f(x, y, z));
    }

    public Mesh getMesh(){
        return mesh;
    }
}
