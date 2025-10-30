let color = "red";
switch(color){
    case "red":
        console.log("slow down");
        break;
    case "green":
        console.log("slow down");
        break;
    default:
        console.log("light is broken");       
}

/*
* Use switch statement to print the day of the week usign a number vairable 'day' with values 1 to 7.
* 1 = Monday, 2 = Tuesday & so on
*/
let day = 7;
switch(day){
    case(1):
        console.log("Monday");
        break;
    case(2):
        console.log("Tuesday");
        break;
    case(3):
        console.log("Wednesday");
        break;
    case(4):
        console.log("Thursday");
        break;
    case(5):
        console.log("Friday");
        break;
    case(6):
        console.log("Saturday");
        break;
    case(7):
        console.log("Sunday, fun day");
        break;
    default:
        console.log("wrong day!"); 
}