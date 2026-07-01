UPDATE river
SET
    length_km = 239.0,
    country = 'Polska',
    region = 'Pojezierze Bytowskie, Pojezierze Krajeńskie, Bory Tucholskie',
    description = 'Popularny i dobrze oznakowany szlak wodny o długości 233 km. Prowadzi przez liczne jeziora rynnowe i zwarte kompleksy leśne Borów Tucholskich, kończąc bieg w Bydgoszczy.'
WHERE name = 'Brda';

INSERT INTO river (name, length_km, country, region, description)
VALUES (
           'Zbrzyca',
           46.8,
           'Polska',
           'Równina Charzykowska, Zaborski Park Krajobrazowy',
           'Prawy dopływ Brdy, dostępny dla kajaków szlak płynący głównie przez lasy i łańcuch kaszubskich jezior. W górnym biegu uciążliwy.'
       );