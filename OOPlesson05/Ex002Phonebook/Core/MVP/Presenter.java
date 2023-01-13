package Ex002Phonebook.Core.MVP;
import Ex002Phonebook.Core.Models.Contact;
/**
 * Компонента Presenter, который знает что будет работать с View и Model 
 */
public class Presenter {
    
    private Model model;
    private View view;    
    /**
     * Конструктор принимает компоненты View и Model(pathDb) и передает их 
     * @param view
     * @param pathDb
     */ public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }
/**
 * загрузка данных через Model
 */
    public void LoadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }
/**
 * Добавление контакта в текущ книгу
 */
    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }
/**
 * Метод удаления контакта
 */
    public void remove() {
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }
/**
 * Сохранение
 */
    public void saveToFile() {
        model.save();
    }
/**
 * Переключение к след записи
 */
    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);                
            }
        }
    }
/**
 * Переключение к предидущ записи
 */
    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);  
            }
        }
    }
}
