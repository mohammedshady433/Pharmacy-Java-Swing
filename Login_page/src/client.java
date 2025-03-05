
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohammed Shady
 */
public class client {
    public String name;
    public String Email;
    public int Phone;
    public String Address;
    public double points;
    public double money_per_one_time;
    public double total_buy_history=0;
    private static ArrayList<Drug> cosmatics_list = new ArrayList<>();
    private static ArrayList<Drug> drug_list = new ArrayList<>();
    private static ArrayList<Drug> other_list = new ArrayList<>();
    private static ArrayList<client> clientt= new ArrayList<>();

    public client(String name, String Email, String Address, int Phone, float points, float price,ArrayList<Drug> cos,ArrayList<Drug>drug ,ArrayList<Drug>other) {
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;
        this.points = points;
        
    }
    public client(String name, String Email, String Address, int Phone){
        this.name = name;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;    
    }

    public client(ArrayList<client> clientt,double price ) {
        this.total_buy_history = price;
        this.clientt=clientt;
    }

    client() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    double Points(double cart_total_price){
        if (points>0){
        money_per_one_time=cart_total_price-(points/100);
        points=0;
        return (money_per_one_time);
        }
        else return 0;
    }
    void add_points(double cart_total_price){
    if (cart_total_price>0){
    points+=(cart_total_price/10);
    }
    else JOptionPane.showMessageDialog(null, "you have to pay somthing to add points");
    }
    client isexist(ArrayList<client> list, int phone, double cart_total_price){
    for (client item : list){
        if (item.Phone==phone){
        item.add_points(cart_total_price);
        money_per_one_time=cart_total_price;
        return item;
        }
    }
    return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

}
