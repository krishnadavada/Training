//class shape implementing dynamic polymorphism(method overriding)
class Shape{
    draw(){
        console.log("Drawing a shape");
    }
}

//inherit circle class from parent class shape
class Circle extends Shape{
    //already present in parent class but for specific implementation for method draw in circle class 
    draw(){
        console.log("Drawing a circle");
    }
}

//inherit triangle class from parent class shape
class Triangle extends Shape{
    //already present in parent class but for specific implementation for method draw in triangle class 
    draw(){
        console.log("Drawing a triangle");
    }
}

function main(){
    //create object for both class
    const c = new Circle();
    const t = new Triangle();

    //calling draw method for both the objects
    c.draw();
    t.draw();
}

main()