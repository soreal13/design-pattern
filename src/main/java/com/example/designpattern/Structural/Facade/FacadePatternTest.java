package com.example.designpattern.Structural.Facade;

public class FacadePatternTest {

    //퍼사드 패턴은 서브시스템을 더 쉽게 사용할 수 있도록 higher-level 인터페이스를 정의하고, 제공합니다.
    // 퍼사드 패턴을 적용하여 wrapper 인터페이스를 제공하여 클라이언트가 보다 쉽게 관리할 수 있도록 도와준다.

    //퍼사드 패턴은 클라이언트 어플리케이션의 헬퍼 역할을 하는 것이지, 서브시스템 인터페이스를 숨기는 것은 아닙니다.
    //퍼사드 패턴은 특정 기능에 대해 인터페이스의 수가 확장되고(위 예제로 치면 디비 종류나 리포트 종류가 늘어난다는 등), 시스템이 복잡해질 수 있는 상황에서 사용하기 적합합니다.
    //퍼사드 패턴은 비슷한 작업을 해야하는 다양한 인터페이스들 중 하나의 인터페이스를 클라이언트에 제공해야 할 때 적용하는 것이 좋습니다.
    //팩토리 패턴과 종종 함께 사용됩니다.

    public static void main(String[] args) {
        String tableName = "Employee";

        // generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
