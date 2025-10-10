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
console.log(str.replaceAll('o','w'));

// !trim()
let txt = "today is the great day"
console.log(txt);
console.log(txt.trim());

// ! indexOf(str)
console.log(str.indexOf('Good'));
console.log(str.indexOf('v'));
console.log(str.indexOf('o'));

// ! lastIndexoF()
console.log(str.lastIndexOf('o'));

// ! includes()
console.log(str.includes('M'));
console.log(str.includes('Evening'));

// ! repeat(num)
console.log(str.repeat(5));

// ! charAt(index)
console.log(str.charAt(8));
console.log(str.charAt(80));

// ! charCodeAt(index)
console.log(str.charCodeAt(8));

// ! concat()
console.log(str.concat(txt));

// ! padStart(Length_of_res_str, char)
// XXXXXXXXX98
let a = '98'
console.log(a.padStart(10,'X'));

// ! padEnd(Length_of_res_str, char)
// 6789XXXXXXXX
let b = '6889'
console.log(b.padEnd(12,'X'))