// ! String : collection of characters
let str = 'Hello Good Evening'
console.log(str);
console.log(str.length);
console.log(str[2]);

// ! String methods
// ! Slice(start_index, end_index) : to get the part of the string
console.log(str.slice(2,8));
console.log(str.slice(8));
console.log(str.slice(-5))  // reverse

// ! substring() : it is similar to slice but here negative index won't work
console.log(str.substring(2,8));
console.log(str.substring(8));
console.log(str.substring(-5));

// ! substr(start_index, length_of_res_str) : to get the part of the string
console.log(str.substr(3,4));

// ! replace(oldstr, newstr)
console.log(str.replace('Evening','Morning'));
console.log(str.replace('o','l'));

// ! replaceAll(oldstr, newstr)
console.log(str.replaceAll('o',w));

// !trim()
let txt = "today is the great day"
console.log(txt);
console.log(txt.trim());

// ! indexOf(str)
console.log(str.indexOf('Good'));