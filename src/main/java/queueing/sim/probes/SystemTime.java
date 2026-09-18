package queueing.sim.probes;

import queueing.sim.EntityView;

/**
 * A probe that records the time spent in the system by entities.
 *
 * <p>The time in system is measured from the moment an entity arrives until the moment it departs.
 *
 * <p>The probe stores the arrival time of each entity until that entity departs. Once the entity
 * departs, its time in system is calculated and recorded, and its arrival time is removed from the
 * internal map.
 */
public final class SystemTime implements Probe {

  /**
   * Records the arrival time of an entity.
   *
   * @param clock the simulation time at which the entity arrived
   * @param entity the entity that arrived
   */
  @Override
  public void entityArrived(double clock, EntityView entity) {
    throw new UnsupportedOperationException("Unimplemented method 'entityArrived'");
  }

  /**
   * Records the time spent in the system by an entity that departs.
   *
   * @param clock the simulation time at which the entity departed
   * @param entity the entity that departed
   */
  @Override
  public void entityDeparted(double clock, EntityView entity) {
    throw new UnsupportedOperationException("Unimplemented method 'entityDeparted'");
  }

  /**
   * Returns the total time spent in the system by all entities that have departed.
   *
   * @return the total system time
   */
  public double totalSystemTime() {
    throw new UnsupportedOperationException("Unimplemented method 'totalSystemTime'");
  }
}
