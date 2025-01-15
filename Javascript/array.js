let arr1 = ["I", "go", "home"];

//delete
delete arr1[1]; 
console.log( arr1);
console.log(arr1[1])

// length
console.log( arr1.length ); 

let arr2 = [1,2,3,4];
//push
arr2.push(5);
console.log(arr2);

//pop
arr2.pop();
console.log(arr2);

//shift
arr2.shift();
console.log(arr2)

//unshift
arr2.unshift(6);
console.log(arr2);

//splice
//for insert in between
arr2.splice(1,0,7);
console.log(arr2);
//for delete
arr2.splice(1,1)
console.log(arr2)

//slice
console.log(arr2.slice(1,3))
console.log(arr2.slice(-1))

//at
console.log(arr2.at(-2))
console.log(arr2[-2])//undefined
console.log(arr2[0])

//indexof
console.log(arr2.indexOf(7)) //not present then -1
console.log(arr2.indexOf(3))//return index of element

//includes
console.log(arr2.includes(7))//false

//concate
let arr3 = [1,2,3];
let arr4 = [4,5,6];
console.log("concat : "+arr3.concat(arr4));

//join
console.log(arr3.join('_'));

//split(method for str)
let a="1,2,3,,4,5";
console.log(a.split(','));

//for each
arr3.forEach((i)=>{
    console.log(i)
})

//map(return new array)
newArr=arr3.map((i)=>i*3)
console.log(newArr)

//filter(return new arr)
narr=arr3.filter((i)=>i<3)
console.log(narr)

//reduce(convert arr in single value)
na=arr3.reduce((a,b)=>a+b)
console.log(na)

//find(if not then undefined)
arr3.push(4,5,3)
newar=arr3.find((i)=>i==2)//2
//newar=arr3.findIndex((i)=>i==2)//1(index)
//newar=arr3.findLastIndex((i)=>i==3)//5
console.log("find : ",newar)

//sort
ar=[2,3,5,1,11]
//ar.sort((a,b)=>a-b) 1,2,3,5,11
ar.sort()
console.log(ar)

//reverse
//ar.sort((a,b)=>b-a)11,5,3,2,1
ar.reverse()
console.log(ar)

