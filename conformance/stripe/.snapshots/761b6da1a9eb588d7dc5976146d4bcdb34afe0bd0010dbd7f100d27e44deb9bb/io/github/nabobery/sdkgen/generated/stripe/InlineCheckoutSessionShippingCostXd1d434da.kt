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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCheckoutSessionShippingCostXd1d434daBranch {
  PaymentPagesCheckoutSessionShippingCost,
}

public sealed class InlineCheckoutSessionShippingCostXd1d434daDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionShippingCostXd1d434daNoMatchException(
  message: String,
) : InlineCheckoutSessionShippingCostXd1d434daDecodingException(message)

internal data class InlineCheckoutSessionShippingCostXd1d434daInspection(
  public val matchesPaymentPagesCheckoutSessionShippingCost: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionShippingCost).count { it }
}

/**
 * The details of the customer cost of shipping, including the customer chosen ShippingRate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/shipping_cost
 */
@Serializable(with = InlineCheckoutSessionShippingCostXd1d434da.Serializer::class)
public class InlineCheckoutSessionShippingCostXd1d434da internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionShippingCostXd1d434daInspection,
) {
  public val paymentPagesCheckoutSessionShippingCost: PaymentPagesCheckoutSessionShippingCostView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionShippingCost) json.decodeFromJsonElement<PaymentPagesCheckoutSessionShippingCostView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionShippingCostXd1d434daBranch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionShippingCost) add(InlineCheckoutSessionShippingCostXd1d434daBranch.PaymentPagesCheckoutSessionShippingCost)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionShippingCostXd1d434da {
      val inspection = inspectInlineCheckoutSessionShippingCostXd1d434da(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionShippingCostXd1d434daNoMatchException("InlineCheckoutSessionShippingCostXd1d434da matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionShippingCostXd1d434da(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionShippingCostXd1d434da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionShippingCostXd1d434da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionShippingCostXd1d434da")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionShippingCostXd1d434da) {
      encoder.requireJsonEncoder("InlineCheckoutSessionShippingCostXd1d434da").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionShippingCostXd1d434da(element: JsonElement): InlineCheckoutSessionShippingCostXd1d434daInspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionShippingCostXd1d434daInspection(
    matchesPaymentPagesCheckoutSessionShippingCost = false,
    failures = listOf("PaymentPagesCheckoutSessionShippingCost: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionShippingCost = raw["amount_subtotal"] != null && raw["amount_tax"] != null && raw["amount_total"] != null
  return InlineCheckoutSessionShippingCostXd1d434daInspection(
    matchesPaymentPagesCheckoutSessionShippingCost = matchesPaymentPagesCheckoutSessionShippingCost,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionShippingCost) add("PaymentPagesCheckoutSessionShippingCost: required properties 'amount_subtotal', 'amount_tax', 'amount_total' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
