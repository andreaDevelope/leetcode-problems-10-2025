# 🎯 LeetCode Solutions - Java Project

Un progetto Java che implementa soluzioni ottimizzate per problemi LeetCode con test completi e documentazione dettagliata.

## 📋 Problemi Implementati

### 🔢 Two Sum (LeetCode #1)

**Difficoltà:** Easy  
**Descrizione:** Trova due numeri in un array che sommati danno il target.

**Soluzioni:**

- ⚡ **Brute Force O(n²)** - Due loop annidati
- 🚀 **HashMap O(n)** - Un passaggio con mappa per complementi

**Esempio:**

```java
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Spiegazione: nums[0] + nums[1] = 2 + 7 = 9
```

### 🔤 Longest Substring Without Repeating Characters (LeetCode #3)

**Difficoltà:** Medium  
**Descrizione:** Trova la lunghezza della sottostringa più lunga senza caratteri ripetuti.

**Soluzioni:**

- ⚡ **Brute Force O(n³)** - Controlla tutte le sottostringhe
- 🚀 **Sliding Window O(n)** - Finestra scorrevole con due puntatori

**Esempio:**

```java
Input: s = "abcabcbb"
Output: 3
Spiegazione: La sottostringa più lunga è "abc", lunghezza 3.
```

## 🏗️ Struttura del Progetto

```
src/main/java/com/esempio/
├── App.java                                    # Classe principale
├── Calculator.java                             # Calcolatrice di esempio
└── leetcode/
    ├── TwoSum.java                             # Soluzioni Two Sum
    ├── LongestSubstringWithoutRepeatingCharacters.java  # Soluzioni Longest Substring
    └── LeetCodeTestRunner.java                 # Runner per tutti i test
```

## 🚀 Come Eseguire

### Prerequisiti

- Java 21+
- Maven 3.6+

### Esecuzione Locale

```bash
# Compila il progetto
mvn clean package

# Esegui l'applicazione
java -jar target/mio-progetto-java-1.0-SNAPSHOT.jar
```

### Esecuzione con Docker

```bash
# Build dell'immagine Docker
docker build -t mio-progetto-java .

# Esegui il container
docker run --rm mio-progetto-java
```

### Esecuzione con Docker Compose

```bash
# Esegui con docker-compose
docker-compose up --build
```

## 🧪 Test

Il progetto include test completi per tutte le soluzioni:

```bash
# Esegui i test Maven
mvn test

# Esegui l'applicazione per vedere i test LeetCode
mvn exec:java -Dexec.mainClass="com.esempio.App"
```

## 📊 Output di Esempio

```
🎯 LEETCODE SOLUTIONS - JAVA PROJECT
==================================================

📊 STATISTICHE SOLUZIONI LEETCODE
==================================================

🔢 PROBLEMA 1: Two Sum
  📝 Descrizione: Trova due numeri che sommati danno il target
  ⚡ Soluzione 1: Brute Force O(n²)
  🚀 Soluzione 2: HashMap O(n)
  🎯 Difficoltà: Easy

🔤 PROBLEMA 3: Longest Substring Without Repeating Characters
  📝 Descrizione: Trova la sottostringa più lunga senza caratteri ripetuti
  ⚡ Soluzione 1: Brute Force O(n³)
  🚀 Soluzione 2: Sliding Window O(n)
  🎯 Difficoltà: Medium

🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥 TWO SUM TESTS 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥

============================================================
🧪 TEST TWO SUM
📊 Array: [2, 7, 11, 15]
🎯 Target: 9
============================================================

1️⃣ BRUTE FORCE O(n²):
🔍 Soluzione Brute Force O(n²)
🔎 Controllando elemento 0 (valore: 2)
  ↳ Confrontando con elemento 1 (valore: 7)
✅ Trovata soluzione: 2 + 7 = 9
📤 Risultato: [0, 1]

2️⃣ HASHMAP O(n):
🚀 Soluzione Ottimizzata O(n) con HashMap
🔍 Elemento 0: 2, cerco complemento: 7
📝 Memorizzato: 2 -> indice 0
🔍 Elemento 1: 7, cerco complemento: 2
✅ Trovata soluzione: 7 + 2 = 9
📍 Indici: [0, 1]
📤 Risultato: [0, 1]

✅ Entrambe le soluzioni producono lo stesso risultato!
```

## 🔧 Tecnologie Utilizzate

- **Java 21** - Linguaggio di programmazione
- **Maven** - Gestione dipendenze e build
- **JUnit 4** - Framework di testing
- **Docker** - Containerizzazione
- **Docker Compose** - Orchestrazione container

## 📝 Note di Sviluppo

- Tutte le soluzioni sono completamente documentate
- Ogni algoritmo include analisi di complessità temporale e spaziale
- I test includono casi edge e validazione dei risultati
- Il codice è organizzato in classi separate per ogni problema
- Output dettagliato per debugging e comprensione

## 🤝 Contributi

Questo progetto è un esempio educativo per dimostrare:

- Implementazione di algoritmi LeetCode
- Best practices per organizzazione del codice Java
- Documentazione completa e commenti dettagliati
- Test automatizzati e validazione dei risultati

## 📄 Licenza

Progetto di esempio per scopi educativi.
