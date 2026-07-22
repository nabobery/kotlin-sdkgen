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

public enum class InlineCheckoutSessionInvoiceX33315f78Branch {
    Branch1,
    Invoice,
}

public sealed class InlineCheckoutSessionInvoiceX33315f78DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCheckoutSessionInvoiceX33315f78NoMatchException(
    message: String,
) : InlineCheckoutSessionInvoiceX33315f78DecodingException(message)

internal data class InlineCheckoutSessionInvoiceX33315f78Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInvoice: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * ID of the invoice created by the Checkout Session, if it exists.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/invoice
 */
@Serializable(with = InlineCheckoutSessionInvoiceX33315f78.Serializer::class)
public class InlineCheckoutSessionInvoiceX33315f78 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCheckoutSessionInvoiceX33315f78Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val invoice: Invoice? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

    public val matchedBranches: Set<InlineCheckoutSessionInvoiceX33315f78Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineCheckoutSessionInvoiceX33315f78Branch.Branch1)
                if (inspection.matchesInvoice) add(InlineCheckoutSessionInvoiceX33315f78Branch.Invoice)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineCheckoutSessionInvoiceX33315f78 {
            val inspection = inspectInlineCheckoutSessionInvoiceX33315f78(raw)
            if (inspection.matchCount == 0) {
                throw InlineCheckoutSessionInvoiceX33315f78NoMatchException(
                    "InlineCheckoutSessionInvoiceX33315f78 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCheckoutSessionInvoiceX33315f78(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionInvoiceX33315f78> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionInvoiceX33315f78 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionInvoiceX33315f78")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionInvoiceX33315f78,
        ) {
            encoder.requireJsonEncoder("InlineCheckoutSessionInvoiceX33315f78").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCheckoutSessionInvoiceX33315f78(
    element: JsonElement,
): InlineCheckoutSessionInvoiceX33315f78Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInvoice = element.isJsonDecodable<Invoice>()
    return InlineCheckoutSessionInvoiceX33315f78Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInvoice = matchesInvoice,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInvoice) add("Invoice: value does not match Invoice")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
