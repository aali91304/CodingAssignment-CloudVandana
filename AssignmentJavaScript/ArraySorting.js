// Function to sort an array in descending order
function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

// Example array
let array = [5, 3, 8, 1, 2, 7, 6, 4];

// Sorting the array in descending order
let sortedArray = sortDescending(array);

// Output the result
console.log("Array sorted in descending order: ", sortedArray);
