package queueing.sim;

import java.util.ArrayDeque;
import java.util.List;

/**
 * Represents a FIFO waiting queue associated with one or more servers.
 *
 * <p>The association between the queue and its servers is established when the queue is created and
 * cannot be changed afterwards.
 */
final class Queue implements QueueView {

  /** The identifier of this queue. */
  private final int id;

  /** The entities currently waiting in the queue. */
  private final ArrayDeque<Entity> entities = new ArrayDeque<>();

  /** The servers associated with this queue. */
  private final List<Server> servers;

  /**
   * Creates a queue associated with the given servers.
   *
   * @param id the identifier of this queue
   * @param servers the servers associated with this queue
   * @throws NullPointerException if {@code servers} is {@code null} or contains {@code null}
   *     elements
   * @throws IllegalArgumentException if {@code servers} is empty
   */
  Queue(int id, List<Server> servers) {
    throw new UnsupportedOperationException("Unimplemented constructor 'Queue'");
  }

  /**
   * Returns whether this queue contains no waiting entities.
   *
   * @return {@code true} if the queue is empty, otherwise {@code false}
   */
  boolean isEmpty() {
    throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
  }

  /**
   * Adds an entity to the end of the queue.
   *
   * @param entity the entity to add
   * @throws NullPointerException if {@code entity} is {@code null}
   */
  void add(Entity entity) {
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  /**
   * Returns the first waiting entity without removing it.
   *
   * @return the first waiting entity, or {@code null} if the queue is empty
   */
  Entity peek() {
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
  }

  /**
   * Removes and returns the first waiting entity.
   *
   * @return the first waiting entity, or {@code null} if the queue is empty
   */
  Entity remove() {
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  /**
   * Returns the servers associated with this queue.
   *
   * @return an unmodifiable list of associated servers
   */
  List<Server> servers() {
    throw new UnsupportedOperationException("Unimplemented method 'servers'");
  }

  /**
   * Returns the servers associated with this queue that are currently available.
   *
   * @return an unmodifiable list of available servers
   */
  List<Server> availableServers() {
    throw new UnsupportedOperationException("Unimplemented method 'availableServers'");
  }

  @Override
  public int id() {
    throw new UnsupportedOperationException("Unimplemented method 'id'");
  }

  @Override
  public int size() {
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public String toString() {
    return "Queue[id="
        + this.id
        + ", entities="
        + this.entities
        + ", servers="
        + this.servers
        + "]";
  }
}
