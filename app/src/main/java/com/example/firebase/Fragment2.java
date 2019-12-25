package com.example.firebase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment
{
    View M;
    TextView viewusername;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) //Ctrl + O untuk melihat method yang bisa diambil secara instan
    {
        M = inflater.inflate(R.layout.activity_frame2,container, false); //memanggil tampilan fragment, container untuk membungkus
        viewusername = M.findViewById(R.id.text_username);
        try
        {
            String username = getArguments().getString("email");
            viewusername.setText(username);
        }
        catch(Exception E)
        {

        }
        return M;
    }
}