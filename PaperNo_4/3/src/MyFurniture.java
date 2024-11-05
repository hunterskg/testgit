
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFurniture implements IFurniture {

    @Override
    public int f1(List<Furniture> t) {
        int sum = 0;
        for (Furniture f : t) {
            if (f.getName().endsWith("n")) {
                sum += f.getPrice();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Furniture> t) {
        String digit = "[0-9]";
        List<Furniture> f = new ArrayList<>();
        for (int i = 0; i < t.size(); i++) {
            if (Character.toString(t.get(i).getName().charAt(0)).matches(digit)) {
                Furniture cFound = new Furniture(t.get(i).getName(), t.get(i).getPrice());
                f.add(cFound);
            }
        }
        Collections.sort(f, (Furniture o1, Furniture o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));

        int index = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.toString(t.get(i).getName().charAt(0)).matches(digit)) {
                t.get(i).setName(f.get(index).getName());
                t.get(i).setPrice(f.get(index).getPrice());
                index++;

            }
        }
    }

    @Override
    public void f3(List<Furniture> t) {
        String digit = "[0-9]";
        int min = t.get(0).getPrice();
        int aver = 0;
        int sum = 0;
        for (Furniture c : t) {
            sum+=c.getPrice();
        }
        aver = sum/t.size();
        for (Furniture c : t) {
            if (c.getPrice() <= min && c.getPrice()<aver) {
                min = c.getPrice();
            }
        }

        int index = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() == min) {

                index = i;

            }
        }

        t.remove(index);

    }

}
