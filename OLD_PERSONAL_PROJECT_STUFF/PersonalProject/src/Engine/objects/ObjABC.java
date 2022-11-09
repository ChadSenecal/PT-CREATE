package Engine.objects;

import Engine.graphics.Mesh;
import Engine.graphics.Vertex;
import Engine.maths.Vector2f;
import Engine.maths.Vector3f;

public class ObjABC {
    private int letter;
    private GameObject userObject;
    private Vector3f userColor;
    private Vector3f position;

    public ObjABC(int letter,Vector3f userColor, Vector3f position) {
        this.letter = letter;
        this.userColor = userColor;
        this.position = position;

        switch(letter){
            //space bar
            case 0:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 1:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(-0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, 0.5f, 0.0f), userColor, new Vector2f(1.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, 0.25f, 0.0f), userColor, new Vector2f(1.0f,1.0f), 0.0f),
                        new Vertex(new Vector3f(-0.25f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,1.0f), 0.0f),

                        new Vertex(new Vector3f(0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.25f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,1.0f), 0.0f),

                        new Vertex(new Vector3f(0.2f, 0.0f, 0.0f), userColor, new Vector2f(1.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.2f, 0.0f, 0.0f), userColor, new Vector2f(1.0f,1.0f), 0.0f),
                        new Vertex(new Vector3f(0.2f, -0.1f, 0.0f), userColor, new Vector2f(1.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.2f, -0.1f, 0.0f), userColor, new Vector2f(1.0f,1.0f), 0.0f)
                }, new int[]{
                        0, 1, 2,     0, 3, 2,    4, 1, 2,    5, 4, 2,   6, 7, 8,    9, 7, 8
                }));
                break;
            case 2:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(0.25f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 0 B.L.
                        new Vertex(new Vector3f(0.25f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 1 T.L.
                        new Vertex(new Vector3f(0.5f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 2 T.R.
                        new Vertex(new Vector3f(0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 3 B.R.

                }, new int[]{
                        0, 1, 2,    0, 2, 3
                }));
                break;
            case 3:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(0.25f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 0
                        new Vertex(new Vector3f(0.25f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 1
                        new Vertex(new Vector3f(0.5f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 2
                        new Vertex(new Vector3f(0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 3

                        new Vertex(new Vector3f(1, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 4
                        new Vertex(new Vector3f(1, 0.35f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 5
                        new Vertex(new Vector3f(0.25f, 0.35f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 6

                        new Vertex(new Vector3f(1, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 7
                        new Vertex(new Vector3f(1, -0.35f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 8
                        new Vertex(new Vector3f(0.25f, -0.35f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), // 9

                        new Vertex(new Vector3f(0.75f, 0.0f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f), //10
                }, new int[]{
                        0, 1, 2,    0, 2, 3,    1, 4, 5,    5, 6, 2,    0, 7, 8,    0, 8, 9
                }));
                break;
            case 4:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(-0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.5f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),

                        new Vertex(new Vector3f(-0.2f, 0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.1f, 0f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.2f, -0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),


                }, new int[]{
                        0, 1, 2,    2, 3, 0,    2, 4, 0,    4, 5, 0,    5, 6, 0,    0, 6, 3
                }));
                break;
            case 5:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(-0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.5f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),

                        new Vertex(new Vector3f(0.0f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, 0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, 0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),

                        new Vertex(new Vector3f(-0.3f, 0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, 0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, -0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),

                        new Vertex(new Vector3f(0.0f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, -0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                }, new int[]{
                        0, 1, 2,    2, 3, 0,    6, 5, 2,    2, 4, 5,    7, 8, 9,    9, 10, 8,   11, 12, 13,     3, 13, 11
                }));
                break;
            case 6:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(-0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.5f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),

                        new Vertex(new Vector3f(0.0f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, 0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, 0.3f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),

                        new Vertex(new Vector3f(-0.3f, 0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, 0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(0.0f, -0.1f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                }, new int[]{
                        0, 1, 2,    2, 3, 0,    6, 5, 2,     2, 4, 5,   7, 8, 9,    9, 10, 8,
                }));
                break;
            case 7:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{
                        new Vertex(new Vector3f(-0.5f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.5f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, 0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                        new Vertex(new Vector3f(-0.3f, -0.5f, 0.0f), userColor, new Vector2f(0.0f,0.0f), 0.0f),
                }, new int[]{

                }));
                break;
            case 8:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 9:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 10:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 11:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 12:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 13:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 14:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 15:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 16:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 17:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 18:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 19:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 20:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 21:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 22:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 23:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 24:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 25:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
            case 26:
                userObject = new GameObject(position, new Vector3f(0, 0, 0), new Vector3f(1, 1, 1), new Mesh(new Vertex[]{

                }, new int[]{

                }));
                break;
        }
    }

    public GameObject getLetter(){
        return userObject;
    }

}
