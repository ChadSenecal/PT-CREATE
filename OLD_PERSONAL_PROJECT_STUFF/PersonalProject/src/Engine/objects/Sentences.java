package Engine.objects;

import Engine.maths.Vector3f;

import java.util.ArrayList;

public class Sentences {
    private String input = "";
    private Vector3f userColor;
    private Vector3f position;
    private float spaceBetween = 0.1f;

    public Sentences(String input, Vector3f userColor, Vector3f position){
        this.input = input;
        this.userColor = userColor;
        this.position = position;
    }

    private GameObject convertToLetter(int letter){
            switch(input.charAt(letter)) {
                case ' ':
                    return new ObjABC(0, position, userColor).getLetter();
                case 'A':
                    return new ObjABC(1, position, userColor).getLetter();
                case 'B':
                    return new ObjABC(2, position, userColor).getLetter();
                case 'C':
                    return new ObjABC(3, position, userColor).getLetter();
                case 'D':
                    return new ObjABC(4, position, userColor).getLetter();
                case 'E':
                    return new ObjABC(5, position, userColor).getLetter();
                case 'F':
                    return new ObjABC(6, position, userColor).getLetter();
                case 'G':
                    return new ObjABC(7, position, userColor).getLetter();
                case 'H':
                    return new ObjABC(8, position, userColor).getLetter();
                case 'I':
                    return new ObjABC(9, position, userColor).getLetter();
                case 'J':
                    return new ObjABC(10, position, userColor).getLetter();
                case 'K':
                    return new ObjABC(11, position, userColor).getLetter();
                case 'L':
                    return new ObjABC(12, position, userColor).getLetter();
                case 'M':
                    return new ObjABC(13, position, userColor).getLetter();
                case 'N':
                    return new ObjABC(14, position, userColor).getLetter();
                case 'O':
                    return new ObjABC(15, position, userColor).getLetter();
                case 'P':
                    return new ObjABC(16, position, userColor).getLetter();
                case 'Q':
                    return new ObjABC(17, position, userColor).getLetter();
                case 'R':
                    return new ObjABC(18, position, userColor).getLetter();
                case 'S':
                    return new ObjABC(19, position, userColor).getLetter();
                case 'T':
                    return new ObjABC(20, position, userColor).getLetter();
                case 'U':
                    return new ObjABC(21, position, userColor).getLetter();
                case 'V':
                    return new ObjABC(22, position, userColor).getLetter();
                case 'W':
                    return new ObjABC(23, position, userColor).getLetter();
                case 'X':
                    return new ObjABC(24, position, userColor).getLetter();
                case 'Y':
                    return new ObjABC(25, position, userColor).getLetter();
                case 'Z':
                    return new ObjABC(26, position, userColor).getLetter();
            }
            return null;
    }

    public ArrayList<GameObject> convertToSentece() {
        ArrayList<GameObject> list = new ArrayList<GameObject>();
        for(int i = 0; i < input.length(); i++){
            GameObject letter = convertToLetter(i);
            letter.getPosition().setx(letter.getPosition().getx() + spaceBetween);
            list.add(letter);
            spaceBetween += spaceBetween;
        }

        return list;
    }
}
