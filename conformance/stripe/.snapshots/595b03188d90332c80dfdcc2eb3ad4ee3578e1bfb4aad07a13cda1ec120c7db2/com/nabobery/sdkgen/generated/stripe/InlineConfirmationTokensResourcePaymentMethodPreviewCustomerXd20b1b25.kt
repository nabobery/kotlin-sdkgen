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

public enum class InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Branch {
    Branch1,
    Customer,
}

public sealed class InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25DecodingException(
    message: String,
) : SerializationException(message)

public class InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25NoMatchException(
    message: String,
) : InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25DecodingException(message)

internal data class InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCustomer: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been
 * saved to a Customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_preview/properties/custo
 * mer
 */
@Serializable(with = InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25.Serializer::class)
public class InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val customer: Customer? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

    public val matchedBranches:
        Set<InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Branch.Branch1,
                    )
                }
                if (inspection.matchesCustomer) {
                    add(
                        InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Branch.Customer,
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
        ): InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25 {
            val inspection = inspectInlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25(raw)
            if (inspection.matchCount == 0) {
                throw InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25NoMatchException(
                    "InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25(
    element: JsonElement,
): InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCustomer = element.isJsonDecodable<Customer>()
    return InlineConfirmationTokensResourcePaymentMethodPreviewCustomerXd20b1b25Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCustomer = matchesCustomer,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCustomer) add("Customer: value does not match Customer")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
