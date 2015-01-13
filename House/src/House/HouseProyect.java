/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package House;

/**
 *
 * @author Marcos
 */
public class HouseProyect {

     
    public static void main(String[] args) 
    {
        House house = new House();
        house.setAdress("Alonso de Ubeda 4887");
        house.setBathroomNumber(1);
        house.setFloorNumber(1);
        house.setRoomsNumber(3);
        
        System.out.println(house.toString());
        

    }
    
}
