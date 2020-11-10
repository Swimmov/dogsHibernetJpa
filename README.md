## Prototype of a game called “DogsPooGolf”. 
### *Hibernate JPA version*
### *Project management tool - Maven*

No database version `<link>` : <https://github.com/Swimmov/DogsPooGolf>
MySQL database version `<link>` : <https://github.com/Swimmov/dogspoogolfDB>
changes from the previous version:

**3 config files are added:**
- pom.xml ---> Maven configuration file atomaticaly generated and then two dependencies were added:
	- mysql
	- hibernate
- Hibernate.cfg.xml --> Hibernate configuration file. Created manually and placed into the /src/main/resources directory
- Persistence.cfg.xml -->  JPA configuration file. Created manually and placed into the /src/main/resources/META-INF directory

**2 new classes were added:**
- class ***HiberDogFood*** --> mapping Entity class with Annotations
- class ***FoodTableManager*** --> for managing database CRUD operations using EntityManagerFactory interface for persistence Unit named in persistence.xml

- class ***DataBaseHandler.java***  removed.
- class ***ConfigsDb.java*** removed.
- class ***ConstDb.java*** removed.

The rest of the files were renamed by adding "HiberJpa" to the beginning of each name.
The main class has name MainHiberJpaClassDog and just a

- little changes inside the code.
