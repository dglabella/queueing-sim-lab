package queueing.sim.probes;

import queueing.sim.EntityView;

/**
 * A probe that counts the number of entities that arrive during a simulation.
 *
 * <p>The counter is incremented each time an entity arrival is reported to the probe through {@link
 * #entityArrived(double, EntityView)}.
 */
public final class ArrivalCounter implements Probe {

  private int count;

  /**
   * Records the arrival of an entity.
   *
   * <p>The simulation clock and entity are received to conform to the {@link Probe} contract, but
   * only the occurrence itself is relevant to this probe.
   *
   * @param clock the simulation time at which the entity arrived
   * @param entity the entity that arrived
   */
  @Override
  public void entityArrived(double clock, EntityView entity) {
    this.count++;
  }

  /**
   * Returns the number of entities that have arrived.
   *
   * @return the number of arrivals recorded by this probe
   */
  public int count() {
    return this.count;
  }
}
