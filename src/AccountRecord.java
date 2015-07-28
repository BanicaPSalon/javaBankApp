/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;

/**
 *
 * @author Genelou
 */
public class AccountRecord implements Serializable{
    private int account;
    private String fname;
    private String mname;
    private String lname;
    private double balance;
    
    // no-argument constructor calls other constructor with
    //def values
    public AccountRecord(){
        this( 0 , "", "", "", 0.0);
    }
    
    //initialize a record
    public AccountRecord(int newAcct, String newFname, String newMname, String newLname, double newBalance){
        setAccount(newAcct);
        setFname(newFname);
        setMname(newMname);
        setLname(newLname);
        setBalance(newBalance);
    }
    
    //set acc number
    public final void setAccount( int acct){
        account = acct;
    }
    //get Acc number
    public int getAccount(){
        return account;
    }
    
    //set fname
    public final void setFname(String newfname){
        fname = newfname;
    }
    
    //get fname
    public String getFname(){
        return fname;
    }
    
    //set mname
    public final void setMname(String newmname){
        mname = newmname;
    }
    
    //get mname
    public String getMname(){
        return mname;
    }
    
    //set lname
    public final void setLname(String newlname){
        lname = newlname;
    }
    
    //get lname
    public String getLname(){
        return lname;
    }
    
    //set Balance
    public final void setBalance(double newbalance){
        balance = newbalance;
    }
    
    //get balance
    public double getBalance(){
        return balance;
    }
    
    
}// end class AccountRecord
