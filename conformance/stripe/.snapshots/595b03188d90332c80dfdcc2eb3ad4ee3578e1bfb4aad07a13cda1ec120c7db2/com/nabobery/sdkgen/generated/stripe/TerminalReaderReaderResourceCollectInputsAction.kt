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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Represents a reader action to collect customer inputs
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_collect_inputs_action
 */
@Serializable(with = TerminalReaderReaderResourceCollectInputsAction.Serializer::class)
public class TerminalReaderReaderResourceCollectInputsAction(
    inputs: List<TerminalReaderReaderResourceInput>,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
) {
    /**
     * List of inputs to be collected.
     */
    public val inputs: List<TerminalReaderReaderResourceInput> = inputs.toList()

    public class Builder {
        private var inputsValue: List<TerminalReaderReaderResourceInput>? = null

        public var inputs: List<TerminalReaderReaderResourceInput>
            get() = requireNotNull(inputsValue) { "inputs is required" }
            set(`value`) {
                inputsValue = value
            }

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        public fun build(): TerminalReaderReaderResourceCollectInputsAction {
            check(inputsValue != null) { "inputs is required" }
            return TerminalReaderReaderResourceCollectInputsAction(
                inputs = inputs,
                metadata = metadata,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceCollectInputsAction =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceCollectInputsAction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceCollectInputsAction {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceCollectInputsAction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TerminalReaderReaderResourceCollectInputsAction must be a JSON object",
                    )
            val inputs = json.decodeRequired<List<TerminalReaderReaderResourceInput>>(rawObject, "inputs")
            return TerminalReaderReaderResourceCollectInputsAction(
                inputs = inputs,
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceCollectInputsAction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceCollectInputsAction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("inputs", json.encodeToJsonElement(value.inputs))
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceCollectInputsAction(
    block: TerminalReaderReaderResourceCollectInputsAction.Builder.() -> Unit,
): TerminalReaderReaderResourceCollectInputsAction = TerminalReaderReaderResourceCollectInputsAction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TerminalReaderReaderResourceCollectInputsAction is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
