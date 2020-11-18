package Model;

/**
 *
 * @author melis
 */
import java.util.ArrayList;

public class TestHarness
{
    public TestHarness()
    {
        testClassHierarchy();
    
        
        //Test the date class
        Date tD = new Date(5, 6, 2020);
        if(tD != null)
        {
            System.out.println("Test date created successfully");
            System.out.println("Date: " + tD.getMonth() + "/" + tD.getDay() + "/" + tD.getYear());
            //Change the object
           tD.setMonth(8);
           System.out.println("Date: " + tD.getMonth() + "/" + tD.getDay() + "/" + tD.getYear());
           tD.setDay(28);
           System.out.println("Date: " + tD.getMonth() + "/" + tD.getDay() + "/" + tD.getYear());
           tD.setYear(2008);
           System.out.println("Date: " + tD.getMonth() + "/" + tD.getDay() + "/" + tD.getYear());
           //Combine the objects
           tD.setDate(10, 5, 2019);
           System.out.println("Date: " + tD.getMonth() + "/" + tD.getDay() + "/" + tD.getYear());
           System.out.println(tD.toString());
      
        }
        
        //Test the category class
        Category tC = new Category("bill", "expense");
        if(tC != null)
        {
           System.out.println("Test category created successfully");
           System.out.println("Category: " + tC.getName() + "\nType: " + tC.getType());
            //Change the object
           tC.setName("paycheck");
           System.out.println("Category: " + tC.getName() + "\nType: " + tC.getType());
           tC.setType("income");
           System.out.println("Category: " + tC.getName() + "\nType: " + tC.getType());
           //Combine the objects
           tC.setCategory("debt", "expense");
           System.out.println("Category: " + tC.getName() + "\nType: " + tC.getType());
           System.out.println(tC.toString());
      
        }
        
        
    }
    //Test Polymorphism
        
       
    public void testClassHierarchy()
        {
           
           Date Date1 = new Date(1,24,2020);
           Category category1 = new Category("Debt", "Expense");
           Transaction budgetItem1 = new BudgetItem(Date1,"Monthly", "Car Payment", category1, 335.95);
           Date Date2 = new Date(1,24,2020);
           Category category2 = new Category("Debt", "Expense");
           Transaction ledgerItem1 = new LedgerItem(Date2, "Car Payment", category2, 335.95,"checking");
           ArrayList<Transaction> transactions = new ArrayList<>();
           transactions.add(budgetItem1);
           transactions.add(ledgerItem1);
           for(Transaction transaction : transactions)
           {
               System.out.println(transaction);
           }
        }
        
    //Test Interface
        
        public void testInterface()
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
           ArrayList<Printable> budgetItems = new ArrayList<>();
           budgetItems.add(budgetItem1);
           budgetItems.add(budgetItem2);
           budgetItems.add(budgetItem3);

            for (Printable budgetItem : budgetItems)
            {
                System.out.println(budgetItem.toString());

            }
            
            
           Date Date4 = new Date(1,24,2020);
           Category category4 = new Category("Debt", "Expense");
           LedgerItem ledgerItem1 = new LedgerItem(Date4,"Car Payment", category4, 335.95, "checking");
           Date Date5 = new Date(1,24,2020);
           Category category5 = new Category("Bill", "Expense");
           BudgetItem budgetItem4 = new BudgetItem(Date5, "Monthly", "Car Payment", category5, 319.96);
           Date Date6 = new Date(3,17,2020);
           Category category6 = new Category("Bill", "Expense");
           BudgetItem budgetItem5 = new BudgetItem(Date6, "Monthly", "Electric", category6, 75.00);
           ArrayList<Printable> transactions = new ArrayList<>();
           transactions.add(ledgerItem1);
           transactions.add(budgetItem4);
           transactions.add(budgetItem5);
           int i = 0;
            for (Printable transaction : transactions)
            {

         
                System.out.println(transactions.get(i).getLabels());
                i = i=1;
            }
            
           
           
        }
}
