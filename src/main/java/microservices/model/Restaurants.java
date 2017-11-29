package microservices.model;

public class Restaurants {
    private int id;
    private String nome;
    private String tipoculinaria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoculinaria() {
        return tipoculinaria;
    }

    public void setTipoculinaria(String tipoculinaria) {
        this.tipoculinaria = tipoculinaria;
    }
}
