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
            
            
 Requests:
 
    Fetch contacts (GET req)-> http://localhost:8080/app/contacts
    Add Contact    (POST req)-> http://localhost:8080/app/contacts
    Update a contact (PUT req) -> http://localhost:8080/app/contacts/{id} e,g. .../contacts/1 (update contact with id 1 , fields with "" will not be updated)
    Delete a contact (DEL req) -> http://localhost:8080/app/contacts/{id}
    Fetch contacts sorted by last name (GET req) -> http://localhost:8080/app/contacts/sorted/last-name/{order} , where order should be Asc or Desc
    Fetch contacts with first/last name match ,sorted by last name (GET req) -> /app/contacts/sorted/last-name?order={o}&match={m}&name={name}
                                                                                ,(where o = Asc/Desc , m =first/last , name = <given first/last name to match contacts>)
                                                                                
     Request Body example for POST,PUT,DELETE methods :
     
    {
    
    "firstname": "Panagiotis",
    "lastname": "Goulidakis",
    "businessphone": "24300889",
    "personalphone": "241042548",
    "mobilephone": "6952173879",
    "personalemail": "pagoulid@gmail.com"
    }
    
  Tested on Postman app  
            
