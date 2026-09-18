package queueing.sim.probes;

import queueing.sim.EntityView;

/**
 * A probe that records the maximum time spent in the system by an entity.
 *
 * <p>The time in system is measured from the moment an entity arrives until the moment it departs.
 *
 * <p>The probe stores the arrival time of each entity until that entity departs. Once the entity
 * departs, its time in system is calculated and compared with the current maximum.
 */
public final class MaxSystemTime implements Probe {

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
   * <p>If the calculated time in system is greater than the current maximum, the maximum is
   * updated.
   *
   * @param clock the simulation time at which the entity departed
   * @param entity the entity that departed
   */
  @Override
  public void entityDeparted(double clock, EntityView entity) {
    throw new UnsupportedOperationException("Unimplemented method 'entityDeparted'");
  }

  /**
   * Returns the maximum time spent in the system by an entity that has departed.
   *
   * @return the maximum system time
   */
  public double maxSystemTime() {
    throw new UnsupportedOperationException("Unimplemented method 'maxSystemTime'");
  }
}
