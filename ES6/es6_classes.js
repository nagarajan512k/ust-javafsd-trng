class student{
    constructor(name,age){
        this.n=name;
        this.a=age;

    }
    stu()
    {
        console.log("The name of the student is:",this.n)
        console.log("The age of the student is:",this.a)
    }
}
var stuObj=new student('Peter',20);
stuObj.stu();