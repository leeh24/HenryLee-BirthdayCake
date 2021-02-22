package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;


public class CakeController implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView view){
        this.view = view;
        model = view.getCakeModel();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean hasCandles) {
        Log.d( "Switch","Button on click");
        model.setIsCandles(hasCandles);
        view.invalidate();
    }

    @Override
    public void onClick(View v) {
        Log.d( "Button","Button on click");
        model.setCandlesLit(false);
        view.invalidate();
    }





}
