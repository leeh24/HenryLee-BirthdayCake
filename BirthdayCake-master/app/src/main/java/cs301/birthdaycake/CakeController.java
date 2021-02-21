package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener  {
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView view){
        this.view = view;
        model = view.getCakeModel();
    }
    @Override
    public void onClick(View v) {
        Log.d( "Button","Button on click");
        model.setCandlesLit(false);
        view.invalidate();
    }



}
