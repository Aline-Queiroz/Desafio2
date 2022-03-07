import java.util.ArrayList;

public class Questao1 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(9);
        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(6);

        if(lista.size() % 2 == 1) {
            lista.sort(null);
            int meio=lista.size() / 2;
            Integer mediana = lista.get(meio);
            System.out.println(mediana);
        }else {
            System.out.println("O tamanho da lista precisa ser impar");
        }

    }
}