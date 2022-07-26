-- How to test ZuulJT applications --

These are the available endpoints for testing:

http://localhost:8080/diagnosis-service/
http://localhost:8080/doctor-api/getDoctor
http://localhost:8080/doctor-api/welcome/John

For an explanation behind the applications:

1) Take the "spring.application.name" value in the application.properties file of the other apps.

2) Within the application.properties of the Zuul Proxy application, make certain configurations.

3) "zuul.routes.<service-name>.url = http://localhost:XXXX/"
    Where <service-name> is the value from Step 1.
    This step maps the endpoints of the other applications to the Zuul Proxy.

    EX: zuul.routes.doctor-service.url = http://localhost:8081/

4) "zuul.routes.<service-name>.path=/<custom-service-name>/**"
    Where <service-name> is the value from Step 1.
    Where <custom-service-name> is an alternate URI path that you can provide.
    This step allows you to customize the URL address that routes to a particular service.

    EX: zuul.routes.doctor-service.path=/doctor-api/**