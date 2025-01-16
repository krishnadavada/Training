//IIFE(immediately invoked function expression)
(function () {
    console.log("I amm IIFE.")
})();

//function defination

function name(){
    console.log("my name")
}

name()

//function expression
//store anonymous function in variable
const myName1=function(n){
    console.log("my name is",n)
}
myName1("sai")

//arrow function 
//this will be inherited
const myname1=(n)=>{
    console.log("my name is",n)
}
myname1("krishna")

//anonymous function
// (){...}


//must return
function name(){
    "hello";
}
    
console.log(name())//undefined


//must return
const myName=function(n){
     n;
    }
console.log(myName("sai")) //undefined 


//arrow function (run without return)
const myname=(n)=>n;
 console.log(myname("krishna"))

function sum(a,b){
    console.log(a+b)
}
sum(5,6)//11
sum(1,2,3,4)//3 others are ignored
sum(2)//NAN
sum()//NAN

//few try-error cases
 function sum1(a,b=9){
      console.log(a+b)
  }
sum1(5)//14
sum1(1,2)//3
sum1(3,4,5)//7 others ignored
sum1()//NAN


function sum2(a,b=9,...c){
    const t=c.reduce((q,w)=>q+w,0)//0 is initial value to reduce
    console.log(a+b+t)
}
sum2(5)//14
sum2(1,2)//3
sum2(3,4,5)//12
sum2()//NAN

//IIFE
//not use when u wann reuse
//why?
//create private scope
//avoide global namespace pollution

// function sum(a,b){
//     return a+b;
// }
// function sum(a,b,c){
//     return a+b+c;
// }
// console.log(sum(2,3)); 
//NAN

// function sum(a,b,c){
//     return a+b+c;
// }

// function sum(a,b){
//     return a+b;
// }

// console.log(sum(2,3)); 
//return 5

function sum(a,b)
{
    console.log(a,b)
}
sum`hi my name ${id} krishna`
//['hi my name','krishna']
//name `${'hi'} my name shreya`
//['', ' my name shreya', raw: Array(2)]
