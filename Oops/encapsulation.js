// BankAccount class implementing encapsulation
class BankAcc {
    
    #balance;

    // Constructor for initialize the balance
    constructor(Balance) {
        if (Balance >= 0) {
            this.#balance = Balance;
        } else {
            throw new Error("Initial balance must be non-negative.");
        }
    }

    // Getter method to access the balance
    getBalance() {
        return this.#balance;
    }

    // Method to deposit money into the account
    deposit(amount) {
        if (amount > 0) {
            this.#balance += amount; // Increase balance
            console.log("Amount deposited successfully!")
            console.log(`${amount} deposited. current balance: ${this.#balance}`);
        } else {
            console.log("Invalid Amount");
        }
    }

    // Method to withdraw money from the account
    withdraw(amount) {
        if (amount > 0 && amount <= this.#balance) {
            this.#balance -= amount; // Decrease balance
            console.log("Amount withdrawn successfully!")
            console.log(`${amount} withdrawn. current balance: ${this.#balance}`);
        } else {
            console.log("Invalid Amount.");
        }
    }
}

function main() {
    try {
        // Create a bank account with an initial balance of 500
        const account = new BankAcc(2000);

        // Access balance through the getter method
        console.log(`Initial Balance: ${account.getBalance()}`);

        // Deposit money
        account.deposit(1000);

        // Withdraw money
        account.withdraw(100);

    } catch (error) {
        console.error(error.message);
    }
}

main();
