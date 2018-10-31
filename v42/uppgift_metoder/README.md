# Inlämmningsuppgift Java PhysicsLibrary

INTRO TEXT


### Konstanter som skall finnas med i ditt Bibliotek:
```java
G - Gravitationskonstanten.
R - Almänna gaskonstanten.
p_0 - lufttrycket vid havsytan.
c - Ljusets hastighet i vakum.
g_swe - Tyngdaccelerationen för Sverige.
```

### Gaser, västkor och material
I dina tabeller ska det minst finnas:
* Totalt 5 olika [gaser](https://github.com/NTIGBG/TE17D-PRRPRR01/blob/master/v42/enums/GasTable.java). 
* Totalt 5 olika [vätskor](https://github.com/NTIGBG/TE17D-PRRPRR01/blob/master/v42/enums/FluidTable.java).
* Totalt 5 olika [material](https://github.com/NTIGBG/TE17D-PRRPRR01/blob/master/v42/enums/SolidTable.java).

### Metoder som skall finnas med:
Dina metoder ska vara kommenterade med vanliga kommentarer ELLER Javadoc. <br><br>
1. En metod som gör om grader fahrenheit till grader celcius.
```java
double fahrenheitToCelsius(double fahrenheit)
fahrenheitToCelsius(50) => 10
```

2. En metod som gör om grader kelvin till grader celcius.
```java
double kelvinToCelsius(double kelvin)
kelvinToCelsius(0) => -273.15
```

3. En metod som räknar ut vätsketrycket i en vätska vid ett visst djup.
```java
double fluidPressure(FluidTable fluid, double deep)
fluidPressure(FluidTable.WATER, 10) => 98003,6
```

4. En metod som räknar ut vätsketrycket i vatten vid ett visst djup.
```java
double pressureUnderWater(double deep)
pressureUnderWater(10) => 98003,6
```

5. En metod som räknar ut kinetisk energi med hjälp av massa och hastighet.
```java
double kineticEnergy(double mass, double velocity)
kineticEnergy(2,2) => 4
```

6. En metod som räknar ut potentiell energi med hjälp av massa och höjd.
```java
double potentialEnergy(double mass, double height)
potentialEnergy(2,5) => 98.2
```

7. En metod som räknar ut hur hög hastighet man kommer upp i som man släpper ett föremål från en viss höjd.
```java
double fallSpeed(double height)
fallSpeed(2.5) => 7,00713922
```

8. En metod som räknar ut skillnad mellan två givna värden.
```java
double delta(double first, double last)
delta(1,10) => 9
delta(5,1) => -4
```

9. En metod som gör om en viss volym av vätska till en massa.
```java
double volumeToMass(FluidTable fluid, double volume)
volumeToMass(FluidTable.WATER,1) => 998
```

10. En metod som gör om en viss volym av gas till en massa.
```java
double volumeToMass(GasTable gas, double volume)
volumeToMass(GasTable.AIR,1) => 1.29
```

11. En metod som gör om en viss volym av materia till en massa.
```java
double volumeToMass(SolidTable solid, double volume)
volumeToMass(SolidTable.IRON,1) => 7870
```

12. En metod som räknar ut medelhastigheten med hjälp av sträcka och tid
```java
double svtVelocity(double distance, double time)
svtVelocity(10,5) => 2
```

13. En metod som räknar ut sträcka med hjälp av hastighet och tid.
```java
double svtDistance(double velocity, double time)
svtDistance(10,5) => 50
```

14. En metod som räknar ut tid för hjälp av sträcka och hastighet.
```java
double svtTime(double distance, double velocity)
svtTime(10,2) => 5
```

15. En metod som räknar ut arbete med hjälp av kraft och sträcka.
```java
double work(double force, double distance)
work(50,10) => 500
```

16. En metod som räknar ut effekt med hjälp av arbete och tid.
```java
double power(double work, double time)
power(1000,2) => 500
```

17. En metod som räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet antal grader.
```java
double heat(SolidTable solid, double mass, double deltaT)
heat(SolidTable.IRON,1,2) => 900
```

18. En metod som räknar ut hur mycket energi som krävs för att värma en viss volym vätska ett angivet antal grader.
```java
double heat(FluidTable fluid, double volume, double deltaT)
heat(FluidTable.WATER,1,10) => 41900
```

19. En metod som räknar ut hur mycket energi som krävs för att värma en viss volym gas ett angivet antal grader.
```java
double heat(GasTable gas, double volume, double deltaT)
heat(GasTable.AIR,1,1) => 1010
```

20. En metod som räknar ut hur högt ett föremål med en viss hastighet uppåt kommer.
```java
double velocityToHeight(double velocity)
velocityToHeight(9.82) => 4.91 
```


### Frågor som skall besvaras med hjälp av era metoder:
Dessa ska besvaras i en separat class med en main-metod.
1. Hur mycket väger 80 dm^3 järn?
2. Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?
3. Hur mycket energi krävs för att värma upp 5 liter vatten?
4. Hur stort är det totala trycket 100 meter under havsytan?
5. Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?
6. En bil med massan 740kg accelererar från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?
7. En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?
8. Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
9. Formulera en egen uppgift man kan lösa med hjälp av dina metoder.
10. Formulera en egen uppgift man kan lösa med hjälp av dina metoder.

## För att nå högre betyg än C på uppgiften vill jag även att ni lägger till:
* Java-dokumentation på alla metoder.
* Ytterligare 10 st eller fler egenskrivna fysikaliska metoder.
* Använt dig av GitHub genom hela uppgiften och gjort minst 15 relevanta commits.


### Viktigt att tänka på:
* Alla formler och uppgfter bortser från luftmotstånd!

# Inlämmning sker senast onsdag den 7/11 kl 23:59 till tomas.weis@ntig.se

