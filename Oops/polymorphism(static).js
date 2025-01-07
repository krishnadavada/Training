// javascript does not support overloading or static 

class Calc{

    add(a,b,c=0,d=0){
        return a+b+c+d;
    }
}

function main(){
     const obj1=new Calc()
     console.log(obj1.add(1,2))
     console.log(obj1.add(1,2,3))
     console.log(obj1.add(1,2,3,4))
}

main()