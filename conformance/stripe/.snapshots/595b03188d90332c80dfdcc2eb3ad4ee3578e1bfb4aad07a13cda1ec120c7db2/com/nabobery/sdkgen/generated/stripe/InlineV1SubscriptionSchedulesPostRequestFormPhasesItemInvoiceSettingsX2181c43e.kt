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
import kotlin.Int
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/invoice_settings
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e(
    public val accountTaxIds: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46? = null,
    public val daysUntilDue: Int? = null,
    public val issuer: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX6d62dcf4? = null,
) {
    public class Builder {
        public var accountTaxIds:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46? = null

        public var daysUntilDue: Int? = null

        public var issuer: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX6d62dcf4? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e =
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e(
                accountTaxIds = accountTaxIds,
                daysUntilDue = daysUntilDue,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46>(
                                it,
                            )
                    },
                daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
                issuer =
                    rawObject["issuer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX6d62dcf4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
                    value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e.build(block)
