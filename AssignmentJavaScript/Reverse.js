// Function to reverse each word in the sentence
function reverseWords(sentence) {
    // Split the sentence into an array of words
    const wordsArray = sentence.split(" ");

    // Reverse each word in the array
    const reversedWordsArray = wordsArray.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words back into a sentence
    return reversedWordsArray.join(" ");
}

// Take input from the user using the 'readline' module
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

// Ask the user to input a sentence
readline.question("Enter a sentence: ", sentence => {
    // Call the reverseWords function and print the result
    const reversedSentence = reverseWords(sentence);
    console.log("Reversed words sentence: " + reversedSentence);
    
    // Close the input stream
    readline.close();
});
