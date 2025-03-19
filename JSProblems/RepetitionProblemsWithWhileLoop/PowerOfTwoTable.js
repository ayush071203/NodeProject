const n = parseInt(process.argv[2]);
let i = 0;
let result = 1;

console.log(`Power of 2 table up to 2^${n} or 256:`);
while (i <= n && result <= 256) {
    console.log(`2^${i} = ${result}`);
    result *= 2;
    i++;
}
