package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06(
    items: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849>,
    public val addInvoiceItems: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330>? = null,
    public val applicationFeePercent: Double? = null,
    public val automaticTax: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxXba49e122? = null,
    public val billingCycleAnchor: InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf? = null,
    public val billingThresholds:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3? = null,
    public val collectionMethod: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemCollectionMethodX6fffc30e? = null,
    public val currency: String? = null,
    public val defaultPaymentMethod: String? = null,
    public val defaultTaxRates: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf? = null,
    public val description: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535? = null,
    public val discounts: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece? = null,
    public val duration: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationX3905b555? = null,
    public val endDate: Int? = null,
    public val invoiceSettings: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c? = null,
    public val metadata: Map<String, String>? = null,
    public val onBehalfOf: String? = null,
    public val prorationBehavior:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412? = null,
    public val transferData: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f? = null,
    public val trial: Boolean? = null,
    public val trialEnd: Int? = null,
) {
    public val items: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849> =
        items.toList()

    public class Builder {
        private var itemsValue:
            List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849>? = null

        public var items: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849>
            get() = requireNotNull(itemsValue) { "items is required" }
            set(`value`) {
                itemsValue = value
            }

        public var addInvoiceItems:
            List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330>? = null

        public var applicationFeePercent: Double? = null

        public var automaticTax:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxXba49e122? = null

        public var billingCycleAnchor:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf? = null

        public var billingThresholds:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3? = null

        public var collectionMethod:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemCollectionMethodX6fffc30e? = null

        public var currency: String? = null

        public var defaultPaymentMethod: String? = null

        public var defaultTaxRates:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf? = null

        public var description:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535? = null

        public var discounts: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece? =
            null

        public var duration: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationX3905b555? =
            null

        public var endDate: Int? = null

        public var invoiceSettings:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c? = null

        public var metadata: Map<String, String>? = null

        public var onBehalfOf: String? = null

        public var prorationBehavior:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412? = null

        public var transferData:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f? = null

        public var trial: Boolean? = null

        public var trialEnd: Int? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06 {
            check(itemsValue != null) { "items is required" }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06(
                items = items,
                addInvoiceItems = addInvoiceItems,
                applicationFeePercent = applicationFeePercent,
                automaticTax = automaticTax,
                billingCycleAnchor = billingCycleAnchor,
                billingThresholds = billingThresholds,
                collectionMethod = collectionMethod,
                currency = currency,
                defaultPaymentMethod = defaultPaymentMethod,
                defaultTaxRates = defaultTaxRates,
                description = description,
                discounts = discounts,
                duration = duration,
                endDate = endDate,
                invoiceSettings = invoiceSettings,
                metadata = metadata,
                onBehalfOf = onBehalfOf,
                prorationBehavior = prorationBehavior,
                transferData = transferData,
                trial = trial,
                trialEnd = trialEnd,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06 must be a JSON object",
                    )
            val items =
                json.decodeRequired<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849>>(
                    rawObject,
                    "items",
                )
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06(
                items = items,
                addInvoiceItems =
                    rawObject["add_invoice_items"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330>>(
                                it,
                            )
                    },
                applicationFeePercent =
                    rawObject["application_fee_percent"]?.let {
                        json
                            .decodeFromJsonElement<Double>(
                                it,
                            )
                    },
                automaticTax =
                    rawObject["automatic_tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxXba49e122>(
                                it,
                            )
                    },
                billingCycleAnchor =
                    rawObject["billing_cycle_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXbdb541cf>(
                                it,
                            )
                    },
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX927362a3>(
                                it,
                            )
                    },
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemCollectionMethodX6fffc30e>(
                                it,
                            )
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                defaultPaymentMethod =
                    rawObject["default_payment_method"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                defaultTaxRates =
                    rawObject["default_tax_rates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf>(
                                it,
                            )
                    },
                description =
                    rawObject["description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535>(
                                it,
                            )
                    },
                discounts =
                    rawObject["discounts"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece>(
                                it,
                            )
                    },
                duration =
                    rawObject["duration"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationX3905b555>(
                                it,
                            )
                    },
                endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<Int>(it) },
                invoiceSettings =
                    rawObject["invoice_settings"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsXbbd5e35c>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
                prorationBehavior =
                    rawObject["proration_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorX9c36a412>(
                                it,
                            )
                    },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataX8949d55f>(
                                it,
                            )
                    },
                trial = rawObject["trial"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                trialEnd = rawObject["trial_end"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("items", json.encodeToJsonElement(value.items))
                    value.addInvoiceItems?.let { put("add_invoice_items", json.encodeToJsonElement(it)) }
                    value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
                    value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
                    value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
                    value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
                    value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.defaultPaymentMethod?.let { put("default_payment_method", it) }
                    value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
                    value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
                    value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", it) }
                    value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
                    value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
                    value.trial?.let { put("trial", json.encodeToJsonElement(it)) }
                    value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06 =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX0f47ab06 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
