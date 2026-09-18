package queueing.sim;

/** Provides a read-only view of a queue in a queueing model. */
public interface QueueView {

  /**
   * Returns the identifier of the queue.
   *
   * @return the queue identifier
   */
  int id();

  /**
   * Returns the number of entities currently waiting in the queue.
   *
   * @return the number of waiting entities
   */
  int size();
}
