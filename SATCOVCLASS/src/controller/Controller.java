package controller;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;
import view.*;

public class Controller {
    Stock_Investor formInvestor;
    List <Stock> listStock;
    Stock stock;

    public Controller(Stock_Investor formInvestor) {
        this.formInvestor = formInvestor;
        stock = new Stock();
        try {
            listStock = stock.getStock();
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void isiTable() {
        try {
            listStock = stock.getStock();
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        TabelStock ts = new TabelStock(listStock);
        formInvestor.getTable().setModel(ts);
    }
    public void isiField(int row) {
        //DGuest
        //System.out.println(listStock.get(row).getId());
        /*framekotak.getTxtId().setText(Integer.toString(listkotak.get(row).getId()));
        framekotak.getTxtLebar().setText(Integer.toString(listkotak.get(row).getLebar()));
        framekotak.getTxtPanjang().setText(Integer.toString(listkotak.get(row).getPanjang()));
        framekotak.getTxtTinggi().setText(Integer.toString(listkotak.get(row).getTinggi()));
        framekotak.getTxtVolume().setText(Integer.toString(listkotak.get(row).Volume()));
        framekotak.getTxtLsBidang().setText(Integer.toString(listkotak.get(row).LuasBidang()));*/
    }
    
}
