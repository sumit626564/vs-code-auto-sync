// ! ITERATORS

// ? forEach() : hof -- by executing the callback function each element of the array 
// it will iterate over array

let nums = [10, 20, 30, 40, 50, 60, 80]
nums.forEach((value, ind)=>{
    console.log(value*100);
})

// ? for of : used to iterate overy the array
for(let n of nums){
    console.log(n);
}

// ? for in : used to iterate overy keys of an objects
let bike = {
    brand : 'pulsur',
    color : 'red',
    engine : 'petrol'
}

for(let k in bike){
    // console.log(k)
    console.log(bike[k]);
}

// ! Date object
let d = new Date()
console.log(d);

console.log(d.getFullYear());
console.log(d.getMonth());
console.log(d.Date());
console.log(d.getDay());
console.log(d.getTime());
console.log(d.getHours());
console.log(d.getMinutes());
console.log(d.getSeconds());

// "! 1947 aug 15" if you want to paricualr date according to user or itself
d.setFullYear(1947)
d.setMonth(0)
d.setDate(17)

// cosole.log(d);

console.log(d.toLocaleDateString()) // used for "DD/MM/YYY"
console.log(d.toLocaleTimeString()) // used for "12:15 PM"