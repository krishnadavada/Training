// function outerFunction() {
//     const outerVar = "I am outer";
  
//     function middleFunction() {
//       const middleVar = "I am middle";
  
//       function innerFunction() {
//         const innerVar = "I am inner";
//         console.log(outerVar);  // Output - I am outer
//         console.log(middleVar); // Output - I am middle
//         console.log(innerVar); // Output - I am inner
//       }
//       innerFunction();
//     }
//     middleFunction();
//   }
//   outerFunction()
// 
//;

const globalVar = "I am global";
function outer() {
  const outerVar = "I am outer";
  function inner() {
    const innerVar = "I am inner";
    console.log(globalVar); // Output - I am global
    console.log(outerVar);  // Output - I am outer
  }
  inner();
}
outer();

  