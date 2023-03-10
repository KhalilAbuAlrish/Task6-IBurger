package Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iburger.MainActivity;
import com.example.iburger.R;
import com.google.android.material.textfield.TextInputLayout;

public class LogInActivity extends AppCompatActivity {

    TextInputLayout tEmail,tPassword;
    Button btnLogIn;
    TextView textSignUp;

    String sEmail,sPassword;
    String rEmail,rPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        tEmail=findViewById(R.id.email_log_in);
        tPassword=findViewById(R.id.password_log_in);
        btnLogIn=findViewById(R.id.btn_log_in);
        textSignUp=findViewById(R.id.sign_up);




        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!emailValidate() || !passwordValidation()){
                    return;
                }else{
                    Bundle bundle=getIntent().getExtras();
                    rEmail=bundle.getString("email");
                    rPassword=bundle.getString("password");
                    welcomeApp(rEmail,rPassword);
                }
            }
        });


        textSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LogInActivity.this,SignUpActivity.class);
                startActivity(intent);
                finish();

            }
        });






    }



    //validation email
    public boolean emailValidate(){

        sEmail=tEmail.getEditText().getText().toString().trim();

        if(sEmail.isEmpty()){
            tEmail.setError("this field should not be empty");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(sEmail).matches()){
            tEmail.setError("sorry your email address is not valid");
            return false;
        }else{
            tEmail.setErrorEnabled(false);
            return true;
        }




    }

    //validation password
    public boolean passwordValidation(){
        sPassword=tPassword.getEditText().getText().toString().trim();

        if(sPassword.isEmpty()) {
            tPassword.setError("this field should not be empty");
            return false;
        }else{
            tPassword.setErrorEnabled(false);
            return true;
        }




    }



    public void welcomeApp(String email,String password){

        if(sEmail.equals(email) && sPassword.equals(password)){
            Intent intent=new Intent(LogInActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "email or password is wrong", Toast.LENGTH_SHORT).show();
        }


    }




}