https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/

#

# Web Services

Web Services, or web services, are a set of technologies and standards that enable communication and interaction between different software systems over the Internet. They are based on standard web protocols such as HTTP (Hypertext Transfer Protocol), XML (Extensible Markup Language), SOAP (Simple Object Access Protocol), and REST (Representational State Transfer).

Web Services allow distributed applications and systems to communicate interoperably, regardless of the platform, programming language, or operating system used. They follow a client-server architecture, where a service is provided by a provider and can be consumed by other applications (clients) that want to use its functionalities.

There are two main types of Web Services:

1. SOAP-based Web Services: They use the SOAP protocol to exchange information in XML format. SOAP defines a message structure and a set of rules for communication between the client and the server.

2. REST-based Web Services: They utilize the principles of the REST architecture for communication. RESTful services are built around resources (data objects) that are identified by URLs and can be accessed using HTTP methods such as GET, POST, PUT, and DELETE.

Web Services are widely used in system integrations, allowing different applications to communicate and share information efficiently and in a standardized manner. They are often employed in enterprise applications such as e-commerce, online banking services, inventory management systems, among others.

#

# REST

REST (Representational State Transfer) is a software architectural style for distributed systems and web services. It was initially proposed by Roy Fielding in his doctoral thesis in 2000 and has become widely adopted as a standard approach for designing APIs (Application Programming Interfaces) on the web.

REST is based on a set of principles and constraints that define how components in a distributed system should interact. These principles include:

1. Client-Server: Clear separation of concerns between the client and the server, where the client is responsible for the user interface and the server is responsible for storing and manipulating data.

2. Statelessness: Each client request to the server must contain all the information necessary to understand and process the request. The server should not store information about the client's state between requests.

3. Cacheability: Server responses can be cached by the client or intermediaries such as proxies to improve performance and reduce the load on the server.

4. Uniform Interface: The system should have a consistent and standardized interface for interactions between components. This is achieved through uniquely identifiable resources, resource manipulation through representations, and hyperlinks for navigation between related resources.

5. Layered System: The system can be composed of multiple layers, where each layer provides a specific set of functionalities. Each layer only knows about the immediate layer below it with which it interacts, promoting modularity and scalability of the system.

These REST principles allow systems to be highly scalable, reliable, and easily modifiable. REST is often used in building web APIs, where resources are exposed as URLs and operations are performed using HTTP methods such as GET, POST, PUT, and DELETE.

#

# Types of parameters

There are different types of parameters that can be used in HTTP requests. Here are some of the most common types:

1. Query Parameters: These parameters are sent in the URL of the request after the "?" character and are usually used for filtering, sorting, or paginating results. For example, in the URL "https://api.example.com/products?category=electronics&order=price", the query parameters are "category" and "order".

2. Path Parameters: These are variable parts of the URL itself that are used to identify specific resources. They are specified within curly braces {} in the URL path definition. For example, in the URL "https://api.example.com/products/{id}", the path parameter is "id" and can be replaced with a specific value in the request.

3. Header Parameters: These parameters are sent in the HTTP request header and provide additional information about the request or the client making the request. Some common examples of header parameters are "Content-Type" to specify the media type of the data being sent or "Authorization" for authentication.

4. Body Parameters: These parameters are used to send data in the request body, often in formats such as JSON or XML. They are commonly used in POST, PUT, or PATCH requests to send information to be processed by the server.

These are just a few examples of the types of parameters commonly used in HTTP requests. The choice of the appropriate parameter type depends on the purpose of the request and the API or service being used.

#

# Status Codes

There are several status codes that are used in HTTP responses to indicate the outcome of a request. Here are some of the most common status codes:

1. 2xx (Success): Indicates that the request was successful.

   - 200 OK: The request was successful, and the result is being returned.
   - 201 Created: The request was successful and resulted in the creation of a new resource.
   - 204 No Content: The request was successful, but there is no content to return.

2. 3xx (Redirection): Indicates that the request needs to be redirected to another location.

   - 301 Moved Permanently: The resource has been permanently moved to a new location.
   - 302 Found: The resource has been temporarily moved to a new location.
   - 304 Not Modified: The resource has not been modified since the last request.

3. 4xx (Client Error): Indicates that there was an error on the client side in the request.

   - 400 Bad Request: The request has invalid syntax or cannot be understood by the server.
   - 401 Unauthorized: The request requires authentication, or the authentication credentials are invalid.
   - 404 Not Found: The requested resource was not found on the server.

