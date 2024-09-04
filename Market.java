import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
  
    private Queue<Person> queue;
    private List<Order> orders;
    
    public Market() {
        this.queue = new LinkedList<>();
        this.orders = new ArrayList<>();
    }
    
    @Override
    public void addToQueue(Person person) {
        queue.add(person);
    }
    
    @Override
    public Person removeFromQueue() {
        return queue.remove();
    }
    
    @Override
    public void placeOrder(Order order) {
        orders.add(order);
    }
    
    @Override
    public Order fulfillOrder() {
        if (!orders.isEmpty()) {
            return orders.remove(0);
        } else {
            return null;
        }
    }
    
    public void update() {
        // реализация обновления состояния магазина
    }
}