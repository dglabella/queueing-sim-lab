package queueing.sim.probes;

import queueing.sim.ServerView;

/**
 * A probe that records the maximum idle period for each server.
 *
 * <p>An idle period begins when a server becomes idle and ends when the server becomes busy again.
 *
 * <p>The probe stores the time at which each server became idle. When that server becomes busy
 * again, the elapsed idle time is calculated and compared with the current maximum for that server.
 *
 * <p>Any idle period that remains open when the simulation ends is closed using the simulation end
 * time.
 */
public final class MaxIdleTime implements Probe {

  /**
   * Records the moment at which a server becomes idle.
   *
   * @param clock the simulation time at which the server became idle
   * @param server the server that became idle
   */
  @Override
  public void serverBecameIdle(double clock, ServerView server) {
    throw new UnsupportedOperationException("Unimplemented method 'serverBecameIdle'");
  }

  /**
   * Records the idle time of a server when it becomes busy.
   *
   * <p>A server becomes busy when it transitions from an idle state to a busy state. Starting
   * service for an entity does not necessarily mean that the server became busy, since a server may
   * already be busy when it starts serving another entity from a queue.
   *
   * @param clock the simulation time at which the server became busy
   * @param server the server that became busy
   */
  @Override
  public void serverBecameBusy(double clock, ServerView server) {
    throw new UnsupportedOperationException("Unimplemented method 'serverBecameBusy'");
  }

  /**
   * Closes all idle periods that remain open when the simulation ends.
   *
   * @param clock the simulation time at which the simulation ended
   */
  @Override
  public void simulationFinished(double clock) {
    throw new UnsupportedOperationException("Unimplemented method 'simulationFinished'");
  }

  /**
   * Returns the maximum idle time recorded for the specified server.
   *
   * @param serverId the identifier of the server
   * @return the maximum idle time for the server
   * @throws IllegalArgumentException if no idle period has been recorded for the specified server
   */
  public double maxIdleTime(int serverId) {
    throw new UnsupportedOperationException("Unimplemented method 'maxIdleTime'");
  }
}
