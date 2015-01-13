/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Marcos
 */
public class BigHospital implements IBuilderHospital 
{
    private Hospital h;
    
    public BigHospital()
    {
        h=new Hospital();
    }
    @Override
    public void buildName() 
    {
        h.setName("Big Hospital");
    }
    
    @Override
    public void buildAdress() 
    {
        h.setAdress("Av.General Paz 101");
    }

    @Override
    public void buildRoomNumber() 
    {
        h.setRoomsNumber(60);
    }

    @Override
    public void buildBathroomNumber() 
    {
        h.setBathroomNumber(20);
    }

    @Override
    public void buildFloorNumber() 
    {
        h.setFloorNumber(6);
    }
    
    @Override
    public Hospital getHospital()
    {return h;}
    
    
}
