package com.JonesRandom.LoginSQLite.ui;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.JonesRandom.LoginSQLite.R;
import com.JonesRandom.LoginSQLite.common.PreferenceManager;
import com.JonesRandom.LoginSQLite.model.ModelUser;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textDetailUser)
    TextView textDetailUser;

    @BindView(R.id.textDetailUserID)
    TextView textDetailUserID;

    @BindView(R.id.textDetailEmail)
    TextView textDetailEmail;

    @BindView(R.id.textDetailPassword)
    TextView textDetailPassword;

    @BindView(R.id.textUserHeader)
    TextView textUserHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ButterKnife.bind(this);

        bindView();

    }

    @SuppressLint("SetTextI18n")
    private void bindView() {
        ModelUser user = PreferenceManager.getUser();

        textDetailUser.setText(user.getUser());
        textDetailUserID.setText("ID "+user.getUserID());
        textDetailEmail.setText(user.getEmail());
        textDetailPassword.setText(user.getPassword());

        textUserHeader.setText("Hai " + user.getUser() + "!");

    }
}
