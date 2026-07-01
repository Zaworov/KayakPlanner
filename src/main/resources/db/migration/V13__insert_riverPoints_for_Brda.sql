DELETE FROM river_point
where river_id = (SELECT id FROM river WHERE name='Brda');

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
        'Świeszyno',
        'TOWN',
        (SELECT id FROM river WHERE name='Brda'),
        233.0,
        1,
        NULL,
        NULL,
        'Miejscowość z plażą gminną, polem biwakowym oraz sklepami. Częsty punkt dowożenia sprzętu pływającego.'
    ),
    (
        'Jezioro Pietrzykowskie Duże',
        'START',
        (SELECT id FROM river WHERE name='Brda'),
        233.0,
        2,
        NULL,
        NULL,
        'Główne miejsce rozpoczynania spływów na rzece Brdzie, przy ośrodku Słoneczny Stok.'
    ),
    (
        'Trzyniec',
        'TOWN',
        (SELECT id FROM river WHERE name='Brda'),
        227.0,
        3,
        NULL,
        NULL,
        'Miejscowość z mostem betonowym, sklepem i przystankiem autobusowym. Możliwość rozbicia namiotu za zgodą właściciela.'
    ),
    (
        'Stara Brda Pilska (leśnictwo)',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Brda'),
        223.5,
        4,
        NULL,
        NULL,
        'Teren dawnego leśnictwa, obecnie ośrodek naukowy SGGW. Uzasadnienie: charakterystyczny punkt orientacyjny ze zniszczoną zastawką.'
    ),
    (
        'Stara Brda Pilska (pole biwakowe)',
        'CAMPING',
        (SELECT id FROM river WHERE name='Brda'),
        222.0,
        4,
        NULL,
        NULL,
        'Pole biwakowe z czynnym sklepem, zlokalizowane po lewej stronie rzeki, około 200 metrów za przenoską.'
    ),
    (
        'Leśnictwo Pustowo',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Brda'),
        219.0,
        6,
        NULL,
        NULL,
        'Teren leśnictwa zaczynający się za mostem drogowym. W korycie mogą pojawiać się powalone drzewa. Uzasadnienie: pomocny punkt nawigacyjny.'
    ),
    (
        'Żołna',
        'FOOD',
        (SELECT id FROM river WHERE name='Brda'),
        214.0,
        5,
        NULL,
        NULL,
        'Nieduża wieś ze sklepem spożywczym i przystankiem autobusowym. Uzasadnienie typu: sklep jest najistotniejszą informacją dla kajakarza w tym punkcie.'
    ),
    (
        'Nowa Brda',
        'START',
        (SELECT id FROM river WHERE name='Brda'),
        208.0,
        8,
        NULL,
        NULL,
        'Leśna osada będąca dogodnym miejscem do rozpoczęcia spływu. Znajdują się tu trzy mosty i obszerne leśne pole biwakowe na prawym brzegu.'
    ),
    (
        'Folbrycht',
        'CAMPING',
        (SELECT id FROM river WHERE name='Brda'),
        202.5,
        9,
        NULL,
        NULL,
        'Niewielkie leśne pole biwakowe przy betonowym moście (droga Przechlewo–Lipczynek), niedaleko przystanku autobusowego Rudniki Skrzyżowanie.'
    ),
    (
        'Most Garbaty',
        'END',
        (SELECT id FROM river WHERE name='Brda'),
        199.5,
        10,
        NULL,
        NULL,
        'Most na trasie Przechlewo–Koczała. Za mostem mieści się dogodne miejsce biwakowe oraz wygodny dostęp do rzeki, co czyni go dobrym punktem startu lub zakończenia etapu.'
    ),
    (
        'Most Wojciecha',
        'VIEWPOINT',
        (SELECT id FROM river WHERE name='Brda'),
        198.0,
        6,
        NULL,
        NULL,
        'Niski drewniany most. Uzasadnienie typu: stanowi bardzo charakterystyczny, orientacyjny punkt na trasie opisany w przewodniku.'
    ),
    (
        'Przechlewo',
        'TOWN',
        (SELECT id FROM river WHERE name='Brda'),
        182.5,
        6,
        NULL,
        NULL,
        'Duża wieś gminna z bogatą ofertą usług, polem namiotowym OKSiR, sklepami, ośrodkiem zdrowia oraz gastronomią.'
    ),
    (
        'Charzykowy',
        'TOWN',
        (SELECT id FROM river WHERE name='Brda'),
        158.5,
        7,
        NULL,
        NULL,
        'Ośrodek żeglarski nad jeziorem. Zapewnia sklepy, gastronomię oraz hotele. Dogodna alternatywa na rozpoczęcie spływu.'
    ),
    (
        'Witoczno',
        'CAMP',
        (SELECT id FROM river WHERE name='Brda'),
        150.0,
        8,
        NULL,
        NULL,
        'Stanica wodna PTTK po lewej stronie jeziora. Zapewnia nocleg, sklep i dobry punkt odpoczynku przed kolejnymi odcinkami.'
    ),
    (
        'Mylof',
        'CAMPING',
        (SELECT id FROM river WHERE name='Brda'),
        129.0,
        7,
        NULL,
        NULL,
        'Dobrze zagospodarowane pole biwakowe niedaleko zapory. Możliwość zakupu ryb w miejscowym ośrodku hodowlanym.'
    ),
    (
        'Woziwoda',
        'CAMPING',
        (SELECT id FROM river WHERE name='Brda'),
        101.5,
        10,
        NULL,
        NULL,
        'Pole biwakowe z zapleczem sanitarnym (natryski) i barem. Znajduje się obok ośrodka edukacji przyrodniczej.'
    ),
    (
        'Tuchola',
        'TOWN',
        (SELECT id FROM river WHERE name='Brda'),
        81.5,
        11,
        NULL,
        NULL,
        'Duże miasto turystyczne w niedalekiej odległości od szlaku. Oferuje pełną infrastrukturę medyczną, handlową i noclegową.'
    ),
    (
        'Gostycyn Nogawica',
        'CAMP',
        (SELECT id FROM river WHERE name='Brda'),
        67.0,
        12,
        NULL,
        NULL,
        'Stanica PTTK na półwyspie z dobrym zapleczem sanitarnym, świetlicą, barem i miejscami noclegowymi w budynkach.'
    ),
    (
        'Sokole Kuźnica',
        'CAMP',
        (SELECT id FROM river WHERE name='Brda'),
        58.5,
        13,
        NULL,
        NULL,
        'Obiekt PTTK ulokowany nad wodą ze sklepem spożywczym, infrastrukturą gastronomiczną i sanitarną.'
    ),
    (
        'Pieczyska',
        'ACCOMMODATION',
        (SELECT id FROM river WHERE name='Brda'),
        48.0,
        14,
        NULL,
        NULL,
        'Miejscowość nad Zalewem Koronowskim o charakterze letniskowym, w której znajdują się liczne ośrodki i pola namiotowe.'
    ),
    (
        'Samociążek',
        'CAMPING',
        (SELECT id FROM river WHERE name='Brda'),
        37.5,
        15,
        NULL,
        NULL,
        'Ośrodki wypoczynkowe, sklepy oraz pole namiotowe zlokalizowane w lesie nad pobliskim Jeziorem Białym.'
    ),
    (
        'Janowo',
        'CAMP',
        (SELECT id FROM river WHERE name='Brda'),
        24.0,
        16,
        NULL,
        NULL,
        'Kemping PTTK będący jednym z ostatnich punktów wypadowych. Znajdują się tu domki i komunikacja autobusowa z Bydgoszczą.'
    ),
    (
        'Bydgoszcz - Brdyujście',
        'END',
        (SELECT id FROM river WHERE name='Brda'),
        1.5,
        17,
        NULL,
        NULL,
        'Koniec spływu szlakiem Brdy. W pobliżu znajduje się tor regatowy oraz połączenie śluzowe z rzeką Wisłą.'
    ),
    (
        'Sominy',
        'START',
        (SELECT id FROM river WHERE name='Zbrzyca'),
        38.0,
        1,
        NULL,
        NULL,
        'Miejsce rozpoczęcia spływu Zbrzycą. Miejscowość letniskowa z zapleczem turystycznym.'
    ),
    (
        'Laska',
        'CAMPING',
        (SELECT id FROM river WHERE name='Zbrzyca'),
        11.9,
        2,
        NULL,
        NULL,
        'Miejsce postojowe przy drogowym moście z możliwością noclegu pod namiotem i pobliskim sklepem.'
    );