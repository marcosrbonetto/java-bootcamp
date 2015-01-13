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
public interface IBuilderHospital 
{
    public void buildName();
    public void buildAdress();
    public void buildRoomNumber();
    public void buildBathroomNumber();
    public void buildFloorNumber();
    
    public Hospital getHospital();
    
}
