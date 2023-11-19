package com.example.homework_33_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvName;
    private NamesAdapter adapter;
    private ArrayList<String> nameList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        adapter = new NamesAdapter(nameList);
        rvName.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("Макс");
        nameList.add("Дмитрий");
        nameList.add("Сергей");
        nameList.add("Тимофей");
        nameList.add("Василий");
        nameList.add("Володя");
        nameList.add("Руслан");
        nameList.add("Алексей");
        nameList.add("Саша");
        nameList.add("Данил");
        nameList.add("Серафим");
        nameList.add("Матвей");
        nameList.add("София");
        nameList.add("Иван");
        nameList.add("Анна");
        nameList.add("Мария");
        nameList.add("Маша");
        nameList.add("Алиса");
        nameList.add("Виктория");
        nameList.add("Полина");
        nameList.add("Морсель");
        nameList.add("Ева");
        nameList.add("Варвара");
        nameList.add("Васелиса");
        nameList.add("Зарина");
        nameList.add("Рин");

    }

    private void initView() {
        rvName = requireActivity().findViewById(R.id.rv_name);
    }
}