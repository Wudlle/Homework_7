public class Main {
    public static void main(String[] args) {
        Main tasks = new Main();
        int[] a = {1, 2, 4, 2, 1, 5, 6, 2};
        int[] b = {-1, -3, 2, 4, -2, -5, -6};

        System.out.print("Task 211) ");
        tasks.task211(a);

        System.out.print("Task 212) ");
        tasks.task212(a);

        System.out.print("Task 213) ");
        tasks.task213(b);

        System.out.print("Task 214) ");
        tasks.task214(b);

        System.out.print("Task 215) ");
        tasks.task215(a);

        System.out.print("Task 216) ");
        tasks.task216(a);

        System.out.print("Task 217) ");
        tasks.task217(a);

        System.out.print("Task 219) ");
        tasks.task219(a);

        System.out.print("Task 220) ");
        tasks.task220(b);

        System.out.print("Task 221) ");
        tasks.task221(a);

        System.out.print("Task 222) ");
        tasks.task222(a);

        System.out.print("Task 223) ");
        tasks.task223(a);

        System.out.print("Task 227) ");
        tasks.task227(a);

        System.out.print("Task 228) ");
        tasks.task228(a);

        System.out.print("Task 229) ");
        tasks.task229(a);
    }


    public void task211(int[] arr) {
        int sum = 0;
        int positive = 0;
        for (int j : arr) {
            if (j > 0) {
                sum = sum + j;
                positive += 1;
            }

        }
        System.out.println(sum / positive);
    }


    public void task212(int[] arr) {
        int positive = 0;
        int sum = 1;
        for (int j : arr) {
            if (j > 0) {
                sum = sum * j;
                positive++;
            }
        }
        System.out.println(sum / positive);
    }


    public void task213(int[] arr) {
        int positive = 0;
        int sum = 1;
        for (int j : arr) {
            if (j < 0) {
                sum = sum * j;
                positive++;
            }
        }
        System.out.println(sum / positive);
    }


    public void task214(int[] arr) {
        int sum = 0;
        int positive = 0;
        for (int j : arr) {
            if (j < 0) {
                sum = sum + j;
                positive += 1;
            }

        }
        System.out.println(sum / positive);
    }


    public void task215(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }


    public void task216(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum * arr[i];
            }
        }
        System.out.println(sum);
    }


    public void task217(int[] arr) {
        int sum = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                sum = sum * (arr[i] * arr[i]);
            }
        }
        System.out.println(sum);
    }


    public void task219(int[] arr) {
        int k = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }


    public void task220(int[] arr) {
        int countOfPositive = 0, countOfNegative = 0;

        for (int j : arr) {
            if (j >= 0) {
                countOfPositive++;
            } else {
                countOfNegative++;
            }
        }
        System.out.println("Positive = " + countOfPositive);
        System.out.println("          Negative = " + countOfNegative);
    }


    public void task221(int[] arr) {
        int a = 1, b = 3, sum = 0;

        for (int j : arr) {
            if (j <= b && j >= a) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }


    public void task222(int[] arr) {
        int c = 1, d = 3, sum = 1;

        for (int j : arr) {
            if (j < d && j >= c) {
                sum = sum * j;
            }
        }
        System.out.println(sum);
    }


    public void task223(int[] arr) {
        int c = 1, d = 3, count = 0;

        for (int j : arr) {
            if (j < d && j > c) {
                count++;
            }
        }
        System.out.println(count);
    }


    public void task227(int[] arr) {
        int k = 2, sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0){
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }


    public void task228(int[] arr) {
        int k = 3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }


    public void task229(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i >= 0) {
                sum *= arr[i];
            }
        }
        System.out.println(sum);
    }

}