// Base class Vehicle
class Vehicle {
    move() {
        throw new Error("This method must be overridden in a subclass");
    }
}

//car class provides a specific implementation for move
class Car extends Vehicle {
    move() {
        console.log("The car is driving on the road.");
    }
}

// Boat class provides a specific implementation for move
class Boat extends Vehicle {
    move() {
        console.log("The boat is sailing on water.");
    }
}

function main() {
    // Creating objects for both
    const myCar = new Car();
    const myBoat = new Boat();

    // Calling the move method
    myCar.move();   
    myBoat.move(); 
}

main();
