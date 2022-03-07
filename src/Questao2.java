import java.util.ArrayList;

public class Questao2 {

    public static void main(String[] args){
        int x = 2;
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(5);
        n.add(3);
        n.add(4);
        n.add(2);

        int contador = 0;
        for (int i = 0; i < n.size(); i++) {
            for (int j = 1; j < n.size(); j++) {
                if(j < n.size() && j > i){
                    if(Math.abs(n.get(i) - n.get(j)) == x){
                        contador = contador + 1;
                    }
                }
            }
        }
        System.out.println(contador);
    }
}