4. 5xx (Server Error): Indicates that there was an error on the server side while processing the request.
   - 500 Internal Server Error: The server encountered an unexpected condition that prevented it from processing the request.
   - 503 Service Unavailable: The server is currently unavailable to handle the request.

These are just some examples of the most common status codes. There are other status codes that can be used for different situations, each with its specific meaning. When receiving an HTTP response, the status code can provide important information about the outcome of the request and assist in troubleshooting issues.

#

# HTTP verbs

HTTP verbs, also known as HTTP methods, are used to indicate the action that should be performed on a resource. Here are some of the most commonly used HTTP verbs:

1. GET: Retrieves a specific resource or a list of resources. It is used to retrieve information from the server.

2. POST: Sends data to the server to create a new resource. It is used to submit data and perform actions that result in a change of state on the server.

3. PUT: Sends data to the server to completely update an existing resource or create a new resource if it doesn't exist. It completely replaces the content of the resource.

4. PATCH: Sends data to the server to partially update an existing resource. It is used when only part of the resource's data needs to be changed.

5. DELETE: Removes a specific resource from the server.

6. OPTIONS: Retrieves the available communication options for a resource or server. It is used to check which methods and headers are supported by the server.

7. HEAD: Retrieves only the response headers of a resource, without returning the response body. It is used to gather information about a resource without retrieving its full content.

These are some of the primary HTTP verbs used to interact with resources in an API or web service. Each verb has a specific purpose and defines an action to be performed on the server regarding the requested resource.

#

# Richardson Maturity Model

The REST architectural style defines maturity levels known as the Richardson Maturity Model. These levels describe different approaches to designing and implementing RESTful APIs. Here are the four levels of the model:

Level 0: POX (Plain Old XML) - At this level, APIs are designed in a similar way to traditional web services, using only XML as the data exchange format. Interactions are typically based on a single endpoint.

Level 1: Individual Resources - At this level, APIs are designed around individual resources identified by unique URLs. HTTP verbs (GET, POST, PUT, DELETE) are used to manipulate these resources.

Level 2: HTTP Verbs - At this level, in addition to using identifiable resources, APIs use the correct HTTP verbs to express specific actions regarding the resources. This includes the proper use of GET, POST, PUT, and DELETE verbs.

Level 3: HATEOAS (Hypermedia as the Engine of Application State) - At this more advanced level, APIs provide responses that contain hypermedia links, allowing clients to dynamically navigate the API. Clients can discover and interact with related resources through these links.

The ultimate goal is to reach Level 3, where the API is highly self-descriptive and clients can dynamically navigate and interact with it using the hypermedia links provided in the responses.

It is important to note that many RESTful APIs may not achieve full Level 3, as the full implementation of HATEOAS can add complexity and may not be necessary for all use cases. The choice of maturity level depends on the specific requirements and needs of the project.

#

# Swagger

Swagger is an open-source tool widely used for designing, building, documenting, and testing RESTful APIs. It provides a set of specifications and tools to describe the structure, operations, and data formats of an API in a standardized and machine-readable manner.

Swagger uses the API description language called OpenAPI Specification (formerly known as Swagger Specification) to define the API structure. This specification is written in JSON or YAML format and describes the API's endpoints, expected parameters, response formats, allowed operations, and other relevant details.

By using Swagger, developers can benefit from the following features:

1. Automatic documentation: Swagger automatically generates interactive documentation for the API based on the provided specification. This includes information about endpoints, parameters, data types, and usage examples, making it easier for other developers to understand and use the API.

2. Interactive interface: The documentation generated by Swagger includes an interactive interface called Swagger UI. It allows developers to explore and test the API directly through a user-friendly interface, facilitating understanding of the available resources.

3. Client code generation: Based on the API specification, Swagger can automatically generate client code in various programming languages, helping accelerate the integration and development of clients for the API.

4. Validation and testing: Swagger can be used for validating and testing the API, allowing verification of whether the API complies with its specification and performing functional and load testing.

In summary, Swagger is a powerful tool for designing, documenting, and testing RESTful APIs in a standardized and efficient manner. It promotes communication and collaboration among development teams, facilitating system integration and the use of APIs by other developers.

#

# JWT

JWT (JSON Web Token) is an open standard (RFC 7519) for creating secure and compact access tokens. It is widely used for authentication and authorization in APIs and distributed systems.

A JWT consists of three parts separated by periods (.):

1. Header: Contains information about the token type and the signature algorithm used. It typically includes the token type, which is "JWT," and the signature algorithm, such as "HS256" (HMAC with SHA-256) or "RS256" (RSA with SHA-256).

