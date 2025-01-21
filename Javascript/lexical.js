// const parentFunction = () => {
//     const message = "Hello from the parent scope!";
  
//     const childFunction = () => {
//       console.log(message); // Output - Hello from the parent scope!
//     };
  
//     return childFunction;
//   };
  
//   const child = parentFunction();
//   child();
  
const name = "John";
function greet() {
  const name = "Jane";
  function sayHello() {
    console.log(`Hello, ${name}`); //hello jane
  }
  sayHello();
}
greet()
