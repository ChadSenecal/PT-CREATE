#version 460 core

in vec3 passColor;
in vec2 passTextureCoord;
in float passTextureIndex;

//out vec4 outTex;
out vec3 outColor;
//uniform sampler2D textures[3];

void main(){
    /*int index = int(passTextureIndex);
    outTex = texture(textures[index], passTextureCoord);*/

    outColor = passColor;
}