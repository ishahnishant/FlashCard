package np.com.shah.nishant.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
    }


    public void closeActivity(View v) {
        finish();
    }

    public void saveCard(View v) {
        //Stores the Question


        //Creating a static TextView to set Question
        TextView newQ = (TextView) findViewById(R.id.addQuestion);
        String newQuestion = newQ.getText().toString();

        //Store Ans
        TextView ans = (TextView) findViewById(R.id.addAns);
        String answerNew = ans.getText().toString();

        //Setting the Question to MainActivity
        //TextView show = (TextView)findViewById(R.id.flashcard_question);
        //show.setText(String.valueOf(newQuestion));


        Intent intent = new Intent(AddCardActivity.this, MainActivity.class);
        intent.putExtra("keyQuestion", newQuestion);
        intent.putExtra("keyAns", answerNew);

        AddCardActivity.this.startActivityForResult(intent, 200);
    }


}

