import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ObservableListDemo {
    public static void main(String[] args) {

        //-------------------------------- Array List ----------------------------

        ArrayList<Integer> alNumbers = new ArrayList<>();

        //-------------------------------- Observable List -----------------------

        ObservableList<Integer> olNumbers = FXCollections.observableArrayList();

        System.out.println(olNumbers);

        System.out.println("--------------------------------");

        olNumbers.addListener(new ListChangeListener<Integer>() {   // Subscribe ekak thamai meka (addListener)
            @Override
            public void onChanged(Change<? extends Integer> change) {
                System.out.println("Working subscriber 1" + change);
            }
        });


        olNumbers.addListener(new ListChangeListener<Integer>() {   // Subscribe ekak thamai meka (addListener)
            @Override
            public void onChanged(Change<? extends Integer> change) {

                System.out.println("Working subscriber 2");
            }
        });

        olNumbers.add(10);
        olNumbers.add(20);
        olNumbers.add(30);
        olNumbers.add(40);
        olNumbers.add(50);

        System.out.println("--------------------------------");

        System.out.println(olNumbers);
        // [10, 20, 30, 40, 50]

        System.out.println("--------------------------------");

        olNumbers.remove(2);
        // [10, 20, 40, 50]

        System.out.println(olNumbers);

        }
    }

