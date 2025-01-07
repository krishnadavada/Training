// Base class Earth
class Earth {
    constructor() {
        this.planetType = "Earth";  // All objects belong to Earth
    }

    // Method to describe Earth
    describeEarth() {
        console.log("This is the Earth, the planet where life exists.");
    }
}

// Class Living extends Earth
class Living extends Earth {
    constructor(livingType) {
        super();  // Call the constructor of Earth class
        this.livingType = livingType;
    }

    // Method to describe living beings
    describeLiving() {
        console.log("Living being type: " + this.livingType);
    }
}

// Class NonLiving extends Earth
class NonLiving extends Earth {
    constructor(nonLivingType) {
        super();  // Call the constructor of Earth class
        this.nonLivingType = nonLivingType;
    }

    // Method to describe non-living things
    describeNonLiving() {
        console.log("Non-living thing type: " + this.nonLivingType);
    }
}

// Class Human extends Living
class Human extends Living {
    constructor(name) {
        super("Human");  // Call the constructor of Living class
        this.name = name;
    }

    // Method to describe a human
    describeHuman() {
        console.log("Human Name: " + this.name);
    }

    // Override describeLiving to add human-specific behavior
    describeLiving() {
        super.describeLiving();
        console.log(this.name + " is a living being of human type.");
    }
}

function main() {
    // Create instances of each class
    const earth = new Earth();
    const livingBeing = new Living("Animal");
    const nonLivingThing = new NonLiving("Rock");
    const human = new Human("John");

    // Call methods on the instances
    earth.describeEarth();
    livingBeing.describeLiving();
    nonLivingThing.describeNonLiving();
    human.describeEarth();
    human.describeLiving();
    human.describeHuman();
}

// Run the main function
main();
