package queueing.sim;

import java.util.Objects;

/**
 * Represents the completion of service for an entity at a server.
 *
 * <p>When executed, the event releases the server. If an entity is waiting in any queue, the
 * departure queue selection strategy determines which queue supplies the next entity. That entity
 * immediately starts service on the server, and a new departure event is scheduled.
 */
final class Departure implements Event {

  /** The simulation time at which the service completion occurs. */
  private final double clock;

  /** The entity whose service is being completed. */
  private final Entity entity;

  /** The server whose service is being completed. */
  private final Server server;

  /**
   * Creates a departure event.
   *
   * @param clock the simulation time at which the departure occurs
   * @param entity the entity whose service is completed
   * @param server the server completing the entity's service
   * @throws NullPointerException if {@code entity} or {@code server} is null
   */
  Departure(double clock, Entity entity, Server server) {
    this.clock = clock;
    this.entity = Objects.requireNonNull(entity);
    this.server = Objects.requireNonNull(server);
  }

  @Override
  public double clock() {
    throw new UnsupportedOperationException("Unimplemented method 'clock'");
  }

  @Override
  public int priority() {
    throw new UnsupportedOperationException("Unimplemented method 'priority'");
  }

  /**
   * Executes the service completion.
   *
   * <p>The current entity's service is completed and the server is released. If there are entities
   * waiting in any queue, the departure queue selection strategy determines which queue supplies
   * the next entity. That entity is assigned to the same server, and a new departure event is
   * scheduled.
   *
   * @param context the context in which the event is executed
   */
  @Override
  public void execute(SimulationContext context) {

    throw new UnsupportedOperationException("Unimplemented method 'execute'");

    // InternalSimulationContext internalContext = (InternalSimulationContext) context;

    // if (!queuesWithWaitingEntities.isEmpty()) {

    // }
    // else {

    // }
  }

  @Override
  public String toString() {
    return "Departure[clock=" + this.clock + ", entity=" + this.entity + "]";
  }
}
