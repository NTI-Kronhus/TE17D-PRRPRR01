## Förra förhöret

* [Facit](https://docs.google.com/document/d/1wRXQioiwWDybIMpxUCYIXTWBCDA_f-v68jYF9sb3lPU/edit?usp=sharing)

## Bonusuppgifter
* [Länk](https://github.com/NTIGBG/TE17D-PRRPRR01/tree/master/v49/bonus)


# Eclipse
## Snabbkomandon i Eclipse:

Kombination | Handling
------------|----------
Ctrl+Shift+O | Importera
Ctrl+Shift+F | Formattera
Alt+Shift+R  | Refactor (byta namn)
Ctrl+Space   | Autocomplete
Ctrl+7       | Kommentera markerade rader
F11          | Kör program

# Datatyper
## Primitiva datatyper

Datatyp     |   Typ av data |Exempel
------------|---------|---------
int |  heltal | ``` int heltal = 6;```
double | decimaltal | ``` double d = 5.67;```
boolean | true/false | ``` boolean condition = true;```
char | tecken | ``` char c = 'N'; ```

## Icke primitiva datatyper
Datatyp     |   Typ av data |Exempel
------------|---------|---------
String |  text | ``` String namn = "Joakim"; ```


# Operatorer
## Logiska operatorer
Operator | Operation
---------|-----------
 && | och
\| \|| eller
! | inte

## Aritmetiska operatorer
Operator | Räknesätt
---------|-----------
\+ | addition
\- | subtraktion
\* | multiplikation
\/ | division
\% | modulus (rest)
\+\+ | öka med 1
\-\- | minska med 1

## Jämförelse operatorer
Operator | Jämförelse
---------|-----------
< | mindre än 
\> | större än
== | lika med
\>= | större än eller lika med
<= | mindre än eller lika med
!= | inte lika med

# Kontrollstrukturer:
## if
Syntax: 
```java
if(villkor){
  // KOD ATT UTFÖRA
}
```
Exempel:
```java
int age = 23;
if( age >= 15 ) {
  System.out.println("Du får köra moppe!");
}
```

## if-else
if-else används om du alltid vill göra en av två saker.
Exempel:
```java
String direction = "right";

if(direction.equals("left")){
  go_left();
}
else{
  go_right();
}
```

## for
En for-loop används vid ett känt antal iterationer. <br>
Syntax:
```java
for( 1 ; 2 ; 3 ){
  // KOD ATT UTFÖRA
}
1 - startvärde
2 - villkor för att fortsätta
3 - öka/minska
```
Exempel:
``` java
int sum = 0;
for(int i = 1 ; i <= 10 ; i++){
  sum += i;
}
System.out.println(sum); // sum = 55
```

## while
En while-loop används vid ett okänt antal iterationer.<br>
Syntax:
```java
while(villkor){
  // KOD ATT UTFÖRA
}
```
Exempel:
``` java
boolean solution = false;
while(!solution){
	// LETA EFTER LÖSNING
}
```

# String



## Inbyggda metoder

Metod | Syfte
------------|----------
.length()   | Ger tillbaka längden av strängen
.equals()   | Måste användas för att jämföra strängar
.substr(int,int) | Används för att få en delsträng mellan två index
.charAt(int)   | Ger tillbaka ett tecken på angivet index
.toUpperCase() | Ger tillbaka samma sträng fast bara stora bokstäver
.toLowerCase() | Ger tillbaka samma sträng fast bara små bokstäver




# Metoder

Genom att skapa flera små metoder i Java, kan dessa användas för att skapa stora program. På så sätt blir det mycket lättare att programmera eftersom man slipper koda samma sak flera gånger.<br>
En tumregel är att en bra metod ska ha mellan 1-10 rader kod.
<br>
<br>
Syntax:
```java
public static [returtyp] [namn] ( [parametrar] ) {
    [kod]
    return [returtyp] // Behövs inte om [returtyp] är void
}
```
En metod deklareras alltid med en returtyp, ett namn och vilka parametrar som man behöver ta in för att metoden ska fungera.
<br>
Exempel på metoder:
```java
public static int add(int a, int b){
    return a + b;
}

public static void hello(){
    System.out.println("Hello");
}
```
```void``` *betyder avsaknad av returtyp*

# JavaDoc

JavaDoc används för att kommentera sina metoder så att alla som använder din kod enkelt och smidigt kan se vad metoderna gör för något.
<br>
JavaDoc indikeras av ```/**``` och ```*/``` ovanför en metods deklaration.
<br> 
Exempel:
```java
/**
 * Denna metod ger tillbaka den minsta av två heltal.
 *
 * @param a ett heltal
 * @param b ett heltal
 * @return den minsta av a och b
 */
public static int min(int a, int b){
    if(a < b){
        return a;
    }
    else{
        return b;
    }
}
```

# Arrayer

## Skapa en array
Med en array kan man på ett enkelt sätt lagra flera värden/variabler av en viss datatyp. <br>


Du kan skapa en array på två olika sätt:
1. Skapa den med värden direkt.
2. Skapa den utan värden fast med en viss längd.
```java
int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
int[] arr2 = new int[5]; // {0,0,0,0,0}

String[] arr3 = {"Joakim","Ohlsson"};
String[] arr4 = new String[4]; // {null,null,null,null}
```
## Loopa igenom en array

Du kan med hjälp av en for-loop enkelt loopa igenom en array för att exempelvis söka, sortera eller skriva ut.<br>
Exempel:
```java
int[] arr = {1,2,3,4,5};
// Skriv ut alla siffror i arr
for (int i = 0; i < arr.length; i++) {
    System.out.println(inputs[i]);
}
```

# Sorteringsalgoritmer

* Bubble sort
* Insertion sort
* Comb sort
* Quick sort
* Selection sort
* Cocktail sort
* Shell sort
* Merge sort
* Heap sort

[Spellista Youtube](https://www.youtube.com/playlist?list=PLvxWhcSU-76fCB-LX6op8WGuCBt52_XS8)


# Ord

* LÄNK TILL DOCS KOMMER SNART

# Övrigt

## Main-metod
En main-metod måste finnas i alla klasser som vi vill köra. <br>
En main-metod skapas enklast genom att skriva main och sedan autocomplete.<br>
Syntax:
```java
public static void main(String[] args){
  // DITT PROGRAM
}
```

## Scanner
En Scanner används för att läsa av användar-input från consolen.<br>
Syntax:
```java
Scanner namn = new Scanner(System.in);
```
Exempel:
```java
Scanner input = new Scanner(System.in);
int tal = input.nextInt();
String text = input.next();
```

## Output
```java
System.out.println("Hello World");
```

## Import
import måste alltid användas när vi använder oss utav bl.a. Scanner och andra avancerade klasser.<br>
Exempel:
```java
import java.util.Scanner;
```
