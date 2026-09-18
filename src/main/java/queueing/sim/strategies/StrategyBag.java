package queueing.sim.strategies;

/**
 * Groups the strategies that define how decisions are made during the execution of a queueing
 * simulation.
 *
 * <p>The strategies determine which server is selected when a service can start, which queue
 * receives an arriving entity when no server is available, and which queue supplies the next
 * waiting entity when a server becomes available.
 *
 * @param serverSelection strategy used to select a server among the available servers
 * @param arrivalQueueSelection strategy used to select a queue for an arriving entity when no
 *     server is available
 * @param departureQueueSelection strategy used to select a queue from which a waiting entity is
 *     taken when a server becomes available
 */
public record StrategyBag(
    ServerSelectionStrategy serverSelection,
    QueueSelectionStrategy arrivalQueueSelection,
    QueueSelectionStrategy departureQueueSelection) {}
