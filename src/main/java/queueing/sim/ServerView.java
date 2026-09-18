package queueing.sim;

/** Provides a read-only view of a server in a queueing model. */
public interface ServerView {

  /**
   * Returns the identifier of the server.
   *
   * @return the server identifier
   */
  int id();

  /**
   * Returns whether this server is currently busy.
   *
   * @return {@code true} if the server is serving an entity, otherwise {@code false}
   */
  boolean isBusy();
}
