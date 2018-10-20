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

    public void hide(View v) {
        findViewById(R.id.noeye).setVisibility(View.INVISIBLE);
        findViewById(R.id.eye).setVisibility(View.VISIBLE);
        findViewById(R.id.flashcard_option2).setVisibility(View.INVISIBLE);
        findViewById(R.id.flashcard_option1).setVisibility(View.INVISIBLE);
        findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);

    }

    public void show(View v) {
        findViewById(R.id.noeye).setVisibility(View.VISIBLE);
        findViewById(R.id.eye).setVisibility(View.INVISIBLE);
        findViewById(R.id.flashcard_option2).setVisibility(View.VISIBLE);
        findViewById(R.id.flashcard_option1).setVisibility(View.VISIBLE);
        findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);

    }

}
