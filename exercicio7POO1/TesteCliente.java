package exercicioPOO1;

//Classe TesteCliente
public class TesteCliente {
 public static void main(String[] args) {
     // Instanciação dos objetos da classe Cliente
     Cliente cliente1 = new Cliente("João da Silva", 30, "Rua A, 123", "11 9999-8888", 2000.0);
     Cliente cliente2 = new Cliente("Maria Santos", 25, "Rua B, 456", "11 7777-6666", 1500.0);
     
     // Chamada do método visualizar() de cada objeto
     cliente1.visualizar();
     cliente2.visualizar();
 }
}