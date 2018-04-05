Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Editar datos del paciente
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos a editar del paciente:
|id|primer_nombre|primer_apellido|genero|fecha_nacimiento|estado_civil|rh|cod_ocupacion|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|1035434045|Socorro|Rossenberg|Masculino|03/04/2018|Sin Dato|A+|Abogado|Ninguno|Subsidiado|Cotizante|EPS SURA|A  G Niza|Afrocolombiano|Ninguna De Las Anteriores|1234567|Budismo|Amaga|CR 54 # 53 A 55|Barranquilla|Urbana|Juan Felipe|Osteoporosis|change name|Cónyugue|3005328198|
Then verificar