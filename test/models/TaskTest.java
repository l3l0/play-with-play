package models;

import org.junit.Test;
import models.*;

import static org.fest.assertions.Assertions.assertThat;

public class TaskTest {

    @Test
    public void its_id_should_be_mutable() {
        Task task = new Task();

        task.setId(new Long(123));
        assertThat(task.getId().intValue()).isEqualTo(123);
    }

    @Test
    public void its_label_should_be_mutable() {
        Task task = new Task();

        task.setLabel(new String("Label"));
        assertThat(task.getLabel()).isEqualTo("Label");
    }
}
