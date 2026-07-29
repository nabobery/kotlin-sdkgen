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

public enum class InlineChargePaymentMethodDetailsXaabd978eBranch {
  PaymentMethodDetails,
}

public sealed class InlineChargePaymentMethodDetailsXaabd978eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargePaymentMethodDetailsXaabd978eNoMatchException(
  message: String,
) : InlineChargePaymentMethodDetailsXaabd978eDecodingException(message)

internal data class InlineChargePaymentMethodDetailsXaabd978eInspection(
  public val matchesPaymentMethodDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetails).count { it }
}

/**
 * Details about the payment method at the time of the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/payment_method_details
 */
@Serializable(with = InlineChargePaymentMethodDetailsXaabd978e.Serializer::class)
public class InlineChargePaymentMethodDetailsXaabd978e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargePaymentMethodDetailsXaabd978eInspection,
) {
  public val paymentMethodDetails: PaymentMethodDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetails) json.decodeFromJsonElement<PaymentMethodDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineChargePaymentMethodDetailsXaabd978eBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetails) add(InlineChargePaymentMethodDetailsXaabd978eBranch.PaymentMethodDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargePaymentMethodDetailsXaabd978e {
      val inspection = inspectInlineChargePaymentMethodDetailsXaabd978e(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargePaymentMethodDetailsXaabd978eNoMatchException("InlineChargePaymentMethodDetailsXaabd978e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargePaymentMethodDetailsXaabd978e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargePaymentMethodDetailsXaabd978e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargePaymentMethodDetailsXaabd978e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargePaymentMethodDetailsXaabd978e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargePaymentMethodDetailsXaabd978e) {
      encoder.requireJsonEncoder("InlineChargePaymentMethodDetailsXaabd978e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargePaymentMethodDetailsXaabd978e(element: JsonElement): InlineChargePaymentMethodDetailsXaabd978eInspection {
  val raw = element as? JsonObject ?: return InlineChargePaymentMethodDetailsXaabd978eInspection(
    matchesPaymentMethodDetails = false,
    failures = listOf("PaymentMethodDetails: expected JSON object"),
  )
  val matchesPaymentMethodDetails = raw["type"].isString()
  return InlineChargePaymentMethodDetailsXaabd978eInspection(
    matchesPaymentMethodDetails = matchesPaymentMethodDetails,
    failures = buildList {
      if (!matchesPaymentMethodDetails) add("PaymentMethodDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
