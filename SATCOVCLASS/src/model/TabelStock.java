package model;

import java.util.*;
import javax.swing.table.AbstractTableModel;
import model.*;

public class TabelStock extends AbstractTableModel{
    List <Stock> listStock;
    public TabelStock(List<Stock> listStock) {this.listStock = listStock; }
    public Stock getRow(int row) { return listStock.get(row); } 
    
    public int getRowCount() { return listStock.size(); }
    public int getColumnCount() { return listStock.getClass().getDeclaredFields().length; }
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0: return listStock.get(rowIndex).getId();
            case 1: return listStock.get(rowIndex).getKodeSaham();
            case 2: return listStock.get(rowIndex).getNamaSaham();
            case 3: return listStock.get(rowIndex).getHarga(); 
            default: return null;
        }
    }
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id";
            case 1: return "Kode";
            case 2: return "Nama";
            case 3: return "Harga";
            default: return null;
        }
    }
}
