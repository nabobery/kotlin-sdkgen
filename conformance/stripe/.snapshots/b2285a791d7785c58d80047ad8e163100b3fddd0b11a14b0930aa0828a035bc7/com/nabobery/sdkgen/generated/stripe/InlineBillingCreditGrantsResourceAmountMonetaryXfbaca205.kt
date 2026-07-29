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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Branch {
  BillingCreditGrantsResourceMonetaryAmount,
}

public sealed class InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205NoMatchException(
  message: String,
) : InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205DecodingException(message)

internal data class InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Inspection(
  public val matchesBillingCreditGrantsResourceMonetaryAmount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingCreditGrantsResourceMonetaryAmount).count { it }
}

/**
 * The monetary amount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_amount/properties/monetary
 */
@Serializable(with = InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205.Serializer::class)
public class InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Inspection,
) {
  public val billingCreditGrantsResourceMonetaryAmount:
      BillingCreditGrantsResourceMonetaryAmountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditGrantsResourceMonetaryAmount) json.decodeFromJsonElement<BillingCreditGrantsResourceMonetaryAmountView>(raw) else null }

  public val matchedBranches: Set<InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Branch>
    get() = buildSet {
      if (inspection.matchesBillingCreditGrantsResourceMonetaryAmount) add(InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Branch.BillingCreditGrantsResourceMonetaryAmount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205 {
      val inspection = inspectInlineBillingCreditGrantsResourceAmountMonetaryXfbaca205(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205NoMatchException("InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205) {
      encoder.requireJsonEncoder("InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditGrantsResourceAmountMonetaryXfbaca205(element: JsonElement): InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Inspection {
  val raw = element as? JsonObject ?: return InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Inspection(
    matchesBillingCreditGrantsResourceMonetaryAmount = false,
    failures = listOf("BillingCreditGrantsResourceMonetaryAmount: expected JSON object"),
  )
  val matchesBillingCreditGrantsResourceMonetaryAmount = raw["currency"].isString() && raw["value"] != null
  return InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205Inspection(
    matchesBillingCreditGrantsResourceMonetaryAmount = matchesBillingCreditGrantsResourceMonetaryAmount,
    failures = buildList {
      if (!matchesBillingCreditGrantsResourceMonetaryAmount) add("BillingCreditGrantsResourceMonetaryAmount: required properties 'currency', 'value' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
