package queueing.sim;

import java.util.random.RandomGenerator;

/** Defines a method for generating time values for the simulation. */
@FunctionalInterface
public interface TimeGenerator {

  /**
   * Generates a time value using the given random generator.
   *
   * @param randomGenerator the source of randomness
   * @return the generated time value
   */
  double generate(RandomGenerator randomGenerator);
}
