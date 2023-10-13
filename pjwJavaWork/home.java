        
 //이 코드를 홈 / 메인 자바 코드에 추가하여 fragment 동작하도록 합니다.

 //각 인기상품 , 추천상품 , 세일상품 버튼 클릭 시 fragment 전환되도록 하는 코드입니다.       
        
        
        btn_home_recommendItem = findViewById(R.id.btn_home_recommendItem);
        btn_home_popularItem = findViewById(R.id.btn_home_popularItem);
        btn_home_saleItem = findViewById(R.id.btn_home_saleItem);

        btn_home_recommendItem.setOnClickListener(v -> {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            fragment_home_recommendItem = new Fragment();
            transaction.replace(R.id.fragment_home_fragmentContainer,fragment_home_recommendItem);
            transaction.commit();

        });

        btn_home_popularItem.setOnClickListener(v -> {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            fragment_home_popularItem = new Fragment();
            transaction.replace(R.id.fragment_home_fragmentContainer,fragment_home_popularItem);
            transaction.commit();
        });

        btn_home_saleItem.setOnClickListener(v -> {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            fragment_home_saleItem = new Fragment();
            transaction.replace(R.id.fragment_home_fragmentContainer,fragment_home_saleItem);
            transaction.commit();
        });

