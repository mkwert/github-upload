package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author melis
 */
public class BudgetTableModel extends AbstractTableModel
{

    private String[] labels = {"Date", "Frequency", "Name", "Amount", "Category"};
    private ArrayList<BudgetItem> budget;
    
    
    public BudgetTableModel(ArrayList<BudgetItem> newBudget)
    {
        budget = newBudget;
    }
    
    @Override
    public int getRowCount()
    {
        return budget.size();
    }

    @Override
    public int getColumnCount()
    {
        return labels.length;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        switch(col)
        {
            case 0: return (Object) budget.get(row).getDate();
            case 1: return (Object) budget.get(row).getFrequency();
            case 2: return (Object) budget.get(row).getName();
            case 3: return (Object) budget.get(row).getCategory();
            case 4: return (Object) budget.get(row).getAmount();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int col)
    {
        return labels[col];
    }
    

    
}
