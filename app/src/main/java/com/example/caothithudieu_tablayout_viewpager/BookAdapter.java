package com.example.caothithudieu_tablayout_viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context context_106;
    private List<BookModel> bookList_106;
    private int layoutResId_106;

    public BookAdapter(Context context, List<BookModel> bookList, int layoutResId) {
        this.context_106 = context;
        this.bookList_106 = bookList;
        this.layoutResId_106 = layoutResId;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view_106 = LayoutInflater.from(context_106).inflate(layoutResId_106, parent, false);
        return new BookViewHolder(view_106);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        BookModel currentBook_106 = bookList_106.get(position);

        holder.nameTextView_106.setText(currentBook_106.getName_106());
        holder.priceTextView_106.setText(currentBook_106.getPrice_106());

        String imageName = currentBook_106.getImageUrl_106();
        int imageId = context_106.getResources().getIdentifier(imageName, "drawable", context_106.getPackageName());
        if (imageId != 0) {
            holder.bookImageView_106.setImageResource(imageId);
        } else {
            holder.bookImageView_106.setImageResource(R.drawable.placeholder_book);
        }

        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context_106, R.color.brown_light_106));
        } else {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context_106, R.color.white_106));
        }
    }

    @Override
    public int getItemCount() {
        return bookList_106.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        public ImageView bookImageView_106;
        public TextView nameTextView_106;
        public TextView priceTextView_106;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImageView_106 = itemView.findViewById(R.id.bookImage_106);
            nameTextView_106 = itemView.findViewById(R.id.bookName_106);
            priceTextView_106 = itemView.findViewById(R.id.bookPrice_106);
        }
    }
}