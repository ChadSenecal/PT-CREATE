package Engine.graphics;

import Engine.IO.Window;
import Engine.maths.Matrix4f;
import Engine.objects.Camera;
import Engine.objects.GameObject;
import org.lwjgl.opengl.*;

public class Renderer {
    private Shader shader;
    private Window window;

    public Renderer(Window window, Shader shader){
        this.shader = shader;
        this.window = window;
    }

    public void bindTextureUnits(Material[] material, int[] textureUnits){
        for(int i = 0; i < material.length; i++) {
                GL13.glActiveTexture(textureUnits[i]);
                GL13.glBindTexture(GL13.GL_TEXTURE_2D, material[i].getTextureID());
        }
    }

    public void useShaderProgram(){
        shader.bind();
    }

    /*public void textureSetting(){
        int loc = shader.getUniformLocataion("textures");
        int[] samplers = {0, 1, 2, 3};
        GL20.glUniform1iv(loc, samplers);
    }*/

    public void updateRenderer(GameObject object){
        GL30.glBindVertexArray(object.getMesh().getVAO());
        GL30.glEnableVertexAttribArray(0);
        GL30.glEnableVertexAttribArray(1);
        GL30.glEnableVertexAttribArray(2);
        GL30.glEnableVertexAttribArray(3);

        GL11.glDrawElements(GL11.GL_TRIANGLES, object.getMesh().getIndices().length, GL11.GL_UNSIGNED_INT, 0);

        shader.setUniform("model", Matrix4f.transform(object.getPosition(), object.getRotation(), object.getScale()));
        shader.setUniform("projection", window.getProjectionMatrix());
    }

    public void renderCamera(Camera camera){
        shader.setUniform("view", Matrix4f.view(camera.getPosition(), camera.getRotation()));
    }

    public void destroyRenderer(){
        shader.unBind();
        GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
        GL30.glDisableVertexAttribArray(0);
        GL30.glDisableVertexAttribArray(1);
        GL30.glDisableVertexAttribArray(2);
        GL30.glDisableVertexAttribArray(3);
        GL30.glBindVertexArray(0);
    }
}
