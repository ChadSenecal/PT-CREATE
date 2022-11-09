package Engine.graphics;

import Engine.IO.Image;

public class MaterialCreator {
    public void createMaterials(Material[] material){
        for(int i = 0; i < material.length; i++){
            material[i].create(new Image());
        }
    }
}
