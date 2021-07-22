package com.majid36.nimazperabot.NimazPerabot;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.user.NimazPerabot.R;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ACCOUNT = "extra_account";

    ImageView ivDetail;
    TextView tvUserNameDetail;
    TextView tvIdDetail;
    TextView tvLocationDetail;

    String receiveDataUsername;
    String receiveDataId;
    String receiveDataLocation;
    Integer receiveDataImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivDetail = findViewById(R.id.ivPPDetail);
        tvUserNameDetail = findViewById(R.id.tvUsernameDetail);
        tvIdDetail = findViewById(R.id.tvIdDetail);
        tvLocationDetail = findViewById(R.id.tvLocationDetail);
        //mengambil data yang dikirim dari myadapterlist melalui class account
        getData();
        //menset data
        setData();
    }

    private void getData(){
        Account account = getIntent().getParcelableExtra(EXTRA_ACCOUNT);
        receiveDataUsername = account.getUsername();
        receiveDataId = account.getId();
        receiveDataImage = account.getImg();
        receiveDataLocation = account.getLocation();
    }

    private void setData(){
        ivDetail.setImageResource(receiveDataImage);
        tvUserNameDetail.setText(receiveDataUsername);
        tvIdDetail.setText(receiveDataId);
        tvLocationDetail.setText(receiveDataLocation);
    }
}