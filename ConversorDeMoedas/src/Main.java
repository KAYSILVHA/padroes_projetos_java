import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entradaDeValores = new Scanner(System.in);
        System.out.println("Digite um Valor: ");
        double valorASerConvertido = entradaDeValores.nextInt();

        Scanner escolherOperacao = new Scanner(System.in);
        System.out.println("Escolha a Operação:\r\n" +
                "1- Converter de Reais a Dólar\r\n" +
                "2- Converter de Reais a Euro\r\n" +
                "3- Converter de Reais a Libras Esterlinas\r\n" +
                "4- Converter de Reais a Peso argentino\r\n" +
                "5- Converter de Reais a Peso Chileno\r\n" +
                "6- Converter de Dólar a Reais\r\n" +
                "7 - Converter de Euro a Reais\r\n" +
                "8- Converter de Libras Esterlinas a Reais\r\n" +
                "9- Converter de Peso argentino a  Reais\r\n" +
                "10- Converter de Peso Chileno a Reais\r\n" +
                "Digite o numero da operacao escolhida: ");
        int operacaoEscolhida = escolherOperacao.nextInt();


        double reaisParaDolar = (valorASerConvertido * 0.21);
        double reaisParaEuro = (valorASerConvertido * 0.19);
        double reaisParaLibrasEsterlinas = (valorASerConvertido * 0.16);
        double reaisParaPesoArgentino = (valorASerConvertido * 54.78);
        double reaisParaPesoChileno = (valorASerConvertido * 168.43 );
        double dolarParaReais = (valorASerConvertido / 0.21);
        double euroParaReais = (valorASerConvertido / 0.19);
        double librasEsterlinasParaReais = (valorASerConvertido / 0.16);
        double pesoArgentinoParaReais = (valorASerConvertido / 54.78);
        double pesoChilenoParaReais = (valorASerConvertido / 168.43);



        if(operacaoEscolhida == 1){
            System.out.printf("Resultado: %.3f %n", reaisParaDolar);
        }else if(reaisParaEuro == 2){
            System.out.printf("Resultado: %.3f %n", reaisParaEuro);
        }else if(reaisParaLibrasEsterlinas == 3){
            System.out.printf("Resultado: %.3f %n", reaisParaLibrasEsterlinas);
        }else if(reaisParaPesoArgentino == 4){
            System.out.printf("Resultado: %.3f %n", reaisParaPesoArgentino);
        }else if(reaisParaPesoChileno == 5){
            System.out.printf("Resultado: %.3f %n", reaisParaPesoChileno);
        }else if(dolarParaReais == 6){
            System.out.printf("Resultado: %.3f %n", dolarParaReais);
        }else if(euroParaReais == 7){
            System.out.printf("Resultado: %.3f %n", euroParaReais);
        }else if(librasEsterlinasParaReais == 8){
            System.out.printf("Resultado: %.3f %n", librasEsterlinasParaReais);
        }else if(pesoArgentinoParaReais == 9){
            System.out.printf("Resultado: %.3f %n", pesoArgentinoParaReais);
        } else if(pesoChilenoParaReais == 10) {
            System.out.printf("Resultado: %.3f %n",pesoChilenoParaReais);
        }else{
            System.out.println("ERRO: Voce escolheu uma operacao inexistente!");
        }
    }
}