package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class TerminalReaderReaderResourceCustomTextView(
    public val description: String? = null,
    @SerialName("skip_button")
    public val skipButton: String? = null,
    @SerialName("submit_button")
    public val submitButton: String? = null,
    public val title: String? = null,
)

/**
 * Represents custom text to be displayed when collecting the input using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_custom_text
 */
@Serializable(with = TerminalReaderReaderResourceCustomText.Serializer::class)
public class TerminalReaderReaderResourceCustomText(
    /**
     * Customize the default description for this input
     */
    public val description: String? = null,
    /**
     * Customize the default label for this input's skip button
     */
    public val skipButton: String? = null,
    /**
     * Customize the default label for this input's submit button
     */
    public val submitButton: String? = null,
    /**
     * Customize the default title for this input
     */
    public val title: String? = null,
) {
    public class Builder {
        /**
         * Customize the default description for this input
         */
        public var description: String? = null

        /**
         * Customize the default label for this input's skip button
         */
        public var skipButton: String? = null

        /**
         * Customize the default label for this input's submit button
         */
        public var submitButton: String? = null

        /**
         * Customize the default title for this input
         */
        public var title: String? = null

        public fun build(): TerminalReaderReaderResourceCustomText =
            TerminalReaderReaderResourceCustomText(
                description = description,
                skipButton = skipButton,
                submitButton = submitButton,
                title = title,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceCustomText =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceCustomText> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceCustomText {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceCustomText")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceCustomText must be a JSON object")
            return TerminalReaderReaderResourceCustomText(
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
                skipButton =
                    rawObject["skip_button"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                submitButton =
                    rawObject["submit_button"]?.let { element ->
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceCustomText,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceCustomText")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.description?.let { put("description", it) }
                    value.skipButton?.let { put("skip_button", it) }
                    value.submitButton?.let { put("submit_button", it) }
                    value.title?.let { put("title", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceCustomText(
    block: TerminalReaderReaderResourceCustomText.Builder.() -> Unit,
): TerminalReaderReaderResourceCustomText = TerminalReaderReaderResourceCustomText.build(block)
