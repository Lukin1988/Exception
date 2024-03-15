
// Клас із винятком, який ми збираємось прокинути
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Клас із методами, що використовують ключові слова для обробки винятків
public class ExceptionExample {
    // Метод, який може викинути виняток
    public static void generateException() throws CustomException {
        throw new CustomException("Виключення сгенеровано");
    }

    // Метод, який обробляє винятки
    public static void handleException() {
        try {
            generateException();
        } catch (CustomException e) {
            System.out.println("Перехвачено виключення: " + e.getMessage());
        } finally {
            System.out.println("Блок finally завжди виконуеться,");
        }
    }

    // Метод, який викидає винятки
    public static void throwException() throws CustomException {
        throw new CustomException("Виклчюення");
    }

    // Наш  улюблений main
    public static void main(String[] args) {
        handleException(); // Викликаемо метод, що оброблюе вийнятки
        try {
            throwException(); // Викликаемо метод, що викидуе вийнтяки
        } catch (CustomException e) {
            System.out.println("Перехватили виключення: " + e.getMessage());
        }
    }
}
