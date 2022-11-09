package Engine.IO;

import org.lwjgl.BufferUtils;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.stb.STBImage.stbi_load;

public class Image {
    private ByteBuffer image;
    private IntBuffer width, height, channel;

    public void loadImage(String path){
        width = BufferUtils.createIntBuffer(1);
        height = BufferUtils.createIntBuffer(1);
        channel = BufferUtils.createIntBuffer(1);
        image = stbi_load(path, width, height, channel, 0);
    }

    public ByteBuffer getImage(){
        return image;
    }

    public IntBuffer getWidth(){
        return width;
    }

    public IntBuffer getHeight(){
        return height;
    }

    public IntBuffer getChannel(){
        return channel;
    }
}
