package Model;

/**
 *
 * @author melis
 */
import java.util.ArrayList;


public class Budget
{
    ArrayList<BudgetItem> budget = new ArrayList<>();


    public Budget()
    {

        createNewBudget();

    }

    public void createNewBudget()
    {
        Date Date1 = new Date(1,24,2020);
        Category category1 = new Category("Debt", "Expense");
        BudgetItem budgetItem1 = new BudgetItem(Date1,"Monthly", "Car Payment", category1, 335.95);
        Date Date2 = new Date(1,24,2020);
        Category category2 = new Category("Bill", "Expense");
        BudgetItem budgetItem2 = new BudgetItem(Date2, "Monthly", "Car Payment", category2, 319.96);
        Date Date3 = new Date(3,17,2020);
        Category category3 = new Category("Bill", "Expense");
        BudgetItem budgetItem3 = new BudgetItem(Date3, "Monthly", "Electric", category3, 75.00);
        budget.add(budgetItem1);
        budget.add(budgetItem2);
        budget.add(budgetItem3);
         
    }

    public ArrayList getBudget()
    {
        return budget;   
    }
    
    public void setBudget(ArrayList<BudgetItem> budget)
    {
        this.budget = budget;
    }

    

    
}
