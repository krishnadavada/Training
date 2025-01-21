// const createCounter = () => {
//     // Your code here
//     let counter=0
//     return function(){
//        counter+=1
//        console.log(counter)
//     }
//   };
  
//   const counter = createCounter();
//   console.log(counter()); // 1
//   console.log(counter()); // 2
//   console.log(counter()); // 3
  

function bank(){
   let balance = 0;
   function deposite(amount){
      balance += amount
      return balance
   }

   function withdraw(amount){
      balance-=amount
      return balance
   }

   function getAm(){
      console.log("balance : ",balance)
   }

   return{ deposite,withdraw,getAm}
}

let b=bank()
b.deposite(1000)
b.withdraw(500)
b.getAm() // balance : 500