console.log(window);
console.log(window.location);
console.log(location);
console.log(window.navigator);
console.log(screen);
console.log(history);
console.log(document);  //DOM


//DOM
console.log(document.head);
console.log(document.body)
console.log(document);
console.log(document.scripts);
console.log(document.images);
console.log(document.links);
console.log(document.forms)


// ! DOM Targetting methods
// ! getElementId('id') : element with unique id

console.log(document.getElementById('heading'));

// ! getElementByClassName("classname") : multiple elements with classname
// returns HTML collection : Array like proejct
let boxes = document.getElementsByClassName("box");
console.log(boxes);

let arr = Array.from(boxes)
console.log(arr);

// ! getElementBytagname("Tagname") : multiple elments with the tagname
console.log(document.getElementsByTagName('button'));

// ! querySelector("selector") : single elment with css selector
console.log(document.querySelector('#heading')) // for particular id
console.log(document.querySelector('.box'))  // for particular class
console.log(document.querySelector('button'));

// ! querySelectorAll("selector") : multiple elements with css selector
console.log(document.querySelectorAll('#btn_blk button'));