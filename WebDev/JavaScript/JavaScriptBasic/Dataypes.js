//! Hoisting : default behaviour of moving all the declarations to the top of the current scope
// var a  , let age , const uname

// console.log(a);  //undefined

// var a = 20 ;

// // console.log(age);  //ref err

// // console.log(uname);  //ref err

// let age = 90
// const uname = 'sam'

// document.writeln('Have a happy weekend')
// console.log('Have a happy weekend')

// // Declaration
// var a
// // Initialization
// a = 10
// // Re-initialization
// a = 1000
// // Re-declaration
// var a;
// console.log(a);

// // Declaration
// let b;
// // Initialization
// b = 100
// // Re-initialization
// b = 9000
// // Re-declaration
// // let b
// console.log(b);

// // Declaration
// const c = 20
// // Initialization
// // c = 9000
// // Re-initialization
// // c = 9000
// // Re-declaration
// // const c = 9000
// console.log(c);

// ! Datatypes
// Primitive datatype (store one data)
// ! string 
// let std = 'priya'
// let emp = "tarun"
// let address = `bng`

// // typeof operator : to check the datatype of a variable
// console.log(typeof std);
// console.log(typeof emp);
// console.log(typeof address);

// // `` -- to write the o/p stmt
// // access variable easily ${varname} and multilined o/p stmt
// console.log(`Hello I am  ${std} and I am from ${address}`);

// console.log("Hello "+std+" from "+address);

// ! number
// let age = 90
// let salary = 89978.88
// console.log(typeof age);
// console.log(typeof salary);

// // ! boolean -- true,false
// let isMarried = false
// console.log(typeof isMarried);

// // ! bigint -- huge amount of data
// let sal = 567879n
// console.log(typeof sal);

// // ! undefined : value of un-initialized var
// let company;
// console.log(typeof company);

// // ! null -- empyt -- creates an empty obj for future use
// let work = null
// console.log(typeof work);

// // ! symbol -- emty function for use
// let project = Symbol
// console.log(typeof project);

// Non-primitive datatype (multiple data)
// function
// array
// object

// ! operators
// ! Arithmatic op -- +,-,*,/,%,++,--
// console.log(2+8);
// console.log(9+"8");
// console.log("hello"+" students");

// console.log(60-8);
// console.log(3*5);
// console.log(50/10);
// console.log(30%4);

// let a = 10  //11
// // a++ -- take val after incr  , ++a -- incr after take val
// // console.log(a++);
// // console.log(--a);

// console.log(a++ + ++a + a-- + ++a + --a);
// //          10  + 12 + 12   + 12  + 11

// ! Assignment op -- =,+=,-=,*=,/=,%=
// let x = 100

// x += 10 // x = x+10
// console.log(x);

// x -= 10 // x = x-10
// console.log(x);

// x *= 10 // x = x*10
// console.log(x);

// x /= 10 // x = x/10
// console.log(x);

// x %= 10 // x = x%10
// console.log(x);

// ! Comparison op - >,<,>=,<=,==,===,!=
console.log(4>10);
console.log(5<10);
console.log(60<=90);
console.log(7>=7);
console.log(3!=9);
console.log(5!=5);

// == -- compares only values
console.log(30 == 30);
console.log(60 == "60");

// === -- compare values and datatype
console.log(60 === 60);
console.log(6 === "6"); 