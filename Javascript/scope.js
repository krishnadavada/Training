// function scopeExample() {
//     if (true) {
//       var a = "var in block";
//       let b = "let in block";
//       const c = "const in block";
//     }
//     console.log(a); // Output - var in block
//     console.log(b); // Output - reference err
//     console.log(c); // Output - reference err
//   }
//   scopeExample();
  
//here var is function scope and updating x value
// var x = 5;
// function test() {
//   var x = 10;
//   if (true) {
//     var x = 15;
//   }
//   console.log(x); // Output - 15
// }
// test();

x = 5;
function test() {
  x = 10;
  if (true) {
    x = 15;
  }
  console.log(x); // Output - 15
}
test();
