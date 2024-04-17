public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um numero modelo");

        Modelo modelo = new Modelo("Modelo A");

        Automovel automovel = new Automovel("ABC1234", "Azul", 4, 1, 10000, 123456789, "123456", 100.0);
        automovel.setModelo(modelo);

        System.out.println(automovel);
        
        automovel.setquilometragemAutomovel(10500);
        automovel.setvalorLocacaoAutomovel(120.0);
        
        System.out.println(automovel);
    }
}
