package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        Button blowoutbuttonView = findViewById(R.id.blowoutbutton);
        blowoutbuttonView.setOnClickListener(cakeController);

        Switch candleSwitch = findViewById(R.id.switch3);
        candleSwitch.setOnCheckedChangeListener(cakeController);

        SeekBar candleSeekBar = findViewById(R.id.seekBar);
        candleSeekBar.setOnSeekBarChangeListener(cakeController);
    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
    }
}
