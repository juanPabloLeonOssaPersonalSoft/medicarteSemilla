Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Crear de paciente nuevo
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos del nuevo paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|fecha_nacimiento|edad|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|TI|1035434045|Sancho|Panza|Masculino|Sin Dato|A+|Abogado|02/04/2018|0 Años, 0 meses y 0 dîas|Ninguno|Subsidiado|Cotizante|EPS SURA|A G Niza|Afrocolombiano|Ninguna De Las Anteriores|6784532|05001 - Medellin ( Antioq )|05001 - Medellin ( Antioq )|CR 54 # 53 A 22|Armenia|Rural|Jaime Alberto Gonzalez|Osteoporosis|Test Test|Tío(A)|3165328176|
Then guardo el paciente

Scenario: Editar datos del paciente
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos a editar del paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|fecha_nacimiento|edad|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|CC|1035434045|Sancho|Panza|Masculino|Sin Dato|A+|Abogado|02/04/2018|0 Años, 0 meses y 0 dîas|Ninguno|Subsidiado|Cotizante|EPS SURA|A G Niza|Afrocolombiano|Ninguna De Las Anteriores|1234567|05002 - Abejorral ( Antioq )|CR 54 # 53 A 25|05001 - Medellin ( Antioq )|Urbana||||Test Name||3005328176|
Then verificar