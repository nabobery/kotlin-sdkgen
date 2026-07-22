package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Information about an input's toggle
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_toggle
 */
@Serializable(with = TerminalReaderReaderResourceToggle.Serializer::class)
public class TerminalReaderReaderResourceToggle(
    /**
     * The toggle's default value. Can be `enabled` or `disabled`.
     */
    public val defaultValue: InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4? = null,
    /**
     * The toggle's description text. Maximum 50 characters.
     */
    public val description: String? = null,
    /**
     * The toggle's title text. Maximum 50 characters.
     */
    public val title: String? = null,
    /**
     * The toggle's collected value. Can be `enabled` or `disabled`.
     */
    public val `value`: InlineTerminalReaderReaderResourceToggleValueX4d8b7bba? = null,
) {
    public class Builder {
        /**
         * The toggle's default value. Can be `enabled` or `disabled`.
         */
        public var defaultValue: InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4? = null

        /**
         * The toggle's description text. Maximum 50 characters.
         */
        public var description: String? = null

        /**
         * The toggle's title text. Maximum 50 characters.
         */
        public var title: String? = null

        /**
         * The toggle's collected value. Can be `enabled` or `disabled`.
         */
        public var `value`: InlineTerminalReaderReaderResourceToggleValueX4d8b7bba? = null

        public fun build(): TerminalReaderReaderResourceToggle =
            TerminalReaderReaderResourceToggle(
                defaultValue = defaultValue,
                description = description,
                title = title,
                value = value,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceToggle = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceToggle> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceToggle {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceToggle")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceToggle must be a JSON object")
            return TerminalReaderReaderResourceToggle(
                defaultValue =
                    rawObject["default_value"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTerminalReaderReaderResourceToggleDefaultValueXa8cf5ef4?>(
                                element,
                            )
                        }
                    },
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                title =
                    rawObject["title"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                value =
                    rawObject["value"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTerminalReaderReaderResourceToggleValueX4d8b7bba?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceToggle,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceToggle")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.defaultValue?.let { put("default_value", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.title?.let { put("title", it) }
                    value.value?.let { put("value", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceToggle(
    block: TerminalReaderReaderResourceToggle.Builder.() -> Unit,
): TerminalReaderReaderResourceToggle = TerminalReaderReaderResourceToggle.build(block)
