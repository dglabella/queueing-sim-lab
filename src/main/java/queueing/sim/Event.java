package queueing.sim;

/**
 * Represents an event that can occur during a simulation.
 *
 * <p>Events are ordered by their simulation clock and execution priority. When executed, an event
 * can interact with the simulation through a {@link SimulationContext}.
 */
public interface Event {

  /**
   * Returns the simulation time at which this event occurs.
   *
   * @return the event time
   */
  double clock();

  /**
   * Returns the priority of this event.
   *
   * <p>Events with lower priority values are executed before events with higher priority values
   * when they occur at the same simulation time.
   *
   * @return the event priority
   */
  int priority();

  /**
   * Executes this event.
   *
   * @param context the context in which the event is executed
   */
  void execute(SimulationContext context);
}
