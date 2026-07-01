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
        (SELECT id FROM river WHERE name='Brda'),
        'Rezerwat Bagnisko Niedźwiady',
        'NATURE_RESERVE',
        212.5,
        'Ochronny sosnowy bór bagienny obejmujący rozwinięte torfowiska śródleśne oraz cenne ptasie miejsca lęgowe.',
        'str. 11 Stara Brda Pilska–Żołna',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Cmentarz w Nowej Brdzie',
        'HISTORICAL_SITE',
        208.0,
        'Zabytkowe pozostałości dawnego cmentarza, na którym znajduje się grób rodziny Nehringów, założycieli XVII-wiecznej papierni.',
        'str. 13 Nowa Brda–most Wojciecha',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Wielki Kanał Brdy',
        'HYDRO_INFRASTRUCTURE',
        129.0,
        'Imponujący, pruski zabytek hydrotechniczny wzniesiony w 1849 roku. Pełni funkcję alternatywnego szlaku spływu biegnącego równolegle do rzeki.',
        'str. 27 Męcikał–Mylof',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Zabytkowa chałupa szachulcowa',
        'HISTORICAL_SITE',
        NULL,
        'Licząca blisko 280 lat drewniana chata o konstrukcji szachulcowej zlokalizowana w Świeszynie.',
        'Świeszyno–Trzyniec',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Źródliskowy Obszar Brdy',
        'LANDSCAPE_PARK',
        233.0,
        'Pagórkowaty obszar krajobrazu chronionego otaczający rynnowe Jezioro Pietrzykowskie Duże.',
        'Świeszyno–Trzyniec',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Groby właścicieli majątku',
        'HISTORICAL_SITE',
        221.8,
        'Historyczne miejsce pochówku dawnych właścicieli ziemskich. Znajduje się na zalesionym wzgórzu, po prawej stronie nurtu.',
        'Stara Brda Pilska–Żołna',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Pozostałości XIX-wiecznej huty szkła',
        'HISTORICAL_SITE',
        217.0,
        'Ruiny huty wybudowanej w 1859 r. w zakolu rzeki. W miejscu dawnego dworu właściciela postawiono szkołę.',
        'Stara Brda Pilska–Żołna',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Rezerwat Przytoń',
        'NATURE_RESERVE',
        202.0,
        'Obszar ochronny starych zbiorowisk leśnych, z przewagą buka (18,05 ha). Ostoja wydr i bobrów.',
        'Nowa Brda–most Wojciecha',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Zaborski Park Krajobrazowy',
        'LANDSCAPE_PARK',
        164.0,
        'Rezerwat urozmaicony wzgórzami, lasami i jeziorami. Bytuje tu ogromna ilość gatunków ptaków i porostów.',
        'str. 19 Konarzyny–Jezioro Charzykowskie',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Park Narodowy Bory Tucholskie',
        'NATIONAL_PARK',
        NULL,
        'Powołany do ochrony unikalnych jezior lobeliowych i torfowisk. Obszar niemal bezludny, o bardzo wysokiej wartości krajobrazowej.',
        'str. 21 Park Narodowy Bory Tucholskie',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Akwedukt w Fojutowie',
        'HYDRO_INFRASTRUCTURE',
        107.5,
        'Zabytek sztuki inżynieryjnej. Jest to miejsce rzadkiego krzyżowania się rzeki z kanałem poprowadzonym górą po akwedukcie.',
        'str. 31 Lutom–Woziwoda',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Zabytkowa śluza miejska',
        'HISTORICAL_SITE',
        11.5,
        'Ponad stuletnia infrastruktura włączająca Brdę do wschodni-zachodniego sytemu komunikacji Kanałem Bydgoskim.',
        'str. 45 Bydgoszcz',
        NULL,
        NULL
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Tor regatowy',
        'SPORT_INFRASTRUCTURE',
        1.5,
        'Powstały na początku XX wieku profesjonalny kanał wioślarski o długości niemal 2 kilometrów wyposażony w zaplecze.',
        'str. 47 Bydgoszcz',
        NULL,
        NULL
    );