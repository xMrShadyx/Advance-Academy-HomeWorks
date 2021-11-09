USE SMART_ELECTRONICS;


DROP TABLE IF EXISTS PHONES;
DROP TABLE IF EXISTS WATCHES;
DROP TABLE IF EXISTS BRANDS;

CREATE TABLE BRANDS (
	ID INT PRIMARY KEY AUTO_INCREMENT,
    `NAME` VARCHAR(255) NOT NULL
);

CREATE UNIQUE INDEX uixd_NAME ON BRANDS(`NAME`);


CREATE TABLE PHONES (
	ID INT PRIMARY KEY AUTO_INCREMENT,
    PHONE_NAME VARCHAR(255) NOT NULL,
    LAUNCH_ANNOUNCED VARCHAR(255) NOT NULL,
    BODY_WEIGHT VARCHAR(255) NOT NULL,
    DISPLAY_SIZE VARCHAR(255) NOT NULL,
    DISPLAY_RESOLUTION VARCHAR(255) NOT NULL,
    PLATFORM_OS VARCHAR(255) NOT NULL,
    MEMORY_INTERNAL VARCHAR(255) NOT NULL,
    
    BRAND_ID INT NOT NULL,
    FOREIGN KEY (BRAND_ID) REFERENCES BRANDS(ID)
);

CREATE UNIQUE INDEX uixd_PHONE_NAME ON PHONES(PHONE_NAME);

CREATE TABLE WATCHES (
	ID INT PRIMARY KEY AUTO_INCREMENT,
    WATCH_NAME VARCHAR(255) NOT NULL,
    LAUNCH_ANNOUNCED VARCHAR(255) NOT NULL,
    BODY_WEIGHT VARCHAR(255) NOT NULL,
    DISPLAY_SIZE VARCHAR(255) NOT NULL,
    DISPLAY_RESOLUTION VARCHAR(255) NOT NULL,
    PLATFORM_OS VARCHAR(255) NOT NULL,
    MEMORY_INTERNAL VARCHAR(255) NOT NULL,
    
    BRAND_ID INT NOT NULL,
    FOREIGN KEY (BRAND_ID) REFERENCES BRANDS(ID)
);

CREATE UNIQUE INDEX uixd_WATCH_NAME ON WATCHES(WATCH_NAME);