# SpringBootLearnings
### Web-services
##### Software system design to support interoperable application-to-application interaction over a network.
###### Designed for application-to-application interaction.
###### Should be interoperable -Not platform independent.
###### Should allow  communication over a network.

##### We communicate to web services through request and response.
##### The necessary condition for restful web services to be platform-independent is request and response should be platform-independent.
##### There are two popular formats for data exchanges (request and response).
<b>1</b> XML format(Extensible markup language)<br>
<b>2</b> JSON format <br>
##### How does application A know the format of  request and response?
###### We do that by providing the service definition.
##### A service definition must have
<b>1</b> Request/response format<br>
<b>2</b> Request structure<br>
<b>3</b> Response Structure<br>
<b>4</b> EndPoint<br>
#### Basic terminology
<b> Request and Response </b> Request is an input to a web service and Response is the output from a web service.<br>
<b> Message Exchange Format </b> is the format of the Request and the Response(eg. XML, JSON)<br>
<b> Service provider</b> is the one that hosts the web service.<br>
<b> Service Consumer </b> The Service Consumer is the one who is consuming the Web Service.<br>
<b>Transport</b> defines how a service is called.<br>
HTTP is all over the web.<br>
<b>Two popular formats are HTTP and MQ.</b><br>
MQ is to use communication over a Queue. The Service Requester will place a message in the Queue. The Service Provider would be listening on the Queue, and as soon as there is a request on the Queue, the web service would take the request, process it, create the response, and put it back in the Queue. The Service Requester will get the response from the Queue.

 SOAP defines a specific XML request and response structure.
 SOAP envelope contains a SOAP header and a SOAP body.
The header contains meta information like authentication, authorization, signatures, and anything like that.
The body is where you put the real content of your request or your response.

SOAP defines a format for your request and the response.
SOAP does not pose any restrictions on your transport.
You can either use HTTP or MQ.
So you can communicate over the web, over the internet, or you can use queues to communicate as well.
In SOAP, the service definition is typically done using something called web service definition language, WSDL.Web service definition language.

REST -->REpresentational State Transfer
REST is completely build on the top of http.






