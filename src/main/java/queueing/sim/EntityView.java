package queueing.sim;

/** Provides read-only information about an entity participating in a simulation. */
public interface EntityView {

  /**
   * Returns the unique identifier of this entity.
   *
   * @return the entity identifier
   */
  long id();
}
