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

public enum class InlineSubscriptionScheduleCustomerX15534109Branch {
    Branch1,
    Customer,
    DeletedCustomer,
}

public sealed class InlineSubscriptionScheduleCustomerX15534109DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleCustomerX15534109NoMatchException(
    message: String,
) : InlineSubscriptionScheduleCustomerX15534109DecodingException(message)

internal data class InlineSubscriptionScheduleCustomerX15534109Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCustomer: Boolean,
    public val matchesDeletedCustomer: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the customer who owns the subscription schedule.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/customer
 */
@Serializable(with = InlineSubscriptionScheduleCustomerX15534109.Serializer::class)
public class InlineSubscriptionScheduleCustomerX15534109 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionScheduleCustomerX15534109Inspection,
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

    public val matchedBranches: Set<InlineSubscriptionScheduleCustomerX15534109Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSubscriptionScheduleCustomerX15534109Branch.Branch1)
                if (inspection.matchesCustomer) add(InlineSubscriptionScheduleCustomerX15534109Branch.Customer)
                if (inspection.matchesDeletedCustomer) {
                    add(
                        InlineSubscriptionScheduleCustomerX15534109Branch.DeletedCustomer,
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
        ): InlineSubscriptionScheduleCustomerX15534109 {
            val inspection = inspectInlineSubscriptionScheduleCustomerX15534109(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionScheduleCustomerX15534109NoMatchException(
                    "InlineSubscriptionScheduleCustomerX15534109 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionScheduleCustomerX15534109(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionScheduleCustomerX15534109> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleCustomerX15534109 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleCustomerX15534109")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionScheduleCustomerX15534109,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionScheduleCustomerX15534109").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionScheduleCustomerX15534109(
    element: JsonElement,
): InlineSubscriptionScheduleCustomerX15534109Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCustomer = element.isJsonDecodable<Customer>()
    val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
    return InlineSubscriptionScheduleCustomerX15534109Inspection(
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
