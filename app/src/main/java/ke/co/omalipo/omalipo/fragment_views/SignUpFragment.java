package ke.co.omalipo.omalipo.fragment_views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.EdgeEffectCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ke.co.omalipo.omalipo.R;
import ke.co.omalipo.omalipo.classes.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    EditText nameView;
    EditText emailView;
    EditText passwordView;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        nameView = (EditText) view.findViewById(R.id.name);
        emailView = (EditText) view.findViewById(R.id.email);
        passwordView = (EditText) view.findViewById(R.id.password);
        Button signupButton = (Button) view.findViewById(R.id.signup_button);
        signupButton.setOnClickListener(new SignupClickListener());

        return view;
    }

    class SignupClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String email = emailView.getText().toString();
            if(TextUtils.isEmpty(email)){
                emailView.setError("Email is required");
                return;
            }
            String name = nameView.getText().toString();
            String password = passwordView.getText().toString();
            User user = new User(name, email, password);
            User.register(user).enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    User createdUser = response.body();
                    if(createdUser == null){
                        Toast.makeText(getActivity(), response.message(), Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getActivity(), "Hello " + createdUser.name, Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {

                }
            });
        }
    }

}
