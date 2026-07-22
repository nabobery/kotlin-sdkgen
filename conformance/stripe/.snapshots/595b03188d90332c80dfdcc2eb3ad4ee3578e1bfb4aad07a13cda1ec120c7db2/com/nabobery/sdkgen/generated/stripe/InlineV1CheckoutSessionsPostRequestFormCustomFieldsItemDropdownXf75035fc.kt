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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items/properties/dropdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items/properties/dropdown
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc(
    options: List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownItemX021543b3>,
    public val defaultValue: String? = null,
) {
    public val options:
        List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownItemX021543b3> =
        options.toList()

    public class Builder {
        private var optionsValue:
            List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownItemX021543b3>? = null

        public var options:
            List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownItemX021543b3>
            get() = requireNotNull(optionsValue) { "options is required" }
            set(`value`) {
                optionsValue = value
            }

        public var defaultValue: String? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc {
            check(optionsValue != null) { "options is required" }
            return InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc(
                options = options,
                defaultValue = defaultValue,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc must be a JSON object",
                    )
            val options =
                json
                    .decodeRequired<List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownItemX021543b3>>(
                        rawObject,
                        "options",
                    )
            return InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc(
                options = options,
                defaultValue = rawObject["default_value"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("options", json.encodeToJsonElement(value.options))
                    value.defaultValue?.let { put("default_value", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc(
    block: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc =
    InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemDropdownXf75035fc is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
