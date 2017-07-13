package technology.dxc.sslissuetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    static int numberOfTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textView);

        final Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                numberOfTimesClicked++;
                if(numberOfTimesClicked == 1)
                    textView.setText("You have clicked the button 1 time!");
                else
                    textView.setText("You have clicked the button " + numberOfTimesClicked + " times!");
            }
        });
    }
}
