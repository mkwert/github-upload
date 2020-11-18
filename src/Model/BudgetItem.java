package Model;

/**
 *
 * @author melis
 */

import java.util.ArrayList;

public class BudgetItem extends Transaction implements Printable
{
    
    private String frequency;
    ArrayList <String> budgetItemNames;
    ArrayList budgetItemValues;

    
    
    public BudgetItem (Date date, String frequency, String name, Category category, double amount)
    {
        super(date, name, category, amount);
        this.frequency = frequency;
        
    }

    @Override
    public Date getDate()
    {
        return super.getDate();
    }

    @Override
    public void setDate(Date date)
    {
        super.setDate(date);
    }

    public String getFrequency()
    {
        return frequency;
    }

    public void setFrequency(String frequency)
    {
        this.frequency = frequency;
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    @Override
    public void setName(String name)
    {
        super.setName(name);
    }

    @Override
    public Category getCategory()
    {
        return super.getCategory();
    }

    @Override
    public void setCategory(Category category)
    {
        super.setCategory(category);
    }

    @Override
    public double getAmount()
    {
        return super.getAmount();
    }

    @Override
    public void setAmount(double amount)
    {
        super.setAmount(amount);
    }
    
    @Override
    public String toString()
  {
      return super.toString() + " " + getFrequency();
  }
    

    public Object getBudgetItemValue(int n)
    {
        return budgetItemValues.get(n);
    } 
    
    public ArrayList<String> getBudgetItemValues()
    {
        budgetItemValues = new ArrayList<>();
        budgetItemValues.add(this.getDate());
        budgetItemValues.add(this.getName());
        budgetItemValues.add(this.getFrequency());
        budgetItemValues.add(this.getAmount());
        budgetItemValues.add(this.getCategory());
        for (int i = 0; i < budgetItemValues.size(); i++)
        {
            return budgetItemValues;
        }
        
        return budgetItemValues;

    }
    public String getBudgetItemName(int n)
    {

        return budgetItemNames.get(n);
    }

    public ArrayList<String> getBudgetItemNames()
    {
        budgetItemNames = new ArrayList<>();
        budgetItemNames.add("Date");
        budgetItemNames.add("Name");
        budgetItemNames.add("Frequency");
        budgetItemNames.add("Amount");
        budgetItemNames.add("Category");

        for (int i = 0; i < budgetItemNames.size(); i++)
        {
            return budgetItemNames;
        }
        
        return budgetItemNames;

    }

    
    
    @Override
    public ArrayList<String> getLabels()
    {
        
        return getBudgetItemNames();
        
    }
    
    
   
    
}
