public class Carro {
    // variaveis
    // tipo de dados primitivo
    public int ano;
    public float velocidade;
    // tipo de dado é uma classe
    public String marca, modelo;
    // métodos construtores
    // sem parâmetro


    public Carro(){
        this.marca = "Vazio";
        this.modelo = "Vazio";
    }

    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano;
        this.velocidade;
        this.marca = marca;
        this.modelo - modelo;
    }

    //métodos
    public void exibirDetalhes(){
        //this representa o objeto que chama o método
        System.out.println("Marca: " + this.marca +
                "Modelo: " + this.modelo +
                "Ano: " + this.ano +
                "Velocidade: " + this.velocidade);
    }
    public void acelerar(float x){
        this.velocidade = this.velocidade + X;
    }
}
