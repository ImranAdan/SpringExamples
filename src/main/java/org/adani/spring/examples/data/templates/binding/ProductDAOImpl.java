package org.adani.spring.examples.data.templates.binding;

import org.adani.spring.examples.data.templates.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    @Autowired
    DataSource dataSource;

    public Product getProduct(int productId) {
        String sql = "SELECT * FROM PRODUCTS WHERE id = ?";
        return new JdbcTemplate(dataSource).queryForObject(sql, new Object[]{productId}, new RowMapper<Product>() {
            public Product mapRow(ResultSet resultSet, int i) throws SQLException {
                Product p = new Product(resultSet.getInt("id"), resultSet.getString("name"));
                p.setPrice(resultSet.getBigDecimal("price"));
                p.setQuantity(resultSet.getInt("quantity"));
                return p;
            }
        });
    }

    public List<Product> getProducts() {
        String sql = "SELECT * FROM PRODUCTS";
        return new JdbcTemplate(dataSource).queryForList(sql, null, Product.class);
    }
}
