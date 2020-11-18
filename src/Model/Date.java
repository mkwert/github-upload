/*

 */
package Model;

/**
 *
 * @author melis
 */
public class Date
{
    //read more on the Calendar class before settling on this
    private int year, month, day;
    
    
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
        
    }

    @Override
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
  
    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }
    
    public void setDate(int m, int d, int y)
  {
      month = m;
      day = d;
      year = y;
      
  }
    
    
}
