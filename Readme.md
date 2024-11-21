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
    This removes the need of defining the controller as well as the service layer for the entity. <br>
