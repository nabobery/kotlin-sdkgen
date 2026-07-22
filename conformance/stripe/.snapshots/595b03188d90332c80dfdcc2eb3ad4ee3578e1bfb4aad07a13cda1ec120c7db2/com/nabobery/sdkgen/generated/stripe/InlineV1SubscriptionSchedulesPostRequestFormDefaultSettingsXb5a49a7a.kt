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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a(
    public val applicationFeePercent: Double? = null,
    public val automaticTax: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294? = null,
    public val billingCycleAnchor: InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4? = null,
    public val billingThresholds: InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79? = null,
    public val collectionMethod: InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555? = null,
    public val defaultPaymentMethod: String? = null,
    public val description: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e? = null,
    public val invoiceSettings: InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be? = null,
    public val onBehalfOf: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfXd32d87d2? = null,
    public val transferData: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9? = null,
) {
    public class Builder {
        public var applicationFeePercent: Double? = null

        public var automaticTax:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294? = null

        public var billingCycleAnchor:
            InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4? = null

        public var billingThresholds:
            InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79? = null

        public var collectionMethod:
            InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555? = null

        public var defaultPaymentMethod: String? = null

        public var description:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e? = null

        public var invoiceSettings:
            InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be? = null

        public var onBehalfOf:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfXd32d87d2? = null

        public var transferData:
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a =
            InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a(
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
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a(
                applicationFeePercent =
                    rawObject["application_fee_percent"]?.let {
                        json.decodeFromJsonElement<Double>(
                            it,
                        )
                    },
                automaticTax =
                    rawObject["automatic_tax"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294>(
                                it,
                            )
                    },
                billingCycleAnchor =
                    rawObject["billing_cycle_anchor"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormBillingCycleAnchorXb60f37c4>(
                                it,
                            )
                    },
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormBillingThresholdsX635c8c79>(
                                it,
                            )
                    },
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555>(
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
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e>(
                                it,
                            )
                    },
                invoiceSettings =
                    rawObject["invoice_settings"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be>(
                                it,
                            )
                    },
                onBehalfOf =
                    rawObject["on_behalf_of"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfXd32d87d2>(
                                it,
                            )
                    },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a",
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

public fun inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a(
    block: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a =
    InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXb5a49a7a.build(block)
