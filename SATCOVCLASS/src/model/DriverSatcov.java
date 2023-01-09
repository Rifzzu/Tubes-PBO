package model;

import java.util.Scanner;
import java.sql.* ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DriverSatcov {
    /*public static void main(String[] args) throws Exception {
        Database db = new Database();
        db.getConnection();
        System.out.println("Connected.");
        
        Scanner inputan = new Scanner(System.in);
        char ulang = 'y';
        int x;
        
        while(ulang != 't'){
            System.out.println("Menu SATCOV.");
            System.out.println("1. Show Stock");
            System.out.println("2. Login");
            System.out.println("3. Register");
                       
            System.out.print("Masukan inputan. ");
            x = inputan.nextInt();
            
            switch(x){
                case 1:
                    try{
                        Stock.showStock(db);
                    }catch(Exception e){
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 2:
                    try{
                        inputan.nextLine();
                        System.out.print("Masukan Username anda. ");
                        String usr = inputan.nextLine();
                        System.out.print("Masukan password: ");
                        String pwd = inputan.nextLine();
                        
                        String rle = User.getRole(db, usr, pwd);
                        
                        if(rle.equals("admin")){
                            Admin adm = Admin.Login(db, usr, pwd, rle);
                            System.out.println("Menu Admin");
                            System.out.println("Tambah data saham.");
                            System.out.print("Kode Saham: ");
                            String kde = inputan.nextLine();
                            System.out.print("Nama Saham: ");
                            String namaSaham = inputan.nextLine();
                            System.out.print("Harga Saham: ");
                            int harga = inputan.nextInt();
                            Admin.addStockExchange(db, kde, namaSaham, harga);
                        }else{
                            Investor inv = Investor.Login(db, usr, pwd, rle);
                            char ulangInvestor = 'y';
                            while(ulangInvestor != 't'){
                                System.out.println("Menu Investor SATCOV.");
                                System.out.println("1. Show Stock");
                                System.out.println("2. Buy Stock");
                                System.out.println("3. Sell Stock");
                                System.out.println("4. Profile");
                                System.out.println("5. Cash Balance");
                                System.out.println("6. Show Portofolio");
                                
                                System.out.print("Masukan inputan. ");
                                int inputanInvestor = inputan.nextInt();
                                switch(inputanInvestor){
                                    case 1:
                                        try{
                                            Investor.showStock(db);
                                        }catch(Exception e){
                                            System.out.println("Something went wrong.");
                                        }
                                        break;
                                    case 4:
                                        try{
                                            Investor.showProfile(db, usr);
                                        }catch(Exception e){
                                            System.out.println("Something went wrong.");
                                        }
                                        break;
                                }
                                
                                System.out.println();
                                System.out.println("Lanjut ?(y/t)");
                                ulangInvestor = inputan.next().charAt(0);
                            }
                            System.out.println("Anda Log Out dari sistem");
                        }
                    }catch(Exception e){
                        System.out.println("Something went wrong.");
                    }
                    break;
                case 3:
                    System.out.println("Anda Pilih Register.");
                    inputan.nextLine();
                    System.out.print("Masukan Nama Lengkap Anda: ");
                    String nma = inputan.nextLine();
                    System.out.print("Masukan username: ");
                    String usr = inputan.nextLine();
                    System.out.print("Masukan password: ");
                    String pwd = inputan.nextLine();
                    System.out.print("Masukan Email Anda: ");
                    String eml = inputan.nextLine();
                    
                    //System.out.println("Username: "+ usr+ " "+ "password: "+pwd);
                    User.Register(db, nma, usr, pwd, eml);
                    
                    break;
            }
            System.out.println();
            System.out.println("Lanjut ?(y/t)");
            ulang = inputan.next().charAt(0);
            
        } 
    }*/
}
