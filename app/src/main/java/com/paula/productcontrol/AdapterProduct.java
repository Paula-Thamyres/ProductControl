package com.paula.productcontrol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.MyViewHolder> {

    private List<Product> productoList;

    public AdapterProduct(List<Product> productoList) {
        this.productoList = productoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemVew = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produto, parent, false);
        return new MyViewHolder(itemVew);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product product = productoList.get(position);

        holder.textProduct.setText(product.getNome());
        holder.textStoke.setText("Estoque: " + product.getEstoque());
        holder.textValue.setText("R$ " + product.getValor());


    }

    @Override
    public int getItemCount() {
        return productoList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textProduct, textStoke, textValue;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textProduct = itemView.findViewById(R.id.text_product);
            textStoke = itemView.findViewById(R.id.text_stock);
            textValue = itemView.findViewById(R.id.text_value);
        }
    }

}
