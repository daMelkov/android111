package com.astra.melkovhw111;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Task> initTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task (
                "MelkovHw51",
                "Записная книжка в SharedPreferences",
                "Одно из самых популярных приложений на телефон - это заметки. " +
                        "Давайте создадим свои собственные. Элементы приложения:\n" +
                        "\n" +
                        "- EditText с заметкой.\n" +
                        "- Кнопка “Сохранить” (при клике на нее, заметка сохраняется в SharedPreferences). " +
                        "При перезапуске приложения, если заметка ранее была сохранена, она отображается в EditText компоненте.",
                R.drawable.hw51)
        );
        tasks.add(new Task(
                "MelkovHw52",
                "AppBar приложения",
                "Навигация в приложении - очень важный атрибут качественного продукта. " +
                        "Объедините все предыдущие работы в единое приложение с помощью App-Bar с переходом на нужный экран приложения через меню AppBar-а.",
                R.drawable.hw52)
        );

        tasks.add(new Task(
                "MelkovHw61",
                "Калькулятор",
                "Разработать интерфейс калькулятора. Нужно сделать текстовое поле TextView и панель цифр калькулятора для ввода чисел.",
                R.drawable.hw61
        ));

        tasks.add(new Task(
                "MelkovHw62",
                "Действия калькулятора",
                "Разработать панель действий калькулятора. Нужно добавить в калькулятор действия:\n" +
                        "- сложение\n" +
                        "- множение\n" +
                        "- вычитание\n" +
                        "- деление\n" +
                        "- процент\n" +
                        "- получение результата (равно)\n" +
                        "- очистка поля (С)\n" +
                        "- смена знака\n" +
                        "Действия нужно разместить справа и сверху от блока цифр, для этого используйте RelativeLayout",
                R.drawable.hw62
        ));

        tasks.add(new Task(
                "MelkovHw71",
                "Цепочка текста",
                "ConstraintLayout предоставляет нам широкий набор инструментов графического оформления. " +
                        "Дополните свой калькулятор цепочкой текста с именем автора программы вокруг панели цифр.",
                R.drawable.hw71
        ));

        tasks.add(new Task(
                "MelkovHw72",
                "Инженерный вид калькулятора",
                "Нужно добавить инженерный вид калькулятора с помощью FrameLayout.",
                R.drawable.hw72
        ));

        tasks.add(new Task(
                "MelkovHw81",
                "Адаптивная горизонтально-вертикальная верстка",
                "Большинство приложений Android могут работать как в горизонтальном, так и в вертикальном виде. " +
                        "Для обеспечения этой возможности используется 2 набора файлов верстки для каждого вида соответственно. " +
                        "Переведите свой экран калькулятора на использование этой возможности. " +
                        "Создайте альтернативную верстку экрана калькулятора в соответствующей папке таким образом, " +
                        "чтобы элементы не пропадали с экрана и сохраняли гармоничное расположение.",
                R.drawable.hw81
        ));

        tasks.add(new Task(
                "MelkovHw82",
                "Страница переключения языка",
                "Если мобильное приложение выходит на международный рынок, ему нужна локализация под разные языки. " +
                        "Создайте страницу со следующими элементами:\n\n" +
                        "Spinner со списком языков - Русский и Английский. Кнопка ОК. " +
                        "По клику на данную кнопку - во всем приложении переключается язык. Добавьте текст на странице для отображения на английском и русском.",
                R.drawable.hw82
        ));

        tasks.add(new Task(
                "MelkovHw91",
                "Переключение цветов в приложении",
                "Среди пользователей приложений у всех разные вкусы. " +
                        "Хорошее приложение должно иметь варианты изменения дизайна под каждого пользователя.\n\n" +
                        "Возьмите домашнее задание “Переключение языка” из занятия 3.3. Добавьте на экран переключения языков следующие элементы:\n\n" +
                        "Spinner с выбором цветов — “черный, зеленый и синий”. " +
                        "Кнопка ОК — по клику на кнопку во всем приложении меняется цветовая тема. " +
                        "Необходимо создать 3 цветовых темы для приложения - в черных, зеленых или синих тонах, применяемых к цвету всех элементов.",
                R.drawable.hw91
        ));

        tasks.add(new Task(
                "MelkovHw92",
                "Переключение отступов в приложении",
                "Продолжаем работу над приложением из домашнего задания “Переключение языка”. " +
                        "Добавьте на экран переключения языков следующие элементы:\n\n" +
                        "- Spinner с выбором темы с разной политикой отступов — “крупная, средняя и мелкая”.\n" +
                        "- Кнопка ОК — по клику на кнопку во всем приложении меняется политика отступов.\n" +
                        "- Необходимо создать 3 темы для приложения соответственно политике отступов, " +
                        "применяемой ко всем элементам приложения. Крупная тема: с отступами 1dpi " +
                        "Средняя тема: с отступами 3dpi Мелкая тема: с отступами 10dpi",
                R.drawable.hw92
        ));

        tasks.add(new Task(
                "MelkovHw101",
                "Отображение списка",
                "Редкое приложение обходится без отображения списка. " +
                        "Это один из самых популярных компонентов в тестовых заданиях и очень популярный вопрос на собеседованиях.\n\n" +
                        "Задание: В этом домашнем задании дается стартовое приложение, которое показывает список строк простейшим образом. " +
                        "Вам нужно переписать его, используя класс SimpleAdapter и добавить подзаголовок.\n\n" +
                        "Пошаговый план действий:\n\n" +
                        "- Создать xml разметку для элемента списка с двумя текстовыми полями.\n" +
                        "- Из массива строк построить список словарей (List<Map<String, String>>), необходимый для использования SimpleAdapter.\n" +
                        "- Вместо ArrayAdapter в методе createAdapter создать SimpleAdapter и вернуть его из этого метода.\n" +
                        "- Использовать созданный адаптер в списке.",
                R.drawable.hw101
        ));

        return tasks;
    }
}
