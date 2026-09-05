INSERT INTO point_of_interest (
    river_id,
    name,
    category,
    river_km,
    description,
    source,
    latitude,
    longitude
)
VALUES
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Kanał Wdy',
        'WATERWAY_BRANCH',
        NULL,
        'Sztuczne odgałęzienie rzeki rozpoczynające się poniżej jeziora Wdzydze[cite: 14].',
        'str. 5 Informacje podstawowe',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Bory Tucholskie',
        'FOREST_COMPLEX',
        NULL,
        'Drugi co do wielkości kompleks leśny w kraju, pełen jezior rynnowych i ostoi rzadkich ptaków[cite: 14].',
        'str. 5-6 Informacje podstawowe',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Wdzydzki Park Krajobrazowy',
        'NATURE_RESERVE',
        NULL,
        'Chroniony obszar krajobrazowy utworzony na szlaku turystycznym Wdy[cite: 14].',
        'str. 6 Informacje podstawowe',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Wdecki Park Krajobrazowy',
        'NATURE_RESERVE',
        NULL,
        'Park krajobrazowy chroniący atrakcyjne przyrodniczo tereny wokół rzeki[cite: 14].',
        'str. 6 Informacje podstawowe',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Jezioro Żurskie',
        'ARTIFICIAL_LAKE',
        NULL,
        'Duży, sztuczny zbiornik zaporowy o powierzchni 440 hektarów[cite: 14].',
        'str. 7',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Rezerwat „Brzęki” im. Zygmunta Czubińskiego',
        'NATURE_RESERVE',
        NULL,
        'Leśny obszar chroniony ze stanowiskiem jarząbu brekinii[cite: 14].',
        'str. 7',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Jezioro Wieckie',
        'LAKE',
        NULL,
        'Akwen o powierzchni 92 ha i głębokości do 10,2 m, gdzie przed wojną przebiegała granica[cite: 14].',
        'str. 9',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Dwór w Jabłuszku',
        'HISTORICAL',
        NULL,
        'Stary, kryty strzechą drewniany dwór należący od ponad 500 lat do rodu Borzyszkowskich[cite: 14].',
        'str. 9',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Kaszubski Park Etnograficzny we Wdzydzach Kiszewskich',
        'HISTORICAL',
        NULL,
        'Skansen z ponad trzydziestoma zabytkowymi budowlami drewnianymi z Kaszub i Kociewia[cite: 14].',
        'Loryniec-Morze Kaszubskie',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Rezerwat przyrody „Kręgi Kamienne” w Odrach',
        'ARCHAEOLOGICAL',
        NULL,
        'Unikalne cmentarzysko Gotów i Gepidów z 10 koncentrycznymi kręgami z głazów[cite: 14].',
        'Bąk-Wojtal',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Diabelski Kamień',
        'NATURE',
        21.2,
        'Największy głaz narzutowy Pomorza i pomnik przyrody[cite: 14].',
        'str. 35',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Zamek w Świeciu',
        'HISTORICAL',
        6.3,
        'Ruiny średniowiecznego zamku krzyżackiego u zbiegu Wdy i Wisły[cite: 14].',
        'str. 37',
        NULL,
        NULL
    );