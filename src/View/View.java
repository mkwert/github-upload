package View;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import Model.BudgetItem;

public class View
{
   private BudgetUI bui;

    public View()
    {
        //bui = new BudgetUI(ArrayList<BudgetItem>);
    }
    
    public BudgetUI getBudgetUI()
    {
        return bui;
    }
    
    

    public void setInitialframe(BudgetUI bui)
    {
        this.bui = bui;
    } 

    
    
}
