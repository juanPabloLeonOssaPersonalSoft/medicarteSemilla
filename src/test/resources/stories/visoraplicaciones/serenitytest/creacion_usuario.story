Meta:
Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Creacion de usuario no profesional
GivenStories: stories/visoraplicaciones/serenitytest/login.story
When ingreso las datos del nuevo usuario:
|usuario|nombres |primerApellido|rol          |fechaInicio|contrasena   |email             |sede   |
|fhernan|Fernando|Fernandez     |Administrador|10/03/2018 |@Bustamante76|fabian20@gmail.com|Armenia|
Then guardo el usuario