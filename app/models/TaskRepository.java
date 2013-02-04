package models;

import java.util.*;
import play.db.ebean.Model.*;

public class TaskRepository {

  public static Finder<Long,Task> finder = new Finder(
    Long.class, Task.class
  );

  public static List<Task> all() {
    return finder.all();
  }
  
  public static void create(Task task) {
    task.save();
  }
  
  public static void delete(Long id) {
    finder.ref(id).delete();
  }
}
