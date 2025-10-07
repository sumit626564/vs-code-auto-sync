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
let multiply = (x,y) => x*y 

console.log(multiply(9,3));

let res = (p,q) => {
    console.log(`addition : ${p+q}`);
    console.log(`multiplication : ${p*q}`);
}
res(90,10)

// design a function -- username, address
// Hello I am username and I am from address
// user input 