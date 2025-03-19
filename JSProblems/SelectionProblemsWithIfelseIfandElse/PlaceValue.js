const number = parseInt(process.argv[2]);

if (number === 1) {
    console.log("Unit");
} else if (number === 10) {
    console.log("Ten");
} else if (number === 100) {
    console.log("Hundred");
} else if (number === 1000) {
    console.log("Thousand");
} else {
    console.log("Invalid Input! Please enter 1, 10, 100, or 1000.");
}
