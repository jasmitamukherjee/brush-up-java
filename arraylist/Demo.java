package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class Demo {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        

        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);


        System.out.println(list.get(1));

        list.add(1, 2);
        System.out.println(list);

        list.set(0, 5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);

    }
    
}
