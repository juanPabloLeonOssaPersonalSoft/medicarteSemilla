Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Crear de paciente nuevo
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos del nuevo paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|TI|6322655|Raul|Zapata|Masculino|Unión Libre|A+|Ingeniero Administrativo|Pregrado Completo|Contributivo|Cotizante|ALIANSALUD|Ips Aliansalud|Índigena|Ninguna De Las Anteriores|6784532|Catolica|Abejorral|CR 54 # 53 A 22|Barrancabermeja|Rural|Jaime|Osteoporosis|Ovelo Rasec|Tío(A)|3165328173|

Then guardo el paciente

Scenario: Editar datos del paciente
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos a editar del paciente:
|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|1035434045|Socorro|Rossenberg|Masculino|Sin Dato|A+|Abogado|Ninguno|Subsidiado|Cotizante|EPS SURA|A  G Niza|Afrocolombiano|Ninguna De Las Anteriores|1234567|Budismo|Amaga|CR 54 # 53 A 55|Barranquilla|Urbana|Juan Felipe||change name||3005328198|
Then verificar