package pro.taskana.spi.history.api;

import pro.taskana.TaskanaEngineConfiguration;
import pro.taskana.spi.history.api.events.TaskanaHistoryEvent;

/** Interface for TASKANA History Service Provider. */
public interface TaskanaHistory {

  /**
   * Initialize TaskanaHistory service.
   *
   * @param taskanaEngineConfiguration {@link TaskanaEngineConfiguration} The Taskana engine
   *     configuration for needed initialization.
   */
  void initialize(TaskanaEngineConfiguration taskanaEngineConfiguration);

  /**
   * Create a new history event.
   *
   * @param event {@link TaskanaHistoryEvent} The event to be created.
   */
  void create(TaskanaHistoryEvent event);
}
