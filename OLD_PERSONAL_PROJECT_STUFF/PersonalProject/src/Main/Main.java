package Main;
import Engine.IO.Input;
import Engine.IO.Window;
import Engine.graphics.*;
import Engine.maths.Vector2f;
import Engine.maths.Vector3f;
import Engine.objects.Camera;
import Engine.objects.GameObject;
import Engine.objects.ObjABC;
import Engine.objects.Sentences;
import Main.object_data.World;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.CallbackI;

import java.util.ArrayList;

//The cherno video on batch rendering: https://www.youtube.com/watch?v=Th4huqR77rI

public class Main implements Runnable {
    public Thread game;
    public  Window window;
    public Renderer renderer;
    public Shader shader;
    public  final int WIDTH = 1280, HEIGHT = 720;
    //private String[] textureImageNames = {"Bannerpng.png", "StartGame.png", "StartFileWriter.png", "ExitProgram.png"};
    //private Material[] materialList = {new Material(textureImageNames[0]), new Material(textureImageNames[1]), new Material(textureImageNames[2]), new Material(textureImageNames[3])};
   // private int[] textureUnits = {GL13.GL_TEXTURE0, GL13.GL_TEXTURE1, GL13.GL_TEXTURE2, GL13.GL_TEXTURE3};

    public Camera camera = new Camera(new Vector3f(0, 0, 2.5f), new Vector3f(0, 0,0));

    ArrayList<GameObject> everything = new ArrayList<GameObject>();
    public World world = new World(everything);

    public void start(){
        game = new Thread(this,"game");
        game.start();
    }

    public void init() {
        System.out.println("Initializing Game!");
        window = new Window(WIDTH, HEIGHT, "Game");
        shader = new Shader("/shaders/mainVertex.glsl", "/shaders/mainFragment.glsl");
        window.setBackgroundColor(0.0f, 0.5f, 0.0f);
        window.create();

        /*String ABC = "ABC";
        for (int y = 0; y < ABC.length(); y++) {
            world.addToArray(new Sentences(ABC, new Vector3f(0, 0, 0), new Vector3f(0, 0, 1)).convertToSentece().get(y));
        }*/
        for(int a = 0; a < 10; a++) {
            for (int i = 0; i < 10; i++) {
                world.addToArray(new GameObject(new Vector3f(i, a, 0), new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(0.25f, -0.5f, 0.0f), new Vector3f(255, 0, 0), new Vector2f(0.0f,0.0f), 0.0f), // 0
                        new Vertex(new Vector3f(0.25f, 0.5f, 0.0f), new Vector3f(0, 255, 0), new Vector2f(0.0f,0.0f), 0.0f), // 1
                        new Vertex(new Vector3f(0.5f, 0.5f, 0.0f), new Vector3f(0, 0, 255), new Vector2f(0.0f,0.0f), 0.0f), // 2
                        new Vertex(new Vector3f(0.5f, -0.5f, 0.0f), new Vector3f(0, 255, 0), new Vector2f(0.0f,0.0f), 0.0f), // 3

                        new Vertex(new Vector3f(1, 0.5f, 0.0f), new Vector3f(255, 0, 0), new Vector2f(0.0f,0.0f), 0.0f), // 4
                        new Vertex(new Vector3f(1, 0.35f, 0.0f), new Vector3f(0, 100, 0), new Vector2f(0.0f,0.0f), 0.0f), // 5
                        new Vertex(new Vector3f(0.25f, 0.35f, 0.0f), new Vector3f(0, 0, 100), new Vector2f(0.0f,0.0f), 0.0f), // 6

                        new Vertex(new Vector3f(1, -0.5f, 0.0f), new Vector3f(50, 50, 50), new Vector2f(0.0f,0.0f), 0.0f), // 7
                        new Vertex(new Vector3f(1, -0.35f, 0.0f), new Vector3f(190, 0, 190), new Vector2f(0.0f,0.0f), 0.0f), // 8
                        new Vertex(new Vector3f(0.25f, -0.35f, 0.0f), new Vector3f(0, 0, 0), new Vector2f(0.0f,0.0f), 0.0f), // 9

                        new Vertex(new Vector3f(0.75f, 0.0f, 0.0f), new Vector3f(255, 255, 255), new Vector2f(0.0f,0.0f), 0.0f), //10
                }, new int[]{
                        0, 1, 2,    0, 2, 3,    1, 4, 5,    5, 6, 2,    0, 7, 8,    0, 8, 9
                })));
            }
        }
        world.makeMenu();
        //new MaterialCreator().createMaterials(materialList);
        shader.create();
        renderer = new Renderer(window, shader);
        //renderer.bindTextureUnits(materialList, textureUnits);
        renderer.useShaderProgram();
    }

    public void run(){
        init();
        while(!window.shouldClose() && !Input.isKeyDown(GLFW.GLFW_KEY_ESCAPE)){
            update();
            render();
            if(Input.isKeyDown(GLFW.GLFW_KEY_F11)){window.setFullscreen(!window.isFullscreen());}
        }
        close();
    }

    private void update(){
        //System.out.println("updating Game!");
        window.update();
        camera.update();
    }

    private void render(){
        //renderer.textureSetting();
        world.updateRenderer(renderer);
        renderer.renderCamera(camera);
        window.swapBuffers();
    }

    private void close(){
        window.destroy();
        world.destroyWorld();
        /*for(int i = 0; i < materialList.length; i++){
            materialList[i].destroy();
        }*/
        shader.destroy();
        renderer.destroyRenderer();
    }

    public static void main(String[] args){
        new Main().start();
    }
}