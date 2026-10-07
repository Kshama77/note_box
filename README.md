# NoteBox

NoteBox is a simple Java console application for creating, viewing, editing, and deleting personal notes.

This project is designed for beginners who want to practice basic Java programming and CRUD operations.

## Features

- Create a note
- View all notes
- Edit an existing note
- Delete a note
- Simple menu-driven interface
- Input validation for menu choices
- Uses Java `ArrayList` to store notes

## Java Concepts Used

- Classes and objects
- Constructors
- Encapsulation
- Private fields
- Getters and setters
- `ArrayList`
- Loops
- `if` statements
- `switch`
- Methods
- `Scanner`
- Exception handling
- Basic CRUD operations

## Project Structure

```text
NoteBox/
├── NoteBox.java
├── Note.java
└── README.md
```

## How to Run

### 1. Check Java

Make sure Java is installed:

```bash
java -version
javac -version
```

Java 17 or newer is recommended.

### 2. Open the project folder

```bash
cd NoteBox
```

### 3. Compile

```bash
javac Note.java NoteBox.java
```

### 4. Run

```bash
java NoteBox
```

## Example

```text
================================
        Welcome to NoteBox
================================

----------- MENU -----------
1. Create Note
2. View Notes
3. Edit Note
4. Delete Note
5. Exit
----------------------------
Choose an option: 1

--- Create Note ---
Enter title: My Goals
Enter content: Practice Java every day
Note created successfully!
```

## Important Note

This beginner version stores notes only while the program is running.

When the application is closed, the notes are removed because no database or file storage is used.

A future version could add:

- File storage
- MySQL database
- Search notes
- Note categories
- Dates and timestamps
- Spring Boot REST API
- React frontend

## GitHub

After downloading and extracting the project:

```bash
git init
git add .
git commit -m "Create NoteBox Java app"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```

## License

This project is for learning and practice purposes.
