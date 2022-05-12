--board:crud

--insert
sb.append(" INSERT INTO board (    \n");
sb.append("     seq,               \n");
sb.append("     title,             \n");
sb.append("     contents,          \n");
sb.append("     read_cnt,          \n");
sb.append("     reg_id,            \n");
sb.append("     mod_id             \n");
sb.append(" ) VALUES (             \n");
sb.append("     ?v0,               \n");
sb.append("     ?v1,               \n");
sb.append("     ?v2,               \n");
sb.append("     ?v3,               \n");
sb.append("     ?v5,               \n");
sb.append("     ?v7                \n");
sb.append(" )                      \n");

--DELETE
DELETE FROM board
WHERE SEQ = 1;

--doSelectOne
sb.append(" SELECT                                                     \n")
sb.append("     seq,                                                   \n")
sb.append("     title,                                                 \n")
sb.append("     contents,                                              \n")
sb.append("     read_cnt,                                              \n")
sb.append("     TO_CHAR(reg_dt,'YYYY/MM/DD HH24:MI:SS') AS reg_dt,     \n")
sb.append("     reg_id,                                                \n")
sb.append("     TO_CHAR(mod_dt,'YYYY/MM/DD HH24:MI:SS') AS mod_dt,     \n")
sb.append("     mod_id                                                 \n")
sb.append(" FROM                                                       \n")
sb.append("     board                                                  \n")
sb.append(" WHERE seq = :SEQ;                                          \n")

--update
sb.append(" UPDATE board                 \n");
sb.append(" SET title = :v1,             \n");
sb.append("     contents = :v2,          \n");
sb.append("     reg_dt = SYSDATE,        \n");
sb.append("     mod_dt = SYSDATE,        \n");
sb.append("     mod_id = :v3             \n");
sb.append(" WHERE seq = :v0;             \n");

SELECT * FROM board;

--��ȸ�Ǽ� ����
UPDATE board
SET read_cnt = read_cnt + 1
WHERE seq = :v0;

--�����ȸ
sb.append("ALTER SESSION SET STATISTICS_LEVEL = ALL;          \n");
sb.append("SELECT A.SEQ,                                      \n");
sb.append("       A.RNUM AS NUM,                              \n");
sb.append("       A.TITLE AS TITLE,                           \n");
sb.append("		  A.ReadCnt,								  \n");
sb.append("       TO_CHAR(A.MOD_DT,'YYYY/MM/DD') AS MOD_DT,   \n");
sb.append("       A.MOD_ID                                    \n");
sb.append("FROM (                                             \n");
sb.append("    SELECT ROWNUM AS RNUM, T1.*                    \n");
sb.append("    FROM (                                         \n");
sb.append("        SELECT *                                   \n");
sb.append("        FROM board                                 \n");
        --�˻�����
sb.append("         ORDER BY mod_dt DESC                      \n");
sb.append("     )T1                                           \n");
sb.append("     WHERE ROWNUM <= 10                            \n");
sb.append(" )A                                                \n");
sb.append(" WHERE RNUM >= 1                                   \n");
;

SELECT * FROM TABLE(DBMS_XPLAN.DISPLAY_CURSOR(NULL,NULL,'ALLSTATS LAST -ROWS +PREDICATE'));

--������ ����
TRUNCATE TABLE board;
INSERT INTO board 
SELECT LEVEL AS seq,
       '����'||LEVEL as title,
       '����'||LEVEL as contents,
       0 as read_cnt,
       SYSDATE - (ROWNUM/(60*60)) AS REG_DT,
       'ADMIN' AS reg_id,
       SYSDATE - (ROWNUM/(60*60)) AS MOD_DT,
       'ADMIN' AS mod_id
FROM dual
CONNECT BY LEVEL <= 900000;

commit;

--��ü�Ǽ� ��ȸ
SELECT COUNT(*) total_cnt
FROM board;
--�˻�����
