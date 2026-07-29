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

public enum class InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beBranch {
  PaymentPagesCheckoutSessionSavedPaymentMethodOptions,
}

public sealed class InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beNoMatchException(
  message: String,
) : InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beDecodingException(message)

internal data class InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beInspection(
  public val matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions).count { it }
}

/**
 * Controls saved payment method settings for the session. Only available in `payment` and `subscription` mode.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/saved_payment_method_options
 */
@Serializable(with = InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be.Serializer::class)
public class InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beInspection,
) {
  public val paymentPagesCheckoutSessionSavedPaymentMethodOptions:
      PaymentPagesCheckoutSessionSavedPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions) json.decodeFromJsonElement<PaymentPagesCheckoutSessionSavedPaymentMethodOptionsView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beBranch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions) add(InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beBranch.PaymentPagesCheckoutSessionSavedPaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be {
      val inspection = inspectInlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beNoMatchException("InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be) {
      encoder.requireJsonEncoder("InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be(element: JsonElement): InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beInspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beInspection(
    matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions = false,
    failures = listOf("PaymentPagesCheckoutSessionSavedPaymentMethodOptions: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions = true
  return InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6beInspection(
    matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions = matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionSavedPaymentMethodOptions) add("PaymentPagesCheckoutSessionSavedPaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
