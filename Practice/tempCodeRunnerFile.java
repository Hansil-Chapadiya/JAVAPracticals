    try {
            File f = new File("MH1.txt");
            b = f.creatNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(b);