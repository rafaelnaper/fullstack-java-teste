select 
	a.id_solicitacao,
    a.id_aereo,
    p.id_passageiro,
    p.nome,
    p.sobrenome,
    a.cia_aerea,
    a.datahora_saida,
    a.datahora_chegada,
    a.cidade_origem,
    a.cidade_destino
from 
	aereo a 
		join aereo_passageiro ap 
			on ap.id_aereo = ap.id_aereo
		join passageiro p
			on ap.id_passageiro = p.id_passageiro and ap.id_aereo = a.id_aereo