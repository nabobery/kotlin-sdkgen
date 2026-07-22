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

public enum class InlineBankAccountCustomerX196a61c7Branch {
    Branch1,
    Customer,
    DeletedCustomer,
}

public sealed class InlineBankAccountCustomerX196a61c7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineBankAccountCustomerX196a61c7NoMatchException(
    message: String,
) : InlineBankAccountCustomerX196a61c7DecodingException(message)

internal data class InlineBankAccountCustomerX196a61c7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCustomer: Boolean,
    public val matchesDeletedCustomer: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * The ID of the customer that the bank account is associated with.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account/properties/customer
 */
@Serializable(with = InlineBankAccountCustomerX196a61c7.Serializer::class)
public class InlineBankAccountCustomerX196a61c7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBankAccountCustomerX196a61c7Inspection,
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

    public val matchedBranches: Set<InlineBankAccountCustomerX196a61c7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineBankAccountCustomerX196a61c7Branch.Branch1)
                if (inspection.matchesCustomer) add(InlineBankAccountCustomerX196a61c7Branch.Customer)
                if (inspection.matchesDeletedCustomer) add(InlineBankAccountCustomerX196a61c7Branch.DeletedCustomer)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineBankAccountCustomerX196a61c7 {
            val inspection = inspectInlineBankAccountCustomerX196a61c7(raw)
            if (inspection.matchCount == 0) {
                throw InlineBankAccountCustomerX196a61c7NoMatchException(
                    "InlineBankAccountCustomerX196a61c7 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineBankAccountCustomerX196a61c7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBankAccountCustomerX196a61c7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBankAccountCustomerX196a61c7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBankAccountCustomerX196a61c7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBankAccountCustomerX196a61c7,
        ) {
            encoder.requireJsonEncoder("InlineBankAccountCustomerX196a61c7").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBankAccountCustomerX196a61c7(
    element: JsonElement,
): InlineBankAccountCustomerX196a61c7Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCustomer = element.isJsonDecodable<Customer>()
    val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
    return InlineBankAccountCustomerX196a61c7Inspection(
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
