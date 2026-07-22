package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * The updated CVC value this token represents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/cvc_update
 */
@Serializable(with = InlineV1TokensPostRequestFormCvcUpdateX5188265b.Serializer::class)
public class InlineV1TokensPostRequestFormCvcUpdateX5188265b(
    public val cvc: String,
) {
    public class Builder {
        private var cvcValue: String? = null

        public var cvc: String
            get() = requireNotNull(cvcValue) { "cvc is required" }
            set(`value`) {
                cvcValue = value
            }

        public fun build(): InlineV1TokensPostRequestFormCvcUpdateX5188265b {
            check(cvcValue != null) { "cvc is required" }
            return InlineV1TokensPostRequestFormCvcUpdateX5188265b(
                cvc = cvc,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormCvcUpdateX5188265b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormCvcUpdateX5188265b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormCvcUpdateX5188265b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormCvcUpdateX5188265b")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TokensPostRequestFormCvcUpdateX5188265b must be a JSON object",
                    )
            val cvc = json.decodeRequired<String>(rawObject, "cvc")
            return InlineV1TokensPostRequestFormCvcUpdateX5188265b(
                cvc = cvc,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormCvcUpdateX5188265b,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormCvcUpdateX5188265b")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("cvc", value.cvc)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TokensPostRequestFormCvcUpdateX5188265b(
    block: InlineV1TokensPostRequestFormCvcUpdateX5188265b.Builder.() -> Unit,
): InlineV1TokensPostRequestFormCvcUpdateX5188265b = InlineV1TokensPostRequestFormCvcUpdateX5188265b.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TokensPostRequestFormCvcUpdateX5188265b is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
