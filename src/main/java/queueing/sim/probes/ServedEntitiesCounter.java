package queueing.sim.probes;

import queueing.sim.EntityView;
import queueing.sim.ServerView;

/**
 * A probe that counts the number of entities that have started receiving service.
 *
 * <p>An entity is considered served when it starts service on a server, regardless of whether it
 * completes its service before the simulation ends.
 */
public final class ServedEntitiesCounter implements Probe {

  private int count;

  /**
   * Records that an entity has started receiving service.
   *
   * @param clock the simulation time at which service started
   * @param entity the entity that started service
   * @param server the server that started serving the entity
   */
  @Override
  public void serviceStarted(double clock, EntityView entity, ServerView server) {
    this.count++;
  }

  /**
   * Returns the number of entities that have started receiving service.
   *
   * @return the number of served entities
   */
  public int count() {
    return this.count;
  }
}
