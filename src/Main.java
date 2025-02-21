public class Main {
    public static void main(String[] args) {
        // criando objetos da classe Carro
        // instanciar a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2015;
        obj1.velocidade = 0.0f;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2018, 0.0f, "Volks", "Gol");
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();

    }
}