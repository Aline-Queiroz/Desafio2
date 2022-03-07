import java.util.Arrays;
import java.util.List;

public class Questao3 {

    public static void main(String[] args) {
        String texto = "tenha um bom dia";
        String texto2 = "ola mundo";

        texto = texto.replace(" ","");

        int quantidadeLetras = texto.length();

        int resultadoRaiz = (int)Math.round(Math.sqrt(quantidadeLetras));

        String regex = "(?<=\\G.{"+resultadoRaiz+"})";

        String[] array = texto.split(regex);
        List<String> list = Arrays.asList(array);
        String decifrado = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).length() > i){
                    String s=list.get(j).substring(i,i+1);
                    decifrado = decifrado + s;
                }
            }
            decifrado = decifrado + " ";
        }

        System.out.println(decifrado);

    }
}
