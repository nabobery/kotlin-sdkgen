package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Double
import kotlin.String
import kotlin.Unit

/**
 * Object representing the subscription schedule's default settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34(
    public val applicationFeePercent: Double? = null,
    public val automaticTax: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX152f9007? = null,
    public val billingCycleAnchor: InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8? = null,
    public val billingThresholds: InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd? = null,
    public val collectionMethod: InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28bdbe08? = null,
    public val defaultPaymentMethod: String? = null,
    public val description: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47? = null,
    public val invoiceSettings: InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29? = null,
    public val onBehalfOf: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718? = null,
    public val transferData: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1? = null,
) {
    public class Builder {
        public var applicationFeePercent: Double? = null

        public var automaticTax:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX152f9007? = null

        public var billingCycleAnchor:
            InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8? = null

        public var billingThresholds:
            InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd? = null

        public var collectionMethod:
            InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28bdbe08? = null

        public var defaultPaymentMethod: String? = null

        public var description:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47? = null

        public var invoiceSettings:
            InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29? = null

        public var onBehalfOf:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718? = null

        public var transferData:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34 =
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34(
                applicationFeePercent = applicationFeePercent,
                automaticTax = automaticTax,
                billingCycleAnchor = billingCycleAnchor,
                billingThresholds = billingThresholds,
                collectionMethod = collectionMethod,
                defaultPaymentMethod = defaultPaymentMethod,
                description = description,
                invoiceSettings = invoiceSettings,
                onBehalfOf = onBehalfOf,
                transferData = transferData,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34 must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34(
                applicationFeePercent =
                    rawObject["application_fee_percent"]?.let {
                        json.decodeFromJsonElement<Double>(
                            it,
                        )
                    },
                automaticTax =
                    rawObject["automatic_tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX152f9007>(
                                it,
                            )
                    },
                billingCycleAnchor =
                    rawObject["billing_cycle_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorX23a66ba8>(
                                it,
                            )
                    },
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsXa93dc2fd>(
                                it,
                            )
                    },
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28bdbe08>(
                                it,
                            )
                    },
                defaultPaymentMethod =
                    rawObject["default_payment_method"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
                description =
                    rawObject["description"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47>(
                                it,
                            )
                    },
                invoiceSettings =
                    rawObject["invoice_settings"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29>(
                                it,
                            )
                    },
                onBehalfOf =
                    rawObject["on_behalf_of"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718>(
                                it,
                            )
                    },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
                    value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
                    value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
                    value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
                    value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
                    value.defaultPaymentMethod?.let { put("default_payment_method", it) }
                    value.description?.let { put("description", json.encodeToJsonElement(it)) }
                    value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
                    value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34(
    block: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34 =
    InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34.build(block)
