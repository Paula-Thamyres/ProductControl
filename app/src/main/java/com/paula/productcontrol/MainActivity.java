package com.paula.productcontrol;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> productList = new ArrayList<>();

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

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);





    }
}