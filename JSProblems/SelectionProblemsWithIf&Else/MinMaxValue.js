
let numbers = Array.from({ length: 5 }, () => Math.floor(Math.random() * 900) + 100);

console.log("Generated Numbers:", numbers);

let minValue = Math.min(...numbers);
let maxValue = Math.max(...numbers);

console.log(`Minimum Value: ${minValue}`);
console.log(`Maximum Value: ${maxValue}`);
