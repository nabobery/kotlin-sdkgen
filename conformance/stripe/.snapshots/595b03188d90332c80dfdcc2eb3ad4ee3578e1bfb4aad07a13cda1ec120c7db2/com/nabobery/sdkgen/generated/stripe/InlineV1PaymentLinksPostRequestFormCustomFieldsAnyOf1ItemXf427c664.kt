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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664(
    public val key: String,
    public val label: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelX4d4c6ea8,
    public val type: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d,
    public val dropdown: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e? = null,
    public val numeric: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemNumericXaa29a00a? = null,
    public val optional: Boolean? = null,
    public val text: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTextX3ea804ae? = null,
) {
    public class Builder {
        private var keyValue: String? = null

        public var key: String
            get() = requireNotNull(keyValue) { "key is required" }
            set(`value`) {
                keyValue = value
            }

        private var labelValue: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelX4d4c6ea8? =
            null

        public var label: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelX4d4c6ea8
            get() = requireNotNull(labelValue) { "label is required" }
            set(`value`) {
                labelValue = value
            }

        private var typeValue: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d? =
            null

        public var type: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var dropdown: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e? =
            null

        public var numeric: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemNumericXaa29a00a? =
            null

        public var optional: Boolean? = null

        public var text: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTextX3ea804ae? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664 {
            check(keyValue != null) { "key is required" }
            check(labelValue != null) { "label is required" }
            check(typeValue != null) { "type is required" }
            return InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664(
                key = key,
                label = label,
                type = type,
                dropdown = dropdown,
                numeric = numeric,
                optional = optional,
                text = text,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664 must be a JSON object",
                    )
            val key = json.decodeRequired<String>(rawObject, "key")
            val label =
                json.decodeRequired<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelX4d4c6ea8>(
                    rawObject,
                    "label",
                )
            val type =
                json.decodeRequired<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d>(
                    rawObject,
                    "type",
                )
            return InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664(
                key = key,
                label = label,
                type = type,
                dropdown =
                    rawObject["dropdown"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemDropdownXd3bed56e>(
                                it,
                            )
                    },
                numeric =
                    rawObject["numeric"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemNumericXaa29a00a>(
                                it,
                            )
                    },
                optional = rawObject["optional"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                text =
                    rawObject["text"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTextX3ea804ae>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("key", value.key)
                    put("label", json.encodeToJsonElement(value.label))
                    put("type", json.encodeToJsonElement(value.type))
                    value.dropdown?.let { put("dropdown", json.encodeToJsonElement(it)) }
                    value.numeric?.let { put("numeric", json.encodeToJsonElement(it)) }
                    value.optional?.let { put("optional", json.encodeToJsonElement(it)) }
                    value.text?.let { put("text", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664(
    block: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664 =
    InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
