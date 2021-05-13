# TacoLocoOrdersService
Taco Loco, a quick service fleet of taco trucks, is building a new mobile app to enable their customers to place orders for their delicious tacos.
Task is to create a web service to calculate order totals
This service will take input as the items and quantities ordered, and respond with the order total.

Tools & Technologies Used:
Spring Boot 2.4.5
Java 8
Spring Data JPA
Spring MVC
H2 internal memory DataBase
Eclipse

API developed for placing order:

URL: http://localhost:8080/tacoloco/v1/placeOrder

Sample Request & Responses of ordering service:

Single item order Request(JSON):
{
"orderId" : 1,
  "items":  [
        {
            "itemname" : "veggie Taco",
            "quantity" : 2,
            "price" : 2.50
        }
    ]
}
Response:
{
    "Order Total": 5.0
}

Multiple items order Request(JSON):
{
"orderId" : 1,
  "items":  [
        {
            "itemname" : "veggie Taco",
            "quantity" : 2,
            "price" : 2.50
        },
        {
            "itemname" : "Chicken Taco",
            "quantity" : 2,
            "price" : 3.00
        }
    ]
}
Response:
{
    "Order Total": 8.8
}
