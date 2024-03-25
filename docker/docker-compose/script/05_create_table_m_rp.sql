-- DB切り替え
\c testdb

-- テーブル作成
CREATE TABLE  test_schema.m_rp (
  role_id VARCHAR(5) NOT NULL,
  permission_id VARCHAR(5) NOT NUll,
  PRIMARY KEY (role_id,permission_id)
);

-- 権限追加
GRANT ALL PRIVILEGES ON test_schema.m_rp TO postgres;

-- サンプルレコード作成
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0001', 'P0001');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0001', 'P0002');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0001', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0002', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0002', 'P0004');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0003', 'P0004');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0004', 'P0004');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0005', 'P0004');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0006', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0007', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0008', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0009', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0010', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0011', 'P0002');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0012', 'P0002');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0013', 'P0002');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0014', 'P0002');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0015', 'P0001');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0016', 'P0001');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0017', 'P0001');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0018', 'P0001');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0019', 'P0004');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0020', 'P0003');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0021', 'P0002');
INSERT INTO test_schema.m_rp(role_id, permission_id) VALUES('R0022', 'P0001');
