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
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections/properties/filters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/fin
 * ancial_connections/properties/filters
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230(
    public val accountSubcategories: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280>? = null,
) {
    public class Builder {
        public var accountSubcategories:
            List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280>? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230 =
            InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230(
                accountSubcategories = accountSubcategories,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230(
                accountSubcategories =
                    rawObject["account_subcategories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXe8926280>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230(
    block: InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230 =
    InlineV1SubscriptionsPostRequestFormPaymentSettingsFiltersX8f956230.build(block)
