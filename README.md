# XML Management and Validation

This project provides a solution for managing and validating XML files against a given XSD schema using Java and JAXB (Jakarta XML Binding). It includes a mechanism to define the structure of an XML file through Java classes and to validate the XML file's content based on this structure and a corresponding XSD schema.

## Requirements

To run this project, you need the following:

- Java Development Kit (JDK - 21) 
- NetBeans IDE (22)
  
## Project Structure
- **com.xmlmanagement.model**: Contains data model classes for Book, Chapter, Paragraph, Lines, Line and Statistics.
- **com.xmlmanagement.services**: Contains service classes. TxtToXmlConverter, ClculateStatistics, ReadSpecificElements, Xsd Generator, XmlValidation.
- **com.xmlmanagement.eshop**: Contains the XmlManagement (main) application class.
- **xml_files**:sample-lorem-ipsum-text-file.txt , book.xml, book2.xml, book.xsd
  
## Setup Instructions
Αντιμετωπίζω ένα θέμα με το Netbeans, οταν πάω να κανω να push στο github ένα πρότζεκτ. Ανεβάζει παράλληλα και άλλα αρχεία από παλαιότερα πρότζεκτ. Οπότε δεν φαίνονται πολύ σωστά εδώ οι φάκελοι. Έχω δοκιμάσει σε πολλά διαφορετικά repositories, για αυτό και δεν έιναι αντιπροσωπευτικά τα commits. Το ανεβάζω και σε ένα διαφορετικό public branch (https://github.com/ElenaChaidou/ManagementXml2.git), από διαφορετικό υπολογιστή (Για αυτό και θα φαίνεται διαφορετικό πρόσωπο). Αυτό σε περίπτωση που από το συγκεκριμένο repository δεν είναι εύκολο να γίνει clone κλπ.

### Step 1: Clone the Repository

First, clone the repository to your local machine:

1. Start NetBeans on your computer
2. Go to Team > Git > Clone...
3. In the Repository URL field, enter the URL of the Git repository.
4. Choose the branch you want to clone (XmlManagement)

### Step 2: Open the Project in NetBeans
1. Open NetBeans IDE.
2. Go to File -> Open Project.
3. Navigate to the directory where you cloned the repository and select the TravelCompany project.
4. Click Open Project.
   
### Step 3: Build and Run the Project
Select Clean and Build.
After the build is successful, right-click on the project again and select Run.
