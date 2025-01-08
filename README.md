# Abgabe-SoftwareDevo
Von Leon Kämker 7423162
Dienstag 16:00-17:30

# Grading

| Sheet       | Ex. 1    | Ex. 2    | Ex. 3    | Ex. 4    | Ex. 5    | Sum      |
| ----------- | -------- | -------- | -------- | -------- | -------- | -------- |
| Homework 01 | 3.5/4    | 4.5/6    | 5/5      | 4.75/5   | -        | 17.75/20 |
| Homework 02 | 3.75/4.5 | 4.5/4.5  | 5/6      | 5/5      | -        | 18.25/20 |
| Homework 03 | 7.5/8    | 5.25/5.5 | 6.5/6.5  | -        | -        | 19.25/20 |
| Homework 04 | 3.5/5    | 4.75/5   | 6.25/7   | 2.75/3   | -        | 17.25/20 |
| Homework 05 | 5/5      | 2.75/7   | 2.5/8    | -        | -        | 10.25/20 |
| Homework 06 | 6/8      | 7/8      | 4/4      | -        | -        | 17/20    |

### Erläuterungen zur Bewertung

HW06:
- Ex. 1: Der Code wurde lediglich als Datei ExerciseGroupManagerTest.class abgegeben. Bitte Java-Code immer in (unkompilierten) Java-Dateien (also mit Endung .java) abgeben. Beim nächsten Mal wird eine solche Abgabe nicht mehr akzeptiert. Aus der Tabelle zu HW05 Ex. 2 wurden lediglich die Testfälle 2 und 3 umgesetzt \[-2p\].
- Ex. 2 a): Bei der Datei "Abgabe6 nr2a" fehlt die Dateiendung .java. Zeile 5 und 12 doppeln sich quasi. Für eine von beiden Importvarianten entscheiden und dann die andere streichen. Fehlende Mocks für die Student-Objekte und die darauf in generateStudentDistribution() aufgerufenen Methoden \[-1p\].

HW04, HW05: Siehe Bemerkungen im Ordner *Correction Files*.

HW03:
- Ex. 1 a): Siehe Bemerkungen im Ordner *Correction Files*.
- Ex. 1 b): Die Association von Student zu ExerciseGroup aus dem Klassendiagramm wurde nicht umgesetzt.
- Ex. 2: Eingaparameter id wird von getEntityById() gar nicht benutzt \[-0.25p\].
- Ex. 3: ExerciseGroupManager-Objekt besser in einer @BeforeEach-Methode initialisieren.

HW02:
- Ex. 1: Merge-Knoten vom Branching fehlt. Der müsste vor dem Fork platziert werden und der Pfeil vom Adjust-Branch würde dann dorthin gehen. Fehlende Beschriftung eines Branches (Boolean Expression an Pfeil).
- Ex. 2: Die Transition von "In Conflict" zu "Assigned" durch das Event "Resolve Conflict" war nicht explizit gegeben, kann man aber implizit annehmen. "Terminated" als eigenen State mit rein zu nehmen ist okay, aber unnötig - stattdessen kann man die Pfeile auch direkt zum Bull's Eye führen, was das Gleiche bedeutet.
- Ex. 3: Gib den Interfaces Namen. Das "Notification" Interface müsste umgedreht sein. Schreib an die Delegates "delegate" dran.

HW01:
- Ex. 1: Shibboleth wird verwendet, die Entwickler davon sind aber nicht selbst als Stakeholder an unserem Projekt beteiligt.
- Ex. 2: Bei den Quality Requirements hast du lediglich den jeweiligen Typen angegeben, aber nicht, was überhaupt die konkreten Requirements sind, die du gefunden hast. Der Zeitplan (WS 25/26 usw.) ist ein Project und kein Process Requirement.
- Ex. 4: Eigene Annahmen sollten als solche markiert werden.
