Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Modificación de usuario no profesional
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos del usuario a verificar:
|usuario|
|Admin|
Then verifico el usuario:
|nombres|primerApellido|rol|fechaInicio|email|sede|
|Liliana|Uribe|Medicarte|01/09/2014|luribe@medicarte.com.co|Armenia|

Scenario: Edición de usuario no profesional
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos a modificar:
|usuario|nombres|primerApellido|rol|fechaInicio|email|sede|
|Admin|||Test||fvelasar@gmail.com||
Then verifico el usuario modificado
