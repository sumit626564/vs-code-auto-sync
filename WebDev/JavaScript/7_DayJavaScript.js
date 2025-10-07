// // ! Array : collection of multiple elements
// // index based -- starts from 0
// // length : num of elements present in the array

// // ! 1.Array literal 
// // syntax : var/let/const arrayname = [val1,val2,val3,val4,......]
// const arr = [1,2,3,4,5,6,7,8,9]
// console.log(arr);
// console.log(arr.length);

// // ! access 
// console.log(arr[1]);

// // ! update
// arr[3] = 400
// console.log(arr);

// // ! add
// arr[9] = 100
// console.log(arr);

// // ! delete
// delete arr[2]
// console.log(arr);

// let std = [1,'Krutik','bng',45667.89,false]
// console.log(std);

// // ! 2.Array constructor
// // let nums = new Array(1,2,3,4,5,6,7,8,9,10,20,20)
// let nums = new Array(2)
// nums[0] = 80
// nums[1] = 800
// nums[2] = 899
// nums[3] = 80000
// console.log(nums);


// ! Array methods
let flipkart = ['cloths','shoes','mobile','laptop','fan','buds']
console.log(flipkart);

//! push(val1,val2,val3.....) : to add multiple array elements at the end of the array
flipkart.push('kurtha','watch','jewellery')
console.log(flipkart);

//! unshift(val1,val2,val3.....) : to add multiple array elements from the starting of the array
flipkart.unshift('table','TV','chair','home appliances')
console.log(flipkart);

// //! pop() : delete the last element from the array
// flipkart.pop()
// flipkart.pop()
// console.log(flipkart);

// //! shift() : delete the first element from the array
// flipkart.shift()
// console.log(flipkart);

// ! splice(start_index,delete_count,replacement_elements) : to add and delete the middle array elements 
//  ['table', 'TV', 'chair', 'home appliances', 'cloths', 'shoes', 'mobile', 'laptop', 'fan', 'buds', 'kurtha', 'watch', 'jewellery']
// ! adding and deleting
// flipkart.splice(2,2,'shirt','earbuds','charger','book')
// ! adding
// flipkart.splice(2,0,'mat','bangle')
// ! delete
// flipkart.splice(4,3)
// console.log(flipkart);

// ! slice(start_index,end_index) : to get the part of the array
// ['table', 'TV', 'chair', 'home appliances', 'cloths', 'shoes', 'mobile', 'laptop', 'fan', 'buds', 'kurtha', 'watch', 'jewellery']
// let slicedArr = flipkart.slice(1,5)
// let slicedArr = flipkart.slice(5)
// console.log(slicedArr);
// console.log(flipkart);

// ! indexOf(element) : returns index position of the specified element
console.log(flipkart.indexOf('book'));
console.log(flipkart.indexOf('watch'));

// ! at(index) : returns element present in the specified index
//console.log(http://flipkart.at(3));
//console.log(http://flipkart.at(30));

// ! includes(element) : check specified element is included in the array or not
console.log(flipkart.includes('watch'));
console.log(flipkart.includes('pen'));

// ! join() : to join all elements of an array into a string.
console.log(flipkart.join());
console.log(flipkart.join(''));
console.log(flipkart.join('--'));
console.log(flipkart.join('..'));

// ! toString() : very similar to join
console.log(flipkart.toString());
console.log(flipkart.toString(''));
console.log(flipkart.toString('--'));
console.log(flipkart.toString('..'));

// ! reverse() : to get the reversed array
console.log(flipkart.reverse());

// ! split() : to convert string into array
let str = "Hello Good Evening"
// let arr = str.split()
// let arr = str.split('')
// let arr = str.split(' ')
let arr = str.split('o')
console.log(arr); 