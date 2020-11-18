package Model;

import java.util.ArrayList;


/**
 *
 * @author melis
 */


public class Transaction
{
    private Date date;
    private String name;
    private Category category;
    private double amount;
    private double balance;
    private int index;
    ArrayList <String> transactionItemNames;
    ArrayList transactionItemValues;
    ArrayList<ArrayList<String>> transactions;
    
    public Transaction (Date d, String n, Category c, double a)
    {
        date = d;
        name = n;
        category = c;
        amount = a;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    
    @Override
    public String toString()
  {
      return getDate() + " " + getName() + " " + getCategory() + " " + getAmount();
  }

     //@Override
    public Object getTransactionItemValue(int n)
    {
        
        return transactionItemValues.get(n);
    }

    //@Override
    public ArrayList<String> getTransactionItemValues()
    {
        transactionItemValues = new ArrayList<>();
        transactionItemValues.add(this.getDate());
        transactionItemValues.add(this.getName());
        transactionItemValues.add(this.getAmount());
        transactionItemValues.add(this.getCategory());
        for (int i = 0; i < transactionItemValues.size(); i++)
        {
            return transactionItemValues;
        }
        
        return transactionItemValues;

    }

    //@Override
    public String getTransactionItemName(int n)
    {

        return transactionItemNames.get(n);
    }

    //@Override
    public ArrayList<String> getTransactionItemNames()
    {
        transactionItemNames = new ArrayList<>();
        transactionItemNames.add("Date");
        transactionItemNames.add("Name");
        transactionItemNames.add("Amount");
        transactionItemNames.add("Category");

        for (int i = 0; i < transactionItemNames.size(); i++)
        {
            return transactionItemNames;
        }
        
        return transactionItemNames;

    }
   
    
    
}
