package program;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	

	public static class Product {
		public String nome;
		public int quantidade;
		public double valor;
	
		
	public double valorTotalEmEstoque() {
		
		return valor * quantidade;
		
	}
		
		public void addProduct(int quantidade) {
			
			this.quantidade += quantidade;
		}
		public void removeProduct(int quantidade) {
			
			this.quantidade -= quantidade;
			
			
		}
		public String toString() {
			
			return "\n" +
	                "Product: "+nome +"\n" +
	                "Quantity: "+quantidade +"\n" +
	                "Price unity: "+ String.format("R$ %.2f\n", valor) +
	                "Total price: "+ String.format("R$ %.2f\n" +
	                "-------------------------\n",valorTotalEmEstoque());
			
			
		}
			
		
		
	
	}

	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product produto = new Product();
		System.out.print("Nome do produto: ");
		produto.nome = sc.next();
		System.out.print("Quantidade de produtos: ");
		produto.quantidade = sc.nextInt();
		System.out.print("Preço do produto: ");
		produto.valor = sc.nextDouble();
		
		System.out.println();
		System.out.println("Repositório dos produtos: " + produto);
		
		System.out.println();
		System.out.println("Adicionar produtos: ");
		int quantidade = sc.nextInt();
		produto.addProduct(quantidade);
		
		System.out.println("Repositório atualizado: " + produto);
		
		System.out.println();
		System.out.println("Remover produtos: ");
		produto.removeProduct(sc.nextInt());
  
		System.out.println("Repositório atualizado: " + produto);
		
		
		
		sc.close();
		

	

}

}

