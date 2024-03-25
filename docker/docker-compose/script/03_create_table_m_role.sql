-- DB切り替え
\c testdb

-- テーブル作成
CREATE TABLE  test_schema.m_role (
  role_id VARCHAR(5) NOT NULL,
  role_name VARCHAR(255) NOT NUll,
  PRIMARY KEY (role_id)
);

-- 権限追加
GRANT ALL PRIVILEGES ON test_schema.m_role TO postgres;

-- サンプルレコード作成
INSERT INTO test_schema.m_role(role_id, role_name) VALUES('R0001', 'ADMIN');
INSERT INTO test_schema.m_role(role_id, role_name) VALUES('R0002', 'SUBMANAGER');
INSERT INTO test_schema.m_role(role_id, role_name) VALUES('R0003', 'USER');
