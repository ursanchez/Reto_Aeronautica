package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstadoFinanciero extends PageObject {

    public static final Target MENU_TRANSPARENCIA = Target.the("Menú Trámites")
            .located(By.xpath("//a [contains (@class, 'static dynamic-children menu-item ms-core-listMenu-item ms-displayInline ms-navedit-linkNode')]//span[contains(text(),'Transparencia')]"));

    public static final Target PRESUPUESTO = Target.the("Opción Presupuesto")
            .located(By.xpath("//a [contains (@href, '/atencion/presupuesto')]"));

    public static final Target ESTADOS_FINANCIEROS = Target.the("Opción Estados Financieros")
            .located(By.xpath("//a[contains (@href, '/atencion/presupuesto/estados-financieros') and contains(@class, 'level2')]"));

    public static final Target BALANCES = Target.the("Opción Balances")
            .located(By.xpath("//div [contains (text(), 'Balances')]"));

    /*public static final Target BTN_ESTADO = Target.the("Opción Balances")
            .located(By.xpath("//a [contains (@title, 'Estado de Situación Financiera a 31 de agosto de 2021') and contains (@class, 'tool-doc view')]"));*/

    public static final Target BTN_ESTADO = Target.the("Botón Estados Financieros 1")
            .located(By.xpath("//div [@class = 'desc-item-paginate']//div [@class = 'buttons']//a [contains (@class, 'tool-doc view')][1]"));


    public static final Target PDF = Target.the("PDF")
            .located(By.xpath("//span [contains (text(), 'Estado de Situación Financiera a 31 de agosto de 2021.pdf')]"));
//embed [contains (@type, 'application/pdf')]
    //div (@id = 'toolbar')//div (@id = 'title')

}
