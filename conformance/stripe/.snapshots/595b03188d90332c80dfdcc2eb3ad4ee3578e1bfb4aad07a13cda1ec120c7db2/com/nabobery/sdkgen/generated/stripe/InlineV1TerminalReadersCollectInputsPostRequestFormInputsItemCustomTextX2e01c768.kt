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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/custom_text.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/custom_text
 */
@Serializable(with = InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768.Serializer::class)
public class InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768(
    public val title: String,
    public val description: String? = null,
    public val skipButton: String? = null,
    public val submitButton: String? = null,
) {
    public class Builder {
        private var titleValue: String? = null

        public var title: String
            get() = requireNotNull(titleValue) { "title is required" }
            set(`value`) {
                titleValue = value
            }

        public var description: String? = null

        public var skipButton: String? = null

        public var submitButton: String? = null

        public fun build(): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768 {
            check(titleValue != null) { "title is required" }
            return InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768(
                title = title,
                description = description,
                skipButton = skipButton,
                submitButton = submitButton,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768 must be a JSON object",
                    )
            val title = json.decodeRequired<String>(rawObject, "title")
            return InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768(
                title = title,
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                skipButton = rawObject["skip_button"]?.let { json.decodeFromJsonElement<String>(it) },
                submitButton = rawObject["submit_button"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("title", value.title)
                    value.description?.let { put("description", it) }
                    value.skipButton?.let { put("skip_button", it) }
                    value.submitButton?.let { put("submit_button", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768(
    block: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768.Builder.() -> Unit,
): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768 =
    InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
