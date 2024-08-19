import java.util.Locale;
import java.util.Scanner;

import model.entities.ContaDIO;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Bem vindo ao banco DIO");
            System.out.println("Por favor digite o numero da Agência: ");
            String agencia = sc.nextLine();
            System.out.print("Por favor digite o numero do Usuário: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Por favor digite o nome do Usuário: ");
            String nomeString = sc.nextLine();
            System.out.print("Por favor digite o saldo inicial: ");
            double saldo = sc.nextDouble();

            ContaDIO conta = new ContaDIO(numero, agencia, nomeString, saldo);

            System.out.println(conta);
        } catch (DomainException e) {
           System.out.println("Error: "+ e.getMessage());
           
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }




        sc.close();
      


    }
}
