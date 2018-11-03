package np.com.shah.nishant.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        String newQ = getIntent().getStringExtra("keyQ");
        String newA = getIntent().getStringExtra("keyA");
        String newO1 = getIntent().getStringExtra("keyO1");
        String newO2 = getIntent().getStringExtra("keyO2");

        EditText newQu = (EditText) findViewById(R.id.addQuestion);
        newQu.setText(newQ);

        EditText newAns = (EditText) findViewById(R.id.addAns);
        newAns.setText(newA);

        EditText wrongA1 = (EditText) findViewById(R.id.wrongAns1);
        wrongA1.setText(newO1);

        EditText wrongA2 = (EditText) findViewById(R.id.wrongAns2);
        wrongA2.setText(newO2);


    }


    public void closeActivity(View v) {
        finish();
    }

    public void saveCard(View v) {
        //Creating a TextView to set Question

        EditText newQ = (EditText) findViewById(R.id.addQuestion);
        String newQuestion = newQ.getText().toString();

        //Store Ans
        EditText ans = (EditText) findViewById(R.id.addAns);
        String answerNew = ans.getText().toString();

        EditText wrongAns1 = (EditText) findViewById(R.id.wrongAns1);
        String ansWrong1 = wrongAns1.getText().toString();

        EditText wrongAns2 = (EditText) findViewById(R.id.wrongAns2);
        String ansWrong2 = wrongAns2.getText().toString();

        if (newQuestion.matches("") || answerNew.matches("") || ansWrong1.matches("") || ansWrong2.matches("")) {
            Toast.makeText(getApplicationContext(), "No fields can be empty", Toast.LENGTH_SHORT).show();
            return;
        } else {


            Intent data = new Intent();
            data.putExtra("keyQuestion", newQuestion);
            data.putExtra("keyAns", answerNew);
            data.putExtra("keyWrongAns1", ansWrong1);
            data.putExtra("keyWrongAns2", ansWrong2);
            setResult(RESULT_OK, data);
            finish();

        }
    }

    }




