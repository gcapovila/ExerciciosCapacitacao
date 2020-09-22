
-- vai trazer sumarização de ciclos com id >= 361 e <= 393 (porque não inclui 360 nem 394)
select sum.*, evt.name as evento_tarifario from cyc_summarize_bil_items sum
       inner join cat_rating_event evt on evt.identifier = sum.rating_event_ident
       where sum.fk_cycsb_id between 360 and 394;