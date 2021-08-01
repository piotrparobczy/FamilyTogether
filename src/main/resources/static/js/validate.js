document.addEventListener("DOMContentLoaded", function () {

    const registerForm = document.getElementById("registerForm")

    // let textarea = document.getElementById("test")
    // const testValue = textarea.attributes.item(2).nodeValue
    // textarea.parentNode.removeChild(textarea)


    registerForm.addEventListener('submit', handler)

    let done = "no"
    let errorField = document.querySelector("#error-message");
    let successField = document.querySelector("#success-message");

    function handler(e) {
        if (done == "no") {
            e.preventDefault();
        }

        errorField.classList.add("d-none");
        successField.classList.add("d-none");
        errorField.innerHTML = "";

        const errors = [];

        //email
        const regexpEmail = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/
        if (!regexpEmail.test(e.target.email.value)) {
            errors.push("Email musi być postaci: example@example.example")
        }
        // if (testValue != null) {
        //     errors.push(testValue)
        // }

        //firstname
        const regexpName = /[A-Z][a-z]{1,9}/
        if (!regexpName.test(e.target.firstName.value)) {
            errors.push("Imie musi zaczynac sie z dużej liter i posiadać 2-10 znaków")
        }
        //lastname
        if (!regexpName.test(e.target.lastName.value)) {
            errors.push("Nazwisko musi zaczynac sie z dużej liter i posiadać 2-10 znaków")
        }
        //password
        const regexpPassword = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/
        if (!regexpPassword.test(e.target.password.value)) {
            errors.push("Hasło musi miec conajmniej 8 znaków, 1 dużą litere, 1 małą litere, 1 znak specjalny")
        }

        if (e.target.password2.value != e.target.password.value) {
            errors.push("Hasła muszą być takie same")
        }
        //birthday
        const regexpBirthday = /([12]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\d|3[01]))/
        if (!regexpBirthday.test(e.target.birthday.value)) {
            errors.push("Urodziny muszą być postaci YYYY-MM-DD")
        }

        validator(errors)
    }

    function validator(errors) {
        if (errors.length) {
            errorField.classList.remove("d-none");
            errors.forEach(error => {
                const newElement = document.createElement("div")
                newElement.innerText = error;
                errorField.appendChild(newElement)
            })
        } else {
            done = "yes"
            successField.classList.remove("d-none");
            successField.innerText = "Formularz jest poprawny i gotowy do wysłania!"
        }

    }

});
