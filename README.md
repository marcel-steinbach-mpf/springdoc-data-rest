## Run
1. ```
   mvn spring-boot:run
   ```
2. http://localhost:8080/swagger-ui.html

## Issues 

* `property-property-reference-controller`
  * includes all http methods even though spring data rest only supports `GET`, `PUT`, `PATCH` and `DELETE`
  * attempting to use `POST` will return `HTTP 405`
  * does not fill in `{property}` placeholder with `childProperty` -- need to do this manually, which somewhat defeats the purpose of documentation
* `child-property-property-reference-controller`
  * spring data rest does not include this
  * attempting to use will return `HTTP 404`
* schemas
  * `chilProperty` is embedded where spring data rest will include link
  * links are named `additionalProp1` etc rather than `self`, `childProperty`, etc
