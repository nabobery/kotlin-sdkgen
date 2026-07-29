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

public enum class InlinePaymentIntentPaymentMethodOptionsX8c4198d2Branch {
  PaymentIntentPaymentMethodOptions,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsX8c4198d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsX8c4198d2NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsX8c4198d2DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsX8c4198d2Inspection(
  public val matchesPaymentIntentPaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptions).count { it }
}

/**
 * Payment-method-specific configuration for this PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/payment_method_options
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsX8c4198d2.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsX8c4198d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsX8c4198d2Inspection,
) {
  public val paymentIntentPaymentMethodOptions: PaymentIntentPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptions) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsX8c4198d2Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptions) add(InlinePaymentIntentPaymentMethodOptionsX8c4198d2Branch.PaymentIntentPaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsX8c4198d2 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsX8c4198d2(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsX8c4198d2NoMatchException("InlinePaymentIntentPaymentMethodOptionsX8c4198d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsX8c4198d2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsX8c4198d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsX8c4198d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsX8c4198d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsX8c4198d2) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsX8c4198d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsX8c4198d2(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsX8c4198d2Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsX8c4198d2Inspection(
    matchesPaymentIntentPaymentMethodOptions = false,
    failures = listOf("PaymentIntentPaymentMethodOptions: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptions = true
  return InlinePaymentIntentPaymentMethodOptionsX8c4198d2Inspection(
    matchesPaymentIntentPaymentMethodOptions = matchesPaymentIntentPaymentMethodOptions,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptions) add("PaymentIntentPaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
