import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        double valorProduto, valorDesconto, valorFinal;
        
        System.out.println("O cliente é premium? (S/N)");
        String clientePremium = sc.next();

        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        if (valorProduto >= 200) {
            valorDesconto = valorProduto * 0.05;
        } else {
            valorDesconto = 0.0;
        }

            if (clientePremium.equalsIgnoreCase("S")) {
                valorDesconto = valorProduto * 0.15;
            }

        if (valorProduto < 200 && clientePremium.equalsIgnoreCase("S")) {
            valorDesconto = 0;
        }
        
        valorFinal = valorProduto - valorDesconto;

        System.out.println("Valor do produto: R$ " + valorProduto);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }
}