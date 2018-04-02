Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Crear de paciente nuevo
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos del nuevo paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|fecha_nacimiento|edad|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|||||||||||||||||||||||||||||
Then guardo el usuario

Scenario: Editar datos del paciente
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos a editar del paciente:
|tipo_id|id|primer_nombre|primer_apellido|genero|estado_civil|rh|cod_ocupacion|fecha_nacimiento|edad|escolaridad|regimen|tipo_afiliacion|empresa|ips|grupo_poblacional|etnia|telefono|religion|municipio_residencia|direccion_domicilio|sede|zona|medico_tratante|programa|dr_nombres|dr_parentesco|dr_telefono|
|||||||||||||||||||||||||||||
Then verificar