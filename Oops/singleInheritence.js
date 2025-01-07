// Parent class
class Animal {

    eat() {
        console.log("animal is eating.");
    }
}

// Child class dog inheriting from the Animal class
class Dog extends Animal {
    bark() {
        console.log("dog is barking.");
    }
}

function main() {
    const myDog = new Dog();

    // Accessing methods from the parent class
    myDog.eat(); 

    // Accessing the method from the child class
    myDog.bark();
}

main();
