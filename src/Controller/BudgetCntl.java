package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Model.Budget;
import Model.BudgetItem;
import View.BudgetUI;
import Model.BudgetTableModel;
import Model.Date;
import Model.Category;
import View.BudgetTableUI;



/**
 *
 * @author melis
 */
public class BudgetCntl implements ActionListener
{
    
    Budget theBudget;
    public ArrayList<BudgetItem> budget = new ArrayList<>();
    public BudgetTableModel budgetTable;
    
    BudgetUI theBudgetUI;
    BudgetTableUI theBudgetTableUI;
    
    public BudgetCntl()
    {
        theBudget = new Budget();
        budget = theBudget.getBudget();
        budgetTable = new BudgetTableModel(budget);

        //theBudgetUI = new BudgetUI(budget);
        //theBudgetUI.setVisible(false);
        
        theBudgetTableUI = new BudgetTableUI(this);
        theBudgetUI.prevBtn.addActionListener(this);
        theBudgetUI.NxtBtn.addActionListener(this);
        theBudgetUI.deleteBtn.addActionListener(this);
        theBudgetUI.addBtn.addActionListener(this);
        theBudgetUI.updateBtn.addActionListener(this);
        theBudgetTableUI.setVisible(true);
        

    }
    
    public BudgetTableModel getBudgetTable()
    {
        return budgetTable;
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Object action = ae.getSource();
        if(action == theBudgetUI.prevBtn)
        {
            if(theBudgetUI.currentBudgetItem == 0)
                System.out.println("You are on the first item");
            else
            {
                theBudgetUI.currentBudgetItem--;
                theBudgetUI.refresh();
            }
        }
        if(action == theBudgetUI.NxtBtn)
        {
            if(theBudgetUI.currentBudgetItem == budget.size()-1)
                System.out.println("You are on the last item");
            else
            {
                theBudgetUI.currentBudgetItem++;
                theBudgetUI.refresh();
            }
        }
        if(action == theBudgetUI.deleteBtn)
        {
            if(!budget.isEmpty())
            {
                budget.remove(theBudgetUI.currentBudgetItem);
                theBudgetUI.refresh();
            }
        }
        if(action == theBudgetUI.addBtn)
        {
            theBudgetUI.month.setText("");
            theBudgetUI.day.setText("");
            theBudgetUI.year.setText("");
            theBudgetUI.category.setText("");
            theBudgetUI.catType.setText("");
            theBudgetUI.frequency.setText("");
            theBudgetUI.name.setText("");
            theBudgetUI.amount.setText("");
            theBudgetUI.submitButton.setVisible(true);
        }
        if(action == theBudgetUI.submitButton)
        {
            theBudgetUI.submitButton.setVisible(false);
            int m = Integer.parseInt(theBudgetUI.month.getText());
            int d = Integer.parseInt(theBudgetUI.day.getText());
            int y = Integer.parseInt(theBudgetUI.year.getText());
            Date newDate = new Date(m,d,y);
            theBudgetUI.category.getText();
            Category newCategory = new Category(theBudgetUI.category.getText(), theBudgetUI.catType.getText());
            BudgetItem newItem = new BudgetItem(newDate, theBudgetUI.frequency.getText(), theBudgetUI.name.getText(), newCategory, Double.parseDouble(theBudgetUI.amount.getText()));
            budget.add(newItem);

        }
        
        if(action == theBudgetUI.updateBtn)
        {
            
            int m = Integer.parseInt(theBudgetUI.month.getText());
            int d = Integer.parseInt(theBudgetUI.day.getText());
            int y = Integer.parseInt(theBudgetUI.year.getText());
            budget.get(theBudgetUI.currentBudgetItem).getDate().setMonth(m);
            budget.get(theBudgetUI.currentBudgetItem).getDate().setDay(d);
            budget.get(theBudgetUI.currentBudgetItem).getDate().setYear(y);
            budget.get(theBudgetUI.currentBudgetItem).setName(theBudgetUI.name.getText());
            budget.get(theBudgetUI.currentBudgetItem).getCategory().setName(theBudgetUI.category.getText());
            budget.get(theBudgetUI.currentBudgetItem).getCategory().setType(theBudgetUI.catType.getText());
            budget.get(theBudgetUI.currentBudgetItem).setFrequency(theBudgetUI.frequency.getText());
            budget.get(theBudgetUI.currentBudgetItem).setAmount(Double.parseDouble(theBudgetUI.amount.getText()));
        }
        
        if(action == theBudgetTableUI.newButton)
        {
            theBudgetUI = new BudgetUI();
            theBudgetUI.month.setText("");
            theBudgetUI.day.setText("");
            theBudgetUI.year.setText("");
            theBudgetUI.category.setText("");
            theBudgetUI.catType.setText("");
            theBudgetUI.frequency.setText("");
            theBudgetUI.name.setText("");
            theBudgetUI.amount.setText("");
            theBudgetUI.submitButton.setVisible(true);
            theBudgetUI.setVisible(true);
            theBudgetTableUI.setVisible(false);
            theBudgetUI.prevBtn.addActionListener(this);
            theBudgetUI.deleteBtn.addActionListener(this);
            theBudgetUI.updateBtn.addActionListener(this);
            theBudgetUI.NxtBtn.addActionListener(this);
            theBudgetUI.addBtn.addActionListener(this);
            theBudgetUI.submitButton.addActionListener(this);
            theBudgetUI.backButton.addActionListener(this);
            //budgetTable.fireTableDataChanged();
        }
        
        if(action == theBudgetUI.backButton)
        {
            budgetTable.fireTableDataChanged();
            theBudgetTableUI.setVisible(true);
            theBudgetUI.setVisible(false);
        }
    }
    
    
    
    public void getBudgetDetailUI(int selectedRow)
    {
        theBudgetUI = new BudgetUI(this, selectedRow);
        theBudgetUI.prevBtn.addActionListener(this);
        theBudgetUI.deleteBtn.addActionListener(this);
        theBudgetUI.updateBtn.addActionListener(this);
        theBudgetUI.NxtBtn.addActionListener(this);
        theBudgetUI.addBtn.addActionListener(this);
        theBudgetUI.submitButton.addActionListener(this);
        theBudgetUI.backButton.addActionListener(this);
        theBudgetTableUI.setVisible(false);
        theBudgetUI.setVisible(true);
        theBudgetUI.submitButton.setVisible(false);
    }
    
    public BudgetItem getBudgetItem(int row)
    {
        return budget.get(row);
    }
}
