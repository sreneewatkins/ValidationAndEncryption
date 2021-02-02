# Coding question:

### Create an Encrypter class to handle input validation and encryption. 

* It should have the method String getEncryptedName(String name) that performs 
  a simple string manipulation.
* The getEncryptedName method must perform the following tasks:
    * Validate the name by calling the validate(name) method provided in the Validator class
        * If the name validation returns true:
          Reverse the entire string and 
          convert upper-case letters to lower-case
          Return the modified string
        * If the name validation returns false:
          Throw an IllegalArgumentException with the message 'Try again with valid name'

The locked stub code in the editor provides the complete implementation of the Validator 
class and validates the implementation of the Encrypter class. 

Constraints:
The name contains no more than 100 characters.
