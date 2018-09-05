# GitHub Laboration

### Den här övningen förutsätter att du gjort första läxan vi har haft ([v.34](https://github.com/NTIGBG/TE17D-PRRPRR01/tree/master/v34/uppgift)) och har laddat ner Git till Windows.

## Del 1: Linux-kommandon
1. Börja med att starta Git Bash.

2. Git Bash är en primärt en kommandotolk för Git som måste laddas ned till Windows för att du ska kunna jobba med versionshantering och utföra olika kommandon som att exempelvis comitta, pusha och checka ut olika versioner av ett repository. <br> 
Man kan även använda vissa linux-kommandon som att skapa filer och mappar samt att navigera sig mellan mappar.<br> 
När man navigerar i en dator via en konsol är det några saker man behöver känna till och tänka på:
    - Alla kommandon du utför sker i den mapp som du "står i".
    - Du står alltid i en mapp och du kan se vilken mapp du står i längst till höger, med gul text.
    ![img](https://i.gyazo.com/5dde3f81f67693310fd186a1e94ba2b0.png)
    - Alla filer du ändrar, skapar eller tar bort är **permanent** och man kan inte ångra något.
    
Här kommer en lista på några basic linux-kommandon som är bra att känna till:

```unix
ls                  -   listar alla filer och mappar i den mapp som du just nu "står i".
cd <mapp>           -   går in i den mapp som du skriver in. (Som att dubbelklicka på en mapp i filhanteraren)
cd ..               -   går tillbaka ur en mapp
cd                  -   går tillbaka till din hem-mapp. (Din användar-mapp)
mkdir <mappnamn>    -   skapar en ny mapp med det angivna namnet. Mappen skapas i samma mapp som du står i.
touch <filnamn>     -   skapar en ny fil med angivet filnamn och filändelse. Filen skapas i den mapp du står i.
rm <filnamn>        -   tar bort den angivna filen.
rmdir <mappnamn>    -   tar bort den angivna mappen. (OBS mappen måste vara tom!)
rm -r <mappnamn>    -   tömmer en hel mapp och tar bort den.
mv <filnamn> <nytt filnamn> - Döper om en fil.
mv <mappnamn> <nytt mappnamn> - Döper om en mapp.
cp <filnamn> <namn på kopia> - Kopierar en fil.
mv <filnamn> <sökväg> - Flyttar en fil till angiven sökväg.

```
*Observera att alla filer och mappar som tas bort med rm-kommandon INTE kan återfinnas i papperskorgen!*

### Uppgift:
#### Läs igenom kommando-listan noga och utför följande steg.
1. Navigera till ditt skrivbord och skapa en mapp som heter github.
2. I den mappen ska du skapa en txt-fil som heter introduktion.
3. Kontrollera att filen blev skapad genom att lista alla filer i mappen du står i.
4. Gör en kopia av filen som får namnet copy.txt.
5. Skapa en ny mapp som heter copy_folder.
6. Flytta copy.txt till mappen copy_folder.
7. Kontrollera att filen blev flyttad genom att gå in i mappen och lista alla filer.
8. Ta bort filen copy.txt.
9. Gå tillbaka till skrivbordet och byt namn på mappen github till junk.
10. Ta bort mappen junk.


***


## Del 2: Git-kommandon
#### Denna del kräver att vi inte enbart jobbar i Git Bash men ha alltid konsolen uppe och hoppa mellan fönsterna.

1. Börja med att gå till din profil på github.com (www.github.com/<användarnamn>)
2. Klicka på den gröna knappen, New repository: <br>
Ge repot ett passande namn, se till att det är publikt och se till att checkboxen **INTE** är ikryssad för att inkludera en "README"-fil.<br>
![img](https://i.gyazo.com/79712d2715797707a895e96b160b5837.png)
3. Öppna programmet Git Bash och navigera till skrivbordet.
4. Skapa en ny mapp som får heta repository.
5. Gå in i mappen repository och skriv kommandot: ``` git init ``` <br>
    Detta skapar ett nytt git-repository i din mapp, vilket innebär att hela mappen nu kommer att fungera som ett lokalt repository som kan hålla koll på olika verisioner av allt innehåll i mappen framöver. *(Versioner som du själv får skapa!)*
6. Skapa nu en ny fil som får heta README.md
7. Öppna filen via filhanteraren med valfritt textredigeringsprogram och skriv in följande rad:
    ```
    # Mitt första repo
    ```
8. Spara filen och återgå till Git Bash.
9. Skriv i konsolen: ```git status ``` <br>
    Du får då upp information som visar vilka filer i ditt repo som är modifierade sedan föregående version.<br><br>
    **Nu ska vi spara våran ändring i mappen som en ny commit och sedan lägga upp det publikt på GitHub.** <br>
10. Skriv in följande rad för att lägga till filen README.md i en ny commit:
    ```
    git add README.md
    ```
11. För att skapa en ny commit med de tillagda filerna skriver vi följande:
    ```
    git commit -m "first commit"
    ```
    *Texten inom citattecknen är ett meddelande som förklarar för oss själva och andra vad vi har gjort för ändring i just denna commit.*
12. Eftersom detta repository endast finns lokalt på din dator just nu måste du vid första commiten koppla ihop det till GitHub och sedan kan du lägga upp det på webben! <br>
Skriv följande rad för att koppla detta repository till det repository nu i början skapade på GitHub:
    ```
    git remote add origin https://github.com/<användarnamn>/<namn på ditt repository>.git
    ```
13. Skriv nu följande rad för att "pusha" upp din commit till GitHub:
    ```
    git push -u origin master
    ```
14. När konsolen laddat klart gå in på ditt  www.github.com/<användarnamn>/<namn på ditt repository> och kolla så att din fil har laddats upp!

#### Fortsättning:
Experimentera gärna runt lite i Git Bash och skapa nya samt ändra befintliga filer, gör nya commits och "pusha" upp dem till GitHub.<br>
[Här](http://rogerdudler.github.io/git-guide/) finns även en bra sida som sammanfattar många av de grundläggande sakerna man kan göra med Git och GitHub!

