INSERT INTO river_section (
    name,
    river_id,
    start_km,
    end_km,
    source,
    description
)
VALUES
('Wdzydzki Park Krajobrazowy',
 (SELECT id FROM river WHERE name='Wda'),
 15.0,
 35.0,
 'OFFICIAL',
 'Odcinek rzeki Wdy przepływający przez Wdzydzki Park Krajobrazowy. Malownicze jeziora, lasy i obszary chronione. Popularny wśród kajakarzy.'),

('Spiętrzenie - trudny odcinek',
 (SELECT id FROM river WHERE name='Wda'),
 40.0,
 42.5,
 'OFFICIAL',
 'Odcinek ze spiętrzeniem wody i możliwymi przeszkodami (np. powalone drzewa, szybszy nurt). Wymaga ostrożności, szczególnie przy wyższym stanie wody.'),

('Propozycja: spływ jednodniowy (rodzinny)',
 (SELECT id FROM river WHERE name='Wda'),
 0.0,
 18.5,
 'OFFICIAL',
 'Łagodny odcinek rzeki idealny dla rodzin z dziećmi. Spokojny nurt, brak trudnych przeszkód, możliwość zakończenia spływu w Borsku z dostępem do infrastruktury turystycznej.');