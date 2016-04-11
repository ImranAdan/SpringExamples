package org.adani.spring.examples.data.templates.binding;

import org.adani.spring.examples.data.templates.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:DATA/config.xml"})
public class ProductDAOTest {

    @Autowired
    ProductDAO productDAO;

    @Test
    public void testGetProduct() throws Exception {
        Product p = productDAO.getProduct(9);
        assertThat(p, is(notNullValue()));
    }
}