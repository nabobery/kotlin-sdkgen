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

public enum class InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedBranch {
  PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions,
}

public sealed class InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedNoMatchException(
  message: String,
) : InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedDecodingException(message)

internal data class InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedInspection(
  public val matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions).count { it }
}

/**
 * Payment method-specific information for line items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_amount_details_line_item/properties/payment_method_op
 * tions
 */
@Serializable(with = InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed.Serializer::class)
public class InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedInspection,
) {
  public val paymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions:
      PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptionsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions) json.decodeFromJsonElement<PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptionsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedBranch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions) add(InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedBranch.PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed {
      val inspection = inspectInlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedNoMatchException("InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed) {
      encoder.requireJsonEncoder("InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed(element: JsonElement): InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedInspection(
    matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions = false,
    failures = listOf("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions: expected JSON object"),
  )
  val matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions = true
  return InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aedInspection(
    matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions = matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions,
    failures = buildList {
      if (!matchesPaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions) add("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourcePaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
