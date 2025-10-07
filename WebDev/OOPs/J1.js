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
// ? 3.Costructor function