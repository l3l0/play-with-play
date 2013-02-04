package controllers;

import org.junit.Test;
import play.mvc.Call;
import play.mvc.Result;

import static play.mvc.Http.Status.*;
import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.*;
import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void its_index_action_should_redirect_to_task_list() {
        Result result = callAction(controllers.routes.ref.Application.index());

        assertThat(status(result)).isEqualTo(303);
        assertThat(header("Location", result)).isEqualTo("/tasks");
    }

}
