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
| Homework 07 | 2/4      | 4/4      | 8/8      | 2.5/4    | -        | 16.5/20  |
| Homework 08 | -        | -        | -        | -        | -        | Skipped  |
| Homework 09 | 2/4      | 8/8      | 0/8      | -        | -        | 10/20    |
| Homework 10 | 0/3      | 3.25/5   | 10/12    | -        | -        | 13.25/20 |

### Erläuterungen zur Bewertung

HW10:
- Ex. 1: Keine der Anforderungen wurde tatsächlich im User Stories Format umgesetzt \[-3p\]. Das wurde in VL04 definiert und hätte so ausgesehen: "As a \<type of user\>, I want \<some goal\> so that \<some reason\>."
- Ex. 2: Vermutlicher kleiner Verständnisfehler: Die 4 unbearbeiteten Issues sollten in dem Sprint auch nicht bearbeitet werden, sonst wären sie im Sprint Backlog und nicht im Product Backlog gewesen \[-0.5p\]. Aus der Kombination von den Issues in der Spalte "Done" und dem Burndown Chart hätte man noch mehr Beobachtungen ableiten können \[-1p\]. Zwischen Sprints gibt es üblicherweise keine Pause, d.h. wenn man eine unfertige Aufgabe "noch schnell fertig machen" will, kommt sie mit entsprechend niedrigerer Aufwandseinschätzung und angepasster Priorität mit in den nächsten Sprint \[-0.25p\]. 
- Ex. 3: Die Issues #2 und #5 aus dem Product Backlog wurden in der Planung übersehen \[-1p\] und bei Issue #1 wird mir das nicht ganz klar, ob das mit der angegebenen Nummer 6 gemeint ist. Bei der Planung für den nächsten Sprint Issues als Must Have zu kategorisieren, diese dann aber nicht in die Vorauswahl für den Sprint zu nehmen (Nr. 2), ergibt keinen Sinn \[-1p\].

HW09:
- Ex. 1: .jar-File fehlt \[-2p\]. Der Fehler könnte mit der Beschränkung der Upload-Größe pro Datei zusammenhängen (dafür müsste ich die Details sehen, um das genauer zu beurteilen). Zumindest das Problem war auch schon im Town Square angesprochen und am 18.12. beantwortet worden.
- Ex. 3: Nicht bearbeitet.

HW07:
- Ex. 1 a): Projekt nicht richtig mit den Abhängigkeiten von Spring Boot und Maven angelegt. Das kann man in der Datei pom.xml überprüfen, die im gepushten Projekt aber nicht existiert \[-1p\].
- Ex. 1 b) Copy-Paste-Fehler: Im Aufgabentext stand explizit, dass das einzelne Zeilen sind, die in der application.properties Datei ergänzt werden müssen. Hintereinander in einer bzw. in zwei Zeilen gesetzt kann Spring die Statements nicht richtig interpretieren \[-1p\].
- Ex. 4: DELETE nicht getestet \[-1p\]. Ein Test, was passiert, wenn eine GET-Anfrage mit einer ID abgeschickt wird, die es in der Datenbank nicht gibt, wäre noch interessant gewesen \[-0.5p\].

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
