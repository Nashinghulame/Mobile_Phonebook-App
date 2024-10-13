// Insert Contact
FUNCTION insertContact(name, phoneNumber)
  IF phonebook is empty THEN
    CREATE a new contact with name and phoneNumber
    ADD contact to phonebook
  ELSE
    FIND the last contact in the phonebook
    ADD new contact after the last contact
  END IF
END FUNCTION

// Search Contact
FUNCTION searchContact(name OR phoneNumber)
  FOR EACH contact IN phonebook
    IF contact's name matches the input name OR contact's phoneNumber matches the input phoneNumber THEN
      RETURN contact's details
    END IF
  END FOR
  RETURN "Contact not found"
END FUNCTION

// Display all contacts
FUNCTION displayContacts()
  FOR EACH contact IN phonebook
    PRINT contact's details
  END FOR
END FUNCTION

// Delete Contact
FUNCTION deleteContact(name OR phoneNumber)
  FOR EACH contact IN phonebook
    IF contact's name matches the input name OR contact's phoneNumber matches the input phoneNumber THEN
      REMOVE contact from phonebook
      RETURN "Contact deleted"
    END IF
  END FOR
  RETURN "Contact not found"
END FUNCTION

// Update Contact
FUNCTION updateContact(name OR phoneNumber, updatedDetails)
  FOR EACH contact IN phonebook
    IF contact's name matches the input name OR contact's phoneNumber matches the input phoneNumber THEN
      UPDATE contact's details with updatedDetails
      RETURN "Contact updated"
    END IF
  END FOR
  RETURN "Contact not found"
END FUNCTION
