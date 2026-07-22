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

public enum class InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Branch {
    Branch1,
    CustomerCashBalanceTransaction,
}

public sealed class InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7NoMatchException(
    message: String,
) : InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7DecodingException(message)

internal data class InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCustomerCashBalanceTransaction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCustomerCashBalanceTransaction).count { it }
}

/**
 * The [Cash Balance Transaction](https://docs.stripe.com/api/cash_balance_transactions/object) that brought the
 * customer balance negative, triggering the clawback of funds.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_adjusted
 * _for_overdraft/properties/linked_transaction
 */
@Serializable(with = InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7.Serializer::class)
public class InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val customerCashBalanceTransaction: CustomerCashBalanceTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesCustomerCashBalanceTransaction) {
                json
                    .decodeFromJsonElement<CustomerCashBalanceTransaction>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Branch.Branch1,
                    )
                }
                if (inspection.matchesCustomerCashBalanceTransaction) {
                    add(
                        InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Branch.CustomerCashBalanceTransaction,
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
        ): InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7 {
            val inspection = inspectInlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7(raw)
            if (inspection.matchCount == 0) {
                throw InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7NoMatchException(
                    "InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7(
    element: JsonElement,
): InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCustomerCashBalanceTransaction = element.isJsonDecodable<CustomerCashBalanceTransaction>()
    return InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCustomerCashBalanceTransaction = matchesCustomerCashBalanceTransaction,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCustomerCashBalanceTransaction) {
                    add(
                        "CustomerCashBalanceTransaction: value does not match CustomerCashBalanceTransaction",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
