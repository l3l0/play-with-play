package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.task.*;
import static play.data.Form.*;

public class Task extends Controller {

    static Form<models.Task> taskForm = form(models.Task.class);

    public static Result list() {
        return ok(
            list.render(models.TaskRepository.all(), taskForm)
        );
    }

    public static Result create() {
        Form<models.Task> filledForm = taskForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest(
                list.render(models.TaskRepository.all(), filledForm)
            );
        } else {
            models.TaskRepository.create(filledForm.get());

            return redirect(routes.Task.list());
        }
    }

    public static Result delete(Long id) {
        models.TaskRepository.delete(id);

        return redirect(routes.Task.list());
    }

}
