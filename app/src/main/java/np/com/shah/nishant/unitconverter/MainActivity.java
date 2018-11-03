package np.com.shah.nishant.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && data != null && resultCode == RESULT_OK) { // this 100 needs to match the 100 we used when we called startActivityForResult!
            String newQuestion = data.getStringExtra("keyQuestion");
            String newAns = data.getExtras().getString("keyAns");
            String newO1 = data.getExtras().getString("keyWrongAns1");
            String newO2 = data.getExtras().getString("keyWrongAns2");

            //Setting question to our flashcard
            TextView newQ = (TextView) findViewById(R.id.flashcard_question);
            newQ.setText(newQuestion);

            TextView newA = (TextView) findViewById(R.id.flashcard_answer);
            newA.setText(newAns);
            newA.setVisibility(View.INVISIBLE);

            TextView opt1 = (TextView) findViewById(R.id.flashcard_option1);
            opt1.setText(newO1);
            opt1.setVisibility(View.INVISIBLE);


            TextView opt2 = (TextView) findViewById(R.id.flashcard_option2);
            opt2.setText(newO2);
            opt2.setVisibility(View.INVISIBLE);

            ImageView newNoEye = (ImageView) findViewById(R.id.noeye);
            newNoEye.setVisibility(View.INVISIBLE);

            ImageView newEye = (ImageView) findViewById(R.id.eye);
            newEye.setVisibility(View.VISIBLE);


        }
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

    public void newActivity(View v) {
        Intent intent = new Intent(MainActivity.this, AddCardActivity.class);


        TextView Q = (TextView) findViewById(R.id.flashcard_question);
        String newQ = Q.getText().toString();

        TextView A = (TextView) findViewById(R.id.flashcard_answer);
        String newA = A.getText().toString();

        TextView O1 = (TextView) findViewById(R.id.flashcard_option1);
        String newO1 = O1.getText().toString();

        TextView O2 = (TextView) findViewById(R.id.flashcard_option2);
        String newO2 = O2.getText().toString();

        intent.putExtra("keyQ", newQ);
        intent.putExtra("keyA", newA);
        intent.putExtra("keyO1", newO1);
        intent.putExtra("keyO2", newO2);
        MainActivity.this.startActivityForResult(intent, 100);

    }



}
