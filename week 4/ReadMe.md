## Post Man 

POST 

localhost:8080/passenger/savePassenger

{
    "passengerFirstName":"Clay",
    "passengerLastName":"Patrick"
}
------------------------------------------------------------------------------
POST

localhost:8080/ticket/buyTicket/{passengerId}/{planeId}?isBussiness={boolean}

------------------------------------------------------------------------------
POST

localhost:8080/ticket/refundTicket/{ticketId}

------------------------------------------------------------------------------

POST 

localhost:8080/plane/getPlaneById?planeId=10

-------------------------------------------------------------------------------

GET

localhost:8080/passenger/findAllPassengers
