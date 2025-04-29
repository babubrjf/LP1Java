package atividade04;

public class Carro {

    private float quilometros;
    private float litros;
    private float media;

    public float getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(float quilometros) {
        this.quilometros = quilometros;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float media(){
        return this.media = this.quilometros/this.litros;
    }

}
