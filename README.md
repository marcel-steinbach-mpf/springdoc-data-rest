* schemas
  * child property is embedded where spring data rest will include link
* `property-reference-controller` lists properties by type name, not by reference name (e.g. `/property/{id}/childProperty` instead of `/property/{id}/myChildPropertyName`, https://github.com/marcel-steinbach-mpf/springdoc-data-rest/blob/cc4743fee963c156c0d0c30eac7924da385dd570/src/main/java/test/Property.java#L24). This also leads to problem where there are two references with the same type.
