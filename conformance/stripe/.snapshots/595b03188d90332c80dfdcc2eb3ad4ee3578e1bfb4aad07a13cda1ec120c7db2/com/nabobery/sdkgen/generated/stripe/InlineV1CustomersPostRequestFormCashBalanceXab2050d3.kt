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

/**
 * Balance information and default balance settings for this customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/cash_balance
 */
@Serializable(with = InlineV1CustomersPostRequestFormCashBalanceXab2050d3.Serializer::class)
public class InlineV1CustomersPostRequestFormCashBalanceXab2050d3(
    public val settings: InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15? = null,
) {
    public class Builder {
        public var settings: InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15? = null

        public fun build(): InlineV1CustomersPostRequestFormCashBalanceXab2050d3 =
            InlineV1CustomersPostRequestFormCashBalanceXab2050d3(
                settings = settings,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormCashBalanceXab2050d3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormCashBalanceXab2050d3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCashBalanceXab2050d3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormCashBalanceXab2050d3")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersPostRequestFormCashBalanceXab2050d3 must be a JSON object",
                    )
            return InlineV1CustomersPostRequestFormCashBalanceXab2050d3(
                settings =
                    rawObject["settings"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormCashBalanceXab2050d3,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormCashBalanceXab2050d3")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.settings?.let { put("settings", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersPostRequestFormCashBalanceXab2050d3(
    block: InlineV1CustomersPostRequestFormCashBalanceXab2050d3.Builder.() -> Unit,
): InlineV1CustomersPostRequestFormCashBalanceXab2050d3 =
    InlineV1CustomersPostRequestFormCashBalanceXab2050d3.build(block)
