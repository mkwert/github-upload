/*

 */
package Model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author melis
 */
public class TransactionTest
{
    
    public TransactionTest()
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
     * Test of getDate method, of class Transaction.
     */
    @Test
    public void testGetDate()
    {
        System.out.println("getDate");
        Date d = new Date(5,10,2019);
        Category c = new Category("Bill","Expense");
        Transaction instance = new Transaction(d,"Water",c, 95.95);
        Date expResult = d;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Transaction.
     */
    @Test
    public void testSetDate()
    {
        System.out.println("setDate");
        Date date = new Date(8,25,2020);
        Date d = new Date(5,10,2019);
        Category c = new Category("Bill","Expense");
        Transaction instance = new Transaction(d,"Water",c, 95.95);
        instance.setDate(date);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Transaction.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Date d = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        Transaction instance = new Transaction(d,"Water",category, 95.95);
        String expResult = "Water";
        String result = instance.getName();
        assertEquals(expResult, result);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Transaction.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        Date d = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        String name = "Electric";
        Transaction instance = new Transaction(d,"Water",category, 95.95);
        instance.setName(name);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Transaction.
     */
    @Test
    public void testGetCategory()
    {
        System.out.println("getCategory");
        Date d = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        Transaction instance = new Transaction(d,"Water",category, 95.95);
        Category expResult = category;
        Category result = instance.getCategory();
        assertEquals(expResult, result);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Transaction.
     */
    @Test
    public void testSetCategory()
    {
        System.out.println("setCategory");
        Date d = new Date(5,10,2019);
        Category category = new Category("Refund","Income");
        Transaction instance = new Transaction(d,"Water",category, 95.95);
        instance.setCategory(category);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount()
    {
        System.out.println("getAmount");
        Date d = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        Transaction instance = new Transaction(d,"Water",category, 95.95);
        double expResult = 95.95;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Transaction.
     */
    @Test
    public void testSetAmount()
    {
        System.out.println("setAmount");
        Date d = new Date(5,10,2019);
        Category category = new Category("Bill","Expense");
        double amount = 50;
        Transaction instance = new Transaction(d,"Water",category, 95.95);
        instance.setAmount(amount);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
