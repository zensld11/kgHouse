package com.degilok.demokghouse.service;

import com.degilok.demokghouse.model.*;
import com.degilok.demokghouse.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllModelsService {
    private final BuildingTypeRepository buildingTypeRepository;
    private final ComplexRepository complexRepository;
    private final DealTypeRepository dealTypeRepository;
    private final DistinctRepository distinctRepository;
    private final ExchangeRepository exchangeRepository;
    private final HeatingRepository heatingRepository;
    private final InstallmentRepository installmentRepository;
    private final LocalityRepository localityRepository;
    private final MortgageRepository mortgageRepository;
    private final PriceRepository priceRepository;
    private final PropertyTypeRepository propertyTypeRepository;
    private final RegionRepository regionRepository;
    private final RoomCountRepository roomCountRepository;
    private final SerieRepository serieRepository;
    private final StateRepository stateRepository;

    private final RoomService roomService;


    public AllModelsService(BuildingTypeRepository buildingTypeRepository, ComplexRepository complexRepository, DealTypeRepository dealTypeRepository, DistinctRepository distinctRepository, ExchangeRepository exchangeRepository, HeatingRepository heatingRepository, InstallmentRepository installmentRepository, LocalityRepository localityRepository, MortgageRepository mortgageRepository, PriceRepository priceRepository, PropertyTypeRepository propertyTypeRepository, RegionRepository regionRepository, RoomCountRepository roomCountRepository, SerieRepository serieRepository, StateRepository stateRepository, RoomService roomService) {
        this.buildingTypeRepository = buildingTypeRepository;
        this.complexRepository = complexRepository;
        this.dealTypeRepository = dealTypeRepository;
        this.distinctRepository = distinctRepository;
        this.exchangeRepository = exchangeRepository;
        this.heatingRepository = heatingRepository;
        this.installmentRepository = installmentRepository;
        this.localityRepository = localityRepository;
        this.mortgageRepository = mortgageRepository;
        this.priceRepository = priceRepository;
        this.propertyTypeRepository = propertyTypeRepository;
        this.regionRepository = regionRepository;
        this.roomCountRepository = roomCountRepository;
        this.serieRepository = serieRepository;
        this.stateRepository = stateRepository;
        this.roomService = roomService;
    }

    public List<DealType> getAllDealTypes() {
        return dealTypeRepository.findAll();

    }

    public List<BuildingType> getBuildingType() {
        return buildingTypeRepository.findAll();
    }

    public List<Complex> getComplex(){
        return complexRepository.findAll();
    }

    public List<Distinct> getDistinct(){
        return distinctRepository.findAll();
    }

    public List<Exchange> getExchange(){
        return exchangeRepository.findAll();
    }

    public List<Heating> getHeating(){
        return heatingRepository.findAll();
    }

    public List<Installment> getInstallment(){
        return installmentRepository.findAll();
    }

    public List<Locality> getLocality(){
        return localityRepository.findAll();
    }

    public List<Mortgage> getMortgage(){
        return mortgageRepository.findAll();
    }

    public List<Price> getPrice(){
        return priceRepository.findAll();
    }

    public List<PropertyType> getPropertyType(){
        return propertyTypeRepository.findAll();
    }

    public List<Region> getRegion(){
        return regionRepository.findAll();
    }

    public List<RoomCount> getRoomCount(){
        return roomCountRepository.findAll();
    }

    public List<Serie> getSerie(){
        return serieRepository.findAll();
    }

    public List<State> getState(){
        return stateRepository.findAll();
    }
}