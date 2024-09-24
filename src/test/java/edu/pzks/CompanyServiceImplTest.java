package edu.pzks;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   company-service
  @class  CompanyServiceImplTest
  @version  1.0.0 
  @since 02.09.24 - 11.59
*/

class CompanyServiceImplTest {
    private final Company main = new Company(null, 3);
    private final Company bookkeeping = new Company(main, 2);
    private final Company system_admin = new Company(main,5);
    private final Company development = new Company(system_admin,4);
    private final Company design = new Company(development,3);
    private final Company back_end = new Company(development,11);
    private final Company front_end = new Company(development,10);
    private final Company bd = new Company(back_end,3);
    private final Company busines_logic = new Company(back_end,5);
    private final Company crm = new Company(bookkeeping,2);
    private final Company management = new Company(bookkeeping,3);
    private final Company marketing = new Company(main,6);
    private final Company hr = new Company(marketing,4);
    private final Company sales_department = new Company(main,9);
    private final Company legal_department = new Company(main,5);
    private final Company customer_service = new Company(sales_department,4);
    private final Company ceo = new Company(main ,2);
    private final Company cto = new Company(main,2);
    private final Company architect = new Company(development,3);
    private final Company testing_engineers = new Company(development,3);


    // ....
    List<Company> companies = List.of(main, bookkeeping);

    private final ICompanyService underTest = new CompanyServiceImpl();


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    //////////////////////////
    @Test
    void whenParentIsNullThenItIsTheTop() {
        Company result = underTest.getTopLevelParent(main);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_main_ParentIsMain() {
        Company result = underTest.getTopLevelParent(main);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_bookkeeping_ParentIsMain() {
        Company result = underTest.getTopLevelParent(bookkeeping);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_development_ParentIsMain() {
        Company result = underTest.getTopLevelParent(development);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_design_ParentIsMain() {
        Company result = underTest.getTopLevelParent(design);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_back_end_ParentIsMain() {
        Company result = underTest.getTopLevelParent(back_end);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_front_end_ParentIsMain() {
        Company result = underTest.getTopLevelParent(front_end);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_bd_ParentIsMain() {
        Company result = underTest.getTopLevelParent(bd);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_busines_logic_ParentIsMain() {
        Company result = underTest.getTopLevelParent(busines_logic);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_crm_ParentIsMain() {
        Company result = underTest.getTopLevelParent(crm);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_management_ParentIsMain() {
        Company result = underTest.getTopLevelParent(management);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_hr_ParentIsMain() {
        Company result = underTest.getTopLevelParent(hr);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_sales_department_ParentIsMain() {
        Company result = underTest.getTopLevelParent(sales_department);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_legal_department_ParentIsMain() {
        Company result = underTest.getTopLevelParent(legal_department);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_customer_service_ParentIsMain() {
        Company result = underTest.getTopLevelParent(customer_service);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_ceo_ParentIsMain() {
        Company result = underTest.getTopLevelParent(ceo);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_cto_ParentIsMain() {
        Company result = underTest.getTopLevelParent(cto);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_system_admin_ParentIsMain() {
        Company result = underTest.getTopLevelParent(system_admin);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_architect_ParentIsMain() {
        Company result = underTest.getTopLevelParent(architect);
        Assertions.assertEquals(main, result);
    }

    @Test
    void whenChildIs_testing_engineers_ParentIsMain() {
        Company result = underTest.getTopLevelParent(testing_engineers);
        Assertions.assertEquals(main, result);
    }












}
