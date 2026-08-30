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

public enum class InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Branch {
  PaymentMethodDetailsCardInstallmentsPlan,
}

public sealed class InlinePaymentMethodDetailsCardInstallmentsPlanX67429504DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardInstallmentsPlanX67429504NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardInstallmentsPlanX67429504DecodingException(message)

internal data class InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Inspection(
  public val matchesPaymentMethodDetailsCardInstallmentsPlan: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsCardInstallmentsPlan).count { it }
}

/**
 * Installment plan selected for the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_installments/properties/plan
 */
@Serializable(with = InlinePaymentMethodDetailsCardInstallmentsPlanX67429504.Serializer::class)
public class InlinePaymentMethodDetailsCardInstallmentsPlanX67429504 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Inspection,
) {
  public val paymentMethodDetailsCardInstallmentsPlan: PaymentMethodDetailsCardInstallmentsPlanView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsCardInstallmentsPlan) json.decodeFromJsonElement<PaymentMethodDetailsCardInstallmentsPlanView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsCardInstallmentsPlan) add(InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Branch.PaymentMethodDetailsCardInstallmentsPlan)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardInstallmentsPlanX67429504 {
      val inspection = inspectInlinePaymentMethodDetailsCardInstallmentsPlanX67429504(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardInstallmentsPlanX67429504NoMatchException("InlinePaymentMethodDetailsCardInstallmentsPlanX67429504 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardInstallmentsPlanX67429504(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardInstallmentsPlanX67429504> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardInstallmentsPlanX67429504 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardInstallmentsPlanX67429504")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardInstallmentsPlanX67429504) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardInstallmentsPlanX67429504").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardInstallmentsPlanX67429504(element: JsonElement): InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Inspection(
    matchesPaymentMethodDetailsCardInstallmentsPlan = false,
    failures = listOf("PaymentMethodDetailsCardInstallmentsPlan: expected JSON object"),
  )
  val matchesPaymentMethodDetailsCardInstallmentsPlan = raw["type"] != null
  return InlinePaymentMethodDetailsCardInstallmentsPlanX67429504Inspection(
    matchesPaymentMethodDetailsCardInstallmentsPlan = matchesPaymentMethodDetailsCardInstallmentsPlan,
    failures = buildList {
      if (!matchesPaymentMethodDetailsCardInstallmentsPlan) add("PaymentMethodDetailsCardInstallmentsPlan: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
