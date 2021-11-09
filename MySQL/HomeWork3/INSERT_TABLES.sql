USE SMART_ELECTRONICS;

INSERT IGNORE INTO BRANDS (`NAME`) VALUES 
	("Samsung"),
    ("Apple"),
    ("Xiomi"),
    ("Huawei"),
    ("Oppo");
    
INSERT IGNORE INTO PHONES (PHONE_NAME, LAUNCH_ANNOUNCED, BODY_WEIGHT, DISPLAY_SIZE, DISPLAY_RESOLUTION,
 PLATFORM_OS, MEMORY_INTERNAL, BRAND_ID) VALUES 
("Galaxy F42 5G", 
"Available. Released 2021, October 03", 
"203g, 9mm thickness", 
"6.6 inches, 104.9 cm2 (~82.1% screen-to-body ratio)", 
"1080 x 2408 pixels, 20:9 ratio (~400 ppi density)", 
"Android 11, One UI Core 3.1", 
"128GB 6GB RAM, 128GB 8GB RAM, microSDXC (dedicated slot)", 
1);

INSERT IGNORE INTO PHONES (PHONE_NAME, LAUNCH_ANNOUNCED, BODY_WEIGHT, DISPLAY_SIZE, DISPLAY_RESOLUTION,
 PLATFORM_OS, MEMORY_INTERNAL, BRAND_ID) VALUES 
("A16K", "Released 2021, November 08", "175g, 7.9mm thickness", "164 x 75.4 x 7.9 mm (6.46 x 2.97 x 0.31 in)", "720 x 1600 pixels, 20:9 ratio (~269 ppi density)",
"Android 11, ColorOS 11.1 Lite", "32GB 3GB RAM, 64GB 4GB RAM, microSDXC", 5);

INSERT IGNORE INTO WATCHES (WATCH_NAME, LAUNCH_ANNOUNCED, BODY_WEIGHT, DISPLAY_SIZE, DISPLAY_RESOLUTION, 
PLATFORM_OS, MEMORY_INTERNAL, BRAND_ID) VALUES 
("Galaxy Watch4 Classic", "Available. Released 2021, August 27", "52 g (46mm), 46.5 g (42mm) (1.66 oz)",
"1.4 inches", "450 x 450 pixels (~321 ppi density)", "Android Wear OS, One UI Watch 3", "16GB 1.5GB RAM, No Card slot", 1);


DELETE FROM PHONES WHERE ID = 2;
UPDATE PHONES SET LAUNCH_ANNOUNCED = "Released 2021, November 12"
WHERE ID = 3;
    
