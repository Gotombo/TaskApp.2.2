package com.example.android22.ui.Profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android22.R;
import com.example.android22.databinding.FragmentDashboardBinding;
import com.example.android22.databinding.FragmentHomeBinding;
import com.example.android22.databinding.FragmentProfileBinding;
import com.example.android22.ui.home.HomeViewModel;
import com.example.android22.ui.home.TaskAdapter;


public class ProfileFragment extends Fragment {
    private ProfileViewModel profileViewModel;
    private FragmentProfileBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        profileViewModel =
                new ViewModelProvider(this).get(ProfileViewModel.class);

        binding = FragmentProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}