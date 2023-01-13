package Ex002Phonebook.Core.MVP;
/**
 * Компонента View, осуществляет работу с данными в методах
 * получения и изменения полей - имени, фамилии, описания контакта
 */
public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    //
}
