* property-property-reference-controller
includes all http methods even though spring data rest only supports get, put, patch and delete
attempting to use POST will return 405
does not fill in {property} place holder with childProperty -- need to do this manually
* child-property-property-reference-controller
spring data rest does not include this
attempting to use will return 404
* schemas
child property is embedded where spring data rest will include link
links are named additionalProp1 etc rather than self, childProperty etc