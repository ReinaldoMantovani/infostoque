package com.example.application.views.about;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Produtos")
@Route("produtos")
@Menu(order = 1, icon = LineAwesomeIconUrl.PRODUCT_HUNT)
public class ProdutosView extends VerticalLayout {

    public ProdutosView() {

    }

}
