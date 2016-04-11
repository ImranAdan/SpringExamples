package org.adani.spring.examples.data.templates.binding;

import org.adani.spring.examples.data.templates.model.Product;

public interface ProductDAO {

    Product getProduct(int productId);
}
