package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

@Serializable
public class InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Branch1View

public enum class InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Branch {
    Branch1,
}

public sealed class InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3NoMatchException(
    message: String,
) : InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Inspection(
    public val matchesBranch1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1).count { it }
}

/**
 * If paying by `sepa_debit`, this sub-hash contains details about the SEPA Direct Debit payment method options to pass
 * to the invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Inspection,
) {
    public val branch1: InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Branch1View? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Branch1View>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Branch.Branch1)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3 {
            val inspection = inspectInlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3NoMatchException(
                    "InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3(
    element: JsonElement,
): InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Inspection {
    val raw =
        element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Inspection(
            matchesBranch1 = false,
            failures = listOf("Branch1: expected JSON object"),
        )
    val matchesBranch1 = true
    return InlineInvoicesPaymentMethodOptionsSepaDebitX88a99be3Inspection(
        matchesBranch1 = matchesBranch1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
