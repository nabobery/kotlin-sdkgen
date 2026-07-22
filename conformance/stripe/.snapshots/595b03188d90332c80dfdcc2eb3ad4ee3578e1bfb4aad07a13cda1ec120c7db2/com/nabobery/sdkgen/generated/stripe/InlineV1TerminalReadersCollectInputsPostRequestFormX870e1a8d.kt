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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d.Serializer::class)
public class InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d(
    inputs: List<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
) {
    /**
     * List of inputs to be collected from the customer using the Reader. Maximum 5 inputs.
     */
    public val inputs: List<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca> =
        inputs.toList()

    public class Builder {
        private var inputsValue:
            List<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca>? = null

        public var inputs: List<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca>
            get() = requireNotNull(inputsValue) { "inputs is required" }
            set(`value`) {
                inputsValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        public fun build(): InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d {
            check(inputsValue != null) { "inputs is required" }
            return InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d(
                inputs = inputs,
                expand = expand,
                metadata = metadata,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d must be a JSON object",
                    )
            val inputs =
                json.decodeRequired<List<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca>>(
                    rawObject,
                    "inputs",
                )
            return InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d(
                inputs = inputs,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("inputs", json.encodeToJsonElement(value.inputs))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d(
    block: InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d.Builder.() -> Unit,
): InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d =
    InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
