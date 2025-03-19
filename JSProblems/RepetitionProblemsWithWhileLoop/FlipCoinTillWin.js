let headsCount = 0;
let tailsCount = 0;

while (headsCount < 11 && tailsCount < 11) {
    const flip = Math.random() < 0.5 ? "Heads" : "Tails";

    if (flip === "Heads") {
        headsCount++;
    } else {
        tailsCount++;
    }

    console.log(`Flip: ${flip} | Heads: ${headsCount} | Tails: ${tailsCount}`);
}

console.log(headsCount === 11 ? "Heads won 11 times!" : "Tails won 11 times!");
