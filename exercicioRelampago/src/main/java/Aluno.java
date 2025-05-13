public class Aluno extends Pessoa {
    private float nota1;
    private float nota2;
    private float media;
    private int matricula;

    public Aluno(String nome, float nota1, float nota2, float media, int matricula) {
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.matricula = matricula;
    }

    public Aluno(){

    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        if (nota1 < 0 || nota1 > 10) {
            throw new IllegalArgumentException("Nota 1 inválida");
        }
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        if (nota2 < 0 || nota2 > 10) {
            throw new IllegalArgumentException("Nota 2 inválida");
        }
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        if (media < 0 || media > 10) {
            throw new IllegalArgumentException("Média inválida");
        }
        this.media = media;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            throw new IllegalArgumentException("Matricula inválida");
        }
        this.matricula = matricula;
    }

    public float calcularMedia() {
        return this.media = (this.nota1 + this.nota2)/2;
    }
}
