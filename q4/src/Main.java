class VendingMachine {
    private int numCans;
    private int tokens;

public VendingMachine() {
        numCans = 10;
        tokens = 0;
        }
public VendingMachine(int cans) {
        numCans = cans;
        tokens = 0;
        }
public void fillUp(int cans) {
        numCans = numCans + cans;
        }
public void insertToken() {
        numCans = numCans - 1;
        tokens = tokens + 1;
        }
public int getCanCount() {
        return numCans;
        }
public int getTokenCount() {
        return tokens;
        }
        }