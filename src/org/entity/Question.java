package org.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Question extends AbstractEntity {

    final static String textColumn = "textColumn";
    final static String categoryIdColumn = "categoryid";

    private String text;
    private long category;

    Question(ResultSet resultSet) throws SQLException {
        super(resultSet);
        text = resultSet.getString(textColumn);
        category = resultSet.getLong(categoryIdColumn);
    }
}
