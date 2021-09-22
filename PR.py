#doesn't work
def transfer(amount):
    #convert amount to dollar an bills
    cents = amount * 100
    dollar_100 = cents / 10000
    dollar_50 = cents / 5000
    dollar_20 = cents / 2500
    dollar_10 = cents / 1000
    dollar_5 = cents / 500
    dollar_2 = cents / 200
    dollar_1 = cents / 100

    print(f"you will need {dollar_100}, 100 dollar bills, {dollar_50} 50 dollar bills\
        {dollar_20} 20 dollar bills, {dollar_10} 10 dollar bills, {dollar_5} 5 dollar bills, {dollar_2} dollar bills, and {dollar_1} dollar bills.")

def main():
    amount = float(input("Enter amount of money: "))
    transfer(amount)

if __name__ == "__main__":
    main()
