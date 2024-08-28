package com.paula.productcontrol;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AdapterProduct adapterProduct;
    private List<Product> productList = new ArrayList<>();
    private RecyclerView rvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvProduct = findViewById(R.id.rvProdutos);

        loadList();

        configRecyclerView();
    }

    private void configRecyclerView() {
        rvProduct.setLayoutManager(new LinearLayoutManager(this));
        rvProduct.setHasFixedSize(true);
        adapterProduct = new AdapterProduct(productList);
        rvProduct.setAdapter(adapterProduct);
    }

    private void loadList() {

        Product product1 = new Product();
        product1.setNome("Monitor LG 34");
        product1.setEstoque(45);
        product1.setValor(1299.99);

        Product product2 = new Product();
        product2.setNome("Caixa de Som C3 Tech");
        product2.setEstoque(10);
        product2.setValor(399.99);

        Product product3 = new Product();
        product3.setNome("Microfone Blue yeti");
        product3.setEstoque(20);
        product3.setValor(199.99);

        Product product4 = new Product();
        product4.setNome("Mouse Logitech");
        product4.setEstoque(15);
        product4.setValor(199.99);

        Product product5 = new Product();
        product5.setNome("Gabinete NZXT H440");
        product5.setEstoque(60);
        product5.setValor(1199.99);

        Product product6 = new Product();
        product6.setNome("Memória Corsair 16GB");
        product6.setEstoque(44);
        product6.setValor(599.99);

        Product product7 = new Product();
        product7.setNome("Teclado Logitech");
        product7.setEstoque(10);
        product7.setValor(195.99);

        Product product8 = new Product();
        product8.setNome("HD SSD Kingston 480GB");
        product8.setEstoque(19);
        product8.setValor(230.57);

        Product product9 = new Product();
        product9.setNome("Processador AMD Ryzen 3.6GHz");
        product9.setEstoque(10);
        product9.setValor(640.71);

        Product product10 = new Product();
        product10.setNome("Memória HyperX Fury 8GB");
        product10.setEstoque(20);
        product10.setValor(318.99);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);





    }
}