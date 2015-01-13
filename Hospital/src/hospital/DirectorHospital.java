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
public class DirectorHospital 
{
    private IBuilderHospital builderHospital=null;
    
    public DirectorHospital(IBuilderHospital builderHospital)
    {
        this.builderHospital=builderHospital;
    }
    public void ConstrucHospital()
    {
        builderHospital.buildName();
        builderHospital.buildAdress();
        builderHospital.buildRoomNumber();
        builderHospital.buildBathroomNumber();
        builderHospital.buildFloorNumber();
    }
    
    public Hospital getHospital()
    {
       return builderHospital.getHospital();
    }
}
