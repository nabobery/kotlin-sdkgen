package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls/properties/blocked_categor
 * ies/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls/properties/blocked_categor
 * ies/items
 */
@Serializable(with = InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466.Serializer::class)
public sealed class InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ac_refrigeration_repair`.
     */
    public data object AcRefrigerationRepair : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "ac_refrigeration_repair"
    }

    /**
     * Documented value. Wire value: `accounting_bookkeeping_services`.
     */
    public data object AccountingBookkeepingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "accounting_bookkeeping_services"
    }

    /**
     * Documented value. Wire value: `advertising_services`.
     */
    public data object AdvertisingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "advertising_services"
    }

    /**
     * Documented value. Wire value: `agricultural_cooperative`.
     */
    public data object AgriculturalCooperative : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "agricultural_cooperative"
    }

    /**
     * Documented value. Wire value: `airlines_air_carriers`.
     */
    public data object AirlinesAirCarriers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "airlines_air_carriers"
    }

    /**
     * Documented value. Wire value: `airports_flying_fields`.
     */
    public data object AirportsFlyingFields : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "airports_flying_fields"
    }

    /**
     * Documented value. Wire value: `ambulance_services`.
     */
    public data object AmbulanceServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "ambulance_services"
    }

    /**
     * Documented value. Wire value: `amusement_parks_carnivals`.
     */
    public data object AmusementParksCarnivals : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "amusement_parks_carnivals"
    }

    /**
     * Documented value. Wire value: `antique_reproductions`.
     */
    public data object AntiqueReproductions : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "antique_reproductions"
    }

    /**
     * Documented value. Wire value: `antique_shops`.
     */
    public data object AntiqueShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "antique_shops"
    }

    /**
     * Documented value. Wire value: `aquariums`.
     */
    public data object Aquariums : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "aquariums"
    }

    /**
     * Documented value. Wire value: `architectural_surveying_services`.
     */
    public data object ArchitecturalSurveyingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "architectural_surveying_services"
    }

    /**
     * Documented value. Wire value: `art_dealers_and_galleries`.
     */
    public data object ArtDealersAndGalleries : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "art_dealers_and_galleries"
    }

    /**
     * Documented value. Wire value: `artists_supply_and_craft_shops`.
     */
    public data object ArtistsSupplyAndCraftShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "artists_supply_and_craft_shops"
    }

    /**
     * Documented value. Wire value: `auto_and_home_supply_stores`.
     */
    public data object AutoAndHomeSupplyStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "auto_and_home_supply_stores"
    }

    /**
     * Documented value. Wire value: `auto_body_repair_shops`.
     */
    public data object AutoBodyRepairShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "auto_body_repair_shops"
    }

    /**
     * Documented value. Wire value: `auto_paint_shops`.
     */
    public data object AutoPaintShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "auto_paint_shops"
    }

    /**
     * Documented value. Wire value: `auto_service_shops`.
     */
    public data object AutoServiceShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "auto_service_shops"
    }

    /**
     * Documented value. Wire value: `automated_cash_disburse`.
     */
    public data object AutomatedCashDisburse : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "automated_cash_disburse"
    }

    /**
     * Documented value. Wire value: `automated_fuel_dispensers`.
     */
    public data object AutomatedFuelDispensers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "automated_fuel_dispensers"
    }

    /**
     * Documented value. Wire value: `automobile_associations`.
     */
    public data object AutomobileAssociations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "automobile_associations"
    }

    /**
     * Documented value. Wire value: `automotive_parts_and_accessories_stores`.
     */
    public data object AutomotivePartsAndAccessoriesStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "automotive_parts_and_accessories_stores"
    }

    /**
     * Documented value. Wire value: `automotive_tire_stores`.
     */
    public data object AutomotiveTireStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "automotive_tire_stores"
    }

    /**
     * Documented value. Wire value: `bail_and_bond_payments`.
     */
    public data object BailAndBondPayments : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "bail_and_bond_payments"
    }

    /**
     * Documented value. Wire value: `bakeries`.
     */
    public data object Bakeries : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "bakeries"
    }

    /**
     * Documented value. Wire value: `bands_orchestras`.
     */
    public data object BandsOrchestras : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "bands_orchestras"
    }

    /**
     * Documented value. Wire value: `barber_and_beauty_shops`.
     */
    public data object BarberAndBeautyShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "barber_and_beauty_shops"
    }

    /**
     * Documented value. Wire value: `betting_casino_gambling`.
     */
    public data object BettingCasinoGambling : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "betting_casino_gambling"
    }

    /**
     * Documented value. Wire value: `bicycle_shops`.
     */
    public data object BicycleShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "bicycle_shops"
    }

    /**
     * Documented value. Wire value: `billiard_pool_establishments`.
     */
    public data object BilliardPoolEstablishments : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "billiard_pool_establishments"
    }

    /**
     * Documented value. Wire value: `boat_dealers`.
     */
    public data object BoatDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "boat_dealers"
    }

    /**
     * Documented value. Wire value: `boat_rentals_and_leases`.
     */
    public data object BoatRentalsAndLeases : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "boat_rentals_and_leases"
    }

    /**
     * Documented value. Wire value: `book_stores`.
     */
    public data object BookStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "book_stores"
    }

    /**
     * Documented value. Wire value: `books_periodicals_and_newspapers`.
     */
    public data object BooksPeriodicalsAndNewspapers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "books_periodicals_and_newspapers"
    }

    /**
     * Documented value. Wire value: `bowling_alleys`.
     */
    public data object BowlingAlleys : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "bowling_alleys"
    }

    /**
     * Documented value. Wire value: `bus_lines`.
     */
    public data object BusLines : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "bus_lines"
    }

    /**
     * Documented value. Wire value: `business_secretarial_schools`.
     */
    public data object BusinessSecretarialSchools : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "business_secretarial_schools"
    }

    /**
     * Documented value. Wire value: `buying_shopping_services`.
     */
    public data object BuyingShoppingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "buying_shopping_services"
    }

    /**
     * Documented value. Wire value: `cable_satellite_and_other_pay_television_and_radio`.
     */
    public data object CableSatelliteAndOtherPayTelevisionAndRadio : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "cable_satellite_and_other_pay_television_and_radio"
    }

    /**
     * Documented value. Wire value: `camera_and_photographic_supply_stores`.
     */
    public data object CameraAndPhotographicSupplyStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "camera_and_photographic_supply_stores"
    }

    /**
     * Documented value. Wire value: `candy_nut_and_confectionery_stores`.
     */
    public data object CandyNutAndConfectioneryStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "candy_nut_and_confectionery_stores"
    }

    /**
     * Documented value. Wire value: `car_and_truck_dealers_new_used`.
     */
    public data object CarAndTruckDealersNewUsed : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "car_and_truck_dealers_new_used"
    }

    /**
     * Documented value. Wire value: `car_and_truck_dealers_used_only`.
     */
    public data object CarAndTruckDealersUsedOnly : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "car_and_truck_dealers_used_only"
    }

    /**
     * Documented value. Wire value: `car_rental_agencies`.
     */
    public data object CarRentalAgencies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "car_rental_agencies"
    }

    /**
     * Documented value. Wire value: `car_washes`.
     */
    public data object CarWashes : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "car_washes"
    }

    /**
     * Documented value. Wire value: `carpentry_services`.
     */
    public data object CarpentryServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "carpentry_services"
    }

    /**
     * Documented value. Wire value: `carpet_upholstery_cleaning`.
     */
    public data object CarpetUpholsteryCleaning : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "carpet_upholstery_cleaning"
    }

    /**
     * Documented value. Wire value: `caterers`.
     */
    public data object Caterers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "caterers"
    }

    /**
     * Documented value. Wire value: `charitable_and_social_service_organizations_fundraising`.
     */
    public data object CharitableAndSocialServiceOrganizationsFundraising : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "charitable_and_social_service_organizations_fundraising"
    }

    /**
     * Documented value. Wire value: `chemicals_and_allied_products`.
     */
    public data object ChemicalsAndAlliedProducts : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "chemicals_and_allied_products"
    }

    /**
     * Documented value. Wire value: `child_care_services`.
     */
    public data object ChildCareServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "child_care_services"
    }

    /**
     * Documented value. Wire value: `childrens_and_infants_wear_stores`.
     */
    public data object ChildrensAndInfantsWearStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "childrens_and_infants_wear_stores"
    }

    /**
     * Documented value. Wire value: `chiropodists_podiatrists`.
     */
    public data object ChiropodistsPodiatrists : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "chiropodists_podiatrists"
    }

    /**
     * Documented value. Wire value: `chiropractors`.
     */
    public data object Chiropractors : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "chiropractors"
    }

    /**
     * Documented value. Wire value: `cigar_stores_and_stands`.
     */
    public data object CigarStoresAndStands : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "cigar_stores_and_stands"
    }

    /**
     * Documented value. Wire value: `civic_social_fraternal_associations`.
     */
    public data object CivicSocialFraternalAssociations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "civic_social_fraternal_associations"
    }

    /**
     * Documented value. Wire value: `cleaning_and_maintenance`.
     */
    public data object CleaningAndMaintenance : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "cleaning_and_maintenance"
    }

    /**
     * Documented value. Wire value: `clothing_rental`.
     */
    public data object ClothingRental : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "clothing_rental"
    }

    /**
     * Documented value. Wire value: `colleges_universities`.
     */
    public data object CollegesUniversities : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "colleges_universities"
    }

    /**
     * Documented value. Wire value: `commercial_equipment`.
     */
    public data object CommercialEquipment : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "commercial_equipment"
    }

    /**
     * Documented value. Wire value: `commercial_footwear`.
     */
    public data object CommercialFootwear : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "commercial_footwear"
    }

    /**
     * Documented value. Wire value: `commercial_photography_art_and_graphics`.
     */
    public data object CommercialPhotographyArtAndGraphics : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "commercial_photography_art_and_graphics"
    }

    /**
     * Documented value. Wire value: `commuter_transport_and_ferries`.
     */
    public data object CommuterTransportAndFerries : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "commuter_transport_and_ferries"
    }

    /**
     * Documented value. Wire value: `computer_network_services`.
     */
    public data object ComputerNetworkServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "computer_network_services"
    }

    /**
     * Documented value. Wire value: `computer_programming`.
     */
    public data object ComputerProgramming : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "computer_programming"
    }

    /**
     * Documented value. Wire value: `computer_repair`.
     */
    public data object ComputerRepair : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "computer_repair"
    }

    /**
     * Documented value. Wire value: `computer_software_stores`.
     */
    public data object ComputerSoftwareStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "computer_software_stores"
    }

    /**
     * Documented value. Wire value: `computers_peripherals_and_software`.
     */
    public data object ComputersPeripheralsAndSoftware : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "computers_peripherals_and_software"
    }

    /**
     * Documented value. Wire value: `concrete_work_services`.
     */
    public data object ConcreteWorkServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "concrete_work_services"
    }

    /**
     * Documented value. Wire value: `construction_materials`.
     */
    public data object ConstructionMaterials : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "construction_materials"
    }

    /**
     * Documented value. Wire value: `consulting_public_relations`.
     */
    public data object ConsultingPublicRelations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "consulting_public_relations"
    }

    /**
     * Documented value. Wire value: `correspondence_schools`.
     */
    public data object CorrespondenceSchools : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "correspondence_schools"
    }

    /**
     * Documented value. Wire value: `cosmetic_stores`.
     */
    public data object CosmeticStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "cosmetic_stores"
    }

    /**
     * Documented value. Wire value: `counseling_services`.
     */
    public data object CounselingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "counseling_services"
    }

    /**
     * Documented value. Wire value: `country_clubs`.
     */
    public data object CountryClubs : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "country_clubs"
    }

    /**
     * Documented value. Wire value: `courier_services`.
     */
    public data object CourierServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "courier_services"
    }

    /**
     * Documented value. Wire value: `court_costs`.
     */
    public data object CourtCosts : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "court_costs"
    }

    /**
     * Documented value. Wire value: `credit_reporting_agencies`.
     */
    public data object CreditReportingAgencies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "credit_reporting_agencies"
    }

    /**
     * Documented value. Wire value: `cruise_lines`.
     */
    public data object CruiseLines : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "cruise_lines"
    }

    /**
     * Documented value. Wire value: `dairy_products_stores`.
     */
    public data object DairyProductsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "dairy_products_stores"
    }

    /**
     * Documented value. Wire value: `dance_hall_studios_schools`.
     */
    public data object DanceHallStudiosSchools : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "dance_hall_studios_schools"
    }

    /**
     * Documented value. Wire value: `dating_escort_services`.
     */
    public data object DatingEscortServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "dating_escort_services"
    }

    /**
     * Documented value. Wire value: `dentists_orthodontists`.
     */
    public data object DentistsOrthodontists : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "dentists_orthodontists"
    }

    /**
     * Documented value. Wire value: `department_stores`.
     */
    public data object DepartmentStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "department_stores"
    }

    /**
     * Documented value. Wire value: `detective_agencies`.
     */
    public data object DetectiveAgencies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "detective_agencies"
    }

    /**
     * Documented value. Wire value: `digital_goods_applications`.
     */
    public data object DigitalGoodsApplications : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "digital_goods_applications"
    }

    /**
     * Documented value. Wire value: `digital_goods_games`.
     */
    public data object DigitalGoodsGames : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "digital_goods_games"
    }

    /**
     * Documented value. Wire value: `digital_goods_large_volume`.
     */
    public data object DigitalGoodsLargeVolume : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "digital_goods_large_volume"
    }

    /**
     * Documented value. Wire value: `digital_goods_media`.
     */
    public data object DigitalGoodsMedia : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "digital_goods_media"
    }

    /**
     * Documented value. Wire value: `direct_marketing_catalog_merchant`.
     */
    public data object DirectMarketingCatalogMerchant : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_catalog_merchant"
    }

    /**
     * Documented value. Wire value: `direct_marketing_combination_catalog_and_retail_merchant`.
     */
    public data object DirectMarketingCombinationCatalogAndRetailMerchant : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_combination_catalog_and_retail_merchant"
    }

    /**
     * Documented value. Wire value: `direct_marketing_inbound_telemarketing`.
     */
    public data object DirectMarketingInboundTelemarketing : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_inbound_telemarketing"
    }

    /**
     * Documented value. Wire value: `direct_marketing_insurance_services`.
     */
    public data object DirectMarketingInsuranceServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_insurance_services"
    }

    /**
     * Documented value. Wire value: `direct_marketing_other`.
     */
    public data object DirectMarketingOther : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_other"
    }

    /**
     * Documented value. Wire value: `direct_marketing_outbound_telemarketing`.
     */
    public data object DirectMarketingOutboundTelemarketing : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_outbound_telemarketing"
    }

    /**
     * Documented value. Wire value: `direct_marketing_subscription`.
     */
    public data object DirectMarketingSubscription : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_subscription"
    }

    /**
     * Documented value. Wire value: `direct_marketing_travel`.
     */
    public data object DirectMarketingTravel : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "direct_marketing_travel"
    }

    /**
     * Documented value. Wire value: `discount_stores`.
     */
    public data object DiscountStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "discount_stores"
    }

    /**
     * Documented value. Wire value: `doctors`.
     */
    public data object Doctors : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "doctors"
    }

    /**
     * Documented value. Wire value: `door_to_door_sales`.
     */
    public data object DoorToDoorSales : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "door_to_door_sales"
    }

    /**
     * Documented value. Wire value: `drapery_window_covering_and_upholstery_stores`.
     */
    public data object DraperyWindowCoveringAndUpholsteryStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "drapery_window_covering_and_upholstery_stores"
    }

    /**
     * Documented value. Wire value: `drinking_places`.
     */
    public data object DrinkingPlaces : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "drinking_places"
    }

    /**
     * Documented value. Wire value: `drug_stores_and_pharmacies`.
     */
    public data object DrugStoresAndPharmacies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "drug_stores_and_pharmacies"
    }

    /**
     * Documented value. Wire value: `drugs_drug_proprietaries_and_druggist_sundries`.
     */
    public data object DrugsDrugProprietariesAndDruggistSundries : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "drugs_drug_proprietaries_and_druggist_sundries"
    }

    /**
     * Documented value. Wire value: `dry_cleaners`.
     */
    public data object DryCleaners : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "dry_cleaners"
    }

    /**
     * Documented value. Wire value: `durable_goods`.
     */
    public data object DurableGoods : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "durable_goods"
    }

    /**
     * Documented value. Wire value: `duty_free_stores`.
     */
    public data object DutyFreeStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "duty_free_stores"
    }

    /**
     * Documented value. Wire value: `eating_places_restaurants`.
     */
    public data object EatingPlacesRestaurants : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "eating_places_restaurants"
    }

    /**
     * Documented value. Wire value: `educational_services`.
     */
    public data object EducationalServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "educational_services"
    }

    /**
     * Documented value. Wire value: `electric_razor_stores`.
     */
    public data object ElectricRazorStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "electric_razor_stores"
    }

    /**
     * Documented value. Wire value: `electric_vehicle_charging`.
     */
    public data object ElectricVehicleCharging : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "electric_vehicle_charging"
    }

    /**
     * Documented value. Wire value: `electrical_parts_and_equipment`.
     */
    public data object ElectricalPartsAndEquipment : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "electrical_parts_and_equipment"
    }

    /**
     * Documented value. Wire value: `electrical_services`.
     */
    public data object ElectricalServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "electrical_services"
    }

    /**
     * Documented value. Wire value: `electronics_repair_shops`.
     */
    public data object ElectronicsRepairShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "electronics_repair_shops"
    }

    /**
     * Documented value. Wire value: `electronics_stores`.
     */
    public data object ElectronicsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "electronics_stores"
    }

    /**
     * Documented value. Wire value: `elementary_secondary_schools`.
     */
    public data object ElementarySecondarySchools : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "elementary_secondary_schools"
    }

    /**
     * Documented value. Wire value: `emergency_services_gcas_visa_use_only`.
     */
    public data object EmergencyServicesGcasVisaUseOnly : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "emergency_services_gcas_visa_use_only"
    }

    /**
     * Documented value. Wire value: `employment_temp_agencies`.
     */
    public data object EmploymentTempAgencies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "employment_temp_agencies"
    }

    /**
     * Documented value. Wire value: `equipment_rental`.
     */
    public data object EquipmentRental : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "equipment_rental"
    }

    /**
     * Documented value. Wire value: `exterminating_services`.
     */
    public data object ExterminatingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "exterminating_services"
    }

    /**
     * Documented value. Wire value: `family_clothing_stores`.
     */
    public data object FamilyClothingStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "family_clothing_stores"
    }

    /**
     * Documented value. Wire value: `fast_food_restaurants`.
     */
    public data object FastFoodRestaurants : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "fast_food_restaurants"
    }

    /**
     * Documented value. Wire value: `financial_institutions`.
     */
    public data object FinancialInstitutions : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "financial_institutions"
    }

    /**
     * Documented value. Wire value: `fines_government_administrative_entities`.
     */
    public data object FinesGovernmentAdministrativeEntities : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "fines_government_administrative_entities"
    }

    /**
     * Documented value. Wire value: `fireplace_fireplace_screens_and_accessories_stores`.
     */
    public data object FireplaceFireplaceScreensAndAccessoriesStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "fireplace_fireplace_screens_and_accessories_stores"
    }

    /**
     * Documented value. Wire value: `floor_covering_stores`.
     */
    public data object FloorCoveringStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "floor_covering_stores"
    }

    /**
     * Documented value. Wire value: `florists`.
     */
    public data object Florists : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "florists"
    }

    /**
     * Documented value. Wire value: `florists_supplies_nursery_stock_and_flowers`.
     */
    public data object FloristsSuppliesNurseryStockAndFlowers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "florists_supplies_nursery_stock_and_flowers"
    }

    /**
     * Documented value. Wire value: `freezer_and_locker_meat_provisioners`.
     */
    public data object FreezerAndLockerMeatProvisioners : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "freezer_and_locker_meat_provisioners"
    }

    /**
     * Documented value. Wire value: `fuel_dealers_non_automotive`.
     */
    public data object FuelDealersNonAutomotive : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "fuel_dealers_non_automotive"
    }

    /**
     * Documented value. Wire value: `funeral_services_crematories`.
     */
    public data object FuneralServicesCrematories : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "funeral_services_crematories"
    }

    /**
     * Documented value. Wire value: `furniture_home_furnishings_and_equipment_stores_except_appliances`.
     */
    public data object FurnitureHomeFurnishingsAndEquipmentStoresExceptAppliances : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String =
            "furniture_home_furnishings_and_equipment_stores_except_appliances"
    }

    /**
     * Documented value. Wire value: `furniture_repair_refinishing`.
     */
    public data object FurnitureRepairRefinishing : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "furniture_repair_refinishing"
    }

    /**
     * Documented value. Wire value: `furriers_and_fur_shops`.
     */
    public data object FurriersAndFurShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "furriers_and_fur_shops"
    }

    /**
     * Documented value. Wire value: `general_services`.
     */
    public data object GeneralServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "general_services"
    }

    /**
     * Documented value. Wire value: `gift_card_novelty_and_souvenir_shops`.
     */
    public data object GiftCardNoveltyAndSouvenirShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "gift_card_novelty_and_souvenir_shops"
    }

    /**
     * Documented value. Wire value: `glass_paint_and_wallpaper_stores`.
     */
    public data object GlassPaintAndWallpaperStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "glass_paint_and_wallpaper_stores"
    }

    /**
     * Documented value. Wire value: `glassware_crystal_stores`.
     */
    public data object GlasswareCrystalStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "glassware_crystal_stores"
    }

    /**
     * Documented value. Wire value: `golf_courses_public`.
     */
    public data object GolfCoursesPublic : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "golf_courses_public"
    }

    /**
     * Documented value. Wire value: `government_licensed_horse_dog_racing_us_region_only`.
     */
    public data object GovernmentLicensedHorseDogRacingUsRegionOnly : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "government_licensed_horse_dog_racing_us_region_only"
    }

    /**
     * Documented value. Wire value: `government_licensed_online_casions_online_gambling_us_region_only`.
     */
    public data object GovernmentLicensedOnlineCasionsOnlineGamblingUsRegionOnly : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String =
            "government_licensed_online_casions_online_gambling_us_region_only"
    }

    /**
     * Documented value. Wire value: `government_owned_lotteries_non_us_region`.
     */
    public data object GovernmentOwnedLotteriesNonUsRegion : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "government_owned_lotteries_non_us_region"
    }

    /**
     * Documented value. Wire value: `government_owned_lotteries_us_region_only`.
     */
    public data object GovernmentOwnedLotteriesUsRegionOnly : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "government_owned_lotteries_us_region_only"
    }

    /**
     * Documented value. Wire value: `government_services`.
     */
    public data object GovernmentServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "government_services"
    }

    /**
     * Documented value. Wire value: `grocery_stores_supermarkets`.
     */
    public data object GroceryStoresSupermarkets : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "grocery_stores_supermarkets"
    }

    /**
     * Documented value. Wire value: `hardware_equipment_and_supplies`.
     */
    public data object HardwareEquipmentAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "hardware_equipment_and_supplies"
    }

    /**
     * Documented value. Wire value: `hardware_stores`.
     */
    public data object HardwareStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "hardware_stores"
    }

    /**
     * Documented value. Wire value: `health_and_beauty_spas`.
     */
    public data object HealthAndBeautySpas : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "health_and_beauty_spas"
    }

    /**
     * Documented value. Wire value: `hearing_aids_sales_and_supplies`.
     */
    public data object HearingAidsSalesAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "hearing_aids_sales_and_supplies"
    }

    /**
     * Documented value. Wire value: `heating_plumbing_a_c`.
     */
    public data object HeatingPlumbingAC : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "heating_plumbing_a_c"
    }

    /**
     * Documented value. Wire value: `hobby_toy_and_game_shops`.
     */
    public data object HobbyToyAndGameShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "hobby_toy_and_game_shops"
    }

    /**
     * Documented value. Wire value: `home_supply_warehouse_stores`.
     */
    public data object HomeSupplyWarehouseStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "home_supply_warehouse_stores"
    }

    /**
     * Documented value. Wire value: `hospitals`.
     */
    public data object Hospitals : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "hospitals"
    }

    /**
     * Documented value. Wire value: `hotels_motels_and_resorts`.
     */
    public data object HotelsMotelsAndResorts : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "hotels_motels_and_resorts"
    }

    /**
     * Documented value. Wire value: `household_appliance_stores`.
     */
    public data object HouseholdApplianceStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "household_appliance_stores"
    }

    /**
     * Documented value. Wire value: `industrial_supplies`.
     */
    public data object IndustrialSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "industrial_supplies"
    }

    /**
     * Documented value. Wire value: `information_retrieval_services`.
     */
    public data object InformationRetrievalServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "information_retrieval_services"
    }

    /**
     * Documented value. Wire value: `insurance_default`.
     */
    public data object InsuranceDefault : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "insurance_default"
    }

    /**
     * Documented value. Wire value: `insurance_underwriting_premiums`.
     */
    public data object InsuranceUnderwritingPremiums : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "insurance_underwriting_premiums"
    }

    /**
     * Documented value. Wire value: `intra_company_purchases`.
     */
    public data object IntraCompanyPurchases : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "intra_company_purchases"
    }

    /**
     * Documented value. Wire value: `jewelry_stores_watches_clocks_and_silverware_stores`.
     */
    public data object JewelryStoresWatchesClocksAndSilverwareStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "jewelry_stores_watches_clocks_and_silverware_stores"
    }

    /**
     * Documented value. Wire value: `landscaping_services`.
     */
    public data object LandscapingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "landscaping_services"
    }

    /**
     * Documented value. Wire value: `laundries`.
     */
    public data object Laundries : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "laundries"
    }

    /**
     * Documented value. Wire value: `laundry_cleaning_services`.
     */
    public data object LaundryCleaningServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "laundry_cleaning_services"
    }

    /**
     * Documented value. Wire value: `legal_services_attorneys`.
     */
    public data object LegalServicesAttorneys : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "legal_services_attorneys"
    }

    /**
     * Documented value. Wire value: `luggage_and_leather_goods_stores`.
     */
    public data object LuggageAndLeatherGoodsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "luggage_and_leather_goods_stores"
    }

    /**
     * Documented value. Wire value: `lumber_building_materials_stores`.
     */
    public data object LumberBuildingMaterialsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "lumber_building_materials_stores"
    }

    /**
     * Documented value. Wire value: `manual_cash_disburse`.
     */
    public data object ManualCashDisburse : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "manual_cash_disburse"
    }

    /**
     * Documented value. Wire value: `marinas_service_and_supplies`.
     */
    public data object MarinasServiceAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "marinas_service_and_supplies"
    }

    /**
     * Documented value. Wire value: `marketplaces`.
     */
    public data object Marketplaces : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "marketplaces"
    }

    /**
     * Documented value. Wire value: `masonry_stonework_and_plaster`.
     */
    public data object MasonryStoneworkAndPlaster : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "masonry_stonework_and_plaster"
    }

    /**
     * Documented value. Wire value: `massage_parlors`.
     */
    public data object MassageParlors : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "massage_parlors"
    }

    /**
     * Documented value. Wire value: `medical_and_dental_labs`.
     */
    public data object MedicalAndDentalLabs : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "medical_and_dental_labs"
    }

    /**
     * Documented value. Wire value: `medical_dental_ophthalmic_and_hospital_equipment_and_supplies`.
     */
    public data object MedicalDentalOphthalmicAndHospitalEquipmentAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String =
            "medical_dental_ophthalmic_and_hospital_equipment_and_supplies"
    }

    /**
     * Documented value. Wire value: `medical_services`.
     */
    public data object MedicalServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "medical_services"
    }

    /**
     * Documented value. Wire value: `membership_organizations`.
     */
    public data object MembershipOrganizations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "membership_organizations"
    }

    /**
     * Documented value. Wire value: `mens_and_boys_clothing_and_accessories_stores`.
     */
    public data object MensAndBoysClothingAndAccessoriesStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "mens_and_boys_clothing_and_accessories_stores"
    }

    /**
     * Documented value. Wire value: `mens_womens_clothing_stores`.
     */
    public data object MensWomensClothingStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "mens_womens_clothing_stores"
    }

    /**
     * Documented value. Wire value: `metal_service_centers`.
     */
    public data object MetalServiceCenters : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "metal_service_centers"
    }

    /**
     * Documented value. Wire value: `miscellaneous`.
     */
    public data object Miscellaneous : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous"
    }

    /**
     * Documented value. Wire value: `miscellaneous_apparel_and_accessory_shops`.
     */
    public data object MiscellaneousApparelAndAccessoryShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_apparel_and_accessory_shops"
    }

    /**
     * Documented value. Wire value: `miscellaneous_auto_dealers`.
     */
    public data object MiscellaneousAutoDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_auto_dealers"
    }

    /**
     * Documented value. Wire value: `miscellaneous_business_services`.
     */
    public data object MiscellaneousBusinessServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_business_services"
    }

    /**
     * Documented value. Wire value: `miscellaneous_food_stores`.
     */
    public data object MiscellaneousFoodStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_food_stores"
    }

    /**
     * Documented value. Wire value: `miscellaneous_general_merchandise`.
     */
    public data object MiscellaneousGeneralMerchandise : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_general_merchandise"
    }

    /**
     * Documented value. Wire value: `miscellaneous_general_services`.
     */
    public data object MiscellaneousGeneralServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_general_services"
    }

    /**
     * Documented value. Wire value: `miscellaneous_home_furnishing_specialty_stores`.
     */
    public data object MiscellaneousHomeFurnishingSpecialtyStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_home_furnishing_specialty_stores"
    }

    /**
     * Documented value. Wire value: `miscellaneous_publishing_and_printing`.
     */
    public data object MiscellaneousPublishingAndPrinting : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_publishing_and_printing"
    }

    /**
     * Documented value. Wire value: `miscellaneous_recreation_services`.
     */
    public data object MiscellaneousRecreationServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_recreation_services"
    }

    /**
     * Documented value. Wire value: `miscellaneous_repair_shops`.
     */
    public data object MiscellaneousRepairShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_repair_shops"
    }

    /**
     * Documented value. Wire value: `miscellaneous_specialty_retail`.
     */
    public data object MiscellaneousSpecialtyRetail : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "miscellaneous_specialty_retail"
    }

    /**
     * Documented value. Wire value: `mobile_home_dealers`.
     */
    public data object MobileHomeDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "mobile_home_dealers"
    }

    /**
     * Documented value. Wire value: `motion_picture_theaters`.
     */
    public data object MotionPictureTheaters : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "motion_picture_theaters"
    }

    /**
     * Documented value. Wire value: `motor_freight_carriers_and_trucking`.
     */
    public data object MotorFreightCarriersAndTrucking : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "motor_freight_carriers_and_trucking"
    }

    /**
     * Documented value. Wire value: `motor_homes_dealers`.
     */
    public data object MotorHomesDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "motor_homes_dealers"
    }

    /**
     * Documented value. Wire value: `motor_vehicle_supplies_and_new_parts`.
     */
    public data object MotorVehicleSuppliesAndNewParts : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "motor_vehicle_supplies_and_new_parts"
    }

    /**
     * Documented value. Wire value: `motorcycle_shops_and_dealers`.
     */
    public data object MotorcycleShopsAndDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "motorcycle_shops_and_dealers"
    }

    /**
     * Documented value. Wire value: `motorcycle_shops_dealers`.
     */
    public data object MotorcycleShopsDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "motorcycle_shops_dealers"
    }

    /**
     * Documented value. Wire value: `music_stores_musical_instruments_pianos_and_sheet_music`.
     */
    public data object MusicStoresMusicalInstrumentsPianosAndSheetMusic : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "music_stores_musical_instruments_pianos_and_sheet_music"
    }

    /**
     * Documented value. Wire value: `news_dealers_and_newsstands`.
     */
    public data object NewsDealersAndNewsstands : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "news_dealers_and_newsstands"
    }

    /**
     * Documented value. Wire value: `non_fi_money_orders`.
     */
    public data object NonFiMoneyOrders : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "non_fi_money_orders"
    }

    /**
     * Documented value. Wire value: `non_fi_stored_value_card_purchase_load`.
     */
    public data object NonFiStoredValueCardPurchaseLoad : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "non_fi_stored_value_card_purchase_load"
    }

    /**
     * Documented value. Wire value: `nondurable_goods`.
     */
    public data object NondurableGoods : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "nondurable_goods"
    }

    /**
     * Documented value. Wire value: `nurseries_lawn_and_garden_supply_stores`.
     */
    public data object NurseriesLawnAndGardenSupplyStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "nurseries_lawn_and_garden_supply_stores"
    }

    /**
     * Documented value. Wire value: `nursing_personal_care`.
     */
    public data object NursingPersonalCare : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "nursing_personal_care"
    }

    /**
     * Documented value. Wire value: `office_and_commercial_furniture`.
     */
    public data object OfficeAndCommercialFurniture : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "office_and_commercial_furniture"
    }

    /**
     * Documented value. Wire value: `opticians_eyeglasses`.
     */
    public data object OpticiansEyeglasses : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "opticians_eyeglasses"
    }

    /**
     * Documented value. Wire value: `optometrists_ophthalmologist`.
     */
    public data object OptometristsOphthalmologist : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "optometrists_ophthalmologist"
    }

    /**
     * Documented value. Wire value: `orthopedic_goods_prosthetic_devices`.
     */
    public data object OrthopedicGoodsProstheticDevices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "orthopedic_goods_prosthetic_devices"
    }

    /**
     * Documented value. Wire value: `osteopaths`.
     */
    public data object Osteopaths : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "osteopaths"
    }

    /**
     * Documented value. Wire value: `package_stores_beer_wine_and_liquor`.
     */
    public data object PackageStoresBeerWineAndLiquor : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "package_stores_beer_wine_and_liquor"
    }

    /**
     * Documented value. Wire value: `paints_varnishes_and_supplies`.
     */
    public data object PaintsVarnishesAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "paints_varnishes_and_supplies"
    }

    /**
     * Documented value. Wire value: `parking_lots_garages`.
     */
    public data object ParkingLotsGarages : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "parking_lots_garages"
    }

    /**
     * Documented value. Wire value: `passenger_railways`.
     */
    public data object PassengerRailways : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "passenger_railways"
    }

    /**
     * Documented value. Wire value: `pawn_shops`.
     */
    public data object PawnShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "pawn_shops"
    }

    /**
     * Documented value. Wire value: `pet_shops_pet_food_and_supplies`.
     */
    public data object PetShopsPetFoodAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "pet_shops_pet_food_and_supplies"
    }

    /**
     * Documented value. Wire value: `petroleum_and_petroleum_products`.
     */
    public data object PetroleumAndPetroleumProducts : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "petroleum_and_petroleum_products"
    }

    /**
     * Documented value. Wire value: `photo_developing`.
     */
    public data object PhotoDeveloping : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "photo_developing"
    }

    /**
     * Documented value. Wire value: `photographic_photocopy_microfilm_equipment_and_supplies`.
     */
    public data object PhotographicPhotocopyMicrofilmEquipmentAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "photographic_photocopy_microfilm_equipment_and_supplies"
    }

    /**
     * Documented value. Wire value: `photographic_studios`.
     */
    public data object PhotographicStudios : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "photographic_studios"
    }

    /**
     * Documented value. Wire value: `picture_video_production`.
     */
    public data object PictureVideoProduction : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "picture_video_production"
    }

    /**
     * Documented value. Wire value: `piece_goods_notions_and_other_dry_goods`.
     */
    public data object PieceGoodsNotionsAndOtherDryGoods : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "piece_goods_notions_and_other_dry_goods"
    }

    /**
     * Documented value. Wire value: `plumbing_heating_equipment_and_supplies`.
     */
    public data object PlumbingHeatingEquipmentAndSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "plumbing_heating_equipment_and_supplies"
    }

    /**
     * Documented value. Wire value: `political_organizations`.
     */
    public data object PoliticalOrganizations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "political_organizations"
    }

    /**
     * Documented value. Wire value: `postal_services_government_only`.
     */
    public data object PostalServicesGovernmentOnly : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "postal_services_government_only"
    }

    /**
     * Documented value. Wire value: `precious_stones_and_metals_watches_and_jewelry`.
     */
    public data object PreciousStonesAndMetalsWatchesAndJewelry : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "precious_stones_and_metals_watches_and_jewelry"
    }

    /**
     * Documented value. Wire value: `professional_services`.
     */
    public data object ProfessionalServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "professional_services"
    }

    /**
     * Documented value. Wire value: `public_warehousing_and_storage`.
     */
    public data object PublicWarehousingAndStorage : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "public_warehousing_and_storage"
    }

    /**
     * Documented value. Wire value: `quick_copy_repro_and_blueprint`.
     */
    public data object QuickCopyReproAndBlueprint : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "quick_copy_repro_and_blueprint"
    }

    /**
     * Documented value. Wire value: `railroads`.
     */
    public data object Railroads : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "railroads"
    }

    /**
     * Documented value. Wire value: `real_estate_agents_and_managers_rentals`.
     */
    public data object RealEstateAgentsAndManagersRentals : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "real_estate_agents_and_managers_rentals"
    }

    /**
     * Documented value. Wire value: `record_stores`.
     */
    public data object RecordStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "record_stores"
    }

    /**
     * Documented value. Wire value: `recreational_vehicle_rentals`.
     */
    public data object RecreationalVehicleRentals : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "recreational_vehicle_rentals"
    }

    /**
     * Documented value. Wire value: `religious_goods_stores`.
     */
    public data object ReligiousGoodsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "religious_goods_stores"
    }

    /**
     * Documented value. Wire value: `religious_organizations`.
     */
    public data object ReligiousOrganizations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "religious_organizations"
    }

    /**
     * Documented value. Wire value: `roofing_siding_sheet_metal`.
     */
    public data object RoofingSidingSheetMetal : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "roofing_siding_sheet_metal"
    }

    /**
     * Documented value. Wire value: `secretarial_support_services`.
     */
    public data object SecretarialSupportServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "secretarial_support_services"
    }

    /**
     * Documented value. Wire value: `security_brokers_dealers`.
     */
    public data object SecurityBrokersDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "security_brokers_dealers"
    }

    /**
     * Documented value. Wire value: `service_stations`.
     */
    public data object ServiceStations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "service_stations"
    }

    /**
     * Documented value. Wire value: `sewing_needlework_fabric_and_piece_goods_stores`.
     */
    public data object SewingNeedleworkFabricAndPieceGoodsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "sewing_needlework_fabric_and_piece_goods_stores"
    }

    /**
     * Documented value. Wire value: `shoe_repair_hat_cleaning`.
     */
    public data object ShoeRepairHatCleaning : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "shoe_repair_hat_cleaning"
    }

    /**
     * Documented value. Wire value: `shoe_stores`.
     */
    public data object ShoeStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "shoe_stores"
    }

    /**
     * Documented value. Wire value: `small_appliance_repair`.
     */
    public data object SmallApplianceRepair : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "small_appliance_repair"
    }

    /**
     * Documented value. Wire value: `snowmobile_dealers`.
     */
    public data object SnowmobileDealers : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "snowmobile_dealers"
    }

    /**
     * Documented value. Wire value: `special_trade_services`.
     */
    public data object SpecialTradeServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "special_trade_services"
    }

    /**
     * Documented value. Wire value: `specialty_cleaning`.
     */
    public data object SpecialtyCleaning : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "specialty_cleaning"
    }

    /**
     * Documented value. Wire value: `sporting_goods_stores`.
     */
    public data object SportingGoodsStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "sporting_goods_stores"
    }

    /**
     * Documented value. Wire value: `sporting_recreation_camps`.
     */
    public data object SportingRecreationCamps : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "sporting_recreation_camps"
    }

    /**
     * Documented value. Wire value: `sports_and_riding_apparel_stores`.
     */
    public data object SportsAndRidingApparelStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "sports_and_riding_apparel_stores"
    }

    /**
     * Documented value. Wire value: `sports_clubs_fields`.
     */
    public data object SportsClubsFields : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "sports_clubs_fields"
    }

    /**
     * Documented value. Wire value: `stamp_and_coin_stores`.
     */
    public data object StampAndCoinStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "stamp_and_coin_stores"
    }

    /**
     * Documented value. Wire value: `stationary_office_supplies_printing_and_writing_paper`.
     */
    public data object StationaryOfficeSuppliesPrintingAndWritingPaper : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "stationary_office_supplies_printing_and_writing_paper"
    }

    /**
     * Documented value. Wire value: `stationery_stores_office_and_school_supply_stores`.
     */
    public data object StationeryStoresOfficeAndSchoolSupplyStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "stationery_stores_office_and_school_supply_stores"
    }

    /**
     * Documented value. Wire value: `swimming_pools_sales`.
     */
    public data object SwimmingPoolsSales : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "swimming_pools_sales"
    }

    /**
     * Documented value. Wire value: `t_ui_travel_germany`.
     */
    public data object TUiTravelGermany : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "t_ui_travel_germany"
    }

    /**
     * Documented value. Wire value: `tailors_alterations`.
     */
    public data object TailorsAlterations : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tailors_alterations"
    }

    /**
     * Documented value. Wire value: `tax_payments_government_agencies`.
     */
    public data object TaxPaymentsGovernmentAgencies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tax_payments_government_agencies"
    }

    /**
     * Documented value. Wire value: `tax_preparation_services`.
     */
    public data object TaxPreparationServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tax_preparation_services"
    }

    /**
     * Documented value. Wire value: `taxicabs_limousines`.
     */
    public data object TaxicabsLimousines : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "taxicabs_limousines"
    }

    /**
     * Documented value. Wire value: `telecommunication_equipment_and_telephone_sales`.
     */
    public data object TelecommunicationEquipmentAndTelephoneSales : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "telecommunication_equipment_and_telephone_sales"
    }

    /**
     * Documented value. Wire value: `telecommunication_services`.
     */
    public data object TelecommunicationServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "telecommunication_services"
    }

    /**
     * Documented value. Wire value: `telegraph_services`.
     */
    public data object TelegraphServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "telegraph_services"
    }

    /**
     * Documented value. Wire value: `tent_and_awning_shops`.
     */
    public data object TentAndAwningShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tent_and_awning_shops"
    }

    /**
     * Documented value. Wire value: `testing_laboratories`.
     */
    public data object TestingLaboratories : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "testing_laboratories"
    }

    /**
     * Documented value. Wire value: `theatrical_ticket_agencies`.
     */
    public data object TheatricalTicketAgencies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "theatrical_ticket_agencies"
    }

    /**
     * Documented value. Wire value: `timeshares`.
     */
    public data object Timeshares : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "timeshares"
    }

    /**
     * Documented value. Wire value: `tire_retreading_and_repair`.
     */
    public data object TireRetreadingAndRepair : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tire_retreading_and_repair"
    }

    /**
     * Documented value. Wire value: `tolls_bridge_fees`.
     */
    public data object TollsBridgeFees : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tolls_bridge_fees"
    }

    /**
     * Documented value. Wire value: `tourist_attractions_and_exhibits`.
     */
    public data object TouristAttractionsAndExhibits : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "tourist_attractions_and_exhibits"
    }

    /**
     * Documented value. Wire value: `towing_services`.
     */
    public data object TowingServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "towing_services"
    }

    /**
     * Documented value. Wire value: `trailer_parks_campgrounds`.
     */
    public data object TrailerParksCampgrounds : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "trailer_parks_campgrounds"
    }

    /**
     * Documented value. Wire value: `transportation_services`.
     */
    public data object TransportationServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "transportation_services"
    }

    /**
     * Documented value. Wire value: `travel_agencies_tour_operators`.
     */
    public data object TravelAgenciesTourOperators : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "travel_agencies_tour_operators"
    }

    /**
     * Documented value. Wire value: `truck_stop_iteration`.
     */
    public data object TruckStopIteration : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "truck_stop_iteration"
    }

    /**
     * Documented value. Wire value: `truck_utility_trailer_rentals`.
     */
    public data object TruckUtilityTrailerRentals : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "truck_utility_trailer_rentals"
    }

    /**
     * Documented value. Wire value: `typesetting_plate_making_and_related_services`.
     */
    public data object TypesettingPlateMakingAndRelatedServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "typesetting_plate_making_and_related_services"
    }

    /**
     * Documented value. Wire value: `typewriter_stores`.
     */
    public data object TypewriterStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "typewriter_stores"
    }

    /**
     * Documented value. Wire value: `u_s_federal_government_agencies_or_departments`.
     */
    public data object USFederalGovernmentAgenciesOrDepartments : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "u_s_federal_government_agencies_or_departments"
    }

    /**
     * Documented value. Wire value: `uniforms_commercial_clothing`.
     */
    public data object UniformsCommercialClothing : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "uniforms_commercial_clothing"
    }

    /**
     * Documented value. Wire value: `used_merchandise_and_secondhand_stores`.
     */
    public data object UsedMerchandiseAndSecondhandStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "used_merchandise_and_secondhand_stores"
    }

    /**
     * Documented value. Wire value: `utilities`.
     */
    public data object Utilities : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "utilities"
    }

    /**
     * Documented value. Wire value: `variety_stores`.
     */
    public data object VarietyStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "variety_stores"
    }

    /**
     * Documented value. Wire value: `veterinary_services`.
     */
    public data object VeterinaryServices : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "veterinary_services"
    }

    /**
     * Documented value. Wire value: `video_amusement_game_supplies`.
     */
    public data object VideoAmusementGameSupplies : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "video_amusement_game_supplies"
    }

    /**
     * Documented value. Wire value: `video_game_arcades`.
     */
    public data object VideoGameArcades : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "video_game_arcades"
    }

    /**
     * Documented value. Wire value: `video_tape_rental_stores`.
     */
    public data object VideoTapeRentalStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "video_tape_rental_stores"
    }

    /**
     * Documented value. Wire value: `vocational_trade_schools`.
     */
    public data object VocationalTradeSchools : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "vocational_trade_schools"
    }

    /**
     * Documented value. Wire value: `watch_jewelry_repair`.
     */
    public data object WatchJewelryRepair : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "watch_jewelry_repair"
    }

    /**
     * Documented value. Wire value: `welding_repair`.
     */
    public data object WeldingRepair : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "welding_repair"
    }

    /**
     * Documented value. Wire value: `wholesale_clubs`.
     */
    public data object WholesaleClubs : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "wholesale_clubs"
    }

    /**
     * Documented value. Wire value: `wig_and_toupee_stores`.
     */
    public data object WigAndToupeeStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "wig_and_toupee_stores"
    }

    /**
     * Documented value. Wire value: `wires_money_orders`.
     */
    public data object WiresMoneyOrders : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "wires_money_orders"
    }

    /**
     * Documented value. Wire value: `womens_accessory_and_specialty_shops`.
     */
    public data object WomensAccessoryAndSpecialtyShops : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "womens_accessory_and_specialty_shops"
    }

    /**
     * Documented value. Wire value: `womens_ready_to_wear_stores`.
     */
    public data object WomensReadyToWearStores : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "womens_ready_to_wear_stores"
    }

    /**
     * Documented value. Wire value: `wrecking_and_salvage_yards`.
     */
    public data object WreckingAndSalvageYards : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466() {
        public override val `value`: String = "wrecking_and_salvage_yards"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466 =
            when (value) {
                AcRefrigerationRepair.value -> AcRefrigerationRepair
                AccountingBookkeepingServices.value -> AccountingBookkeepingServices
                AdvertisingServices.value -> AdvertisingServices
                AgriculturalCooperative.value -> AgriculturalCooperative
                AirlinesAirCarriers.value -> AirlinesAirCarriers
                AirportsFlyingFields.value -> AirportsFlyingFields
                AmbulanceServices.value -> AmbulanceServices
                AmusementParksCarnivals.value -> AmusementParksCarnivals
                AntiqueReproductions.value -> AntiqueReproductions
                AntiqueShops.value -> AntiqueShops
                Aquariums.value -> Aquariums
                ArchitecturalSurveyingServices.value -> ArchitecturalSurveyingServices
                ArtDealersAndGalleries.value -> ArtDealersAndGalleries
                ArtistsSupplyAndCraftShops.value -> ArtistsSupplyAndCraftShops
                AutoAndHomeSupplyStores.value -> AutoAndHomeSupplyStores
                AutoBodyRepairShops.value -> AutoBodyRepairShops
                AutoPaintShops.value -> AutoPaintShops
                AutoServiceShops.value -> AutoServiceShops
                AutomatedCashDisburse.value -> AutomatedCashDisburse
                AutomatedFuelDispensers.value -> AutomatedFuelDispensers
                AutomobileAssociations.value -> AutomobileAssociations
                AutomotivePartsAndAccessoriesStores.value -> AutomotivePartsAndAccessoriesStores
                AutomotiveTireStores.value -> AutomotiveTireStores
                BailAndBondPayments.value -> BailAndBondPayments
                Bakeries.value -> Bakeries
                BandsOrchestras.value -> BandsOrchestras
                BarberAndBeautyShops.value -> BarberAndBeautyShops
                BettingCasinoGambling.value -> BettingCasinoGambling
                BicycleShops.value -> BicycleShops
                BilliardPoolEstablishments.value -> BilliardPoolEstablishments
                BoatDealers.value -> BoatDealers
                BoatRentalsAndLeases.value -> BoatRentalsAndLeases
                BookStores.value -> BookStores
                BooksPeriodicalsAndNewspapers.value -> BooksPeriodicalsAndNewspapers
                BowlingAlleys.value -> BowlingAlleys
                BusLines.value -> BusLines
                BusinessSecretarialSchools.value -> BusinessSecretarialSchools
                BuyingShoppingServices.value -> BuyingShoppingServices
                CableSatelliteAndOtherPayTelevisionAndRadio.value -> CableSatelliteAndOtherPayTelevisionAndRadio
                CameraAndPhotographicSupplyStores.value -> CameraAndPhotographicSupplyStores
                CandyNutAndConfectioneryStores.value -> CandyNutAndConfectioneryStores
                CarAndTruckDealersNewUsed.value -> CarAndTruckDealersNewUsed
                CarAndTruckDealersUsedOnly.value -> CarAndTruckDealersUsedOnly
                CarRentalAgencies.value -> CarRentalAgencies
                CarWashes.value -> CarWashes
                CarpentryServices.value -> CarpentryServices
                CarpetUpholsteryCleaning.value -> CarpetUpholsteryCleaning
                Caterers.value -> Caterers
                CharitableAndSocialServiceOrganizationsFundraising.value -> CharitableAndSocialServiceOrganizationsFundraising
                ChemicalsAndAlliedProducts.value -> ChemicalsAndAlliedProducts
                ChildCareServices.value -> ChildCareServices
                ChildrensAndInfantsWearStores.value -> ChildrensAndInfantsWearStores
                ChiropodistsPodiatrists.value -> ChiropodistsPodiatrists
                Chiropractors.value -> Chiropractors
                CigarStoresAndStands.value -> CigarStoresAndStands
                CivicSocialFraternalAssociations.value -> CivicSocialFraternalAssociations
                CleaningAndMaintenance.value -> CleaningAndMaintenance
                ClothingRental.value -> ClothingRental
                CollegesUniversities.value -> CollegesUniversities
                CommercialEquipment.value -> CommercialEquipment
                CommercialFootwear.value -> CommercialFootwear
                CommercialPhotographyArtAndGraphics.value -> CommercialPhotographyArtAndGraphics
                CommuterTransportAndFerries.value -> CommuterTransportAndFerries
                ComputerNetworkServices.value -> ComputerNetworkServices
                ComputerProgramming.value -> ComputerProgramming
                ComputerRepair.value -> ComputerRepair
                ComputerSoftwareStores.value -> ComputerSoftwareStores
                ComputersPeripheralsAndSoftware.value -> ComputersPeripheralsAndSoftware
                ConcreteWorkServices.value -> ConcreteWorkServices
                ConstructionMaterials.value -> ConstructionMaterials
                ConsultingPublicRelations.value -> ConsultingPublicRelations
                CorrespondenceSchools.value -> CorrespondenceSchools
                CosmeticStores.value -> CosmeticStores
                CounselingServices.value -> CounselingServices
                CountryClubs.value -> CountryClubs
                CourierServices.value -> CourierServices
                CourtCosts.value -> CourtCosts
                CreditReportingAgencies.value -> CreditReportingAgencies
                CruiseLines.value -> CruiseLines
                DairyProductsStores.value -> DairyProductsStores
                DanceHallStudiosSchools.value -> DanceHallStudiosSchools
                DatingEscortServices.value -> DatingEscortServices
                DentistsOrthodontists.value -> DentistsOrthodontists
                DepartmentStores.value -> DepartmentStores
                DetectiveAgencies.value -> DetectiveAgencies
                DigitalGoodsApplications.value -> DigitalGoodsApplications
                DigitalGoodsGames.value -> DigitalGoodsGames
                DigitalGoodsLargeVolume.value -> DigitalGoodsLargeVolume
                DigitalGoodsMedia.value -> DigitalGoodsMedia
                DirectMarketingCatalogMerchant.value -> DirectMarketingCatalogMerchant
                DirectMarketingCombinationCatalogAndRetailMerchant.value -> DirectMarketingCombinationCatalogAndRetailMerchant
                DirectMarketingInboundTelemarketing.value -> DirectMarketingInboundTelemarketing
                DirectMarketingInsuranceServices.value -> DirectMarketingInsuranceServices
                DirectMarketingOther.value -> DirectMarketingOther
                DirectMarketingOutboundTelemarketing.value -> DirectMarketingOutboundTelemarketing
                DirectMarketingSubscription.value -> DirectMarketingSubscription
                DirectMarketingTravel.value -> DirectMarketingTravel
                DiscountStores.value -> DiscountStores
                Doctors.value -> Doctors
                DoorToDoorSales.value -> DoorToDoorSales
                DraperyWindowCoveringAndUpholsteryStores.value -> DraperyWindowCoveringAndUpholsteryStores
                DrinkingPlaces.value -> DrinkingPlaces
                DrugStoresAndPharmacies.value -> DrugStoresAndPharmacies
                DrugsDrugProprietariesAndDruggistSundries.value -> DrugsDrugProprietariesAndDruggistSundries
                DryCleaners.value -> DryCleaners
                DurableGoods.value -> DurableGoods
                DutyFreeStores.value -> DutyFreeStores
                EatingPlacesRestaurants.value -> EatingPlacesRestaurants
                EducationalServices.value -> EducationalServices
                ElectricRazorStores.value -> ElectricRazorStores
                ElectricVehicleCharging.value -> ElectricVehicleCharging
                ElectricalPartsAndEquipment.value -> ElectricalPartsAndEquipment
                ElectricalServices.value -> ElectricalServices
                ElectronicsRepairShops.value -> ElectronicsRepairShops
                ElectronicsStores.value -> ElectronicsStores
                ElementarySecondarySchools.value -> ElementarySecondarySchools
                EmergencyServicesGcasVisaUseOnly.value -> EmergencyServicesGcasVisaUseOnly
                EmploymentTempAgencies.value -> EmploymentTempAgencies
                EquipmentRental.value -> EquipmentRental
                ExterminatingServices.value -> ExterminatingServices
                FamilyClothingStores.value -> FamilyClothingStores
                FastFoodRestaurants.value -> FastFoodRestaurants
                FinancialInstitutions.value -> FinancialInstitutions
                FinesGovernmentAdministrativeEntities.value -> FinesGovernmentAdministrativeEntities
                FireplaceFireplaceScreensAndAccessoriesStores.value -> FireplaceFireplaceScreensAndAccessoriesStores
                FloorCoveringStores.value -> FloorCoveringStores
                Florists.value -> Florists
                FloristsSuppliesNurseryStockAndFlowers.value -> FloristsSuppliesNurseryStockAndFlowers
                FreezerAndLockerMeatProvisioners.value -> FreezerAndLockerMeatProvisioners
                FuelDealersNonAutomotive.value -> FuelDealersNonAutomotive
                FuneralServicesCrematories.value -> FuneralServicesCrematories
                FurnitureHomeFurnishingsAndEquipmentStoresExceptAppliances.value -> FurnitureHomeFurnishingsAndEquipmentStoresExceptAppliances
                FurnitureRepairRefinishing.value -> FurnitureRepairRefinishing
                FurriersAndFurShops.value -> FurriersAndFurShops
                GeneralServices.value -> GeneralServices
                GiftCardNoveltyAndSouvenirShops.value -> GiftCardNoveltyAndSouvenirShops
                GlassPaintAndWallpaperStores.value -> GlassPaintAndWallpaperStores
                GlasswareCrystalStores.value -> GlasswareCrystalStores
                GolfCoursesPublic.value -> GolfCoursesPublic
                GovernmentLicensedHorseDogRacingUsRegionOnly.value -> GovernmentLicensedHorseDogRacingUsRegionOnly
                GovernmentLicensedOnlineCasionsOnlineGamblingUsRegionOnly.value -> GovernmentLicensedOnlineCasionsOnlineGamblingUsRegionOnly
                GovernmentOwnedLotteriesNonUsRegion.value -> GovernmentOwnedLotteriesNonUsRegion
                GovernmentOwnedLotteriesUsRegionOnly.value -> GovernmentOwnedLotteriesUsRegionOnly
                GovernmentServices.value -> GovernmentServices
                GroceryStoresSupermarkets.value -> GroceryStoresSupermarkets
                HardwareEquipmentAndSupplies.value -> HardwareEquipmentAndSupplies
                HardwareStores.value -> HardwareStores
                HealthAndBeautySpas.value -> HealthAndBeautySpas
                HearingAidsSalesAndSupplies.value -> HearingAidsSalesAndSupplies
                HeatingPlumbingAC.value -> HeatingPlumbingAC
                HobbyToyAndGameShops.value -> HobbyToyAndGameShops
                HomeSupplyWarehouseStores.value -> HomeSupplyWarehouseStores
                Hospitals.value -> Hospitals
                HotelsMotelsAndResorts.value -> HotelsMotelsAndResorts
                HouseholdApplianceStores.value -> HouseholdApplianceStores
                IndustrialSupplies.value -> IndustrialSupplies
                InformationRetrievalServices.value -> InformationRetrievalServices
                InsuranceDefault.value -> InsuranceDefault
                InsuranceUnderwritingPremiums.value -> InsuranceUnderwritingPremiums
                IntraCompanyPurchases.value -> IntraCompanyPurchases
                JewelryStoresWatchesClocksAndSilverwareStores.value -> JewelryStoresWatchesClocksAndSilverwareStores
                LandscapingServices.value -> LandscapingServices
                Laundries.value -> Laundries
                LaundryCleaningServices.value -> LaundryCleaningServices
                LegalServicesAttorneys.value -> LegalServicesAttorneys
                LuggageAndLeatherGoodsStores.value -> LuggageAndLeatherGoodsStores
                LumberBuildingMaterialsStores.value -> LumberBuildingMaterialsStores
                ManualCashDisburse.value -> ManualCashDisburse
                MarinasServiceAndSupplies.value -> MarinasServiceAndSupplies
                Marketplaces.value -> Marketplaces
                MasonryStoneworkAndPlaster.value -> MasonryStoneworkAndPlaster
                MassageParlors.value -> MassageParlors
                MedicalAndDentalLabs.value -> MedicalAndDentalLabs
                MedicalDentalOphthalmicAndHospitalEquipmentAndSupplies.value -> MedicalDentalOphthalmicAndHospitalEquipmentAndSupplies
                MedicalServices.value -> MedicalServices
                MembershipOrganizations.value -> MembershipOrganizations
                MensAndBoysClothingAndAccessoriesStores.value -> MensAndBoysClothingAndAccessoriesStores
                MensWomensClothingStores.value -> MensWomensClothingStores
                MetalServiceCenters.value -> MetalServiceCenters
                Miscellaneous.value -> Miscellaneous
                MiscellaneousApparelAndAccessoryShops.value -> MiscellaneousApparelAndAccessoryShops
                MiscellaneousAutoDealers.value -> MiscellaneousAutoDealers
                MiscellaneousBusinessServices.value -> MiscellaneousBusinessServices
                MiscellaneousFoodStores.value -> MiscellaneousFoodStores
                MiscellaneousGeneralMerchandise.value -> MiscellaneousGeneralMerchandise
                MiscellaneousGeneralServices.value -> MiscellaneousGeneralServices
                MiscellaneousHomeFurnishingSpecialtyStores.value -> MiscellaneousHomeFurnishingSpecialtyStores
                MiscellaneousPublishingAndPrinting.value -> MiscellaneousPublishingAndPrinting
                MiscellaneousRecreationServices.value -> MiscellaneousRecreationServices
                MiscellaneousRepairShops.value -> MiscellaneousRepairShops
                MiscellaneousSpecialtyRetail.value -> MiscellaneousSpecialtyRetail
                MobileHomeDealers.value -> MobileHomeDealers
                MotionPictureTheaters.value -> MotionPictureTheaters
                MotorFreightCarriersAndTrucking.value -> MotorFreightCarriersAndTrucking
                MotorHomesDealers.value -> MotorHomesDealers
                MotorVehicleSuppliesAndNewParts.value -> MotorVehicleSuppliesAndNewParts
                MotorcycleShopsAndDealers.value -> MotorcycleShopsAndDealers
                MotorcycleShopsDealers.value -> MotorcycleShopsDealers
                MusicStoresMusicalInstrumentsPianosAndSheetMusic.value -> MusicStoresMusicalInstrumentsPianosAndSheetMusic
                NewsDealersAndNewsstands.value -> NewsDealersAndNewsstands
                NonFiMoneyOrders.value -> NonFiMoneyOrders
                NonFiStoredValueCardPurchaseLoad.value -> NonFiStoredValueCardPurchaseLoad
                NondurableGoods.value -> NondurableGoods
                NurseriesLawnAndGardenSupplyStores.value -> NurseriesLawnAndGardenSupplyStores
                NursingPersonalCare.value -> NursingPersonalCare
                OfficeAndCommercialFurniture.value -> OfficeAndCommercialFurniture
                OpticiansEyeglasses.value -> OpticiansEyeglasses
                OptometristsOphthalmologist.value -> OptometristsOphthalmologist
                OrthopedicGoodsProstheticDevices.value -> OrthopedicGoodsProstheticDevices
                Osteopaths.value -> Osteopaths
                PackageStoresBeerWineAndLiquor.value -> PackageStoresBeerWineAndLiquor
                PaintsVarnishesAndSupplies.value -> PaintsVarnishesAndSupplies
                ParkingLotsGarages.value -> ParkingLotsGarages
                PassengerRailways.value -> PassengerRailways
                PawnShops.value -> PawnShops
                PetShopsPetFoodAndSupplies.value -> PetShopsPetFoodAndSupplies
                PetroleumAndPetroleumProducts.value -> PetroleumAndPetroleumProducts
                PhotoDeveloping.value -> PhotoDeveloping
                PhotographicPhotocopyMicrofilmEquipmentAndSupplies.value -> PhotographicPhotocopyMicrofilmEquipmentAndSupplies
                PhotographicStudios.value -> PhotographicStudios
                PictureVideoProduction.value -> PictureVideoProduction
                PieceGoodsNotionsAndOtherDryGoods.value -> PieceGoodsNotionsAndOtherDryGoods
                PlumbingHeatingEquipmentAndSupplies.value -> PlumbingHeatingEquipmentAndSupplies
                PoliticalOrganizations.value -> PoliticalOrganizations
                PostalServicesGovernmentOnly.value -> PostalServicesGovernmentOnly
                PreciousStonesAndMetalsWatchesAndJewelry.value -> PreciousStonesAndMetalsWatchesAndJewelry
                ProfessionalServices.value -> ProfessionalServices
                PublicWarehousingAndStorage.value -> PublicWarehousingAndStorage
                QuickCopyReproAndBlueprint.value -> QuickCopyReproAndBlueprint
                Railroads.value -> Railroads
                RealEstateAgentsAndManagersRentals.value -> RealEstateAgentsAndManagersRentals
                RecordStores.value -> RecordStores
                RecreationalVehicleRentals.value -> RecreationalVehicleRentals
                ReligiousGoodsStores.value -> ReligiousGoodsStores
                ReligiousOrganizations.value -> ReligiousOrganizations
                RoofingSidingSheetMetal.value -> RoofingSidingSheetMetal
                SecretarialSupportServices.value -> SecretarialSupportServices
                SecurityBrokersDealers.value -> SecurityBrokersDealers
                ServiceStations.value -> ServiceStations
                SewingNeedleworkFabricAndPieceGoodsStores.value -> SewingNeedleworkFabricAndPieceGoodsStores
                ShoeRepairHatCleaning.value -> ShoeRepairHatCleaning
                ShoeStores.value -> ShoeStores
                SmallApplianceRepair.value -> SmallApplianceRepair
                SnowmobileDealers.value -> SnowmobileDealers
                SpecialTradeServices.value -> SpecialTradeServices
                SpecialtyCleaning.value -> SpecialtyCleaning
                SportingGoodsStores.value -> SportingGoodsStores
                SportingRecreationCamps.value -> SportingRecreationCamps
                SportsAndRidingApparelStores.value -> SportsAndRidingApparelStores
                SportsClubsFields.value -> SportsClubsFields
                StampAndCoinStores.value -> StampAndCoinStores
                StationaryOfficeSuppliesPrintingAndWritingPaper.value -> StationaryOfficeSuppliesPrintingAndWritingPaper
                StationeryStoresOfficeAndSchoolSupplyStores.value -> StationeryStoresOfficeAndSchoolSupplyStores
                SwimmingPoolsSales.value -> SwimmingPoolsSales
                TUiTravelGermany.value -> TUiTravelGermany
                TailorsAlterations.value -> TailorsAlterations
                TaxPaymentsGovernmentAgencies.value -> TaxPaymentsGovernmentAgencies
                TaxPreparationServices.value -> TaxPreparationServices
                TaxicabsLimousines.value -> TaxicabsLimousines
                TelecommunicationEquipmentAndTelephoneSales.value -> TelecommunicationEquipmentAndTelephoneSales
                TelecommunicationServices.value -> TelecommunicationServices
                TelegraphServices.value -> TelegraphServices
                TentAndAwningShops.value -> TentAndAwningShops
                TestingLaboratories.value -> TestingLaboratories
                TheatricalTicketAgencies.value -> TheatricalTicketAgencies
                Timeshares.value -> Timeshares
                TireRetreadingAndRepair.value -> TireRetreadingAndRepair
                TollsBridgeFees.value -> TollsBridgeFees
                TouristAttractionsAndExhibits.value -> TouristAttractionsAndExhibits
                TowingServices.value -> TowingServices
                TrailerParksCampgrounds.value -> TrailerParksCampgrounds
                TransportationServices.value -> TransportationServices
                TravelAgenciesTourOperators.value -> TravelAgenciesTourOperators
                TruckStopIteration.value -> TruckStopIteration
                TruckUtilityTrailerRentals.value -> TruckUtilityTrailerRentals
                TypesettingPlateMakingAndRelatedServices.value -> TypesettingPlateMakingAndRelatedServices
                TypewriterStores.value -> TypewriterStores
                USFederalGovernmentAgenciesOrDepartments.value -> USFederalGovernmentAgenciesOrDepartments
                UniformsCommercialClothing.value -> UniformsCommercialClothing
                UsedMerchandiseAndSecondhandStores.value -> UsedMerchandiseAndSecondhandStores
                Utilities.value -> Utilities
                VarietyStores.value -> VarietyStores
                VeterinaryServices.value -> VeterinaryServices
                VideoAmusementGameSupplies.value -> VideoAmusementGameSupplies
                VideoGameArcades.value -> VideoGameArcades
                VideoTapeRentalStores.value -> VideoTapeRentalStores
                VocationalTradeSchools.value -> VocationalTradeSchools
                WatchJewelryRepair.value -> WatchJewelryRepair
                WeldingRepair.value -> WeldingRepair
                WholesaleClubs.value -> WholesaleClubs
                WigAndToupeeStores.value -> WigAndToupeeStores
                WiresMoneyOrders.value -> WiresMoneyOrders
                WomensAccessoryAndSpecialtyShops.value -> WomensAccessoryAndSpecialtyShops
                WomensReadyToWearStores.value -> WomensReadyToWearStores
                WreckingAndSalvageYards.value -> WreckingAndSalvageYards
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
