function isPrime(num) {
    if (num < 2) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

function getPalindrome(num) {
    return parseInt(num.toString().split('').reverse().join(''));
}

const num = parseInt(process.argv[2]);

if (isPrime(num)) {
    const palindrome = getPalindrome(num);
    console.log(`${num} is a Prime Number.`);
    console.log(`Palindrome of ${num} is ${palindrome}.`);

    if (isPrime(palindrome)) {
        console.log(`Palindrome ${palindrome} is also Prime.`);
    } else {
        console.log(`Palindrome ${palindrome} is NOT Prime.`);
    }
} else {
    console.log(`${num} is NOT a Prime Number.`);
}
