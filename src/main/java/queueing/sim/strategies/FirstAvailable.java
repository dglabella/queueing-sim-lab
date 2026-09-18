package queueing.sim.strategies;

import java.util.List;
import queueing.sim.ServerView;

/** A server selection policy that selects the first available server. */
public final class FirstAvailable implements ServerSelectionStrategy {

  /**
   * Selects the first server from the given collection.
   *
   * @param servers the available servers
   * @return the first available server
   * @throws IllegalArgumentException if {@code servers} is empty
   */
  @Override
  public int select(List<ServerView> servers) {
    if (servers.isEmpty()) {
      throw new IllegalArgumentException("No servers available");
    }

    return servers.getFirst().id();
  }
}
