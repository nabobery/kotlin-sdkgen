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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/invoice_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/invoice_settings
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be(
    public val accountTaxIds: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979? = null,
    public val daysUntilDue: Int? = null,
    public val issuer: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsIssuerXb6328562? = null,
) {
    public class Builder {
        public var accountTaxIds: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979? =
            null

        public var daysUntilDue: Int? = null

        public var issuer: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsIssuerXb6328562? =
            null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be =
            InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be(
                accountTaxIds = accountTaxIds,
                daysUntilDue = daysUntilDue,
                issuer = issuer,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be must be a JSON object",
                    )
            return InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be(
                accountTaxIds =
                    rawObject["account_tax_ids"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979>(
                            it,
                        )
                    },
                daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
                issuer =
                    rawObject["issuer"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsIssuerXb6328562>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be",
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

public fun inlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be(
    block: InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be =
    InlineV1SubscriptionSchedulesPostRequestFormInvoiceSettingsX739376be.build(block)
