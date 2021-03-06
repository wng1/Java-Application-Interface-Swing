//1.0
button.addActionListener(event -> System.out.println("You have submitted your form"));

//Utilising an internal iteration over external iteration   = allOrder.SFC
long count = allOrders.stream()
                      .filter(order -> order.isFrom("New York"))
                      .count();
//print out the iteration
long count = allOrders.stream()
                      .filter(order -> {System.out.println(order.getOrders());
                      return order.isFrom("New York");
                      })
                      .count();

//Finding details about the order
//in the Orders.java, the following getOrders() will be found like this:
public Stream<Order> getOrders() 
{ return order.stream(); }


Set<String> ord = order.getOrders()
                       .filter(customer -> customer.getFirstName()
                       .map(customer -> customer.getFirstName())
                       .collect(toSet());

//Refactoring code to meet new modern systems

public Set<String> findOrdersAboveTen(List<Order> orders)
{
  return orders.stream
  .flatMap(order -> order.getOrderQuantity())
  .filter(order -> order.getQuantity() > 5)
  .map(order -> order.getOrder())
  .collect(toSet());
  
}

//method reference ->   order:order.getName
