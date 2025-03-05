import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Remove {
    boolean search(String ID, ArrayList<Drug> list) {
        if (list.removeIf(item -> item.getId().equals(ID))){
        return true;
        }
        else {
        JOptionPane.showMessageDialog(null, "The ID is not correct ");
        return false;
        }
    }
}