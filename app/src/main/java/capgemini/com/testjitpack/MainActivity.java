package capgemini.com.testjitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import capgemini.com.view.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test test = new Test();
        test.testMessage("Test message");

    }
}
