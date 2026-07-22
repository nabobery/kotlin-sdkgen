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
 * www-form-urlencoded/schema/properties/default_settings/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/invoice_settings
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29(
    public val accountTaxIds: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e? = null,
    public val daysUntilDue: Int? = null,
    public val issuer: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsIssuerX26a93bc4? = null,
) {
    public class Builder {
        public var accountTaxIds: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e? =
            null

        public var daysUntilDue: Int? = null

        public var issuer: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsIssuerX26a93bc4? =
            null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29 =
            InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29(
                accountTaxIds = accountTaxIds,
                daysUntilDue = daysUntilDue,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29 must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsXa2ef078e>(
                            it,
                        )
                    },
                daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
                issuer =
                    rawObject["issuer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsIssuerX26a93bc4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29",
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

public fun inlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29(
    block: InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29 =
    InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX59d4bd29.build(block)
