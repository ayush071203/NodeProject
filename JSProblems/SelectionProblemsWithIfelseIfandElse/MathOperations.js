const a = parseInt(process.argv[2]);
const b = parseInt(process.argv[3]);
const c = parseInt(process.argv[4]);

let result1 = a + b * c;
let result2 = a % b + c;
let result3 = c + a / b;
let result4 = a * b + c;

console.log(`Results: ${result1}, ${result2}, ${result3}, ${result4}`);

let max = Math.max(result1, result2, result3, result4);
let min = Math.min(result1, result2, result3, result4);

console.log(`Maximum Value: ${max}`);
console.log(`Minimum Value: ${min}`);
