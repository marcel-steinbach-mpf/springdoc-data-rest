* schemas
  * child property is embedded where spring data rest will include link
* property-reference-controller lists properties by type name, not by reference name (e.g. `/property/{id}/childProperty` instead of `/property/{id}/myChildPropertyName`). This also leads to problem where there are two references with the same type.
