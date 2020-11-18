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
public class LedgerItemTest
{
    
    public LedgerItemTest()
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
     * Test of getAccount method, of class LedgerItem.
     */
    @Test
    public void testGetAccount()
    {
        System.out.println("getAccount");
        Date d = new Date(5,10,2019);
        Category c = new Category("Bill","Expense");
        LedgerItem instance = new LedgerItem(d,"Water",c, 95.95, "checking");
        String expResult = "checking";
        String result = instance.getAccount();
        assertEquals(expResult, result);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAccount method, of class LedgerItem.
     */
    @Test
    public void testSetAccount()
    {
        System.out.println("setAccount");
        String account = "discover card";
        Date d = new Date(5,10,2019);
        Category c = new Category("Bill","Expense");
        LedgerItem instance = new LedgerItem(d,"Water",c, 95.95, "checking");
        instance.setAccount(account);
        System.out.println(instance.toString());
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
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
