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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormX9a66c4b8.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormX9a66c4b8(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Settings that apply to the [Payments Balance](https://docs.stripe.com/api/balance).
     */
    public val payments: InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Settings that apply to the [Payments Balance](https://docs.stripe.com/api/balance).
         */
        public var payments: InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6? = null

        public fun build(): InlineV1BalanceSettingsPostRequestFormX9a66c4b8 =
            InlineV1BalanceSettingsPostRequestFormX9a66c4b8(
                expand = expand,
                payments = payments,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormX9a66c4b8 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormX9a66c4b8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormX9a66c4b8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormX9a66c4b8")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BalanceSettingsPostRequestFormX9a66c4b8 must be a JSON object",
                    )
            return InlineV1BalanceSettingsPostRequestFormX9a66c4b8(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                payments =
                    rawObject["payments"]?.let {
                        json.decodeFromJsonElement<InlineV1BalanceSettingsPostRequestFormPaymentsX12e67db6>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BalanceSettingsPostRequestFormX9a66c4b8,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormX9a66c4b8")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.payments?.let { put("payments", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BalanceSettingsPostRequestFormX9a66c4b8(
    block: InlineV1BalanceSettingsPostRequestFormX9a66c4b8.Builder.() -> Unit,
): InlineV1BalanceSettingsPostRequestFormX9a66c4b8 = InlineV1BalanceSettingsPostRequestFormX9a66c4b8.build(block)
