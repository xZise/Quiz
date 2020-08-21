package org.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

abstract class AbstractEntity {

    final static String idColumn = "id";

    private final long objId;

    AbstractEntity(ResultSet resultSet) throws SQLException {
        objId = resultSet.getLong(idColumn);
    }

    public long getObjId() {
        return objId;
    }
}
