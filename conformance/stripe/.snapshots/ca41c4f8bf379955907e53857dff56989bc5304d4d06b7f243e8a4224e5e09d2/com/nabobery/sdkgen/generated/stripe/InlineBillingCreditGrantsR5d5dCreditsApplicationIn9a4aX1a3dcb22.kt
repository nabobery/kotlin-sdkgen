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

public enum class InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Branch {
  BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided,
}

public sealed class InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22NoMatchException(
  message: String,
) : InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22DecodingException(message)

internal data class InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Inspection(
  public val matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided).count { it }
}

/**
 * Details of the invoice to which the reinstated credits were originally applied. Only present if `type` is
 * `credits_application_invoice_voided`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_credit/properties/credits_app
 * lication_invoice_voided
 */
@Serializable(with = InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22.Serializer::class)
public class InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Inspection,
) {
  public val billingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided:
      BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoidedView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided) json.decodeFromJsonElement<BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoidedView>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Branch>
    get() = buildSet {
      if (inspection.matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided) add(InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Branch.BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22 {
      val inspection = inspectInlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22NoMatchException("InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22) {
      encoder.requireJsonEncoder("InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22(element: JsonElement): InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Inspection {
  val raw = element as? JsonObject ?: return InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Inspection(
    matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided = false,
    failures = listOf("BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided: expected JSON object"),
  )
  val matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided = raw["invoice"] != null && raw["invoice_line_item"].isString()
  return InlineBillingCreditGrantsR5d5dCreditsApplicationIn9a4aX1a3dcb22Inspection(
    matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided = matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided,
    failures = buildList {
      if (!matchesBillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided) add("BillingCreditGrantsResourceBalanceCreditsApplicationInvoiceVoided: required properties 'invoice', 'invoice_line_item' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
