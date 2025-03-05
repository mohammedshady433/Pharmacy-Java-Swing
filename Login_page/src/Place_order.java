import java.util.ArrayList;
import java.lang.*;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Place_order {
//    int end_day=0;
    
    final String Cosmatics_ID="co";
    final String Drug_ID="dr";
    final String other_ID="ot";
    boolean exist = false; 
    public Place_order() {
    }
    double search_ID_and_take_actions(String id, ArrayList<Drug> list, int quantity){
    for(Drug item : list){
        if (Objects.equals(item.getId(), id)){
            exist=true;
            //********************************************************************************************
            if (item.isAllowed() == true){
                int what=JOptionPane.showConfirmDialog(null,"do you have permission","ask",JOptionPane.YES_NO_OPTION);
                if (what ==1){
                              JOptionPane.showMessageDialog(null, "Sorry, you don't have permission to buy this drug");
                              return 0;
                }
                else{
                        if(item.getQuantity()>=quantity)
                        {
                            item.setQuantity((item.getQuantity())-quantity);
                            return item.getPrice();
                        }
                        else{JOptionPane.showMessageDialog(null, "Sorry, the quantity isn't sufficient\n check again later");}
                }
            }
            //***********************************************************************************************
            else
            {
                if(item.getQuantity()>=quantity)
                {
                    item.setQuantity((item.getQuantity())-quantity);
                    return item.getPrice();
                }
                else{JOptionPane.showMessageDialog(null, "Sorry, the quantity isn't sufficient\n check again later");}
            }

        }
    }
    if (!exist){
        JOptionPane.showMessageDialog(null, "Drug out of the stock ");
    }
    return 0;
    }

    double price(String ID, int quantity, ArrayList<Drug> list){
        double Price =search_ID_and_take_actions(ID,list,quantity);

        if (Price == 0){
            return 0;
        }
        else {
            if (ID.startsWith(Cosmatics_ID)){
                return Price*1.2*quantity;
            }
            else {

                return Price*quantity;
            }
}
}
}
