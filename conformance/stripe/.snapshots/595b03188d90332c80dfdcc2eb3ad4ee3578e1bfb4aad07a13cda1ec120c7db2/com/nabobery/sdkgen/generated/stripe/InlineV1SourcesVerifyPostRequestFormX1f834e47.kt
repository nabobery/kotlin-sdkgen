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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}~1verify/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}~1verify/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema
 */
@Serializable(with = InlineV1SourcesVerifyPostRequestFormX1f834e47.Serializer::class)
public class InlineV1SourcesVerifyPostRequestFormX1f834e47(
    values: List<String>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    /**
     * The values needed to verify the source.
     */
    public val values: List<String> = values.toList()

    public class Builder {
        private var valuesValue: List<String>? = null

        public var values: List<String>
            get() = requireNotNull(valuesValue) { "values is required" }
            set(`value`) {
                valuesValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1SourcesVerifyPostRequestFormX1f834e47 {
            check(valuesValue != null) { "values is required" }
            return InlineV1SourcesVerifyPostRequestFormX1f834e47(
                values = values,
                expand = expand,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SourcesVerifyPostRequestFormX1f834e47 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SourcesVerifyPostRequestFormX1f834e47> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SourcesVerifyPostRequestFormX1f834e47 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesVerifyPostRequestFormX1f834e47")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SourcesVerifyPostRequestFormX1f834e47 must be a JSON object",
                    )
            val values = json.decodeRequired<List<String>>(rawObject, "values")
            return InlineV1SourcesVerifyPostRequestFormX1f834e47(
                values = values,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesVerifyPostRequestFormX1f834e47,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesVerifyPostRequestFormX1f834e47")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("values", json.encodeToJsonElement(value.values))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SourcesVerifyPostRequestFormX1f834e47(
    block: InlineV1SourcesVerifyPostRequestFormX1f834e47.Builder.() -> Unit,
): InlineV1SourcesVerifyPostRequestFormX1f834e47 = InlineV1SourcesVerifyPostRequestFormX1f834e47.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SourcesVerifyPostRequestFormX1f834e47 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
