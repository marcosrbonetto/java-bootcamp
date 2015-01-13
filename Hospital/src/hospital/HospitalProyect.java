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
public class HospitalProyect {

   
    public static void main(String[] args) {
        IBuilderHospital builderHospital = new BigHospital();
        DirectorHospital director = new DirectorHospital(builderHospital);
        director.ConstrucHospital();
        
        Hospital hospital = director.getHospital();
        System.out.println("Hospital: " + hospital);
                
        builderHospital = new SmallHospital();
        director = new DirectorHospital(builderHospital);
        director.ConstrucHospital();
        
        hospital = director.getHospital();
        System.out.println("House: " + hospital);
    }
    
}
