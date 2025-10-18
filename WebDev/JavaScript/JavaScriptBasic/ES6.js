// ! Rest parameter(...indetifer) : improved way to handel function parameter
// store indefinite number number of arg from of array

function demo(a,b,...c){
    console.log(a)
    console.log(b)
    console.log(c)
}

demo(1,2,3,4,5,6,7,8,9,10)

// ! spread operator : spread the array elements

let nums = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
function task(...rest){
    console.log(rest);
}

// task(nums[0], num[1], num[2], num[3])
task(...nums)

let even = [2, 4, 6, 8, 10]
let odd = [1, 3, 5, 7, 9]

let newArr = [...even,...odd]
console.log(newArr);