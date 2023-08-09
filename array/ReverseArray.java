package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,4,3,2);
        List<Integer> rev = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            rev.add(lista.get(i));
        }

        System.out.println(rev);

    }

}
