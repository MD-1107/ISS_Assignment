document.addEventListener('DOMContentLoaded', function () {
    const form = document.forms['registerForm'];
    const name = form['name'];
    const email = form['email'];
    const contact = form['contact'];
    const password = form['password'];
    const password2 = form['password2'];
    const gender = form['gender'];
    const city = form['city'];

    form.addEventListener('submit', function (e) {
        e.preventDefault();
        validateInputs();
        
        if (form.querySelectorAll('.success').length === form.length - 1) {
          
            window.location.href = '/Login'; 
        }
    });

    const setError = function (element, message) {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = message;
    inputControl.classList.add('error');
    inputControl.classList.remove('success');
   };

    const setSuccess = function (element) {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = '';
    inputControl.classList.add('success');
    inputControl.classList.remove('error');
    };


    const isValidEmail = function (email) {
        const emailFormat = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return emailFormat.test(String(email).toLowerCase());
    };

    const validateInputs = function () {
        const nameValue = name.value.trim();
        const emailValue = email.value.trim();
        const contactValue = contact.value.trim();
        const passwordValue = password.value.trim();
        const password2Value = password2.value.trim();
        const genderValue = gender.value;
        const cityValue = city.value;

        if (nameValue === '') {
            setError(name, 'Username is Required');
        } else {
            setSuccess(name);
        }

        if (emailValue === '') {
            setError(email, 'Email is Required');
        } else if (!isValidEmail(emailValue)) {
            setError(email, 'Valid Email is required');
        } else {
            setSuccess(email);
        }

        if (contactValue === '') {
            setError(contact, 'Contact Number is Required');
        } else if (contactValue.length !== 10) {
            setError(contact, 'Provide Valid Contact Number');
        } else {
            setSuccess(contact);
        }

        if (passwordValue === '') {
            setError(password, 'Password is Required');
        } else if (passwordValue.length < 8) {
            setError(password, 'Password should be at least 8 characters');
        } else {
            setSuccess(password);
        }

        if (password2Value === '') {
            setError(password2, 'Please confirm your password');
        } else if (password2Value !== passwordValue) {
            setError(password2, 'The passwords do not match');
        } else {
            setSuccess(password2);
        }

        if (!genderValue) {
            setError(gender, 'Please select a gender');
        } else {
            setSuccess(gender);
        }

        if (cityValue === 'Select City') {
            setError(city, 'Please select a city');
        } else {
            setSuccess(city);
        }
    };
});
