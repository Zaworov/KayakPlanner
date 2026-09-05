INSERT INTO river_section (
    river_id,
    name,
    start_km,
    end_km,
    start_point_id,
    end_point_id,
    source,
    description
)
VALUES
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Jezioro Wieckie – Jezioro Fiszewo',
        195.0,
        187.3,
        NULL,
        NULL,
        'str. 9',
        'Skrajnie trudny odcinek przypominający miejscami wąski rów melioracyjny. Bujna roślinność i brak wody zmuszają do przeciągania kajaków[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Jezioro Fiszewo – Borowiec',
        187.3,
        184.0,
        NULL,
        NULL,
        'str. 9',
        'Spokojniejszy fragment o korycie poszerzającym się do 4 metrów, meandrujący rozległą łąkową doliną[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Borowiec – Jezioro Lubiszewskie',
        184.0,
        181.5,
        NULL,
        NULL,
        'str. 9',
        'Odcinek płynący w leśnym, malowniczym wąwozie o nieco szybszym nurcie[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Loryniec - Morze Kaszubskie',
        166.0,
        160.4,
        NULL,
        NULL,
        'Loryniec-Morze Kaszubskie',
        'Zmienny odcinek początkowo zalesiony z wartkim prądem, przechodzący w spokojną dolinę i kompleks jezior[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Jezioro Wdzydze—Borsk',
        152.1,
        150.0,
        NULL,
        NULL,
        'str. 13 Jezioro Wdzydze—Borsk',
        'Odcinek po opuszczeniu jeziora Wdzydze, łączący uregulowane fragmenty z rwącym korytem starorzecza[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Bąk-Wojtal',
        147.0,
        137.2,
        NULL,
        NULL,
        'Bąk-Wojtal',
        'Zróżnicowany fragment z dynamicznym nurtem, płyciznami, przenoską i bystrzami pod mostami[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Czarna Woda – Jastrzębie',
        130.0,
        130.0,
        NULL,
        NULL,
        'Wieck-Jastrzębie',
        'Etap poniżej Czarnej Wody, gdzie rzeka płynie szybko i dużymi zakolami przez wąską dolinę[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Zimne Zdroje – Czubek',
        123.0,
        117.0,
        NULL,
        NULL,
        'Zimne Zdroje—Czarne',
        'Odcinek o stopniowo zwalniającym nurcie wśród łagodniejących dolin i łąk[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Mały Bukowiec–Młynki',
        105.7,
        98.5,
        NULL,
        NULL,
        'str. 23 Mały Bukowiec–Młynki',
        'Odcinek z przenoską przy elektrowni, licznymi miejscami biwakowymi i spokojnym nurtem[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Kałębnica–Błędno',
        77.6,
        62.2,
        NULL,
        NULL,
        'str. 27',
        'Malowniczy odcinek prowadzący przez leśne doliny, głębokie jary i zakola[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Most w Żurawkach',
        52.0,
        50.0,
        NULL,
        NULL,
        'str. 29',
        'Dziki i wymagający fragment z głazami, szybkim nurtem i powalonym drzewem[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Stara Rzeka–Grzybek',
        50.0,
        38.0,
        NULL,
        NULL,
        'str. 31',
        'Spokojny odcinek prowadzący do Tlenia i Jeziora Żurskiego[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Żur–Gródek',
        34.5,
        23.2,
        NULL,
        NULL,
        'str. 33',
        'Odcinek przez kanały i jeziora zaporowe wymagający dwóch obowiązkowych przenosek[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Diabelski Kamień–Kozłowo',
        21.2,
        11.5,
        NULL,
        NULL,
        'str. 35',
        'Szybki i techniczny odcinek z bystrzami, głazami i rozlewiskiem przed zaporą[cite: 12].'
    ),
    (
        (SELECT id FROM river WHERE name='Wda'),
        'Świecie–Ujście Wdy',
        8.0,
        0.0,
        NULL,
        NULL,
        'str. 37',
        'Końcowy odcinek przez Świecie do ujścia Wisły z przenoską przy dawnych zastawach[cite: 12].'
    );