package queueing.sim.probes;

import queueing.sim.EntityView;

/**
 * A probe that counts the number of entities that have departed from the system.
 *
 * <p>An entity is considered departed when it completes its service and leaves the system.
 */
public final class DepartureCounter implements Probe {

  private int count;

  /**
   * Records that an entity has departed from the system.
   *
   * @param clock the simulation time at which the entity departed
   * @param entity the entity that departed
   */
  @Override
  public void entityDeparted(double clock, EntityView entity) {
    this.count++;
  }

  /**
   * Returns the number of entities that have departed from the system.
   *
   * @return the number of departed entities
   */
  public int count() {
    return this.count;
  }
}