2. Payload: Contains additional data about the entity (user, client, etc.) and related metadata. It can include information like the user ID, permissions, token expiration, and other relevant data. The payload is encoded in JSON and is commonly referred to as JWT claims.

3. Signature: The final part of the JWT is used to verify the token's integrity. The signature is calculated using the encoded header, encoded payload, a secret key (in the case of symmetric signature algorithms) or a private key (in the case of asymmetric signature algorithms). The signature ensures that the JWT has not been tampered with during transmission and can be verified by the server to ensure the token's authenticity.

JWTs are popular due to their portability, security, and scalability. They can be easily transmitted through HTTP requests, stored in cookies, or in local storage such as LocalStorage or SessionStorage. Servers can verify the token's signature to ensure its authenticity and authorize access based on the information contained in the payload.

However, it is important to take precautions when using JWTs, such as protecting the secret or private key used to sign and verify the tokens, setting appropriate expiration times, and considering security when transmitting tokens over the network.

When it comes to where to save your JWT token, there are several common options depending on the context of your application. Here are some popular choices:

1. Cookies: JWT tokens can be stored in cookies. Cookies offer the advantage of being automatically sent with HTTP requests, simplifying the authentication process across multiple requests. However, it's important to consider proper security measures when working with cookies, such as setting the correct security options and protecting against cross-site scripting (XSS) and cross-site request forgery (CSRF) attacks.

2. Local Storage or Session Storage: JWT tokens can also be stored in the local storage of the browser, such as Local Storage or Session Storage. These storage mechanisms allow tokens to be accessed and used on the client side. However, it's important to be aware that local storage is vulnerable to cross-site scripting (XSS) attacks, so proper security measures should be implemented, such as properly encoding the data and protecting against malicious scripts.

3. Server-side Storage: In some cases, it may be preferable to store the JWT token on the server side. In this scenario, the token would be stored in a server session or in a database. The server would be responsible for associating the token with the user session and managing it properly. This approach can be useful when working with server-side architectures or when greater control over the token is required.

The choice of where to store the JWT token depends on the specific requirements of your application, the context of use, and the security aspects you want to ensure. It's important to implement proper security precautions, such as protecting the token against unauthorized access and renewing it when necessary, as well as evaluating the risks and vulnerabilities associated with each storage option.

#

# Versioning via path parameter

Versioning via path parameter is a common approach to versioning APIs, where the version number is included directly in the URL path. For example:

```
https://api.example.com/api/v1/users
```

In this case, the API version is indicated by the "v1" segment in the URL path. As new versions are released, the URL structure can be updated to reflect the new version, such as:

```
https://api.example.com/api/v2/users
```

This approach allows different versions of the API to coexist on the same domain, making it easier to transition to newer versions. The specific API endpoints and resources are grouped under their respective version numbers in the URL path, which facilitates maintenance and organization.

However, it is important to consider some best practices when using versioning via path parameter:

1. Maintain compatibility: When releasing a new API version, try to maintain compatibility with previous versions whenever possible. This means avoiding changes that break existing functionality for clients using older versions.

2. Document the changes: It is crucial to thoroughly document and communicate the changes between API versions. Provide detailed information about the modifications, added features, deprecated features, and any impact the updates may have on existing clients.

3. Deprecation management: Establish a deprecation and removal policy for older API versions. Set deadlines and provide a clear plan for clients to migrate to newer versions before older versions are phased out.

4. Consider scalability: As the API grows and new versions are added, consider the scalability of the path parameter versioning structure. Ensure that the URL structure is flexible enough to accommodate future versions and changes without compromising usability.

Remember that the choice of versioning method depends on the specific needs and requirements of your project. Evaluate the available options carefully and choose the approach that best fits your context.

#

# Best practices

Sure! Here are additional details for each line:

2. Pagination: In web development, pagination is the practice of dividing a large dataset into smaller, more manageable chunks or pages. It is commonly used in situations where displaying all the data at once would be impractical or negatively impact performance. Pagination improves user experience by allowing users to navigate through the data more easily.

3. Filters: Filters enable users to refine and narrow down data based on specific criteria or conditions. They provide a way to customize and focus the data that is displayed or retrieved. For example, in an e-commerce website, users can apply filters to search for products within a specific price range or belonging to a particular category.

4. Define logical resources: In API development, defining logical resources involves identifying and designing the resources that the API will expose and interact with. This includes determining the endpoints (URLs), data models, and operations that will be available to API consumers. Logical resources define the structure and functionality of the API.

5. Fault tolerance: Fault tolerance refers to the ability of a system to continue functioning properly even in the presence of failures or errors. It involves designing the system in such a way that it can handle and recover from faults, ensuring high availability and reliability. Fault tolerance is important for systems that need to operate continuously without interruption.

