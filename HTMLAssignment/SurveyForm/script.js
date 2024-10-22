function handleSubmit(event) {
    event.preventDefault(); // Prevent the default form submission behavior

    // Get all form values
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelector('input[name="gender"]:checked').value;
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    // Create the confirmation message
    const message = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dob}
        Country: ${country}
        Gender: ${gender}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobile}
    `;

    // Show the popup with values
    if (confirm(message)) {
        // If the user confirms, reset the form
        document.getElementById("surveyForm").reset();
    }
}
