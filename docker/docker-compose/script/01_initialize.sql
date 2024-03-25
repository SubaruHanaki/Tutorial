-- DB作成
CREATE DATABASE testdb; 

-- 作成したDBへ切り替え
\c testdb

-- スキーマ作成
CREATE SCHEMA test_schema;

-- ロールの作成
-- CREATE ROLE postgres WITH LOGIN PASSWORD 'postgres';

-- 権限追加
GRANT ALL PRIVILEGES ON SCHEMA test_schema TO postgres;