6. Cache: Caching involves storing frequently accessed data in a temporary storage to improve performance. By caching data, subsequent requests for the same data can be served more quickly, reducing the need for repetitive computations or expensive operations. Caching can be done at various levels, such as the application level, database level, or even at the network level.

7. Connectivity: Connectivity refers to establishing reliable and stable connections between different components of a system or between different systems. It ensures that the necessary communication channels are established and maintained to facilitate data exchange and interaction. Connectivity is crucial for distributed systems, APIs, and services that rely on interconnectivity.

8. Timeouts: Timeouts are used to set a maximum waiting time for a request or operation. If the request or operation takes longer than the specified timeout period, it is terminated or considered unsuccessful. Timeouts are essential for managing resource allocation, preventing long delays, and handling situations where a response cannot be obtained within a reasonable time.

9. Documentation: Documentation involves creating comprehensive and well-structured materials that describe the functionality, usage, and implementation details of software or an API. It provides guidance and reference for developers, users, and other stakeholders. Documentation typically includes explanations of the API endpoints, input/output formats, authentication requirements, and examples of usage.

10. Use SSL: SSL (Secure Sockets Layer) or its successor, TLS (Transport Layer Security), is a cryptographic protocol used to establish secure and encrypted communication channels over the internet. Using SSL/TLS ensures that data transmitted between a client and a server is encrypted, preventing unauthorized access or tampering. It is crucial for protecting sensitive information and maintaining data security.

11. Versioning: Versioning involves managing different versions of software or an API to handle changes, updates, and backward compatibility. By assigning version numbers to software releases or API revisions, developers can introduce new features, fix bugs, and make improvements while ensuring existing functionality remains intact. Versioning allows different clients or consumers to interact with the API based on their compatible versions.

12. Testing and validation (automate): Testing and validation are essential steps in software development and API implementation. Automating these processes involves using tools and scripts to automatically test the correctness, functionality, and performance of the software or API. Automated testing ensures that the system behaves as expected, identifies potential issues or bugs, and speeds up the testing process.

13. Self-service (swagger|HATEOAS): Self-service features aim to provide users with a more intuitive and interactive experience when working with an API. Swagger is

a popular tool for documenting and exploring APIs, offering a self-service interface where users can browse and test API endpoints. HATEOAS (Hypermedia as the Engine of Application State) is a principle that allows an API to guide clients by providing hyperlinks to related resources, enabling self-discovery and navigation of the API's capabilities.

14. Marketing (campaign): Marketing campaigns refer to promotional efforts to raise awareness and promote the software or API to a targeted audience. It involves various strategies and activities, such as advertising, content creation, social media engagement, and public relations. Marketing campaigns aim to attract users, generate interest, and drive adoption of the software or API.

15. Exports: Enabling the capability to export data or results from the software or API in different formats or structures. This allows users to extract and utilize data generated or processed by the software or API in external systems or applications. Export functionality can support formats like CSV, JSON, XML, or specific file types compatible with other software tools.

16. i18n/globalization: Internationalization (i18n) and globalization involve designing software or APIs that can be easily adapted and localized to support different languages, cultures, and regions. This includes implementing features like language localization, date and time formats, currency conversions, and other regional-specific considerations to make the software or API accessible and user-friendly to a global audience.

17. Notifications (status code 201|after sending the file): Notifications in the context of an API typically involve sending status codes (e.g., HTTP status code 201 - Created) to indicate the successful completion of an operation. In this case, it refers to sending a notification or status code after sending a file via the API to confirm that the file was successfully processed or received by the intended recipient.

18. Field limits: Field limits involve setting constraints or limits on the size, format, or content of input fields to ensure data integrity and prevent misuse or abuse. By enforcing field limits, developers can prevent data entries that exceed certain thresholds or do not comply with the expected format, reducing the risk of errors or security vulnerabilities.

19. Monitor your API: Monitoring an API involves continuously observing and analyzing its performance, availability, and usage. This includes collecting metrics, logs, and other relevant data to identify any issues, bottlenecks, or abnormalities. By monitoring the API, developers can proactively detect and resolve problems, optimize performance, and ensure a smooth user experience.

20. Choose the appropriate technology: Selecting the most suitable programming languages, frameworks, libraries, and tools is crucial for the success of a project. The choice of technology should align with the project's requirements, constraints, scalability needs, development team's expertise, and long-term goals. It involves evaluating factors such as performance, security, community support, documentation, and compatibility with existing systems.
