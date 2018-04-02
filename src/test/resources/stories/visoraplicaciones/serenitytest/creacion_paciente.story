Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Crear de paciente nuevo
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos del nuevo paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|fecha_nacimiento|edad|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|||||||A+|Abogado|02/04/2018|0 Años, 0 meses y 0 dîas|Ninguno|Subsidiado||||||||||||Jaime Alberto Gonzalez|Osteoporosis|Test Test|Tío(A)|3165328176|
Then guardo el paciente

Scenario: Editar datos del paciente
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos a editar del paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|fecha_nacimiento|edad|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
||||||||||||||||||||||||Jaime Alberto Gonzalez|Osteoporosis|Test Test|Tío(A)|3165328176|
Then verificar