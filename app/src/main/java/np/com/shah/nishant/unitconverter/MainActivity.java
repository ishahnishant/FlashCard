package np.com.shah.nishant.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAns(View view){
        findViewById(R.id.flashcard_answer).setBackground(getDrawable(R.drawable.flashcard_green));

    }

    public void checkOpt1(View view){
        findViewById(R.id.flashcard_option1).setBackground(getDrawable(R.drawable.flashcard_red));


    }

    public void checkOpt2(View view){

        findViewById(R.id.flashcard_option2).setBackground(getDrawable(R.drawable.flashcard_red));

    }

}
