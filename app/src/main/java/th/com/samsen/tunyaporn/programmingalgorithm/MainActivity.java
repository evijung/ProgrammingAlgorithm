package th.com.samsen.tunyaporn.programmingalgorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        print1();
        print2();
        print3();
    }

    private void print3() {
        int sum = 5;
        for (int i = 1; i <= sum; i++) {
            int temp = sum - i;
            for (int j = 0; j < temp; j++) {
                System.out.print('0');
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print('X');
            }
            System.out.print('X');

            for (int j = 0; j < i-1; j++) {
                System.out.print('X');
            }
            for (int j = 0; j < temp; j++) {
                System.out.print('0');
            }


            System.out.println();

        }


    }

    private void print2() {
        int sum = 10;
        for (int i = 1; i <= 10; i++) {
            int temp = sum - i;
            for (int j = 0; j < temp; j++) {
                System.out.print('0');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('X');
            }
            System.out.println();
        }

    }

    private void print1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}