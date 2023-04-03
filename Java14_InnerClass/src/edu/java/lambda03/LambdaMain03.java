package edu.java.lambda03;

import java.util.Arrays;
import java.util.List;

public class LambdaMain03 {

    public static void main(String[] args) {
        // Employee를 원소로 갖는 리스트를 선언, 초기화
        List<Employee> employees = Arrays.asList(
                new Employee(100, "이찬희", "개발1팀", "대리", 400.0),
                new Employee(101, "지대한", "개발2팀", "사원", 350.0),
                new Employee(200, "김다훈", "개발2팀", "과장", 380.0),
                new Employee(201, "유다한", "개발1팀", "부장", 500.0),
                new Employee(300, "강효남", "인사팀", "사원", 300.0),
                new Employee(301, "위태욱", "인사팀", "과장", 1000.0)
        );
        
        // 1. 모든 직원들의 정보를 한 줄에 한 명씩 출력.
        
        // 2. 개발1,2팀에서 일하는 직원들의 급여의 합계를 출력.
        
        // 3. 개발1,2팀에서 일하는 직원들의 급여의 평균을 출력.
        
        // 4. 직급이 사원인 직원들의 급여의 합계를 출력.
        
        // 5. 직급이 사원인 직원들의 급여의 평균을 출력.

        // 6. 급여가 400 이상인 직원들의 정보를 한 줄에 한 명씩 출력.
        
        // 7. 개발1팀 직원들의 급여를 10% 인상하고, 그 직원들의 급여 평균을 계산하고 출력.
        
    }

}
