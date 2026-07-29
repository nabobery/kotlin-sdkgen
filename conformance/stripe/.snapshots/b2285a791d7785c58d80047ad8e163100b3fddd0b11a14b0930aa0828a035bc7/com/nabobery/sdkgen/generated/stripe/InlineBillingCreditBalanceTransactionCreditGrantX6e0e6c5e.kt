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

public enum class InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eBranch {
  Branch1,
  BillingCreditGrant,
}

public sealed class InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eNoMatchException(
  message: String,
) : InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eDecodingException(message)

internal data class InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eInspection(
  public val matchesBranch1: Boolean,
  public val matchesBillingCreditGrant: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBillingCreditGrant).count { it }
}

/**
 * The credit grant associated with this credit balance transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction/properties/credit_grant
 */
@Serializable(with = InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e.Serializer::class)
public class InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val billingCreditGrant: BillingCreditGrant? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditGrant) json.decodeFromJsonElement<BillingCreditGrant>(raw) else null }

  public val matchedBranches: Set<InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eBranch.Branch1)
      if (inspection.matchesBillingCreditGrant) add(InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eBranch.BillingCreditGrant)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e {
      val inspection = inspectInlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eNoMatchException("InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e) {
      encoder.requireJsonEncoder("InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5e(element: JsonElement): InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBillingCreditGrant = element.isJsonDecodable<BillingCreditGrant>()
  return InlineBillingCreditBalanceTransactionCreditGrantX6e0e6c5eInspection(
    matchesBranch1 = matchesBranch1,
    matchesBillingCreditGrant = matchesBillingCreditGrant,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBillingCreditGrant) add("BillingCreditGrant: value does not match BillingCreditGrant")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
