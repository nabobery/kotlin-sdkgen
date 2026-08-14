package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCustomerBalanceTransactionCustomerX6a99f473Branch {
  Branch1,
  Customer,
}

public sealed class InlineCustomerBalanceTransactionCustomerX6a99f473DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceTransactionCustomerX6a99f473NoMatchException(
  message: String,
) : InlineCustomerBalanceTransactionCustomerX6a99f473DecodingException(message)

internal data class InlineCustomerBalanceTransactionCustomerX6a99f473Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The ID of the customer the transaction belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction/properties/customer
 */
@Serializable(with = InlineCustomerBalanceTransactionCustomerX6a99f473.Serializer::class)
public class InlineCustomerBalanceTransactionCustomerX6a99f473 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceTransactionCustomerX6a99f473Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceTransactionCustomerX6a99f473Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceTransactionCustomerX6a99f473Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineCustomerBalanceTransactionCustomerX6a99f473Branch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceTransactionCustomerX6a99f473 {
      val inspection = inspectInlineCustomerBalanceTransactionCustomerX6a99f473(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceTransactionCustomerX6a99f473NoMatchException("InlineCustomerBalanceTransactionCustomerX6a99f473 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceTransactionCustomerX6a99f473(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceTransactionCustomerX6a99f473> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceTransactionCustomerX6a99f473 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceTransactionCustomerX6a99f473")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceTransactionCustomerX6a99f473) {
      encoder.requireJsonEncoder("InlineCustomerBalanceTransactionCustomerX6a99f473").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceTransactionCustomerX6a99f473(element: JsonElement): InlineCustomerBalanceTransactionCustomerX6a99f473Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlineCustomerBalanceTransactionCustomerX6a99f473Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
