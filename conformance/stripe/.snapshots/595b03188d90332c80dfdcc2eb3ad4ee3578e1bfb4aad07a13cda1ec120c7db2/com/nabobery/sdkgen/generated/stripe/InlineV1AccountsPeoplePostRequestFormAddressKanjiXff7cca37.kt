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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * The Kanji variation of the person's address (Japan only).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/address_kanji
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37(
    public val city: String? = null,
    public val country: String? = null,
    public val line1: String? = null,
    public val line2: String? = null,
    public val postalCode: String? = null,
    public val state: String? = null,
    public val town: String? = null,
) {
    public class Builder {
        public var city: String? = null

        public var country: String? = null

        public var line1: String? = null

        public var line2: String? = null

        public var postalCode: String? = null

        public var state: String? = null

        public var town: String? = null

        public fun build(): InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37 =
            InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37(
                city = city,
                country = country,
                line1 = line1,
                line2 = line2,
                postalCode = postalCode,
                state = state,
                town = town,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37 must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37(
                city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
                country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
                line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<String>(it) },
                line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<String>(it) },
                postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
                state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
                town = rawObject["town"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.city?.let { put("city", it) }
                    value.country?.let { put("country", it) }
                    value.line1?.let { put("line1", it) }
                    value.line2?.let { put("line2", it) }
                    value.postalCode?.let { put("postal_code", it) }
                    value.state?.let { put("state", it) }
                    value.town?.let { put("town", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37(
    block: InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37 =
    InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37.build(block)
