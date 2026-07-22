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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1application_fees~1{id}~1refund/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1application_fees~1{id}~1refund/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema
 */
@Serializable(with = InlineV1ApplicationFeesRefundPostRequestFormX82199c17.Serializer::class)
public class InlineV1ApplicationFeesRefundPostRequestFormX82199c17(
    public val amount: Int? = null,
    public val directive: String? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    public class Builder {
        public var amount: Int? = null

        public var directive: String? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1ApplicationFeesRefundPostRequestFormX82199c17 =
            InlineV1ApplicationFeesRefundPostRequestFormX82199c17(
                amount = amount,
                directive = directive,
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ApplicationFeesRefundPostRequestFormX82199c17 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ApplicationFeesRefundPostRequestFormX82199c17> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ApplicationFeesRefundPostRequestFormX82199c17 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ApplicationFeesRefundPostRequestFormX82199c17")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ApplicationFeesRefundPostRequestFormX82199c17 must be a JSON object",
                    )
            return InlineV1ApplicationFeesRefundPostRequestFormX82199c17(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                directive = rawObject["directive"]?.let { json.decodeFromJsonElement<String>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ApplicationFeesRefundPostRequestFormX82199c17,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ApplicationFeesRefundPostRequestFormX82199c17")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.directive?.let { put("directive", it) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ApplicationFeesRefundPostRequestFormX82199c17(
    block: InlineV1ApplicationFeesRefundPostRequestFormX82199c17.Builder.() -> Unit,
): InlineV1ApplicationFeesRefundPostRequestFormX82199c17 =
    InlineV1ApplicationFeesRefundPostRequestFormX82199c17.build(block)
