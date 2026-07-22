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

public enum class InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Branch {
    InvoicesPaymentMethodOptions,
}

public sealed class InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8NoMatchException(
    message: String,
) : InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8DecodingException(message)

internal data class InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Inspection(
    public val matchesInvoicesPaymentMethodOptions: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInvoicesPaymentMethodOptions).count { it }
}

/**
 * Payment-method-specific configuration to provide to the invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_settings/properties/payment_method_options
 */
@Serializable(with = InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8.Serializer::class)
public class InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Inspection,
) {
    public val invoicesPaymentMethodOptions: InvoicesPaymentMethodOptionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInvoicesPaymentMethodOptions) {
                json
                    .decodeFromJsonElement<InvoicesPaymentMethodOptionsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Branch>
        get() =
            buildSet {
                if (inspection.matchesInvoicesPaymentMethodOptions) {
                    add(
                        InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Branch.InvoicesPaymentMethodOptions,
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
        ): InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8 {
            val inspection = inspectInlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8NoMatchException(
                    "InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8(
    element: JsonElement,
): InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Inspection {
    val raw =
        element as? JsonObject ?: return InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Inspection(
            matchesInvoicesPaymentMethodOptions = false,
            failures = listOf("InvoicesPaymentMethodOptions: expected JSON object"),
        )
    val matchesInvoicesPaymentMethodOptions = true
    return InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8Inspection(
        matchesInvoicesPaymentMethodOptions = matchesInvoicesPaymentMethodOptions,
        failures =
            buildList {
                if (!matchesInvoicesPaymentMethodOptions) {
                    add(
                        "InvoicesPaymentMethodOptions: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
