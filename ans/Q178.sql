# Write your MySQL query statement below
select s1.Score, (select count(distinct Score) from Scores where Score > s1.Score)+1 as Rank from Scores s1
order by (select count(distinct Score) from Scores where Score > s1.Score)