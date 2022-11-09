package Engine.graphics;

import Engine.IO.Image;
import org.lwjgl.opengl.*;

import static org.lwjgl.stb.STBImage.stbi_image_free;

public class Material {
    private int textureID;
    private String fileName;

    public Material(String fileName){
        this.fileName = fileName;
    }

    public void create(Image texture){
        textureID = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureID);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        texture.loadImage("resources/textures/" + fileName);
        if(texture.getImage() != null) {
            if(texture.getChannel().get(0) == 3){
                 GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGB, texture.getWidth().get(0), texture.getHeight().get(0), 0, GL11.GL_RGB, GL11.GL_UNSIGNED_BYTE, texture.getImage());
            }else if(texture.getChannel().get(0) == 4){
                GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA, texture.getWidth().get(0), texture.getHeight().get(0), 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, texture.getImage());
            }else{
                System.err.println("Unknown number of channels in image at location: resources/textures/" + fileName);
            }
        }else{
            System.err.println("Couldn't find image at location: resources/textures/" + fileName);
        }
        stbi_image_free(texture.getImage());
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
    }

    public void destroy(){
        GL13.glDeleteTextures(textureID);
    }

    public int getTextureID(){
        return textureID;
    }

}
