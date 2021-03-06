package com.example.lab3.News

import com.example.lab3.R

fun newsList(): Array<News>{
    return arrayOf(
            News(
                    head= "Samsung представила игровые Mini-LED мониторы Odyssey, телевизоры Neo QLED и огромные micro-LED панели",
                    date = "вчера в 20:38",
                    cut = "Samsung провела онлайн-презентацию, посвящённую дисплеям, на которой представила обновления линеек мониторов и ТВ на 2021 год. Мы выбрали из анонсов главное.",
                    image = R.drawable.news1 ,
                    fullText = "Neo-QLED представляет собой уже привычную QLED-панель с основой из VA-матрицы и цветовым фильтром из квантовых точек, но с новым типом подсветки — Mini-LED. За матрицей расположены тысячи миниатюрных светодиодов, каждый из которых в 40 раз меньше тех, что применялись в телевизорах прошлых лет.\n" +
                            "\n" +
                            "«Ковровая» Mini-LED подсветка разделена на множество зон, яркость которых регулируется отдельно, поэтому телевизор может отображать HDR-картинку одновременно с очень ярким светом и очень глубоким чёрным цветом. Зонирование подсветки существовало и ранее, но теперь зоны стали меньше, что помогает избавиться от эффекта белёсых «ореолов» вокруг ярких объектов на тёмном фоне, которые возникали из--за того, что зона подсветки была намного крупнее, чем отображаемый объект.\n" +
                            "\n"+
                            "Neo-QLED уже поступили в продажу в США:\n" +
                            " • QN85A (4К) поставляются с диагоналями 55, 65, 75 и 85 дюймов по цене от 1,6 тысячи долларов (от 118 тысяч рублей без учёта налогов);\n" +
                            " • QN90A (4К) — с диагоналями 50, 55, 65, 75 и 85 дюймов стоят от 1,8 тысячи до 5 тысяч долларов (133–370 тысяч рублей без учёта налогов);\n" +
                            " • QN800A (8K) — 65, 75 или 85 дюймов, от 3,5 до 6,5 тысяч долларов (258-480 тысяч рублей по курсу);\n" +
                            " • QN900A (8K) — 65, 75 или 85 дюймов, от 5 до 9 тысяч долларов (370-665 тысяч рублей по курсу).\n" +
                            "\n" +
                            "4К-модели отличаются друг от друга дизайном и количеством динамиков — обе модели оснащаются HDMI 2.1, имеют частоту 120 Гц, задержку ввода 5,8 мс и поддержку VRR FreeSync Premium Pro."
            ),
            News(
                    head= "Microsoft представила Mesh - сервис-среду дополненной реальности для общения и взаимодействия людей",
                    date = "50 минут назад",
                    cut = "Корпорация планирует создать \"новое слово в виртуальной реальности\" на основе платформы, которую уже прозвали Teams из будущего.",
                    image = R.drawable.news2,
                    fullText = "В рамках Ignite — конференции VR/AR разработчиков, которую проводит сама Microsoft, редмондская корпорация показала новый продукт: платформу для удобного создания дополненной реальности под названием Mesh. Создатели описывают её не иначе, как «уникальную среду для виртуальной и дополненной реальности, созданную и развивающуюся на основе мощностей Azure, и в которой будет возможно симулировать присутствие другого человека на огромном перечне устройств».\n" +
                            "\n" +
                            "Проще говоря, в Mesh будет создана полноценная возможность большому количеству людей одновременно видеть друг друга и взаимодействовать в виртуальном пространстве или же при помощи AR-наложения на реальный фон. Это стало возможно благодаря объединению технологий Microsoft Azure (Azure Spatial Anchors, Azure Object Anchors, Azure Rendering) и компонентов, выкупленных у других компаний, вроде AltspaceVR.\n" +
                            "\n" +
                            "На конференции компания вновь продемонстрировала Holoportation — технологию, которая позволяет перемещать в виртуальную или дополненную реальность небольшие пространства со всеми объектами и людьми в ней.\n" +
                            "\n" +
                            "MS Research трудится над ней уже много лет уже много лет, впервые её показали ещё в 2016 году, но с тех пор крупных новостей о ней не появлялось. На запуске Mesh Holoportation доступна не будет — по словам инженеров, им нужно ещё какое-то время для тестирования."
            ),
            News(
                    head= "The Last of Us Part II стала лидером по числу номинаций на BAFTA Games Awards 2021",
                    date = "вчера в 14:28",
                    cut = "Организаторы BAFTA Games Awards опубликовали полный список номинантов на свою премию. Церемония вручения наград пройдёт 25 марта в онлайн-формате.",
                    image = R.drawable.news3,
                    fullText = "The Last of Us Part II стала рекордсменом по числу номинаций за всю историю BAFTA — как отметил THR, ранее ни одна игра не была представлена сразу в 13 номинациях BAFTA Games Awards.\n" +
                            "\n" +
                            "Ghost of Tsushima представлена в десяти номинациях, Hades в восьми, а Spider-Man: Miles Morales и Dreams удостоились семи номинаций. Кроме ААА в список вошли и небольшие тайтлы вроде Fall Guys — аркада представлена в пяти категориях. Cyberpunk 2077 получила четыре номинации, но на главную награду RPG не претендует.\n" +
                            "\n" +
                            "В 2021 году впервые появится отдельная категория «Игры года», в которой могут голосовать только пользователи."
            ),
            News(
                    head= "Blasphemous преодолела отметку в миллион игроков",
                    date = "вчера в 14:14",
                    cut = "Разработчики из студии The Game Kitchen, которая выпустила Blasphemous, объявили о миллионе проданных копий игры в специальном видео.",
                    image = R.drawable.news4,
                    fullText = "В нём можно увидеть, как команда празднует своё достижение — сотрудникам разослали специальный плакат в массивной рамке, на котором написано, что в Blasphemous сыграл уже миллион человек.\n" +
                            "\n" +
                            "Blasphemous — экшн-платформер, который рассказывает о человеке по прозвищу Кающийся. Попав в цикл смерти и возрождения, он пытается спасти свой мир от проклятия.\n" +
                            "\n" +
                            "Игра вышла 10 сентября 2019 года на ПК, PS4, Xbox One и Nintendo Switch. В феврале 2021-го Blasphemous получила бесплатное DLC, которое добавило в игру кроссовер с Bloodstained: Ritual of the Night."
            ),
            News(
                    head= "Sony прекратит продавать и сдавать в прокат фильмы и сериалы в PS Store с 31 августа",
                    date = "вчера в 16:17",
                    cut = "Компания объяснила это изменениями в поведении потребителей — теперь они предпочитают смотреть кино и телешоу в стриминговых сервисах.",
                    image = R.drawable.news5,
                    fullText = "О том, что с 31 августа 2021 года фильмы и сериалы нельзя будет купить или взять в прокат в PS Store, Sony объявила в блоге PlayStation. Компания отметила, что учитывает интересы потребителей и потому, заметив рост использования стриминговых сервисов для просмотра кино на консолях, решила прекратить продажу и прокат фильмов и телешоу по отдельности.\n" +
                            "\n" +
                            "Sony отметила, что все, кто уже приобрёл кино в PS Store, сохранят к нему доступ на PS4, PS5 и мобильных устройствах с приложением PS Video."
            ),
            News(
                    head= "В Nioh 2 на ПК добавили правильные подсказки для игры на клавиатуре и мыши",
                    date = "вчера в 13:30",
                    cut = "Почти через месяц после выхода ПК-версии.",
                    image = R.drawable.news6,
                    fullText = "Team Ninja выпустила патч 1.27 для ПК-версии Nioh 2, в котором скорректировала подсказки. Изначально вместо того, чтобы рекомендовать нужные клавиши на клавиатуре и мыши, игра показывала комбинации для контроллеров. Игроки массово критиковали эту ошибку и называли её одним из главных недостатков ПК-версии Nioh 2.\n" +
                            "\n" +
                            "После обновления в Nioh 2 на ПК появились отдельные значки для подсказок при использовании клавиатуры и мыши. Выбрать эти значки можно в меню настроек управления.\n" +
                            "\n" +
                            "Патч 1.27 также исправил ряд ошибок в ПК-версии Nioh 2, в том числе связанных с производительностью. В частности, устранена проблема, из-за которой частота кадров могла постепенно снижаться при высоком значении параметра «Качество эффекта». Разработчики вдобавок устранили баг, который приводил к тому, что тени в катсценах пропадали после отключения теней в игре.\n" +
                            "\n" +
                            "Nioh 2 вышла 13 марта 2020 года на PS4, а 5 февраля 2021-го — на PS5 и ПК. 18 февраля игра получила поддержку DLSS."
            ),
            News(
                    head= "F1 | Презентация Alpine A521",
                    date = "вчера в 19:24",
                    cut = "Alpine F1 представили свой новый болид - Alpine A521",
                    image = R.drawable.news7,
                    fullText = "Некоторые технические характеристики болида Alpine A521:\n" +
                            "\n" +
                            "Двигатель RENAULT E-TECH 21 - 1.6L V6, более 950 лошадиных сил на борту.\n" +
                            "\n" +
                            "Длина - 5425MM, ширина - 2000MM, высота - 950MM.\n" +
                            "\n" +
                            "Вес 753KG - со всем оборудованием и пилотом."
            ),
            News(
                    head= "Roguelite-платформер ScourgeBringer выйдет на PS4 и PS Vita 22 апреля",
                    date = "вчера в 19:16",
                    cut = "Издатель Dear Villagers объявил в Твиттере о том, что платформер ScourgeBringer от французкой студии Flying Oak Games выйдет на PlayStation 4 и PlayStation Vita уже 22 апреля.",
                    image = R.drawable.news8,
                    fullText = "Издательство Dear Villagers и разработчики из студии Flying Oak Games объявили, что пиксельный боевик с элементами рогалика ScourgeBringer выйдет на PlayStation 4 и PlayStation Vita уже 22 апреля.\n" +
                            "\n" +
                            "Изначально ScourgeBringer вышла в раннем доступе Steam в феврале 2020 года, а полноценный релиз состоялся в октябре того же года на Xbox One, Nintendo Switch и PC. Также игра доступна подписчикам Xbox Game Pass."
            ),
            News(
                    head= "Total Film: новые кадры из «Годзилла против Конга»",
                    date = "вчера в 18:10",
                    cut = "Фильм выйдет 26 марта 2021 года одновременно в кинотеатрах и в стриминговом сервисе HBO Max.",
                    image = R.drawable.news9,
                    fullText = "«Годзилла против Конга» — фильм-кроссовер, в котором столкнутся обезьяна Конг из «Острова Черепа» 2017 года и кайдзю Годзилла из блокбастера Гарета Эдвардса, который вышел в 2014 году.\n" +
                            "\n" +
                            "Режиссёром «Годзиллы против Конга» выступил Адам Вингард, который поставил триллер «Гость», хоррор «Ведьма из Блэр: Новая глава» и экранизацию «Тетради смерти», которая вышла на Netflix.\n" +
                            "\n" +
                            "Главные роли в предстоящем фильме исполнили Александр Скарсгард («Настоящая кровь», «Меланхолия»), Милли Бобби Браун («Очень странные дела»), Ребекка Холл («Вики Кристина Барселона»), Брайан Тайри Генри («Атланта»), Сюн Огури («Гинтама») и Эйса Гонсалес («Малыш на драйве»)."
            ),
            News(
                    head= "Ratchet and Clank стала бесплатной в PS Store в рамках программы Play at Home",
                    date = "вчера в 07:14",
                    cut = "Игру можно забрать до конца марта — она навсегда останется в библиотеке.",
                    image = R.drawable.news10,
                    fullText = "Инициативу Play at Home представили в 2020 году, раздав Journey и сборник Uncharted. Теперь Sony возобновила её, начав с Ratchet & Clank."
            )
    )
}