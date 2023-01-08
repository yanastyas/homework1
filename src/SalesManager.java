public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat() {
        int stat = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        for (long sale : sales) {
            if (min() == sale && b == 0) {
                b++;
            } else if (max() == sale && c == 0) {
                c++;
            } else {
                stat += sale;
                a++;
            }
        }
        return (stat / a);
    }
}

