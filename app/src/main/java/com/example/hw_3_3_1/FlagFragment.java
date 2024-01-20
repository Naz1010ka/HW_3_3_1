package com.example.hw_3_3_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;


public class FlagFragment extends Fragment {

    private RecyclerView rvFlag;
    private ArrayList<String> flagList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_flag, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFlag = requireActivity().findViewById(R.id.rv_flag);
        loadData();
        FlagAdapter adapter = new FlagAdapter(flagList);
        rvFlag.setAdapter(adapter);
    }
    private void loadData(){
        flagList.add("Kyrgyzstan \uD83C\uDDF0\uD83C\uDDEC");
        flagList.add("Kazakstan \uD83C\uDDF0\uD83C\uDDFF");
        flagList.add("Turkey  \uD83C\uDDF9\uD83C\uDDF7");
        flagList.add("United Arab Emirates  \uD83C\uDDE6\uD83C\uDDEA");
        flagList.add("Uzbekistan  \uD83C\uDDF0\uD83C\uDDEC");
        flagList.add("Ukraine  \uD83C\uDDFA\uD83C\uDDE6");
        flagList.add("Tunisia \uD83C\uDDF9\uD83C\uDDF3");
        flagList.add("United States  \uD83C\uDDFA\uD83C\uDDF8");
        flagList.add("New Zealand  \uD83C\uDDF3\uD83C\uDDFF");
        flagList.add("Norway  \uD83C\uDDF3\uD83C\uDDF4");
        flagList.add("Armenia  \uD83C\uDDE6\uD83C\uDDF7");
        flagList.add("Afghanistan \uD83C\uDDE6\uD83C\uDDEB");
        flagList.add("India \uD83C\uDDEE\uD83C\uDDF3");
        flagList.add("Finland  \uD83C\uDDEB\uD83C\uDDEE");
        flagList.add("Estonia  \uD83C\uDDEA\uD83C\uDDEA");
        flagList.add("Cuba  \uD83C\uDDE8\uD83C\uDDF7");

    }
}