/*

 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author melis
 */
public class LedgerItem extends Transaction implements Printable
{
   
    private String account;
    ArrayList <String> ledgerItemNames;
    
    public LedgerItem (Date d, String n, Category c, double am, String ac)
    {
        super (d, n, c, am);
        account = ac;
        
    }
    
    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }
    
    @Override
    public String toString()
  {
      return super.toString() + " " + getAccount();
  }
    
    public String getBudgetItemName(int n)
    {

        return ledgerItemNames.get(n);
    }

    public ArrayList<String> getLedgerItemNames()
    {
        ledgerItemNames = new ArrayList<>();
        ledgerItemNames.add("Date");
        ledgerItemNames.add("Name");
        ledgerItemNames.add("Category");
        ledgerItemNames.add("Amount");
        ledgerItemNames.add("Account");

        for (int i = 0; i < ledgerItemNames.size(); i++)
        {
            return ledgerItemNames;
        }
        
        return ledgerItemNames;

    }
    
    @Override
    public ArrayList<String> getLabels()
    {
        
        return getLedgerItemNames();
        
    }
}
