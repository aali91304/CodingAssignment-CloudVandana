function appendToDisplay(value) {
    const resultField = document.getElementById("result");
    if (resultField.value === "Error") {
        resultField.value = "";
    }
    resultField.value += value;
}

function clearDisplay() {
    document.getElementById("result").value = "";
}

function calculateResult() {
    const resultField = document.getElementById("result");
    try {
        let result = eval(resultField.value.replace('×', '*').replace('÷', '/'));
        if (isNaN(result) || result === Infinity || result === -Infinity) {
            resultField.value = "Error";
        } else {
            resultField.value = result;
        }
    } catch (error) {
        resultField.value = "Error";
    }
}
