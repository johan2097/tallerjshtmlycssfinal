
const verifyData = () => {
    document.querySelector("form").addEventListener("submit", function(event){
        event.preventDefault();
        validateForm();
    }); 
};

const printFieldsInfo = () => {
    let firstName = document.getElementById("fname").value;
    let lastName = document.getElementById("lname").value;
    let email = document.getElementById("email").value;
    let subject = document.getElementById("subject").value;
    
    console.log("Form data: ")
    console.log("First name: " + firstName);
    console.log("Last name: " + lastName);
    console.log("email: " + email);
    console.log("Subject: " + subject);
};

const validateForm = () => {
    let input = document.forms.myForm.elements.checktext;
    let empty = false;
    for(let i of input) {
        if(i.value === '') {
            empty = true;
        }
    }
    if(empty) {
        alert('Campos vacios, intente nuevamente');
    } else {
        printFieldsInfo();
    }
};

window.onload = verifyData;
