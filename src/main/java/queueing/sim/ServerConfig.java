package queueing.sim;

import java.util.Objects;

/**
 * Describes the configuration of a server in a queueing model.
 *
 * <p>A server is identified by its {@code id} and is associated with a service time generator used
 * to generate the duration of each service performed by the server.
 *
 * <p>For example:
 *
 * <pre>{@code
 * new ServerConfig(
 *     10,
 *     randomGenerator -> 5.0);
 * }</pre>
 *
 * @param id the unique identifier of the server
 * @param serviceTimeGenerator the generator used to generate service times
 */
public record ServerConfig(int id, TimeGenerator serviceTimeGenerator) {

  /**
   * Creates a server configuration.
   *
   * @throws NullPointerException if {@code serviceTimeGenerator} is {@code null}
   */
  public ServerConfig {
    Objects.requireNonNull(serviceTimeGenerator);
  }
}
