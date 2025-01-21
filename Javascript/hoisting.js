console.log(a); // Output - undefined
var a = 10;

console.log(b); // Output - ref err
let b = 20;

//hoisting is possible
function hoistedFunction() {
  console.log("I am hoisted!");
}

hoistedFunction();

//hoisting is not possible in function expression (behave as variable)
funExp()

var funExp=function (){
    console.log("I am function expression")
}

//hoisting is not possible in arrow function (behave as variable)
funExp()

var funExp=()=>{
    console.log("I am function expression")
}


