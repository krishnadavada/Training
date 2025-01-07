//javascript does not support multiple inheritence but we can achieve this using mixins
// A mixin is a function that takes a class as a parameter, extends it, and adds new functionality to it.

//mixin function CanFLy
const CanFly = (Base) => class extends Base {
    fly() {
        console.log(`flying...`);
    }
};

//mixin function CanSwim
const CanSwim = (Base) => class extends Base {
    swim() {
        console.log(`swimming...`);
    }
};

// Base class
class Animal {
    eat() {
        console.log(`eating...`);
    }
}

// Duck class using mixins for flying and swimming
class Duck extends CanSwim(CanFly(Animal)) {
    quack() {
        console.log(`quacking...`);
    }
}

// Main function
function main() {
    const duck = new Duck();
    duck.eat();
    duck.quack();
    duck.fly();  
    duck.swim();  
}

// Execute the main function
main();
