package np.com.shah.nishant.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
    }


    public void closeActivity(View v) {
        finish();
    }
}
