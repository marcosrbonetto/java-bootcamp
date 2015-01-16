package Clases;
/**
 *
 * @author Marcos
 */
public class TransactionSingleton 
{
    private static int nextId=0;
    private static TransactionSingleton idTransaction;
    
    private TransactionSingleton()
    {nextId++;}

    public static int getNextTransactionId() {
        idTransaction=new TransactionSingleton();
        return nextId;
    }
    
    
    
   
    
}
