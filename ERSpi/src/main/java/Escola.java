public class Escola {

    private Professor professor;

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getEscolaridadeDiretor() {
        if (this.professor == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.professor.getNomeEscolaridade();
        }
    }
}
