package org.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Answer extends AbstractEntity {

    final static String textColumn = "Text";
    final static String correctColumn = "Correct";
    final static String questionColumn = "QuestionID";

    private final String text;
    private final boolean correct;
    private final int questionId;

    Answer(ResultSet resultSet) throws SQLException {
        super(resultSet);

        text = resultSet.getString(textColumn);
        correct = resultSet.getBoolean(correctColumn);
        questionId = resultSet.getInt(questionColumn);
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return correct;
    }
}
