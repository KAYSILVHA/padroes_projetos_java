public class vetoresJava {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;


        int maior = numeros[0];
        int menor = numeros[0];

        int media = 0;


        for (int i = 0; i < numeros.length; i++) {
                if(numeros[i] > maior){
                    maior = numeros[i];
                }

            if(numeros[i] < menor){
                menor = numeros[i];
            }

            media += numeros[i];

        }


        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);
        System.out.println("MEDIA: " + media/ numeros.length);
    }


}
