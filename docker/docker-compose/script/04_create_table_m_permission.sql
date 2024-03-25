-- DB切り替え
\c testdb

-- テーブル作成
CREATE TABLE  test_schema.m_permission (
  permission_id VARCHAR(5) NOT NULL,
  permission_name VARCHAR(255) NOT NUll,
  PRIMARY KEY (permission_id)
);

-- 権限追加
GRANT ALL PRIVILEGES ON test_schema.m_permission TO postgres;

-- サンプルレコード作成
INSERT INTO test_schema.m_permission(permission_id, permission_name) VALUES('P0001', '参照');
INSERT INTO test_schema.m_permission(permission_id, permission_name) VALUES('P0002', '編集');
INSERT INTO test_schema.m_permission(permission_id, permission_name) VALUES('P0003', '追加');
INSERT INTO test_schema.m_permission(permission_id, permission_name) VALUES('P0004', '削除');
