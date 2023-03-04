select o.owner_id, o.owner_name, count(distinct ca.category_id) as count 
from owner as o, article as a, category_article_mapping as ca 
where a.owner_id = o.owner_id and a.article_id = ca.article_id 
group by o.owner_id 
order by count desc;
