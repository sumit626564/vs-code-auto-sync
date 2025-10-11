let heading = document.getElementById('greet');
console.log(heading);

//! ! innerHTML : change the HTML of an element
heading.innerHTML = '<i>Good Evening....</i>'

// ! innerText: Change the content
heading.innerText = '<i> Good <i>'

// ! changing the value of an attribute
heading.id = 'demo'

// ! setAttribute('arr_name', "att_val") : adding new attribute
heading.setAttribute('title', 'Today is the great apply.!');

// ! style : adding styles to the elements
heading.style.color = 'red'
document.body.style.backgroundColor = 'black'

// !  creatElement(tagname) : create a new element
let d = document.createElement('div')
d.textContent = 'Hello I am Div'
console.log(d);

// ! 