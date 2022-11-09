package Engine.maths;

import java.util.Objects;

public class Vector3f {
    private float x ,y, z;

    public Vector3f(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void set(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3f add(Vector3f vector1, Vector3f vector2){
        return new Vector3f(vector1.getx() + vector2.getx(), vector1.gety() + vector2.gety(), vector1.getz() + vector2.getz());
    }

    public static Vector3f subtraction(Vector3f vector1, Vector3f vector2){
        return new Vector3f(vector1.getx() - vector2.getx(), vector1.gety() - vector2.gety(), vector1.getz() - vector2.getz());
    }

    public static Vector3f multiply(Vector3f vector1, Vector3f vector2){
        return new Vector3f(vector1.getx() * vector2.getx(), vector1.gety() * vector2.gety(), vector1.getz() * vector2.getz());
    }

    public static Vector3f divide(Vector3f vector1, Vector3f vector2){
        return new Vector3f(vector1.getx() / vector2.getx(), vector1.gety() / vector2.gety(), vector1.getz() / vector2.getz());
    }

    public static float length(Vector3f vector){
        return (float)Math.sqrt((vector.getx() * vector.getx())+(vector.gety() * vector.gety())+(vector.getz() * vector.getz()));
    }

    public static Vector3f normalize(Vector3f vector){
        float len = Vector3f.length(vector);
        return Vector3f.divide(vector, new Vector3f(len, len, len));
    }

    public static float dot(Vector3f vector1, Vector3f vector2){
        return (vector1.getx() * vector2.getx())+(vector1.gety() * vector2.gety())+(vector1.getz() * vector2.getz());
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3f vector3f = (Vector3f) o;
        return Float.compare(vector3f.x, x) == 0 &&
                Float.compare(vector3f.y, y) == 0 &&
                Float.compare(vector3f.z, z) == 0;
    }

    public float getx(){
        return x;
    }
    public void setx(float x){
        this.x = x;
    }
    public float gety(){
        return y;
    }
    public void sety(float y){
        this.y = y;
    }
    public float getz(){
        return z;
    }
    public void setz(float z){
        this.z = z;
    }

}
