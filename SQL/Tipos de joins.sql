
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
