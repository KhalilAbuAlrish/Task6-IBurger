package Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import com.example.iburger.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {

    TextInputLayout tFullName,tPhoneNumber,tEmailAddress,tLocation,tPassword,tConfirmPassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        tFullName=findViewById(R.id.full_name_sign_up);
        tPhoneNumber=findViewById(R.id.phone_number_sign_in);
        tEmailAddress=findViewById(R.id.email_address_sign_up);
        tLocation=findViewById(R.id.location_sign_up);
        tPassword=findViewById(R.id.password_sign_up);
        tConfirmPassword=findViewById(R.id.confirm_password_sign_up);
        btnSignUp=findViewById(R.id.btn_sign_up);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!nameValidation() || !phoneNumberValidation() || !emailAddressValidation()
                || !locationValidation() || !passwordValidation() || !confirmPasswordValidation()){

                    return;

                }else{
                    Intent intent=new Intent(SignUpActivity.this,LogInActivity.class);
                    intent.putExtra("email",tEmailAddress.getEditText().getText().toString().trim());
                    intent.putExtra("password",tPassword.getEditText().getText().toString().trim());
                    startActivity(intent);
                    finish();
                }

            }
        });


    }



    //validate full name
    public boolean nameValidation(){

        String sFullName=tFullName.getEditText().getText().toString().trim();

        if(sFullName.isEmpty()){
            tFullName.setError("this field should not be empty");
            return false;
        }else{
            tFullName.setErrorEnabled(false);
            return true;
        }


    }


    //validate phone number
    public boolean phoneNumberValidation(){

        String sPhoneNumber=tPhoneNumber.getEditText().getText().toString().trim();
        String validIDS=null;

        if(sPhoneNumber.length()<2){

            tPhoneNumber.setError("the length of number should be 9 char");
            return false;

        }else{
            validIDS=sPhoneNumber.substring(0,2);
        }



        if(sPhoneNumber.isEmpty()){
            tPhoneNumber.setError("this field should not be empty");
            return false;
        }else if(sPhoneNumber.length() != 9){
            tPhoneNumber.setError("the length of number should be 9 char");
            return false;
        }else if(!validIDS.equals("78") && !validIDS.equals("77") && !validIDS.equals("79")){
            tPhoneNumber.setError("sorry your number is not valid");
            return false;
        }else{
            tPhoneNumber.setErrorEnabled(false);
            return true;
        }

    }


    // validate email address
    public boolean emailAddressValidation(){

        String sEmailAddress=tEmailAddress.getEditText().getText().toString().toString();

        if(sEmailAddress.isEmpty()){
            tEmailAddress.setError("this field should not be empty");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(sEmailAddress).matches()){
            tEmailAddress.setError("Sorry your email address is not valid");
            return false;
        }else{
            tEmailAddress.setErrorEnabled(false);
            return true;
        }



    }

    // validate location
    public boolean locationValidation(){

        String sLocation=tLocation.getEditText().getText().toString().trim();

        if(sLocation.isEmpty()){
            tLocation.setError("this field should not be empty");
            return false;
        }else{
            tLocation.setErrorEnabled(false);
            return true;
        }


    }


    // validate password
    public boolean passwordValidation(){

        String sPassword=tPassword.getEditText().getText().toString().trim();

        if(sPassword.isEmpty()){
            tPassword.setError("this filed should not be empty");
            return false;
        }else if(sPassword.length()<10){
            tPassword.setError("password should be greater than 10 char");
            return false;
        }else{
            tPassword.setErrorEnabled(false);
            return true;
        }

    }


    // validate confirmPassword

    public boolean confirmPasswordValidation(){

        String sPassword=tPassword.getEditText().getText().toString().trim();
        String sConfirmPassword=tConfirmPassword.getEditText().getText().toString().trim();

        if(sConfirmPassword.isEmpty()){
            tConfirmPassword.setError("this field should not be empty");
            return false;
        }else if(!sConfirmPassword.equals(sPassword)){
            tConfirmPassword.setError("your password enter is not matches");
            return false;
        }else{
            tConfirmPassword.setErrorEnabled(false);
            return true;
        }

    }


}