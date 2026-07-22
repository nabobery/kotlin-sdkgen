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
 * Information on whether this personalization design is used to create cards when one is not specified.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/preferences
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859(
    public val isDefault: Boolean,
) {
    public class Builder {
        private var isDefaultValue: Boolean? = null

        public var isDefault: Boolean
            get() = requireNotNull(isDefaultValue) { "isDefault is required" }
            set(`value`) {
                isDefaultValue = value
            }

        public fun build(): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859 {
            check(isDefaultValue != null) { "isDefault is required" }
            return InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859(
                isDefault = isDefault,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859 must be a JSON object",
                    )
            val isDefault = json.decodeRequired<Boolean>(rawObject, "is_default")
            return InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859(
                isDefault = isDefault,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("is_default", json.encodeToJsonElement(value.isDefault))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859(
    block: InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859.Builder.() -> Unit,
): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859 =
    InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
