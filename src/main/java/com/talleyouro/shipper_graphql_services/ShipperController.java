package com.talleyouro.shipper_graphql_services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import models.Shipper;
import models.ShipperInput;
import repositories.ShipperRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;



@Controller
public class ShipperController {

    private final ShipperRepository repo;

    public ShipperController(ShipperRepository repo) {
        this.repo = repo;
    }

    @QueryMapping
    public List<Shipper> shippers() {
        return repo.findAll();
    }

    @QueryMapping
    public Optional<Shipper> shipperById(@Argument Short id) {
        return repo.findById(id);
    }

    @MutationMapping
    public Shipper createShipper(@Argument ShipperInput input) {
        Shipper s = new Shipper();
        s.setCompanyName(input.companyName());
        s.setPhone(input.phone());
        return repo.save(s);
    }

    @MutationMapping
    public Optional<Shipper> updateShipper(@Argument Short id, @Argument ShipperInput input) {
        return repo.findById(id).map(s -> {
            s.setCompanyName(input.companyName());
            s.setPhone(input.phone());
            return repo.save(s);
        });
    }

    @MutationMapping
    public boolean deleteShipper(@Argument Short id) {
        if (!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }
}
