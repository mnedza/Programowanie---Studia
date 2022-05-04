////////////////////
SEMESTR 1
////////////////////

Zadania do wykonania na zaliczenie  -> katalog: Semestr 1 Java

///////////////////////////////////////////////////////////////

////////////////////
SEMESTR 3
////////////////////

Projekt realizowany na ćwiczeniach z PIO z prowadzącym -> katalog: Semestr 3 Java

Pierwsza, najprostsza implementacja znajduje się w katalogu step-1, kolejna wersja (po stworzeniu klasy players.Player) -- w katalogu step-2 itd.

Spis etapów

step-1: Pierwsza, najprostsza implementacja, wszystko w metodzie main().

step-2: Dodana klasa players.Player reprezentująca gracza. W klasie tylko jedna metoda int guess().

step-3: Do klasy players.Player dodane pole imienia (name). Dodany seter sprawdzający poprawność danych (na razie wykluczenie null i łańcucha pustego).

step-4: Konstruktory w klasie players.Player.

step-5: Dodana klasa players.PlayerHuman, która dziedziczy po players.Player i wprowadza inny sposób odgadywania.

step-6: Poprawiona struktura klas graczy: abstrakcyjna klasa bazowa players.Player z abstrakcyjną metodą guess(). Wprowadzona klasa players.PlayerComp.

step-7: W przypadku przekazania do settera setName() klasy players.Player nieprawidłowego imienia, rzucany jest wyjątek IllegalArgumentException.

step-8: Poprawność imienia sprawdzamy za pomocą wyrażenia regularnego.

step-9: Logika gry przeniesiona do klasy Game.

step-10: Metody addPlayer() i play() w klasie Game przystosowane do trybu multiplayer. Zastosowanie kolekcji (ArrayList). Wprowadzenie iteratora.

step-11: Imiona graczy muszą być unikatowe -- modyfikacja w metodzie addPlayer(). Zastosowanie rekurencji.

step-12: Dodane metody removePlayer() i printPlayers().

step-13: Dodana klasa statistics.WinStatistics z metodami umożliwiającymi prowadzenie statystyk wygranych. Zastosowanie mapy (HashMap). Obiekt klasy statistics.WinStatistics jest 
przekazywany do obiektu gry poprzez konstruktor Game(statistics.WinStatistics) -- namiastka tzw. wstrzykiwanie zależności (ang. dependency injection).

step-14: Dodanie możliwości przeprowadzania gry bez statystyk (konstruktor bezparametrowy Game()). Zastosowanie wzorca Null Object (pusty obiekt): interfejs statistics.WinStatistics, klasa statistics.NullStatistics. Dotychczasowa klasa statystyk zmieniła nazwę na statistics.WinStatistics.

step-15: Wielkie końcowe porządki: utworzone dwa pakiety (players, statistics), w których wylądowały odpowiednie klasy.
