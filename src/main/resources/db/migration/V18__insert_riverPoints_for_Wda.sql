DELETE FROM river_point
WHERE river_id = (SELECT id FROM river WHERE name='Wda');

INSERT INTO river_point (
    name,
    type,
    river_id,
    river_km,
    river_order,
    latitude,
    longitude,
    description
)
VALUES
    (
        'Jezioro Krążno',
        'START',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        1,
        NULL,
        NULL,
        'Punkt początkowy szlaku Wdy zlokalizowany na wysokości 160 m n.p.m. na Równinie Charzykowskiej[cite: 11].'
    ),
    (
        'Tleń',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        2,
        NULL,
        NULL,
        'Miejscowość, poniżej której Wda wpływa na Wysoczyznę Świecką[cite: 11].'
    ),
    (
        'Czarna Woda',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        3,
        NULL,
        NULL,
        'Miejscowość, w której zarejestrowano średnią letnią temperaturę wody o godz. 7.00 na poziomie 13,5 stopnia Celsjusza[cite: 11].'
    ),
    (
        'Świecie',
        'END',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        4,
        NULL,
        NULL,
        'Koniec szlaku i miejsce ujścia Wdy do Wisły, zlokalizowane w Dolinie Fordońskiej na wysokości około 23 m n.p.m.[cite: 11].'
    ),
    (
        'Szczerkowo',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        5,
        NULL,
        NULL,
        'Miejscowość na szlaku, w sąsiedztwie której znajduje się rezerwat przyrody[cite: 11].'
    ),
    (
        'Lipusz',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        6,
        NULL,
        NULL,
        'Miejscowość, w której zazwyczaj rozpoczyna się najpopularniejszy odcinek spływu rzeką[cite: 11].'
    ),
    (
        'Śluza',
        'START',
        (SELECT id FROM river WHERE name='Wda'),
        195.0,
        7,
        NULL,
        NULL,
        'Wieś polecana jako dogodny punkt do rozpoczęcia spływu obok mostu i śluzy (tuż za wypływem z Jeziora Wieckiego)[cite: 11].'
    ),
    (
        'Jabłuszko',
        'START',
        (SELECT id FROM river WHERE name='Wda'),
        195.0,
        8,
        NULL,
        NULL,
        'Osada na południowym krańcu Jeziora Wieckiego, polecana jako doskonałe miejsce do rozpoczęcia spływu kajakowego[cite: 11].'
    ),
    (
        'Fiszewo',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        187.3,
        9,
        NULL,
        NULL,
        'Miejscowość widoczna po lewej stronie, zlokalizowana przy jeziorze o tej samej nazwie[cite: 11].'
    ),
    (
        'Imielina',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        10,
        NULL,
        NULL,
        'Zabudowania wsi mijane po prawej stronie na wysokości jeziora Fiszewo[cite: 11].'
    ),
    (
        'Skwierawy',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        11,
        NULL,
        NULL,
        'Duża wieś, której zabudowania można dostrzec w oddali po lewej stronie rzeki, za mostami w pobliżu jeziora Fiszewo[cite: 11].'
    ),
    (
        'Borowiec',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        184.0,
        12,
        NULL,
        NULL,
        'Niewielka miejscowość zagubiona pośród lasów, poniżej której nurt rzeki zaczyna przyspieszać[cite: 11].'
    ),
    (
        'Papiernia',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        181.0,
        13,
        NULL,
        NULL,
        'Lokalizacja z mostem na trasie Lipusz-Sulęczyno oraz stawem młyńskim z ruinami dawnego młyna, gdzie konieczna jest przenoska[cite: 11].'
    ),
    (
        'Pole biwakowe z ujściem dopływu',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        14,
        NULL,
        NULL,
        'Miejsce biwakowe na lewym brzegu zlokalizowane przy szerokim ujściu bocznego dopływu. Kajakarze mogą stąd popłynąć pod prąd do pobliskich jezior[cite: 11].'
    ),
    (
        'Gminne pole biwakowe w Lipuszu',
        'START',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        15,
        NULL,
        NULL,
        'Rozległy, choć skromnie zagospodarowany teren gminny po prawej stronie brzegu, bezpośrednio za mostkiem. Rekomendowane miejsce do rozpoczęcia spływu[cite: 11].'
    ),
    (
        'Krugliniec',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        16,
        NULL,
        NULL,
        'Punkt orientacyjny na rzece. Odcinek prowadzący do tego miejsca charakteryzuje się bystrym nurtem[cite: 11].'
    ),
    (
        'Płocice',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        173.0,
        17,
        NULL,
        NULL,
        'Miejscowość na trasie spływu, gdzie Wda płynie wśród łąk i mija lokalny most[cite: 11].'
    ),
    (
        'Szwedzki Ostrów',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        171.5,
        18,
        NULL,
        NULL,
        'Osada w sąsiedztwie rzeki, przy której znajduje się most drewniany[cite: 11].'
    ),
    (
        'Pole biwakowe nad Jeziorem Schodno',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        19,
        NULL,
        NULL,
        'Miejsce kempingowe usytuowane w lesie na piaszczystym brzegu pod koniec Jeziora Schodno[cite: 11].'
    ),
    (
        'Loryniec',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        166.0,
        20,
        NULL,
        NULL,
        'Miejscowość, w której rzeka przyspiesza. W pobliżu znajdują się sklepy umożliwiające uzupełnienie prowiantu[cite: 11].'
    ),
    (
        'Sklepy w Loryńcu',
        'FOOD',
        (SELECT id FROM river WHERE name='Wda'),
        166.0,
        21,
        NULL,
        NULL,
        'Punkty zaopatrzeniowe zlokalizowane blisko rzeki po jej lewej stronie[cite: 11].'
    ),
    (
        'Czarlina',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        163.0,
        22,
        NULL,
        NULL,
        'Miejscowość, za którą prąd rzeki zwalnia, a dolina ulega rozszerzeniu odsłaniając łąki[cite: 11].'
    ),
    (
        'Rybakówka i rozwidlenie',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        23,
        NULL,
        NULL,
        'Punkt orientacyjny, przy którym rzeka skręca w kierunku południowym, formując przesmyk[cite: 11].'
    ),
    (
        'Jezioro Radolne',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        160.4,
        24,
        NULL,
        NULL,
        'Akwen wodny mijany na trasie głównego szlaku, usytuowany za mostem drogowym[cite: 11].'
    ),
    (
        'Pole biwakowe nad Jeziorem Radolnym',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        25,
        NULL,
        NULL,
        'Teren przygotowany do noclegu w lesie, znajdujący się w zachodniej zatoce Jeziora Radolnego[cite: 11].'
    ),
    (
        'Wdzydze Kiszewskie',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        26,
        NULL,
        NULL,
        'Popularna wieś turystyczna nad jeziorem Gołuń z bogatą infrastrukturą handlową i noclegową[cite: 11].'
    ),
    (
        'Stanica wodna PTTK we Wdzydzach Kiszewskich',
        'CAMP',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        27,
        NULL,
        NULL,
        'Obiekt oferujący zaplecze i obsługę dla wodniaków zwiedzających okoliczne jeziora[cite: 11].'
    ),
    (
        'Borsk',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        28,
        NULL,
        NULL,
        'Wieś usytuowana za ostatnią z wysp, na południowo-wschodnim brzegu jeziora z ośrodkami wczasowymi[cite: 11].'
    ),
    (
        'Pole biwakowe z barem przy starorzeczu',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        29,
        NULL,
        NULL,
        'Wygodne miejsce noclegowe oferujące smaczne i tanie posiłki w pobliżu dawnego domku strażnika kanałowego[cite: 11].'
    ),
    (
        'Bąk',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        147.0,
        30,
        NULL,
        NULL,
        'Wieś mijana po lewej stronie rzeki obok mostu, z dostępem do sklepów[cite: 11].'
    ),
    (
        'Miedzno',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        142.5,
        31,
        NULL,
        NULL,
        'Miejscowość na lewym brzegu z polem biwakowym usytuowanym na leśnej skarpie[cite: 11].'
    ),
    (
        'Leśnictwo Grzybno',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        32,
        NULL,
        NULL,
        'Kompleks budynków leśnictwa stojących w miejscu ujścia kanału[cite: 11].'
    ),
    (
        'Wojtal',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        139.5,
        33,
        NULL,
        NULL,
        'Osada z ośrodkiem hodowli ryb, oferująca możliwość zakupu świeżych pstrągów i karpi[cite: 11].'
    ),
    (
        'Ujście strug z jeziora Skrzynki Małe i Studzienickiej Strugi',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        34,
        NULL,
        NULL,
        'Punkt zbiegu wód jeziora Skrzynki Małe oraz Studzienickiej Strugi[cite: 11].'
    ),
    (
        'Wieck',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        35,
        NULL,
        NULL,
        'Wieś z leśnym polem biwakowym na skarpie przy Jeziorze Wieckim[cite: 11].'
    ),
    (
        'Klonowice',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        36,
        NULL,
        NULL,
        'Miejscowość położona za ujściem strugi, przez którą przebiega betonowy most drogowy[cite: 11].'
    ),
    (
        'Złe Mięso',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        37,
        NULL,
        NULL,
        'Miejscowość powiązana z lokalną legendą o dawnej karczmie[cite: 11].'
    ),
    (
        'Jastrzębie',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        38,
        NULL,
        NULL,
        'Wieś na szlaku z kładką pieszą[cite: 11].'
    ),
    (
        'Zimne Zdroje',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        123.0,
        39,
        NULL,
        NULL,
        'Miejscowość, w której rzeka przepływa pod mostem drogowym[cite: 11].'
    ),
    (
        'Parcele (pole biwakowe Tadonka)',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        120.5,
        40,
        NULL,
        NULL,
        'Punkt biwakowy położony poniżej ujścia Zbylewskiej Strugi[cite: 11].'
    ),
    (
        'Klaniny',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        41,
        NULL,
        NULL,
        'Wieś z zabudowaniami widocznymi z prawego brzegu rzeki[cite: 11].'
    ),
    (
        'Huta Kalna',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        42,
        NULL,
        NULL,
        'Miejscowość z widoczną sylwetką zabytkowego kościoła z XVII wieku[cite: 11].'
    ),
    (
        'Czubek',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        117.0,
        43,
        NULL,
        NULL,
        'Leśnictwo z wiekowymi drzewami oraz polem biwakowym ze sklepem i barem[cite: 11].'
    ),
    (
        'Mały Bukowiec',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        105.7,
        44,
        NULL,
        NULL,
        'Pole biwakowe przy moście na trasie Borzechowo–Osowo Leśne[cite: 11].'
    ),
    (
        'Młynki',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        98.5,
        45,
        NULL,
        NULL,
        'Duże zagospodarowane pole biwakowe przy moście na trasie Lubichowo–Ocypel[cite: 11].'
    ),
    (
        'Wieś Wda',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        87.0,
        46,
        NULL,
        NULL,
        'Miejscowość z mostem drogowym, sklepem i polem biwakowym[cite: 11].'
    ),
    (
        'Pole biwakowe Wda',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        87.0,
        47,
        NULL,
        NULL,
        'Pole biwakowe po lewej stronie na obrzeżach miejscowości[cite: 11].'
    ),
    (
        'Wdecki Młyn',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        85.0,
        48,
        NULL,
        NULL,
        'Miejscowość z elektrownią wodną, leśnictwem i polem biwakowym[cite: 11].'
    ),
    (
        'Pole biwakowe Wdecki Młyn',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        84.8,
        49,
        NULL,
        NULL,
        'Pole biwakowe przy leśnictwie około 200 m za elektrownią[cite: 11].'
    ),
    (
        'Smolniki',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        81.0,
        50,
        NULL,
        NULL,
        'Wieś ze sklepem spożywczym[cite: 11].'
    ),
    (
        'Ujście Kałębnicy',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        77.6,
        51,
        NULL,
        NULL,
        'Ujście dopływu Kałębnicy z możliwością wpłynięcia na Jezioro Słone[cite: 11].'
    ),
    (
        'Żurawki',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        75.0,
        52,
        NULL,
        NULL,
        'Pole biwakowe przy moście z utrudnionym podejściem przez wysoką skarpę[cite: 11].'
    ),
    (
        'Łuby',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        69.0,
        53,
        NULL,
        NULL,
        'Wieś położona na wysokim brzegu rzeki[cite: 11].'
    ),
    (
        'Błędno',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        62.2,
        54,
        NULL,
        NULL,
        'Leśna osada przy moście drogowym oraz wejściu do Wdeckiego Parku Krajobrazowego[cite: 11].'
    ),
    (
        'Pole biwakowe Błędno',
        'CAMPING',
        (SELECT id FROM river WHERE name='Wda'),
        62.0,
        55,
        NULL,
        NULL,
        'Pole biwakowe po prawej stronie około 200 m za Błędnem[cite: 11].'
    ),
    (
        'Leśnictwo Pohulanka',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        52.0,
        56,
        NULL,
        NULL,
        'Leśnictwo położone na wysokim lewym brzegu, stanowiące początek trudniejszego odcinka[cite: 11].'
    ),
    (
        'Stara Rzeka',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        50.0,
        57,
        NULL,
        NULL,
        'Miejscowość położona na wysokich zboczach doliny Wdy[cite: 11].'
    ),
    (
        'Stanica wodna PTTK Tleń',
        'CAMP',
        (SELECT id FROM river WHERE name='Wda'),
        40.0,
        58,
        NULL,
        NULL,
        'Stanica z polem biwakowym, sklepem i wypożyczalnią sprzętu[cite: 11].'
    ),
    (
        'Grzybek',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        38.0,
        59,
        NULL,
        NULL,
        'Most na przewężeniu Jeziora Żurskiego będący punktem orientacyjnym[cite: 11].'
    ),
    (
        'Przystań przed elektrownią Żur',
        'CAMP',
        (SELECT id FROM river WHERE name='Wda'),
        34.5,
        60,
        NULL,
        NULL,
        'Przystań po lewej stronie przed kanałem doprowadzającym wodę do elektrowni[cite: 11].'
    ),
    (
        'Elektrownia Żur',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        34.5,
        61,
        NULL,
        NULL,
        'Elektrownia wodna wymagająca przenoski kajaka[cite: 11].'
    ),
    (
        'Elektrownia Gródek',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        23.2,
        62,
        NULL,
        NULL,
        'Elektrownia wodna przy zaporze Jeziora Gródek[cite: 11].'
    ),
    (
        'Diabelski Kamień',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Wda'),
        21.2,
        63,
        NULL,
        NULL,
        'Pomnik przyrody dostępny pieszo od stacji kolejowej Leosia[cite: 11].'
    ),
    (
        'Bedlenki',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        16.5,
        64,
        NULL,
        NULL,
        'Wieś położona przy moście drogowym nad Wdą[cite: 11].'
    ),
    (
        'Wyrwa',
        'TOWN',
        (SELECT id FROM river WHERE name='Wda'),
        11.5,
        65,
        NULL,
        NULL,
        'Wieś z mostem drogowym przy ujściu strugi Wyrwa[cite: 11].'
    ),
    (
        'Kozłowo',
        'END',
        (SELECT id FROM river WHERE name='Wda'),
        NULL,
        66,
        NULL,
        NULL,
        'Zapora ziemna z dogodnym miejscem do przenoski kajaków[cite: 11].'
    ),
    (
        'Przystań wodna PTTK Świecie',
        'CAMP',
        (SELECT id FROM river WHERE name='Wda'),
        8.0,
        67,
        NULL,
        NULL,
        'Przystań wodna położona przed Świeciem[cite: 11].'
    ),
    (
        'Ujście Wdy do Wisły',
        'END',
        (SELECT id FROM river WHERE name='Wda'),
        0.0,
        68,
        NULL,
        NULL,
        'Zakończenie szlaku kajakowego Wdy w miejscu ujścia do Wisły[cite: 11].'
    );