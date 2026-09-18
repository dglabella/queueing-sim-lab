package queueing.sim;

/** Defines a generator for generating entities. */
@FunctionalInterface
interface EntityGenerator {

  /**
   * Generates a new entity.
   *
   * @return the generated entity
   */
  Entity generate();
}
