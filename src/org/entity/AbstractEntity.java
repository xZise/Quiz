package org.entity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class AbstractEntity {

    final static String idColumn = "id";

    @Column("id")
    private final long objId;

    AbstractEntity(ResultSet resultSet) throws SQLException {
        objId = resultSet.getLong(idColumn);
    }

    public long getObjId() {
        return objId;
    }

    public void commit() throws IllegalAccessException {
        String tableName;
        Table tableAnnotation = getClass().getAnnotation(Table.class);
        tableName = tableAnnotation.value();
        Map<String, Object> attributes = new HashMap<>();

        for (Field field : getClass().getFields()) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
                attributes.put(column.value(), field.get(this));
            }
        }


    }

    private void insert(String tableName, Map<String, Object> attributes) {

    }

    private void update(String tableName, Map<String, Object> attributes) {

    }
}

