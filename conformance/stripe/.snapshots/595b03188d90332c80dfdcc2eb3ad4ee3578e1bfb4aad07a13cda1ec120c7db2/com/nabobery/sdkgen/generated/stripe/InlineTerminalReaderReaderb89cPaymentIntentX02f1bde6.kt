package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Branch {
    Branch1,
    PaymentIntent,
}

public sealed class InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6NoMatchException(
    message: String,
) : InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6DecodingException(message)

internal data class InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPaymentIntent: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * Most recent PaymentIntent processed by the reader.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_confirm_payment_intent_action/proper
 * ties/payment_intent
 */
@Serializable(with = InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6.Serializer::class)
public class InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val paymentIntent: PaymentIntent? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null
        }

    public val matchedBranches: Set<InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Branch.Branch1)
                if (inspection.matchesPaymentIntent) {
                    add(
                        InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Branch.PaymentIntent,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6 {
            val inspection = inspectInlineTerminalReaderReaderb89cPaymentIntentX02f1bde6(raw)
            if (inspection.matchCount == 0) {
                throw InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6NoMatchException(
                    "InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTerminalReaderReaderb89cPaymentIntentX02f1bde6(
    element: JsonElement,
): InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
    return InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPaymentIntent = matchesPaymentIntent,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPaymentIntent) add("PaymentIntent: value does not match PaymentIntent")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
