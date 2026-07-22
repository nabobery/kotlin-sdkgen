package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class SetupIntentPaymentMethodOptionsCardMandateOptionsView(
    public val amount: Int,
    @SerialName("amount_type")
    public val amountType: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74,
    public val currency: String,
    public val description: String? = null,
    @SerialName("end_date")
    public val endDate: Int? = null,
    public val interval: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a,
    @SerialName("interval_count")
    public val intervalCount: Int? = null,
    public val reference: String,
    @SerialName("start_date")
    public val startDate: Int,
    @SerialName("supported_types")
    public val supportedTypes: List<InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e>? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card_mandate_options
 */
@Serializable(with = SetupIntentPaymentMethodOptionsCardMandateOptions.Serializer::class)
public class SetupIntentPaymentMethodOptionsCardMandateOptions(
    /**
     * Amount to be charged for future payments, specified in the presentment currency.
     */
    public val amount: Int,
    /**
     * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
     * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
     */
    public val amountType: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Specifies payment frequency. One of `day`, `week`, `month`, `year`, or `sporadic`.
     */
    public val interval: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a,
    /**
     * Unique identifier for the mandate or subscription.
     */
    public val reference: String,
    /**
     * Start date of the mandate or subscription. Start date should not be lesser than yesterday.
     */
    public val startDate: Int,
    /**
     * A description of the mandate or subscription that is meant to be displayed to the customer.
     */
    public val description: String? = null,
    /**
     * End date of the mandate or subscription. If not provided, the mandate will be active until canceled. If provided,
     * end date should be after start date.
     */
    public val endDate: Int? = null,
    /**
     * The number of intervals between payments. For example, `interval=month` and `interval_count=3` indicates one
     * payment every three months. Maximum of one year interval allowed (1 year, 12 months, or 52 weeks). This parameter
     * is optional when `interval=sporadic`.
     */
    public val intervalCount: Int? = null,
    /**
     * Specifies the type of mandates supported. Possible values are `india`.
     */
    public val supportedTypes: List<InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e>? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var amountTypeValue:
            InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74? = null

        public var amountType:
            InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74
            get() = requireNotNull(amountTypeValue) { "amountType is required" }
            set(`value`) {
                amountTypeValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var intervalValue:
            InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a? = null

        public var interval: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        private var referenceValue: String? = null

        public var reference: String
            get() = requireNotNull(referenceValue) { "reference is required" }
            set(`value`) {
                referenceValue = value
            }

        private var startDateValue: Int? = null

        public var startDate: Int
            get() = requireNotNull(startDateValue) { "startDate is required" }
            set(`value`) {
                startDateValue = value
            }

        /**
         * A description of the mandate or subscription that is meant to be displayed to the customer.
         */
        public var description: String? = null

        /**
         * End date of the mandate or subscription. If not provided, the mandate will be active until canceled. If provided,
         * end date should be after start date.
         */
        public var endDate: Int? = null

        /**
         * The number of intervals between payments. For example, `interval=month` and `interval_count=3` indicates one
         * payment every three months. Maximum of one year interval allowed (1 year, 12 months, or 52 weeks). This parameter
         * is optional when `interval=sporadic`.
         */
        public var intervalCount: Int? = null

        /**
         * Specifies the type of mandates supported. Possible values are `india`.
         */
        public var supportedTypes: List<InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e>? =
            null

        public fun build(): SetupIntentPaymentMethodOptionsCardMandateOptions {
            check(amountValue != null) { "amount is required" }
            check(amountTypeValue != null) { "amountType is required" }
            check(currencyValue != null) { "currency is required" }
            check(intervalValue != null) { "interval is required" }
            check(referenceValue != null) { "reference is required" }
            check(startDateValue != null) { "startDate is required" }
            return SetupIntentPaymentMethodOptionsCardMandateOptions(
                amount = amount,
                amountType = amountType,
                currency = currency,
                interval = interval,
                reference = reference,
                startDate = startDate,
                description = description,
                endDate = endDate,
                intervalCount = intervalCount,
                supportedTypes = supportedTypes,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SetupIntentPaymentMethodOptionsCardMandateOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SetupIntentPaymentMethodOptionsCardMandateOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SetupIntentPaymentMethodOptionsCardMandateOptions {
            val jsonDecoder = decoder.requireJsonDecoder("SetupIntentPaymentMethodOptionsCardMandateOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "SetupIntentPaymentMethodOptionsCardMandateOptions must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val amountType =
                json.decodeRequired<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74>(
                    rawObject,
                    "amount_type",
                )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val interval =
                json.decodeRequired<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsIntervalX6beb651a>(
                    rawObject,
                    "interval",
                )
            val reference = json.decodeRequired<String>(rawObject, "reference")
            val startDate = json.decodeRequired<Int>(rawObject, "start_date")
            return SetupIntentPaymentMethodOptionsCardMandateOptions(
                amount = amount,
                amountType = amountType,
                currency = currency,
                interval = interval,
                reference = reference,
                startDate = startDate,
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                endDate =
                    rawObject["end_date"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                intervalCount =
                    rawObject["interval_count"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                supportedTypes =
                    rawObject["supported_types"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineSetupIntentPaymentMecd6aSupportedTypesItemXf71f619e>?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SetupIntentPaymentMethodOptionsCardMandateOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SetupIntentPaymentMethodOptionsCardMandateOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("amount_type", json.encodeToJsonElement(value.amountType))
                    put("currency", value.currency)
                    put("interval", json.encodeToJsonElement(value.interval))
                    put("reference", value.reference)
                    put("start_date", json.encodeToJsonElement(value.startDate))
                    value.description?.let { put("description", it) }
                    value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
                    value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
                    value.supportedTypes?.let { put("supported_types", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun setupIntentPaymentMethodOptionsCardMandateOptions(
    block: SetupIntentPaymentMethodOptionsCardMandateOptions.Builder.() -> Unit,
): SetupIntentPaymentMethodOptionsCardMandateOptions = SetupIntentPaymentMethodOptionsCardMandateOptions.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "SetupIntentPaymentMethodOptionsCardMandateOptions is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
