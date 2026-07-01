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
        (SELECT id FROM river WHERE name='Brda'),
        'Świeszyno–Trzyniec',
        233.0,
        227.0,
        NULL,
        NULL,
        'str. 9 Świeszyno–Trzyniec',
        'Początkowy, rzadziej uczęszczany odcinek Brdy. Prowadzi przez Jezioro Pietrzykowskie Duże, a następnie bardzo wąskim i płytkim korytem rzecznym.'
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Świeszyno–Żołna',
        233.0,
        214.0,
        NULL,
        NULL,
        'str. 9-11',
        'Wąski i dziki początek szlaku Brdy z licznymi przeszkodami wodnymi, ruinami zastawek i płytkim, piaszczysto-kamienistym dnem.'
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Nowa Brda–Jezioro Charzykowskie',
        208.0,
        158.5,
        NULL,
        NULL,
        'str. 13-19',
        'Trasa prowadzi przez cenne przyrodniczo przełomy leśne, a następnie ciąg rozległych jezior polodowcowych, gdzie należy uważać na wiatr i falowanie.'
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Jezioro Charzykowskie–Mylof',
        158.5,
        129.0,
        NULL,
        NULL,
        'str. 19-27',
        'Odcinek pełen jezior otoczonych Borami Tucholskimi, kończący się sztucznym zaporowym Jeziorem Zapora przed hydroelektrownią.'
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Mylof–Zalew Koronowski',
        129.0,
        67.0,
        NULL,
        NULL,
        'str. 27-37',
        'Klasyczny etap leśny przez Bory Tucholskie. Charakteryzuje się dość szybkim nurtem, obecnością głazów, powalonych drzew oraz malowniczymi przełomami.'
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Zalew Koronowski–Bydgoszcz',
        67.0,
        1.5,
        NULL,
        NULL,
        'str. 37-47',
        'Wymagający etap przez rozlewisko korownowskie ze stojącą wodą, a następnie system kanałów i elektrowni wodnych, prowadzący do zurbanizowanego centrum Bydgoszczy.'
    ),
    (
        (SELECT id FROM river WHERE name='Zbrzyca'),
        'Sominy–Widno',
        38.0,
        14.2,
        NULL,
        NULL,
        'str. 51-53',
        'Górny i środkowy bieg Zbrzycy prowadzący przez płytkie, zarastające jeziora, z koniecznością omijania starych stawów młyńskich i tartaków.'
    ),
    (
        (SELECT id FROM river WHERE name='Zbrzyca'),
        'Widno–Ujście do Brdy',
        14.2,
        0.0,
        NULL,
        NULL,
        'str. 53-55',
        'Spokojny leśny odcinek Zbrzycy przepływający przez urokliwy łańcuch rynnowych jezior przed połączeniem z wodami Brdy.'
    ),
    (
        (SELECT id FROM river WHERE name='Brda'),
        'Stara Brda Pilska–Żołna',
        223.5,
        214.0,
        NULL,
        NULL,
        'str. 11 Stara Brda Pilska–Żołna',
        'Malowniczy odcinek leśny z licznymi bystrzami i kamienistym dnem. Przy niskim stanie wody wymaga przeciągania kajaka.'
    ),
    (
        (SELECT id FROM river WHERE name='Zbrzyca'),
        'Sominy–Parzyn',
        38.0,
        30.0,
        NULL,
        NULL,
        'str. 51 Sominy–Parzyn',
        'Początkowy odcinek rzeki Zbrzycy prowadzący przez płytkie, zarastające jeziora wytopiskowe i łąki.'
    );