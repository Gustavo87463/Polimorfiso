package SuperClass;
public class Animal {

    protected double peso;
    protected int idade;
    protected int numeroMembros;


    public void locomover(){
        System.out.println("Metodo locomover de classe animal");

    }

    public void alimentar(){
        System.out.println("Metodo alimentar da classe animal");
    }

    public void emitirom(){
        System.out.println("Metodo emitirsom da classe animal");
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroMembros() {
        return numeroMembros;
    }

    public void setpeso(double peso){
        this.peso = peso;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNumeroMembros(int numeroMembros) {
        this.numeroMembros = numeroMembros;
    }


    


}