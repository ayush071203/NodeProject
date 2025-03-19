function isPalindrome(num) {
    const str = num.toString();
    return str === str.split('').reverse().join('');
}

const num1 = parseInt(process.argv[2]);
const num2 = parseInt(process.argv[3]);

console.log(`${num1} is ${isPalindrome(num1) ? '' : 'NOT '}a palindrome.`);
console.log(`${num2} is ${isPalindrome(num2) ? '' : 'NOT '}a palindrome.`);
