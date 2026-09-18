package queueing.sim;

import java.util.List;

/**
 * Describes the configuration of a queue in a queueing model.
 *
 * <p>A queue is identified by its {@code id} and is associated with one or more server
 * configurations. Each server configuration defines the identifier and service-time generator of
 * one server associated with the queue.
 *
 * <p>For example, a configuration with two server configurations represents a queue with two
 * servers:
 *
 * <pre>{@code
 * new QueueConfig(
 *     1,
 *     List.of(
 *         new ServerConfig(
 *             10,
 *             randomGenerator -> 3.0),
 *         new ServerConfig(
 *             20,
 *             randomGenerator -> 5.0)));
 * }</pre>
 *
 * <p>The actual {@link Queue} and {@link Server} objects are created internally by the simulation
 * framework from this configuration.
 *
 * @param id the unique identifier of the queue
 * @param servers the server configurations associated with the queue
 */
public record QueueConfig(int id, List<ServerConfig> servers) {

  /**
   * Creates a queue configuration.
   *
   * @throws NullPointerException if {@code servers} is {@code null} or contains {@code null}
   *     elements
   * @throws IllegalArgumentException if {@code servers} is empty
   */
  public QueueConfig {

    if (servers == null) {
      throw new NullPointerException("servers must not be null");
    }

    if (servers.isEmpty()) {
      throw new IllegalArgumentException("servers must not be empty");
    }

    servers = List.copyOf(servers);
  }
}
