// ! Object : used to store the data in the form of key value pair
// ! 3
// ? 1.Object literal
//var/let/const object_name = {
    // key1 : value1,
    // key2 : value2,
    // key3 : value3,
    // ..........
    // .........
//}

const obj = {
    unmae : 'Pavi',
    uid : 1234,
    address : 'bng'
}
console.log(obj);

// dot notation and bracket notation
// ! access -- objectname.keyname  / objectname["keyname"]

console.log(obj.unmae);
console.log(obj["uid"]);

// ! update -- objectname.keyname = newval / objectname["keyname"] = newval
obj.uid = 222
obj["address"] = "mumbai"
console.log(obj);

// ! add -- objectname.keyname = val / objectname["keyname"] = val
obj.age = 34
obj["contact"] = 23456789
console.log(obj);

// ! delete -- delete objectname.keyname / delete objectname["keyname"]
delete obj.unmae
delete obj["address"]
console.log(obj);

// ? 2.Object constructor
let car = new Object()
car.brand = 'BMW'
car.color = 'White'
console.log(car);

// ? 3.Costructor function
function student(sid,sname,course){
    this.sid = sid;
    this.sname = sname;
    this.course = course;
}
let std1 = new student(1,'sam','BCA')
console.log(std1);

let std2 = new student(2, 'pavan','BE')
console.log(std2)


// ! Objectmethods