package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Orders represent your intent to purchase a particular Climate product. When you create an order, the
 * payment is deducted from your merchant balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.order
 */
@Serializable(with = ClimateOrder.Serializer::class)
public class ClimateOrder(
    /**
     * Total amount of [Frontier](https://frontierclimate.com/)'s service fees in the currency's smallest unit.
     */
    public val amountFees: Int,
    /**
     * Total amount of the carbon removal in the currency's smallest unit.
     */
    public val amountSubtotal: Int,
    /**
     * Total amount of the order including fees in the currency's smallest unit.
     */
    public val amountTotal: Int,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase, representing the
     * currency for this order.
     */
    public val currency: String,
    deliveryDetails: List<ClimateRemovalsOrderDeliveries>,
    /**
     * The year this order is expected to be delivered.
     */
    public val expectedDeliveryYear: Int,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
     */
    public val livemode: Boolean,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * Quantity of carbon removal that is included in this order.
     */
    public val metricTons: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineClimateOrderObjectValueX1643c05f,
    /**
     * Unique ID for the Climate `Product` this order is purchasing.
     */
    public val product: InlineClimateOrderProductX0eb8827c,
    /**
     * The current status of this order.
     */
    public val status: InlineClimateOrderStatusXf7d02510,
    public val beneficiary: ClimateRemovalsBeneficiary? = null,
    /**
     * Time at which the order was canceled. Measured in seconds since the Unix epoch.
     */
    public val canceledAt: Int? = null,
    /**
     * Reason for the cancellation of this order.
     */
    public val cancellationReason: InlineClimateOrderCancellationReasonXb8eb996f? = null,
    /**
     * For delivered orders, a URL to a delivery certificate for the order.
     */
    public val certificate: String? = null,
    /**
     * Time at which the order was confirmed. Measured in seconds since the Unix epoch.
     */
    public val confirmedAt: Int? = null,
    /**
     * Time at which the order's expected_delivery_year was delayed. Measured in seconds since the Unix epoch.
     */
    public val delayedAt: Int? = null,
    /**
     * Time at which the order was delivered. Measured in seconds since the Unix epoch.
     */
    public val deliveredAt: Int? = null,
    /**
     * Time at which the order's product was substituted for a different product. Measured in seconds since the Unix
     * epoch.
     */
    public val productSubstitutedAt: Int? = null,
) {
    /**
     * Details about the delivery of carbon removal for this order.
     */
    public val deliveryDetails: List<ClimateRemovalsOrderDeliveries> = deliveryDetails.toList()

    public class Builder {
        private var amountFeesValue: Int? = null

        public var amountFees: Int
            get() = requireNotNull(amountFeesValue) { "amountFees is required" }
            set(`value`) {
                amountFeesValue = value
            }

        private var amountSubtotalValue: Int? = null

        public var amountSubtotal: Int
            get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
            set(`value`) {
                amountSubtotalValue = value
            }

        private var amountTotalValue: Int? = null

        public var amountTotal: Int
            get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
            set(`value`) {
                amountTotalValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var deliveryDetailsValue: List<ClimateRemovalsOrderDeliveries>? = null

        public var deliveryDetails: List<ClimateRemovalsOrderDeliveries>
            get() = requireNotNull(deliveryDetailsValue) { "deliveryDetails is required" }
            set(`value`) {
                deliveryDetailsValue = value
            }

        private var expectedDeliveryYearValue: Int? = null

        public var expectedDeliveryYear: Int
            get() = requireNotNull(expectedDeliveryYearValue) { "expectedDeliveryYear is required" }
            set(`value`) {
                expectedDeliveryYearValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var metricTonsValue: String? = null

        public var metricTons: String
            get() = requireNotNull(metricTonsValue) { "metricTons is required" }
            set(`value`) {
                metricTonsValue = value
            }

        private var objectValueValue: InlineClimateOrderObjectValueX1643c05f? = null

        public var objectValue: InlineClimateOrderObjectValueX1643c05f
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var productValue: InlineClimateOrderProductX0eb8827c? = null

        public var product: InlineClimateOrderProductX0eb8827c
            get() = requireNotNull(productValue) { "product is required" }
            set(`value`) {
                productValue = value
            }

        private var statusValue: InlineClimateOrderStatusXf7d02510? = null

        public var status: InlineClimateOrderStatusXf7d02510
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        public var beneficiary: ClimateRemovalsBeneficiary? = null

        /**
         * Time at which the order was canceled. Measured in seconds since the Unix epoch.
         */
        public var canceledAt: Int? = null

        /**
         * Reason for the cancellation of this order.
         */
        public var cancellationReason: InlineClimateOrderCancellationReasonXb8eb996f? = null

        /**
         * For delivered orders, a URL to a delivery certificate for the order.
         */
        public var certificate: String? = null

        /**
         * Time at which the order was confirmed. Measured in seconds since the Unix epoch.
         */
        public var confirmedAt: Int? = null

        /**
         * Time at which the order's expected_delivery_year was delayed. Measured in seconds since the Unix epoch.
         */
        public var delayedAt: Int? = null

        /**
         * Time at which the order was delivered. Measured in seconds since the Unix epoch.
         */
        public var deliveredAt: Int? = null

        /**
         * Time at which the order's product was substituted for a different product. Measured in seconds since the Unix
         * epoch.
         */
        public var productSubstitutedAt: Int? = null

        public fun build(): ClimateOrder {
            check(amountFeesValue != null) { "amountFees is required" }
            check(amountSubtotalValue != null) { "amountSubtotal is required" }
            check(amountTotalValue != null) { "amountTotal is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(deliveryDetailsValue != null) { "deliveryDetails is required" }
            check(expectedDeliveryYearValue != null) { "expectedDeliveryYear is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(metricTonsValue != null) { "metricTons is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(productValue != null) { "product is required" }
            check(statusValue != null) { "status is required" }
            return ClimateOrder(
                amountFees = amountFees,
                amountSubtotal = amountSubtotal,
                amountTotal = amountTotal,
                created = created,
                currency = currency,
                deliveryDetails = deliveryDetails,
                expectedDeliveryYear = expectedDeliveryYear,
                id = id,
                livemode = livemode,
                metadata = metadata,
                metricTons = metricTons,
                objectValue = objectValue,
                product = product,
                status = status,
                beneficiary = beneficiary,
                canceledAt = canceledAt,
                cancellationReason = cancellationReason,
                certificate = certificate,
                confirmedAt = confirmedAt,
                delayedAt = delayedAt,
                deliveredAt = deliveredAt,
                productSubstitutedAt = productSubstitutedAt,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ClimateOrder = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ClimateOrder> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ClimateOrder {
            val jsonDecoder = decoder.requireJsonDecoder("ClimateOrder")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ClimateOrder must be a JSON object")
            val amountFees = json.decodeRequired<Int>(rawObject, "amount_fees")
            val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
            val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val deliveryDetails =
                json.decodeRequired<List<ClimateRemovalsOrderDeliveries>>(
                    rawObject,
                    "delivery_details",
                )
            val expectedDeliveryYear = json.decodeRequired<Int>(rawObject, "expected_delivery_year")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val metricTons = json.decodeRequired<String>(rawObject, "metric_tons")
            val objectValue = json.decodeRequired<InlineClimateOrderObjectValueX1643c05f>(rawObject, "object")
            val product = json.decodeRequired<InlineClimateOrderProductX0eb8827c>(rawObject, "product")
            val status = json.decodeRequired<InlineClimateOrderStatusXf7d02510>(rawObject, "status")
            return ClimateOrder(
                amountFees = amountFees,
                amountSubtotal = amountSubtotal,
                amountTotal = amountTotal,
                created = created,
                currency = currency,
                deliveryDetails = deliveryDetails,
                expectedDeliveryYear = expectedDeliveryYear,
                id = id,
                livemode = livemode,
                metadata = metadata,
                metricTons = metricTons,
                objectValue = objectValue,
                product = product,
                status = status,
                beneficiary =
                    rawObject["beneficiary"]?.let {
                        json.decodeFromJsonElement<ClimateRemovalsBeneficiary>(
                            it,
                        )
                    },
                canceledAt =
                    rawObject["canceled_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                cancellationReason =
                    rawObject["cancellation_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineClimateOrderCancellationReasonXb8eb996f?>(element)
                        }
                    },
                certificate =
                    rawObject["certificate"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                confirmedAt =
                    rawObject["confirmed_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                delayedAt =
                    rawObject["delayed_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                deliveredAt =
                    rawObject["delivered_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                productSubstitutedAt =
                    rawObject["product_substituted_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ClimateOrder,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ClimateOrder")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount_fees", json.encodeToJsonElement(value.amountFees))
                    put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
                    put("amount_total", json.encodeToJsonElement(value.amountTotal))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("delivery_details", json.encodeToJsonElement(value.deliveryDetails))
                    put("expected_delivery_year", json.encodeToJsonElement(value.expectedDeliveryYear))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("metric_tons", value.metricTons)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("product", json.encodeToJsonElement(value.product))
                    put("status", json.encodeToJsonElement(value.status))
                    value.beneficiary?.let { put("beneficiary", json.encodeToJsonElement(it)) }
                    value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
                    value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
                    value.certificate?.let { put("certificate", it) }
                    value.confirmedAt?.let { put("confirmed_at", json.encodeToJsonElement(it)) }
                    value.delayedAt?.let { put("delayed_at", json.encodeToJsonElement(it)) }
                    value.deliveredAt?.let { put("delivered_at", json.encodeToJsonElement(it)) }
                    value.productSubstitutedAt?.let { put("product_substituted_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun climateOrder(block: ClimateOrder.Builder.() -> Unit): ClimateOrder = ClimateOrder.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("ClimateOrder is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
