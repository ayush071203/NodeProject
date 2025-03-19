function celsiusToFahrenheit(celsius) {
    if (celsius < 0 || celsius > 100) {
        console.log("Invalid Celsius value! Enter a temperature between 0°C and 100°C.");
        return;
    }
    return (celsius * 9/5) + 32;
}

function fahrenheitToCelsius(fahrenheit) {
    if (fahrenheit < 32 || fahrenheit > 212) {
        console.log("Invalid Fahrenheit value! Enter a temperature between 32°F and 212°F.");
        return;
    }
    return (fahrenheit - 32) * 5/9;
}

// Input
const choice = parseInt(process.argv[2]);
const temp = parseFloat(process.argv[3]);

if (choice === 1) {
    console.log(`${temp}°C = ${celsiusToFahrenheit(temp).toFixed(2)}°F`);
} else if (choice === 2) {
    console.log(`${temp}°F = ${fahrenheitToCelsius(temp).toFixed(2)}°C`);
} else {
    console.log("Invalid choice! Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius.");
}
