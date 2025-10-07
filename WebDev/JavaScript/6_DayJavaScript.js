// ! Array : collection of multiple elements
// index based -- starts from 0
// length : num of elements present in the array

// ! 1.Array literal 
// syntax : var/let/const arrayname = [val1,val2,val3,val4,......]
const arr = [1,2,3,4,5,6,7,8,9]
console.log(arr);
console.log(arr.length);

// ! access 
console.log(arr[1]);

// ! update
arr[3] = 400
console.log(arr);

// ! add
arr[9] = 100
console.log(arr);

// ! delete
delete arr[2]
console.log(arr);

let std = [1,'Krutik','bng',45667.89,false]
console.log(std);