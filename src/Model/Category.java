package Model;

/**
 *
 * @author melis
 */
public class Category
{
    private String name; //category name: bill, debt, etc.
    private String type; //income or expense
    
    public Category(String c, String t)
    {
        name = c;
        type = t;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    public void setCategory(String name, String type)
    {
        name = name;
        type = type;
        
    }
     @Override
    public String toString()
    {
      return getName() + " " + getType();
    }
}
