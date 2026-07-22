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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represents a per-transaction override of a reader configuration
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_process_config
 */
@Serializable(with = TerminalReaderReaderResourceProcessConfig.Serializer::class)
public class TerminalReaderReaderResourceProcessConfig(
    /**
     * Enable customer-initiated cancellation when processing this payment.
     */
    public val enableCustomerCancellation: Boolean? = null,
    /**
     * If the customer doesn't abandon authenticating the payment, they're redirected to this URL after completion.
     */
    public val returnUrl: String? = null,
    /**
     * Override showing a tipping selection screen on this transaction.
     */
    public val skipTipping: Boolean? = null,
    public val tipping: TerminalReaderReaderResourceTippingConfig? = null,
) {
    public class Builder {
        /**
         * Enable customer-initiated cancellation when processing this payment.
         */
        public var enableCustomerCancellation: Boolean? = null

        /**
         * If the customer doesn't abandon authenticating the payment, they're redirected to this URL after completion.
         */
        public var returnUrl: String? = null

        /**
         * Override showing a tipping selection screen on this transaction.
         */
        public var skipTipping: Boolean? = null

        public var tipping: TerminalReaderReaderResourceTippingConfig? = null

        public fun build(): TerminalReaderReaderResourceProcessConfig =
            TerminalReaderReaderResourceProcessConfig(
                enableCustomerCancellation = enableCustomerCancellation,
                returnUrl = returnUrl,
                skipTipping = skipTipping,
                tipping = tipping,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceProcessConfig =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TerminalReaderReaderResourceProcessConfig> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceProcessConfig {
            val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceProcessConfig")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TerminalReaderReaderResourceProcessConfig must be a JSON object")
            return TerminalReaderReaderResourceProcessConfig(
                enableCustomerCancellation =
                    rawObject["enable_customer_cancellation"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
                returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
                skipTipping = rawObject["skip_tipping"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                tipping =
                    rawObject["tipping"]?.let {
                        json.decodeFromJsonElement<TerminalReaderReaderResourceTippingConfig>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TerminalReaderReaderResourceProcessConfig,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceProcessConfig")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.enableCustomerCancellation?.let {
                        put(
                            "enable_customer_cancellation",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.returnUrl?.let { put("return_url", it) }
                    value.skipTipping?.let { put("skip_tipping", json.encodeToJsonElement(it)) }
                    value.tipping?.let { put("tipping", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun terminalReaderReaderResourceProcessConfig(
    block: TerminalReaderReaderResourceProcessConfig.Builder.() -> Unit,
): TerminalReaderReaderResourceProcessConfig = TerminalReaderReaderResourceProcessConfig.build(block)
