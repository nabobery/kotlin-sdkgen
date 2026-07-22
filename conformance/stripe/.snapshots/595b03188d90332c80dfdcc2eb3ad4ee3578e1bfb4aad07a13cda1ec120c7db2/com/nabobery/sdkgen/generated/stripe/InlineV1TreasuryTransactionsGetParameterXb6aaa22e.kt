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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/8/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/8/schema
 */
@Serializable(with = InlineV1TreasuryTransactionsGetParameterXb6aaa22e.Serializer::class)
public class InlineV1TreasuryTransactionsGetParameterXb6aaa22e(
    public val postedAt: InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c? = null,
) {
    public class Builder {
        public var postedAt: InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c? = null

        public fun build(): InlineV1TreasuryTransactionsGetParameterXb6aaa22e =
            InlineV1TreasuryTransactionsGetParameterXb6aaa22e(
                postedAt = postedAt,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TreasuryTransactionsGetParameterXb6aaa22e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryTransactionsGetParameterXb6aaa22e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionsGetParameterXb6aaa22e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryTransactionsGetParameterXb6aaa22e")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryTransactionsGetParameterXb6aaa22e must be a JSON object",
                    )
            return InlineV1TreasuryTransactionsGetParameterXb6aaa22e(
                postedAt =
                    rawObject["posted_at"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryTransactionsGetParameterPostedAtXdb05c71c>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryTransactionsGetParameterXb6aaa22e,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryTransactionsGetParameterXb6aaa22e")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryTransactionsGetParameterXb6aaa22e(
    block: InlineV1TreasuryTransactionsGetParameterXb6aaa22e.Builder.() -> Unit,
): InlineV1TreasuryTransactionsGetParameterXb6aaa22e = InlineV1TreasuryTransactionsGetParameterXb6aaa22e.build(block)
