// let al = alert("danger");
// console.log("This is a simple log" + al);
// console.error("This is an error msg");
// console.warn("this is a warning msg");
// let input = prompt("Enter Value: ");
// console.log(input);


/*================================================================== */
// Question No. 1:
/* Create a number variable num with some value.
    Now, print "good" if the number is divisible by 10 and print "bad" if it is not */

let num = 20;
if(num/10){
    console.log("good");
}else{
    console.log("bad")
}

/*
* Take the user's name & age as input using prompts.
* Then return back the following statement to the user as an alert (by substituting
* their name & age) :
* name is age years old
 */
// let name = prompt("Enter Name: ");  // prompt use for input
// let age = prompt("Enter Age: ");
// alert(`${name} is ${age} year old.`);

/* 
* Qs3. Write a switch statement to print the months in a quarter.
*   Months in Quarter 1 : January, February, March
*   Months in Quarter 2 : April, May, June
*   Months in Quarter 3 : July, August, September
*   Months in Quarter 4: October, November, December
*   [Use the number as the case value in switch]
*/
let month_num = 0;
switch(month_num){
    case(1):
        console.log("January, February, March");
        break;
    case(2):
        console.log("April, May, June");
        break;
    case(3):
        console.log("July, August, September");
        break;
    case(4):
        console.log("October, November, December")
    default:
        console.log("Uknown");
}

let str = "Aolden string";
if(str[0] == 'a' || str[0] == 'A' && str.length == 5){
    console.log("golden")
}else{
    console.log("not");
}