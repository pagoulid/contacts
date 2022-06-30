Mapping files:

    Some files may be unmapped 
    if so then map :
    * ContactApplication.java
    * OpenAPI2SpringBoot

    File -> Project Structure -> 
    ->Facets -> click '+' on right panel
    -> Add above files
Database setup:

    - Add h2 DB with properties:
            User : sa,
            password: password,
            URL : jdbc:h2:mem:dcbapp://localhost:8080/app/contacts
            