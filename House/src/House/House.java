
package House;

public class House 
{
    private String adress;
    private int roomsNumber;
    private int floorNumber; //Planta Baja: 0 
    private int bathroomNumber;

    public House() 
    {}

    public String getAdress() {
        return adress;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getBathroomNumber() {
        return bathroomNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }
    
    public String toString()
    {
        return "Ubicación: "+this.getAdress()+" - Número de Habitaciones: "+this.getRoomsNumber()+ " - Número de Baños:"+this.getBathroomNumber()+" - Número de Pisos: "+this.getFloorNumber();
    }
    
    
}
