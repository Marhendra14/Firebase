package com.example.firebase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragment3 extends Fragment
{
    View M;
    TextView em, pass;
    EditText isiem,isipass;
    Button login;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) //Ctrl + O untuk melihat method yang bisa diambil secara instan
    {
        M = inflater.inflate(R.layout.activity_frame3,container, false); //memanggil tampilan fragment, container untuk membungkus
        isiem = M.findViewById(R.id.isiemail);
        isipass = M.findViewById(R.id.isipassword);
        login = M.findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String inputemail = isiem.getText().toString();
                String inputpass = isipass.getText().toString();
                Bundle bundle = new Bundle();
                Fragment2 fragment2 = new Fragment2();
                bundle.putString("email", inputemail);
                fragment2.setArguments(bundle);
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame2, fragment2);
                ft.commit();
            }
        });
        return M;
    }


}