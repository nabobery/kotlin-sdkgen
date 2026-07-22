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
 * Represents a reader action to process a setup intent
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_process_setup_intent_action
 */
@Serializable(with = TerminalReaderReaderResourceProcessSetupIntentAction.Serializer::class)
public class TerminalReaderReaderResourceProcessSetupIntentAction(
    /**
     * Most recent SetupIntent processed by the reader.
     */
    public val setupIntent: InlineTerminalReaderReaderResourceProcessSetupIntentActionSetupIntentXb1c809a3,
    /**
     * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be attached to a Customer for
     * future transactions. Only present if it was possible to generate a card PaymentMethod.
     */
    public val generatedCard: String? = null,
    public val processConfig: TerminalReaderReaderResourceProcessSetupConfig? = null,
) {
    public class Builder {
        private var setupIntentValue:
            InlineTerminalReaderReaderResourceProcessSetupIntentActionSetupIntentXb1c809a3? = null

        public var setupIntent:
            InlineTerminalReaderReaderResourceProcessSetupIntentActionSetupIntentXb1c809a3
            get() = requireNotNull(setupIntentValue) { "setupIntent is required" }
            set(`value`) {
                setupIntentValue = value
            }

        /**
         * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be attached to a Customer for
         * future transactions. Only present if it was possible to generate a card PaymentMethod.
         */
        public var generatedCard: String? = null

        public var processConfig: TerminalReaderReaderResourceProcessSetupConfig? = null

        public fun build(): TerminalReaderReaderResourceProcessSetupIntentAction {
            check(setupIntentValue != null) { "setupIntent is required" }
            return TerminalReaderReaderResourceProcessSetupIntentAction(
                setupIntent = setupIntent,
                generatedCard = generatedCard,
                processConfig = processConfig,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceProcessSetupIntentAction =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceProcessSetupIntentAction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceProcessSetupIntentAction {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceProcessSetupIntentAction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TerminalReaderReaderResourceProcessSetupIntentAction must be a JSON object",
                    )
            val setupIntent =
                json
                    .decodeRequired<InlineTerminalReaderReaderResourceProcessSetupIntentActionSetupIntentXb1c809a3>(
                        rawObject,
                        "setup_intent",
                    )
            return TerminalReaderReaderResourceProcessSetupIntentAction(
                setupIntent = setupIntent,
                generatedCard = rawObject["generated_card"]?.let { json.decodeFromJsonElement<String>(it) },
                processConfig =
                    rawObject["process_config"]?.let {
                        json.decodeFromJsonElement<TerminalReaderReaderResourceProcessSetupConfig>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceProcessSetupIntentAction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceProcessSetupIntentAction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("setup_intent", json.encodeToJsonElement(value.setupIntent))
                    value.generatedCard?.let { put("generated_card", it) }
                    value.processConfig?.let { put("process_config", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceProcessSetupIntentAction(
    block: TerminalReaderReaderResourceProcessSetupIntentAction.Builder.() -> Unit,
): TerminalReaderReaderResourceProcessSetupIntentAction =
    TerminalReaderReaderResourceProcessSetupIntentAction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TerminalReaderReaderResourceProcessSetupIntentAction is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
