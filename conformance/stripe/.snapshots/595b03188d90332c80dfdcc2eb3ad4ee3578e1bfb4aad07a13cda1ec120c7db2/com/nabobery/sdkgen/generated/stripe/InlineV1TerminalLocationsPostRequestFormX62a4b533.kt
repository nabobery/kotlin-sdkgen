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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormX62a4b533.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormX62a4b533(
    /**
     * The full address of the location. You can't change the location's `country`. If you need to modify the `country`
     * field, create a new `Location` object and re-register any existing readers to that location.
     */
    public val address: InlineV1TerminalLocationsPostRequestFormAddressX18dbb007? = null,
    /**
     * The Kana variation of the full address of the location (Japan only).
     */
    public val addressKana: InlineV1TerminalLocationsPostRequestFormAddressKanaXe49a73e8? = null,
    /**
     * The Kanji variation of the full address of the location (Japan only).
     */
    public val addressKanji: InlineV1TerminalLocationsPostRequestFormAddressKanjiX36415c5b? = null,
    /**
     * The ID of a configuration that will be used to customize all readers in this location.
     */
    public val configurationOverrides: InlineV1TerminalLocationsPostRequestFormConfigurationOverridesXa36a9d04? = null,
    /**
     * A name for the location.
     */
    public val displayName: InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d? = null,
    /**
     * The Kana variation of the name for the location (Japan only).
     */
    public val displayNameKana: InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f? = null,
    /**
     * The Kanji variation of the name for the location (Japan only).
     */
    public val displayNameKanji: InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a? = null,
    /**
     * The phone number for the location.
     */
    public val phone: InlineV1TerminalLocationsPostRequestFormPhoneX618229f9? = null,
) {
    public class Builder {
        /**
         * The full address of the location. You can't change the location's `country`. If you need to modify the `country`
         * field, create a new `Location` object and re-register any existing readers to that location.
         */
        public var address: InlineV1TerminalLocationsPostRequestFormAddressX18dbb007? = null

        /**
         * The Kana variation of the full address of the location (Japan only).
         */
        public var addressKana: InlineV1TerminalLocationsPostRequestFormAddressKanaXe49a73e8? = null

        /**
         * The Kanji variation of the full address of the location (Japan only).
         */
        public var addressKanji: InlineV1TerminalLocationsPostRequestFormAddressKanjiX36415c5b? = null

        /**
         * The ID of a configuration that will be used to customize all readers in this location.
         */
        public var configurationOverrides:
            InlineV1TerminalLocationsPostRequestFormConfigurationOverridesXa36a9d04? = null

        /**
         * A name for the location.
         */
        public var displayName: InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d? = null

        /**
         * The Kana variation of the name for the location (Japan only).
         */
        public var displayNameKana: InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f? =
            null

        /**
         * The Kanji variation of the name for the location (Japan only).
         */
        public var displayNameKanji: InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c? =
            null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a? = null

        /**
         * The phone number for the location.
         */
        public var phone: InlineV1TerminalLocationsPostRequestFormPhoneX618229f9? = null

        public fun build(): InlineV1TerminalLocationsPostRequestFormX62a4b533 =
            InlineV1TerminalLocationsPostRequestFormX62a4b533(
                address = address,
                addressKana = addressKana,
                addressKanji = addressKanji,
                configurationOverrides = configurationOverrides,
                displayName = displayName,
                displayNameKana = displayNameKana,
                displayNameKanji = displayNameKanji,
                expand = expand,
                metadata = metadata,
                phone = phone,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TerminalLocationsPostRequestFormX62a4b533 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormX62a4b533> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormX62a4b533 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormX62a4b533")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalLocationsPostRequestFormX62a4b533 must be a JSON object",
                    )
            return InlineV1TerminalLocationsPostRequestFormX62a4b533(
                address =
                    rawObject["address"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormAddressX18dbb007>(it)
                    },
                addressKana =
                    rawObject["address_kana"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormAddressKanaXe49a73e8>(it)
                    },
                addressKanji =
                    rawObject["address_kanji"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormAddressKanjiX36415c5b>(it)
                    },
                configurationOverrides =
                    rawObject["configuration_overrides"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormConfigurationOverridesXa36a9d04>(
                                it,
                            )
                    },
                displayName =
                    rawObject["display_name"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormDisplayNameXc804549d>(it)
                    },
                displayNameKana =
                    rawObject["display_name_kana"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormDisplayNameKanaX9bf21f5f>(it)
                    },
                displayNameKanji =
                    rawObject["display_name_kanji"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c>(
                            it,
                        )
                    },
                expand =
                    rawObject["expand"]?.let {
                        json
                            .decodeFromJsonElement<List<String>>(
                                it,
                            )
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormMetadataXfd4c4a0a>(it)
                    },
                phone =
                    rawObject["phone"]?.let {
                        json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormPhoneX618229f9>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostRequestFormX62a4b533,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalLocationsPostRequestFormX62a4b533")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
                    value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
                    value.configurationOverrides?.let { put("configuration_overrides", json.encodeToJsonElement(it)) }
                    value.displayName?.let { put("display_name", json.encodeToJsonElement(it)) }
                    value.displayNameKana?.let { put("display_name_kana", json.encodeToJsonElement(it)) }
                    value.displayNameKanji?.let { put("display_name_kanji", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalLocationsPostRequestFormX62a4b533(
    block: InlineV1TerminalLocationsPostRequestFormX62a4b533.Builder.() -> Unit,
): InlineV1TerminalLocationsPostRequestFormX62a4b533 = InlineV1TerminalLocationsPostRequestFormX62a4b533.build(block)
