package com.example.caothithudieu_tablayout_viewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class BestSellerFragment extends Fragment {

    private RecyclerView recyclerView_106;
    private BookAdapter adapter_106;
    private List<BookModel> bookList_106;

    public BestSellerFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_106 = inflater.inflate(R.layout.fragment_book_list, container, false);

        recyclerView_106 = view_106.findViewById(R.id.recyclerView_106);
        recyclerView_106.setLayoutManager(new LinearLayoutManager(getContext()));

        bookList_106 = new ArrayList<>();
        bookList_106.add(new BookModel("Nhà Giả Kim", "99,000đ", "book_alchemy"));
        bookList_106.add(new BookModel("Đắc Nhân Tâm", "125,000đ", "book_dhwfi"));

        adapter_106 = new BookAdapter(getContext(), bookList_106, R.layout.item_book_linear);
        recyclerView_106.setAdapter(adapter_106);

        return view_106;
    }
}