Feature: Validar extracción de la historia de usuario PRUEB-254

  Scenario: Validar la integridad y actualización del contenido de la historia de usuario
    When ejecuto la herramienta "leer_hu2" para extraer el contenido de JIRA de la historia de usuario "PRUEB-254"
    Then el contenido de la historia de usuario se extrae correctamente y se valida su integridad

    When releo el documento del usuario con "read_file_from_directory1"
    Then el documento se recarga correctamente y se asegura que contenga la información actualizada