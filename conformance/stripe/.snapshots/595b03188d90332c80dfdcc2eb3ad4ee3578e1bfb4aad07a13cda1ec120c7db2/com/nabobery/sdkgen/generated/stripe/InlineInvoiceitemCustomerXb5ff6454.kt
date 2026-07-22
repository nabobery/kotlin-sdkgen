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

public enum class InlineInvoiceitemCustomerXb5ff6454Branch {
    Branch1,
    Customer,
    DeletedCustomer,
}

public sealed class InlineInvoiceitemCustomerXb5ff6454DecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceitemCustomerXb5ff6454NoMatchException(
    message: String,
) : InlineInvoiceitemCustomerXb5ff6454DecodingException(message)

internal data class InlineInvoiceitemCustomerXb5ff6454Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCustomer: Boolean,
    public val matchesDeletedCustomer: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The ID of the customer to bill for this invoice item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/customer
 */
@Serializable(with = InlineInvoiceitemCustomerXb5ff6454.Serializer::class)
public class InlineInvoiceitemCustomerXb5ff6454 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceitemCustomerXb5ff6454Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val customer: Customer? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

    public val deletedCustomer: DeletedCustomer? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null
        }

    public val matchedBranches: Set<InlineInvoiceitemCustomerXb5ff6454Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineInvoiceitemCustomerXb5ff6454Branch.Branch1)
                if (inspection.matchesCustomer) add(InlineInvoiceitemCustomerXb5ff6454Branch.Customer)
                if (inspection.matchesDeletedCustomer) add(InlineInvoiceitemCustomerXb5ff6454Branch.DeletedCustomer)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineInvoiceitemCustomerXb5ff6454 {
            val inspection = inspectInlineInvoiceitemCustomerXb5ff6454(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceitemCustomerXb5ff6454NoMatchException(
                    "InlineInvoiceitemCustomerXb5ff6454 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceitemCustomerXb5ff6454(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceitemCustomerXb5ff6454> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceitemCustomerXb5ff6454 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceitemCustomerXb5ff6454")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceitemCustomerXb5ff6454,
        ) {
            encoder.requireJsonEncoder("InlineInvoiceitemCustomerXb5ff6454").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceitemCustomerXb5ff6454(
    element: JsonElement,
): InlineInvoiceitemCustomerXb5ff6454Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCustomer = element.isJsonDecodable<Customer>()
    val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
    return InlineInvoiceitemCustomerXb5ff6454Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCustomer = matchesCustomer,
        matchesDeletedCustomer = matchesDeletedCustomer,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCustomer) add("Customer: value does not match Customer")
                if (!matchesDeletedCustomer) add("DeletedCustomer: value does not match DeletedCustomer")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
