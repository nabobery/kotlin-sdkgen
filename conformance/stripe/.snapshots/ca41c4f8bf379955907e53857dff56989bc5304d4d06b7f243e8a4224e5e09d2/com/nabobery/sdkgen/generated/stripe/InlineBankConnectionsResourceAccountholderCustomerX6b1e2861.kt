package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Branch {
  Branch1,
  Customer,
}

public sealed class InlineBankConnectionsResourceAccountholderCustomerX6b1e2861DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBankConnectionsResourceAccountholderCustomerX6b1e2861NoMatchException(
  message: String,
) : InlineBankConnectionsResourceAccountholderCustomerX6b1e2861DecodingException(message)

internal data class InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The ID for an Account representing a customer that this account belongs to. Only available when `account_holder.type`
 * is `customer`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_accountholder/properties/customer
 */
@Serializable(with = InlineBankConnectionsResourceAccountholderCustomerX6b1e2861.Serializer::class)
public class InlineBankConnectionsResourceAccountholderCustomerX6b1e2861 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Branch.Branch1)
      if (inspection.matchesCustomer) add(InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Branch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBankConnectionsResourceAccountholderCustomerX6b1e2861 {
      val inspection = inspectInlineBankConnectionsResourceAccountholderCustomerX6b1e2861(raw)
      if (inspection.matchCount == 0) {
        throw InlineBankConnectionsResourceAccountholderCustomerX6b1e2861NoMatchException("InlineBankConnectionsResourceAccountholderCustomerX6b1e2861 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBankConnectionsResourceAccountholderCustomerX6b1e2861(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResourceAccountholderCustomerX6b1e2861> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResourceAccountholderCustomerX6b1e2861 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBankConnectionsResourceAccountholderCustomerX6b1e2861")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResourceAccountholderCustomerX6b1e2861) {
      encoder.requireJsonEncoder("InlineBankConnectionsResourceAccountholderCustomerX6b1e2861").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBankConnectionsResourceAccountholderCustomerX6b1e2861(element: JsonElement): InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlineBankConnectionsResourceAccountholderCustomerX6b1e2861Inspection(
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
