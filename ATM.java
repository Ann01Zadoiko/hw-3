package molude;

public class ATM {
    public int countBanknotes(int sum){
        int count = 0;
        int j = 100;
        while (sum > 0 && j>=1){
                if (sum >= j * 5) {
                    sum -= j*5;
                    count++;
                }
                if (sum  >= j*2 && sum < j*5){
                    sum -= j*2;
                    count++;
                }
                if (sum  >= j*1 && sum < j*2){
                    sum -= j*1;
                    count++;
                }
            if (sum >=100){
                j=100;
            }
            if (sum <100 && sum>=10){
                j = 10;
            }
            if (sum >=1 && sum<10){
                j = 1;
            }
            }

        return count;
    }
}

