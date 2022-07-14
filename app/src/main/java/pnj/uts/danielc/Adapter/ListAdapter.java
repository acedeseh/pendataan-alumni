package pnj.uts.danielc.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pnj.uts.danielc.Data.Alumni;
import pnj.uts.danielc.DetailActivity;
import pnj.uts.danielc.databinding.ListItemBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyListViewHolder> {

    private ArrayList<Alumni> alumni;
    private Context context;
    public ListAdapter(ArrayList<Alumni>alumni){
        this.alumni = alumni;
    }

    @NonNull
    @Override
    public MyListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        return new ListAdapter.MyListViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyListViewHolder holder, int position) {
        holder.mtvNim.setText("NIM : "+String.valueOf(alumni.get(position).getNim()));
        holder.mtvNama.setText("NAMA ALUMNI : "+alumni.get(position).getNama_alumni());

        holder.mcontainerListItem.setOnClickListener(v->{
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("nim",Long.parseLong(String.valueOf(alumni.get(position).getNim())));
            context.startActivity(intent);
            ((Activity)context).finish();
        });
    }

    @Override
    public int getItemCount() {
        return alumni.size();
    }

    public class MyListViewHolder extends RecyclerView.ViewHolder {
        public final TextView mtvNim;
        public final TextView mtvNama;
        public final LinearLayout mcontainerListItem;
        public MyListViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            mtvNama = binding.tvNamaAlumni;
            mtvNim = binding.tvNim;
            mcontainerListItem = binding.ContainerListItem;
        }
    }
}
