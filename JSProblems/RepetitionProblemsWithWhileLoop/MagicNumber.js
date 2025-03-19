const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let low = 1;
let high = 100;
let mid;

console.log("Think of a number between 1 to 100...");

while (low <= high) {
    mid = Math.floor((low + high) / 2);

    rl.question(`Is your number less than, greater than, or equal to ${mid}? (l/g/e): `, (answer) => {
        if (answer === 'e') {
            console.log(`Your magic number is: ${mid}`);
            rl.close();
        } else if (answer === 'l') {
            high = mid - 1;
        } else if (answer === 'g') {
            low = mid + 1;
        } else {
            console.log("Invalid input. Please enter 'l', 'g', or 'e'.");
        }
    });
}
