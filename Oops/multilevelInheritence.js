// Grandparent class
class Vehicle {
    constructor(make, model) {
        this.make = make;
        this.model = model;
    }

    start() {
        console.log(`Starting the ${this.make} ${this.model}`);
    }
}

// Parent class Car inherits from Vehicle
class Car extends Vehicle {
    constructor(make, model, doors) {
        super(make, model); // Call the constructor of Vehicle
        this.doors = doors;
    }

    drive() {
        console.log(`Driving the ${this.make} ${this.model} with ${this.doors} doors.`);
    }
}

// Child class ElectricCar inherits from Car, which inherits from Vehicle
class ElectricCar extends Car {
    constructor(make, model, doors, batteryLife) {
        super(make, model, doors); // Call the constructor of Car
        this.batteryLife = batteryLife;
    }

    charge() {
        console.log(`Charging the ${this.make} ${this.model}. Battery life: ${this.batteryLife} hours.`);
    }
}

function main() {
    const myElectricCar = new ElectricCar("Tesla", "Model S", 4, 12);

    // Inherited from Vehicle (via Car)
    myElectricCar.start(); 

    // Inherited from Car
    myElectricCar.drive();

    // Specific to ElectricCar
    myElectricCar.charge(); 
}

main();
