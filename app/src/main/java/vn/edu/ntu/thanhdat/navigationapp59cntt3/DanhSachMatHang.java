package vn.edu.ntu.thanhdat.navigationapp59cntt3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DanhSachMatHang extends Fragment {
    FloatingActionButton fab;
    RecyclerView rvListMH;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dsmathang, container, false);
        rvListMH = view.findViewById(R.id.rvListMH);
        fab= view.findViewById(R.id.fab);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(DanhSachMatHang.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = NavHostFragment.findNavController(DanhSachMatHang.this);
                controller.navigate(R.id.action_danhSachMatHang_to_productFragment2);
            }
        });
    }
}
