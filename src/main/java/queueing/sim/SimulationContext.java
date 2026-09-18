package queueing.sim;

import java.util.random.RandomGenerator;

/** Provides the services and simulation state available to an event while it is being executed. */
public interface SimulationContext {

  /**
   * Returns the random generator used by the simulation.
   *
   * @return the simulation's random generator
   */
  RandomGenerator randomGenerator();

  /**
   * Returns the queueing model being simulated.
   *
   * @return the simulation's queueing model
   */
  QueueingModel model();

  /**
   * Schedules an event for execution during the simulation.
   *
   * @param event the event to schedule
   * @throws NullPointerException if {@code event} is {@code null}
   */
  void schedule(Event event);
}
