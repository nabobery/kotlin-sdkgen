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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/selection/properties/choices/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/selection/properties/choices/items
 */
@Serializable(with = InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065.Serializer::class)
public class InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065(
    public val id: String,
    public val text: String,
    public val style: InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9? = null,
) {
    public class Builder {
        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var textValue: String? = null

        public var text: String
            get() = requireNotNull(textValue) { "text is required" }
            set(`value`) {
                textValue = value
            }

        public var style:
            InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9? = null

        public fun build(): InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065 {
            check(idValue != null) { "id is required" }
            check(textValue != null) { "text is required" }
            return InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065(
                id = id,
                text = text,
                style = style,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065 must be a JSON object",
                    )
            val id = json.decodeRequired<String>(rawObject, "id")
            val text = json.decodeRequired<String>(rawObject, "text")
            return InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065(
                id = id,
                text = text,
                style =
                    rawObject["style"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("id", value.id)
                    put("text", value.text)
                    value.style?.let { put("style", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065(
    block: InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065.Builder.() -> Unit,
): InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065 =
    InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
