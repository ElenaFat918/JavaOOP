package Ex002Phonebook.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Ex002Phonebook.Core.Infrastructure.Phonebook;
import Ex002Phonebook.Core.Models.Contact;
/**
 * Модель работает с тел книгой
 */
public class Model {

    Phonebook currentBook; // Текущ книга
    private int currentIndex; //Условный индекс контакта на который смотрим
    private String path; // Путь к БД
    /**
     * Конструктор работает с БД, к которой передается путь
     * @param path
     */
    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }
    /**
     * Получение текущего контакта по текущему индексу
     * @return
     */
    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact(currentIndex);
        } else {
            // ???...
            return null;
        }
    }
/**
 * Загрузка данных контакта
 */
    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
 * Сохранение данных контакта
 */
    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
/**
 * Получение всей тел книжки
 * @return
 */
    public Phonebook currentBook() {
        return this.currentBook;
    }
/**
 * Получение текущ индекса
 * @return
 */
    public int getCurrentIndex() {
        return this.currentIndex;
    }
    /**
     * Изменение текущ индекса
     * @param value
     */
    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}