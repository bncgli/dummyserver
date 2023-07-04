SET SCHEMA PUBLIC;
CREATE ALIAS PUBLIC.ROM_STORE_DATA DETERMINISTIC FOR "it.eurobet.vegas.dummyserver.procedures.StoredProcedures.store_procedure";
CREATE ALIAS PUBLIC.ROM_GET_CONFIG DETERMINISTIC FOR "it.eurobet.vegas.dummyserver.procedures.StoredProcedures.get_config";
