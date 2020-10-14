package br.com.fundatec.clinica.controller.response;

import java.util.List;

public class ProjectionCollection {

    private List<ConsultaProjection> items;

    public ProjectionCollection() {
    }

    public ProjectionCollection(List<ConsultaProjection> items) {
        this.items = items;
    }

    public List<ConsultaProjection> getItems() {
        return items;
    }

    public void setItems(List<ConsultaProjection> items) {
        this.items = items;
    }
}
