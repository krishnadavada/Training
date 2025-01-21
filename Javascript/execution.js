// console.log("Global Context");

// function firstFunction() {
//   console.log("Inside First Function");

//   function secondFunction() {
//     console.log("Inside Second Function");
//   }
//   secondFunction();
// }
// firstFunction();

//explanation : 
//print global context

//global
//firstfunction{}

//function
//secondfunction{}

//print inside first function

//print inside second function


// console.log("Start");

// function first() {
//   console.log("First Function");
//   second();
// }

// function second() {
//   console.log("Second Function");
// }

// first();
// console.log("End");


var a="global"

function print(){
    var b="function"
    console.log(a);
    console.log(b);
}

print()