let arr1 = ["I", "go", "home"];

//delete
//no length change empty is there
delete arr1[1]; //return true
console.log( arr1);
console.log(arr1[1])

// length
//a=5
//a.length=6//return 6
//array length incresed by empty element
//a.length=3
//array length descresed like [1,2,3]

console.log( arr1.length ); 

let arr2 = [1,2,3,4];
//push
arr2.push(5);//return length of arr
console.log(arr2);
//change

//pop
arr2.pop();//return deleted element
console.log(arr2);
//change

//shift
arr2.shift();//return deleted element
console.log(arr2)
//change

//in pop or shift any args given but work same no diff

//unshift
arr2.unshift(6);//arr length
console.log(arr2);
//change

//splice
//for insert in between
arr2.splice(1,0,7);//return 1(1 ele insert)
console.log(arr2);
//for delete
arr2.splice(1,1)
console.log(arr2)
//a=[1,2,3,4]
//a.splice(0) return full array
//a empty array(delete all elment)
//a.splice(2)//3,4 return
//a //1,2
//change in original arr

//slice
console.log(arr2.slice(1,3))
console.log(arr2.slice(-1))
//a.slice(-1,-2)//return []
//no change 

//at
console.log(arr2.at(-2))
console.log(arr2[-2])//undefined
console.log(arr2[0])
//a.at("tree") //return first ele

//indexof
console.log(arr2.indexOf(7)) //not present then -1
console.log(arr2.indexOf(3))//return index of element

//includes
console.log(arr2.includes(7))//false
//if includes true

//concate
let arr3 = [1,2,3];
let arr4 = [4,5,6];
console.log("concat : "+arr3.concat(arr4));
//return new arr ,no change in arr3

//join
console.log(arr3.join('_'));
//no change

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
//if no then return empty arr

//reduce(convert arr in single value)
na=arr3.reduce((a,b)=>a+b)
console.log(na)

//find(if not then undefined)
arr3.push(4,5,3)
newar=arr3.find((i)=>i==2)//2 //no find then undefined
//newar=arr3.findIndex((i)=>i==2)//1(index)//if not then -1
//newar=arr3.findLastIndex((i)=>i==3)//5
console.log("find : ",newar)

//sort
ar=[2,3,5,1,11]
//ar.sort((a,b)=>a-b) 1,2,3,5,11
ar.sort()//change
ar.toSorted()//no chnge in main arr
console.log(ar)

//reverse
//ar.sort((a,b)=>b-a)11,5,3,2,1
ar.reverse()
//ar.toReversed()//no chnage
console.log(ar)

//a=[name:'abc']//syntax err
//a=['name':'abc']//syntax err
//a['name']='krishna'
//a (now above will added into a)


//a={name:"krishna",name:'aaa'}
//name//return shreya 

//a=[1,2,3,function name(){return 3}]
//a[3]()//function will run
//a[3]//return as it is function 

//a=[1,2,3]
//a.some((i)=>i>90)//return false
//if atleast 1 ele there return true
//else false
//for [] false

//same for every but for all ele
//for [] true