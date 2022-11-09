package Main.object_data;
import Engine.graphics.Renderer;
import Engine.objects.GameObject;
import Engine.objects.ObjABC;

import java.util.ArrayList;

public class World {
    private ArrayList<GameObject> everything;
    private int array_section = 0;

    public World(ArrayList<GameObject> everything){
       this.everything = everything;
    }

    public void addToArray(GameObject object){
        everything.add(array_section, object);
        array_section++;
    }

    public void makeMenu(){
        for(int z = 0; z < everything.size(); z++){
            everything.get(z).getMesh().create();
        }
    }

    public void updateRenderer(Renderer renderer){
        for(int u = 0; u < everything.size(); u++){
            renderer.updateRenderer(everything.get(u));
        }
    }

    public void destroyWorld(){
        for(int o = 0; o < everything.size(); o++){
            everything.get(o).getMesh().destroy();
        }
    }
}
