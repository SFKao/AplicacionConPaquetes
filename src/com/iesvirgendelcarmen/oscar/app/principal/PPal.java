package com.iesvirgendelcarmen.oscar.app.principal;

import com.iesvirgendelcarmen.oscar.app.views.PrincipalView;

public class PPal {

    private static PrincipalView p;

    public static void lanzarAplicacion() {
        p = new PrincipalView();
        p.inicioViews();
    }

    public static void main(String[] args) {
        lanzarAplicacion();
    }

}
