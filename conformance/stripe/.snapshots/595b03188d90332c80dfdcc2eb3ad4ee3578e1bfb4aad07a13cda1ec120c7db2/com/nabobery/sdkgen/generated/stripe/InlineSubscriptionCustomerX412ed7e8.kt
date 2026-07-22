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

public enum class InlineSubscriptionCustomerX412ed7e8Branch {
    Branch1,
    Customer,
    DeletedCustomer,
}

public sealed class InlineSubscriptionCustomerX412ed7e8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionCustomerX412ed7e8NoMatchException(
    message: String,
) : InlineSubscriptionCustomerX412ed7e8DecodingException(message)

internal data class InlineSubscriptionCustomerX412ed7e8Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCustomer: Boolean,
    public val matchesDeletedCustomer: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the customer who owns the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/customer
 */
@Serializable(with = InlineSubscriptionCustomerX412ed7e8.Serializer::class)
public class InlineSubscriptionCustomerX412ed7e8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionCustomerX412ed7e8Inspection,
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

    public val matchedBranches: Set<InlineSubscriptionCustomerX412ed7e8Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSubscriptionCustomerX412ed7e8Branch.Branch1)
                if (inspection.matchesCustomer) add(InlineSubscriptionCustomerX412ed7e8Branch.Customer)
                if (inspection.matchesDeletedCustomer) add(InlineSubscriptionCustomerX412ed7e8Branch.DeletedCustomer)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineSubscriptionCustomerX412ed7e8 {
            val inspection = inspectInlineSubscriptionCustomerX412ed7e8(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionCustomerX412ed7e8NoMatchException(
                    "InlineSubscriptionCustomerX412ed7e8 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionCustomerX412ed7e8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionCustomerX412ed7e8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionCustomerX412ed7e8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionCustomerX412ed7e8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionCustomerX412ed7e8,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionCustomerX412ed7e8").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionCustomerX412ed7e8(
    element: JsonElement,
): InlineSubscriptionCustomerX412ed7e8Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCustomer = element.isJsonDecodable<Customer>()
    val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
    return InlineSubscriptionCustomerX412ed7e8Inspection(
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
