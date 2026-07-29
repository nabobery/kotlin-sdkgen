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

public enum class InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cBranch {
  Branch1,
  CheckoutSession,
}

public sealed class InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cNoMatchException(
  message: String,
) : InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cDecodingException(message)

internal data class InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cInspection(
  public val matchesBranch1: Boolean,
  public val matchesCheckoutSession: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCheckoutSession).count { it }
}

/**
 * The ID of the checkout session (if any) that created the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction/properties/checkout_session
 */
@Serializable(with = InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c.Serializer::class)
public class InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val checkoutSession: CheckoutSession? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCheckoutSession) json.decodeFromJsonElement<CheckoutSession>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cBranch.Branch1)
      if (inspection.matchesCheckoutSession) add(InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cBranch.CheckoutSession)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c {
      val inspection = inspectInlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cNoMatchException("InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c) {
      encoder.requireJsonEncoder("InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c(element: JsonElement): InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCheckoutSession = element.isJsonDecodable<CheckoutSession>()
  return InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84cInspection(
    matchesBranch1 = matchesBranch1,
    matchesCheckoutSession = matchesCheckoutSession,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCheckoutSession) add("CheckoutSession: value does not match CheckoutSession")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
