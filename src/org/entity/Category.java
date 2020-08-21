package org.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

@Table("Category")
public class Category extends AbstractEntity {

    final static String nameColumn = "Name";

    @Column("Name")
    private final String name;

    Category(ResultSet resultSet) throws SQLException {
        super(resultSet);

        name = resultSet.getString(nameColumn);
    }

    public String getName() {
        return name;
    }
}
