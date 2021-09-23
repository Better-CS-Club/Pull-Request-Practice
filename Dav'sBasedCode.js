const prices = [100, 50, 20, 10, 5, 2, 1, .25, .1, .05, .01];
const text = ["100 Dollar Bill", "50 Dollar Bill", "20 Dollar Bill", "10 Dollar Bill", "5 Dollar Bill", "2 Dollar Bill", "1 Dollar Bill", "Quarter", "Dime", "Nickel", "Penny"];

function money(price) {
  for(let i = 0; i<prices.length; i++) {
    const property = prices[i];
    if(price >= property) {
      let count = Math.floor(price / property);
      price -= property * count;
      if(count > 1) {
        if(property == .01) {
          console.log(count + " Pennies");
        } else {
          console.log(count + " " + text[i] + "s");
        }
      } else if(count == 1) {
        console.log(count + " " + text[i]);
      }
    }
  }
}
money(45.81);
