let heading = document.getElementById('greet');
console.log(heading);

//! ! innerHTML : change the HTML of an element
heading.innerHTML = '<i>Good Evening....</i>'

// ! innerText: Change the content
heading.innerText = '<i> Good <i>'

// ! changing the value of an attribute
heading.id = 'demo'

// ! setAttribute('arr_name', "att_val") : adding new attribute
heading.setAttribute('title', to)

