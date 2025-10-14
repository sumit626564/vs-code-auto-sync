// Function : blk of code which is used to perform particular task and it will be execute when we call it or when we invoke it
console.log('functions');

// parameters : variables declared at the time of function declaration
// function demo(a,b){
//     let res = a+b
//     console.log(res);
// }

// demo(10,100)
// demo(2,4)
// demo(90,80)
// arguments : values passed at the time of function calling to the fun parameters

// function demo(a,b){
//     let res = a+b
//     return res
// }

// console.log(demo(10,100));
// console.log(demo(2,4));

// ! Types of functions

// ! Named function / function declaration : function with name
// function greet(user){
//     console.log(`Hello ${user}`);
// }

// greet('Sanju')

// ! Anonymous function : function without name
// ! Function with expression/functional expression : Passing whole anonymous function as a value to a variable is known as function with expression.
// ! first-class function / first-citizen function : function which is passed as a value variable
// let result = function (num1,num2){
//     console.log(num1*num2);
// }

// result(2,8)

// ! Immediate Invoking function(IIF) : function which shd be called immediately after the declaration
// (function (){
//     console.log('Hello I am IIF');
// })()

// ! Arrow function : reduces syntax
// (para) => { code }
// let multiply = (x,y) => x*y 

// console.log(multiply(9,3));

// let res = (p,q) => {
//     console.log(`addition : ${p+q}`);
//     console.log(`multiplication : ${p*q}`);
// }
// res(90,10)

// design a function -- username, address
// Hello I am username and I am from address
// user input


// ! Nested function :  function inside one more function
// function parent(){
//     let pland = 10
//     let phouse = 4
//     console.log(`Parent Properties : ${pland} acers land and ${phouse} houses`);
//     function child(){
//         let cland = 4
//         let chouse = 2
//         console.log(`Child properties : ${cland+pland} acers land and ${chouse} houses `);
//         // lexical scoping/scope chaining : The ability of js engine to search a variable in the outer scope when it is not available in the local scope
//         // closure : stores required data for nested function
//     }
//     // child()
//     return child
// }

// parent()()    //javascript currying : calling child function along with parent function 

// ! Higher order function(HOF) : function which takes one more function as a value or returns new function
// used to perform multiple tasks

// ! Callback function : function which is passed as an argument to one more function

// function hof(a,b,task){
//     let res = task(a,b)
//     return res
// }

// let add = hof(20,30,function(x,y){return x+y})
// console.log(add);

// let mul = hof(2,4,(p,q)=> p*q)
// console.log(mul);

// ! Generator function : used to generate the values
// yield : very similar to return -- used to yield the value -- 

// function* generate(){
//     yield 123
//     yield "hello"
//     yield "Tarun"
//     yield true
//     yield 677.89
// }

// let res = generate()

// console.log(http://res.next().value);
// console.log(http://res.next().value);
// console.log(http://res.next().value);
// console.log(http://res.next().value);
// console.log(http://res.next().value);

// for(let i=1;i<=5;i++){
//     console.log(http://res.next().value);
// }