class Room{
    Room(){
        System.out.println("Room Created");
    }
}

class House{
    private Room room;
    House(){
        room = new Room(); // House creates the room
    }

    void display(){
        System.out.println("House has a room");
    }
}

public class Composition {
    public static void main(String[] args) {
        House house = new House();
        house.display();

    }
}
