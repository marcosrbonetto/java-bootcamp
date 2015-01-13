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
public class SmallHospital implements IBuilderHospital 
{
    private Hospital h;
    
    public SmallHospital()
    {
        h=new Hospital();
    }
    public void buildName() 
    {
        h.setName("Small Hospital");
    }

    @Override
    public void buildAdress() 
    {
        h.setAdress("Av.Colon 457");
    }

    @Override
    public void buildRoomNumber() 
    {
        h.setRoomsNumber(30);
    }

    @Override
    public void buildBathroomNumber() 
    {
        h.setBathroomNumber(10);
    }

    @Override
    public void buildFloorNumber() 
    {
        h.setFloorNumber(3);
    }
    
    @Override
    public Hospital getHospital()
    {return h;}
    
}
