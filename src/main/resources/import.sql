INSERT INTO user (user_id, user_name, password) VALUES (1, "admin", "admin");
INSERT INTO role (role_id,role) VALUES (1,"ROLE_ADMIN");
INSERT INTO user_role (user_id,role_id) VALUES (1,1);