-- DB切り替え
\c testdb

-- テーブル作成
DROP TABLE IF EXISTS test_schema.m_user;
CREATE TABLE test_schema.m_user
(
    user_id character varying(5) NOT NULL,
    password character varying(255) NOT NULL,
    role_id character varying(5) NOT NULL,
    user_name character varying(255) NOT NULL,
    PRIMARY KEY (user_id)
);

ALTER TABLE IF EXISTS test_schema.m_user
    OWNER to postgres;

-- 権限追加
GRANT ALL PRIVILEGES ON test_schema.m_user TO postgres;

-- サンプルレコード作成
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0001', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0001', 'User1');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0002', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User2');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0003', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User3');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0004', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0001', 'User4');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0005', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0001', 'User5');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0006', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0001', 'User6');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0007', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0001', 'User7');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0008', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User8');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0009', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User9');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0010', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User10');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0011', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User11');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0012', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User12');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0013', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0002', 'User13');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0014', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User14');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0015', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User15');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0016', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User16');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0017', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User17');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0018', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User18');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0019', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User19');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0020', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User20');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0021', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User21');
INSERT INTO test_schema.m_user(user_id,password,role_id,user_name) VALUES('M0022', '$2a$08$3V2MZJSnNnS0kcf2beuK2eQsdCTM7qwpIoK/PQJ/ApeMOtuZe2KUK', 'R0003', 'User22');
