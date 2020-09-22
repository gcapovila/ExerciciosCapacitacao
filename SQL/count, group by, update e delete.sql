
update cyc_cycle_occurrence set occurrence_status = 2 where id in (&id_do_ciclo) and occurrence_status = 1;

select count(fk_accnt_id) as quantidade, fk_accnt_id from acc_delivery_method group by fk_accnt_id having count(fk_accnt_id) > 1;
select * from acc_delivery_method where fk_accnt_id in (101869107,101869091,101869103);

delete from acc_delivery_method where id in (100350005,100350019,100350022);
