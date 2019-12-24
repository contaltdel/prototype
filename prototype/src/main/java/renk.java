

public abstract class renk implements Cloneable {
          
    protected String renkAdi; 
       
    abstract void renkEkle(); 
       
    public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
}
