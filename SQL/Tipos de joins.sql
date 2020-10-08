
-- vai trazer dados das duas tabelas somente quando a igualdade for verdadeira:
select sum.*, evt.name as evento_tarifario from cyc_summarize_bil_items sum
       inner join cat_rating_event evt on evt.identifier = sum.rating_event_ident
       where sum.fk_cycsb_id = 261;
       
-- traz todos os dados das duas tabelas, idenpendente da igualdade ser verdadeira       
select sum.*, evt.name as evento_tarifario from cyc_summarize_bil_items sum
       full outer join cat_rating_event evt on evt.identifier = sum.rating_event_ident;

-- traz todos os dados da tabela da esquerda, idenpendente da igualdade ser verdadeira
select sum.*, evt.name as evento_tarifario from cyc_summarize_bil_items sum
       left join cat_rating_event evt on evt.identifier = sum.rating_event_ident; 

-- traz todos os dados da tabela da direita, idenpendente da igualdade ser verdadeira
select sum.*, evt.name as evento_tarifario from cyc_summarize_bil_items sum
       right join cat_rating_event evt on evt.identifier = sum.rating_event_ident;
       
------------------------ SELECT "COMPLEXO" COM JOIN ----------------------------------

-- este select vai trazer tudo que tem na itm_billing_item (respeitando os filtros), mesmo que não tenha correspondente nas outras duas tabelas (porque é left join)
select bil.id, bil.fk_ratev_id, bil.gross_value, bil.event_date, bil.fk_accnt_id, bil.type, bil.fk_prdcont_id, bil.fk_acpnt_id, bil.description,
       occ.*, assoc.* from itm_billing_item bil
       left join itm_occ_item occ on occ.pfk_bilit_id = bil.id
       left join itm_item_association assoc on assoc.fk_bilit_id_source = bil.id
       where bil.id in (select fk_bilit_id from trp_trip_item where fk_trptp_id in (2441))
       and (assoc.fk_reass_id = 600 or assoc.fk_reass_id is null)
       order by bil.id;
