package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents an input to be collected using the reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_input
 */
@Serializable(with = TerminalReaderReaderResourceInput.Serializer::class)
public class TerminalReaderReaderResourceInput(
    /**
     * Type of input being collected.
     */
    public val type: InlineTerminalReaderReaderResourceInputTypeXc23bd85e,
    /**
     * Default text of input being collected.
     */
    public val customText: InlineTerminalReaderReaderResourceInputCustomTextXcaef2151? = null,
    public val email: TerminalReaderReaderResourceEmail? = null,
    public val numeric: TerminalReaderReaderResourceNumeric? = null,
    public val phone: TerminalReaderReaderResourcePhone? = null,
    /**
     * Indicate that this input is required, disabling the skip button.
     */
    public val required: Boolean? = null,
    public val selection: TerminalReaderReaderResourceSelection? = null,
    public val signature: TerminalReaderReaderResourceSignature? = null,
    /**
     * Indicate that this input was skipped by the user.
     */
    public val skipped: Boolean? = null,
    public val text: TerminalReaderReaderResourceText? = null,
    /**
     * List of toggles being collected. Values are present if collection is complete.
     */
    public val toggles: List<TerminalReaderReaderResourceToggle>? = null,
) {
    public class Builder {
        private var typeValue: InlineTerminalReaderReaderResourceInputTypeXc23bd85e? = null

        public var type: InlineTerminalReaderReaderResourceInputTypeXc23bd85e
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * Default text of input being collected.
         */
        public var customText: InlineTerminalReaderReaderResourceInputCustomTextXcaef2151? = null

        public var email: TerminalReaderReaderResourceEmail? = null

        public var numeric: TerminalReaderReaderResourceNumeric? = null

        public var phone: TerminalReaderReaderResourcePhone? = null

        /**
         * Indicate that this input is required, disabling the skip button.
         */
        public var required: Boolean? = null

        public var selection: TerminalReaderReaderResourceSelection? = null

        public var signature: TerminalReaderReaderResourceSignature? = null

        /**
         * Indicate that this input was skipped by the user.
         */
        public var skipped: Boolean? = null

        public var text: TerminalReaderReaderResourceText? = null

        /**
         * List of toggles being collected. Values are present if collection is complete.
         */
        public var toggles: List<TerminalReaderReaderResourceToggle>? = null

        public fun build(): TerminalReaderReaderResourceInput {
            check(typeValue != null) { "type is required" }
            return TerminalReaderReaderResourceInput(
                type = type,
                customText = customText,
                email = email,
                numeric = numeric,
                phone = phone,
                required = required,
                selection = selection,
                signature = signature,
                skipped = skipped,
                text = text,
                toggles = toggles,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceInput = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceInput> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceInput {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceInput")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceInput must be a JSON object")
            val type = json.decodeRequired<InlineTerminalReaderReaderResourceInputTypeXc23bd85e>(rawObject, "type")
            return TerminalReaderReaderResourceInput(
                type = type,
                customText =
                    rawObject["custom_text"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTerminalReaderReaderResourceInputCustomTextXcaef2151?>(
                                element,
                            )
                        }
                    },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceEmail>(it) },
                numeric =
                    rawObject["numeric"]?.let {
                        json.decodeFromJsonElement<TerminalReaderReaderResourceNumeric>(
                            it,
                        )
                    },
                phone = rawObject["phone"]?.let {
                    json.decodeFromJsonElement<TerminalReaderReaderResourcePhone>(
                        it,
                    )
                },
                required =
                    rawObject["required"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
                selection =
                    rawObject["selection"]?.let {
                        json.decodeFromJsonElement<TerminalReaderReaderResourceSelection>(
                            it,
                        )
                    },
                signature =
                    rawObject["signature"]?.let {
                        json.decodeFromJsonElement<TerminalReaderReaderResourceSignature>(
                            it,
                        )
                    },
                skipped = rawObject["skipped"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                text = rawObject["text"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceText>(it) },
                toggles =
                    rawObject["toggles"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<TerminalReaderReaderResourceToggle>?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceInput,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceInput")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.customText?.let { put("custom_text", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", json.encodeToJsonElement(it)) }
                    value.numeric?.let { put("numeric", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
                    value.required?.let { put("required", json.encodeToJsonElement(it)) }
                    value.selection?.let { put("selection", json.encodeToJsonElement(it)) }
                    value.signature?.let { put("signature", json.encodeToJsonElement(it)) }
                    value.skipped?.let { put("skipped", json.encodeToJsonElement(it)) }
                    value.text?.let { put("text", json.encodeToJsonElement(it)) }
                    value.toggles?.let { put("toggles", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceInput(
    block: TerminalReaderReaderResourceInput.Builder.() -> Unit,
): TerminalReaderReaderResourceInput = TerminalReaderReaderResourceInput.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TerminalReaderReaderResourceInput is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
