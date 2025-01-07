// Base class
class Vehicle {
    constructor(make, model) {
        this.make = make;
        this.model = model;
    }

    displayInfo() {
        console.log(`Vehicle: ${this.make} ${this.model}`);
    }
}

// Derived class Car inherits from Vehicle
class Car extends Vehicle {
    constructor(make, model, doors) {
        super(make, model); // Call the constructor of Vehicle
        this.doors = doors;
    }

    displayInfo() {
        console.log(`Car: ${this.make} ${this.model}, Doors: ${this.doors}`);
    }
}

// Derived class Truck inherits from Vehicle
class Truck extends Vehicle {
    constructor(make, model, capacity) {
        super(make, model); // Call the constructor of Vehicle
        this.capacity = capacity;
    }

    displayInfo() {
        console.log(`Truck: ${this.make} ${this.model}, Capacity: ${this.capacity} tons`);
    }
}

// Derived class Motorcycle inherits from Vehicle
class Motorcycle extends Vehicle {
    constructor(make, model, type) {
        super(make, model); // Call the constructor of Vehicle
        this.type = type;
    }

    displayInfo() {
        console.log(`Motorcycle: ${this.make} ${this.model}, Type: ${this.type}`);
    }
}

function main() {
    const car = new Car("Toyota", "Camry", 4);
    const truck = new Truck("Ford", "F-150", 2);
    const motorcycle = new Motorcycle("Harley-Davidson", "Sportster", "Cruiser");

    car.displayInfo(); 
    truck.displayInfo(); 
    motorcycle.displayInfo(); 
}

main();
