package Model;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author melis
 */
public class BudgetItemTest
{
    
    public BudgetItemTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of getDueDate method, of class BudgetItem.
     */
    @Test
    public void testGetDate()
    {
        System.out.println("getDate");
        Date date = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(date, "weekly", "Water",category, 95.95);
        Date expResult = date;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDueDate method, of class BudgetItem.
     */
    @Test
    public void testSetDate()
    {
        System.out.println("setDueDate");
        Date date = new Date(5,10,2019);
        Date d = new Date(8,25,2018);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(date, "weekly", "Water",category, 95.95);
        instance.setDate(d);
        assertEquals(instance.getDate(), d);
        System.out.println(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequency method, of class BudgetItem.
     */
    @Test
    public void testGetFrequency()
    {
        System.out.println("getFrequency");
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        String expResult = "weekly";
        String result = instance.getFrequency();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFrequency method, of class BudgetItem.
     */
    @Test
    public void testSetFrequency()
    {
        System.out.println("setFrequency");
        String frequency = "monthly";
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        instance.setFrequency(frequency);
        assertEquals(instance.getFrequency(), frequency);
        System.out.println(frequency);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class BudgetItem.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        String expResult = "Water";
        String result = instance.getName();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class BudgetItem.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        String name = "Electric";
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        instance.setName(name);
        assertEquals(instance.getName(), name);
        System.out.println(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class BudgetItem.
     */
    @Test
    public void testGetCategory()
    {
        System.out.println("getCategory");
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        Category expResult = category;
        Category result = instance.getCategory();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class BudgetItem.
     */
    @Test
    public void testSetCategory()
    {
        System.out.println("setCategory");
        Date dueDate = new Date(5,10,2019);
        Category c = new Category ("Debt", "Expense");
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",c, 95.95);
        instance.setCategory(category);
        assertEquals(instance.getCategory(), category);
        System.out.println(category);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class BudgetItem.
     */
    @Test
    public void testGetAmount()
    {
        System.out.println("getAmount");
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        double expResult = 95.95;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class BudgetItem.
     */
    @Test
    public void testSetAmount()
    {
        System.out.println("setAmount");
        Date dueDate = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        double amount = 35.25;
        BudgetItem instance = new BudgetItem(dueDate, "weekly", "Water",category, 95.95);
        instance.setAmount(amount);
        assertEquals(instance.getAmount(), amount, 0);
        System.out.println(amount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class LedgerItem.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Date d = new Date(5,10,2019);
        Category c = new Category("Bill","Expense");
        LedgerItem instance = new LedgerItem(d,"Water",c, 95.95, "checking");
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
