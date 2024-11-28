<h1>Overview</h1>

Repository to track development of CRUD API with Spring and SpringBoot

<h2>Notes</h2>

1. <strong>Why do we need Service layer if we have DAO?</strong> <br>
![Dao And Service](./img/daoAndService.PNG?raw=true "DaoAndService") <br><br>
2. <strong>Where should we place Transaction constraint?</strong> <br>
    The transaction constraint should be placed in Service layer instead of the DAO layer. <br><br>
3. <strong>Why is Spring Data JPA used?</strong> <br>
    Redefining methods of a DAO is kind of a boiler code. <br>
    JPA is a project in Spring that provides the basic CRUD operations pre-defined, 
    you just need to tell the Entity type and the primary key and use JpaRepository interface. <br>
    <em>Note: JPA provides Transactional features out of the box, 
        hence we need not use Transactional in our Service class for a single entity</em> <br>
    Checkout [feat/repository](https://github.com/faizansaghir/crudProjectInSpringBoot/tree/feat/repository) for example of Spring JPA implementation <br><br>
4. <strong>Why is Spring Data Rest used? </strong> <br>
    Redefining controllers for each entity/ repository for basic CRUD operation is redundant. <br>
    Data Rest project of Spring provides us out of box REST API for our entities. <br>
    Once we include the data rest dependency in our project, 
    Spring scans for JPA repositories in our project and creates endpoints for basic CRUD operations. <br>
    This removes the need of defining the controller as well as the service layer for the entity. <br><br>
5. <strong>Spring Data REST Configurations and Sorting</strong> <br>
    <strong>Configurations:</strong> <br>
    &emsp;a. To change endpoint for an entity from default of plural of entity name, <br>
    &emsp;&emsp;use <strong>@RepositoryRestResource(path='newPath')</strong>. <br>
    <pre>Example:
        @Repository
        @RepositoryRestResource(path = "members")
        public interface EmployeeRepository extends JpaRepository&lt;Employee, Integer&gt; {
        } </pre> <br>
    &emsp;b. To change page size of the response sent to client, <br>
    &emsp;&emsp;Update the <code>spring.data.rest.default-page-size</code> property in <code>application.properties</code> file. <br>
    <pre>Example:
        spring.data.rest.default-page-size=3</pre>
    <strong>Sorting:</strong> <br>
    Spring data rest by default has endpoint with sorting features. <br>
    To sort the response by an attribute, use <code>/apiEndpoint?sort=attributeName[,asc/desc]</code>. <br>
    <pre>Example:
    http://localhost:8080/api/employees?sort=lastName
    http://localhost:8080/api/employees?sort=lastName,desc
    http://localhost:8080/api/employees?sort=lastName,asc
   
    <em>Note: Default sorting technique is in Ascending order</em></pre> <br>
