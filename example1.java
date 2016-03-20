//1.0
button.addActionListener(event -> System.out.println("You have submitted your form"));

//Utilising an internal iteration over external iteration   = allOrder.SFC
long count = allOrders.stream()
                      .filter(order -> order.isFrom("New York"))
                      .count();
