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
