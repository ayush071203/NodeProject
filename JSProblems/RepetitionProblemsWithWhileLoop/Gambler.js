let money = 100;
let wins = 0;
let totalBets = 0;

while (money > 0 && money < 200) {
    totalBets++;
    const betResult = Math.random() < 0.5 ? "Win" : "Lose";

    if (betResult === "Win") {
        money++;
        wins++;
    } else {
        money--;
    }

    console.log(`Bet ${totalBets}: ${betResult} | Money: Rs ${money}`);
}

console.log(`\nFinal Money: Rs ${money}`);
console.log(`Total Bets: ${totalBets}`);
console.log(`Total Wins: ${wins}`);
