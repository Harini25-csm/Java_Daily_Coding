//sum of n numbers
// syntax:s "node sum.js" to run the code
function sum(...args) {
    let total = 0;
    for (let i = 0; i < args.length; i++){
        total += args[i];
    }
    return total;
}
module.exports = sum;
