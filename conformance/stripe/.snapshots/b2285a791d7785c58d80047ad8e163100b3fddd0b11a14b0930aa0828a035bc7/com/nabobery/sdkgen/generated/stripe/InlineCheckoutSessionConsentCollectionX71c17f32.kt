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

public enum class InlineCheckoutSessionConsentCollectionX71c17f32Branch {
  PaymentPagesCheckoutSessionConsentCollection,
}

public sealed class InlineCheckoutSessionConsentCollectionX71c17f32DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionConsentCollectionX71c17f32NoMatchException(
  message: String,
) : InlineCheckoutSessionConsentCollectionX71c17f32DecodingException(message)

internal data class InlineCheckoutSessionConsentCollectionX71c17f32Inspection(
  public val matchesPaymentPagesCheckoutSessionConsentCollection: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionConsentCollection).count { it }
}

/**
 * When set, provides configuration for the Checkout Session to gather active consent from customers.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/consent_collection
 */
@Serializable(with = InlineCheckoutSessionConsentCollectionX71c17f32.Serializer::class)
public class InlineCheckoutSessionConsentCollectionX71c17f32 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionConsentCollectionX71c17f32Inspection,
) {
  public val paymentPagesCheckoutSessionConsentCollection:
      PaymentPagesCheckoutSessionConsentCollectionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionConsentCollection) json.decodeFromJsonElement<PaymentPagesCheckoutSessionConsentCollectionView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionConsentCollectionX71c17f32Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionConsentCollection) add(InlineCheckoutSessionConsentCollectionX71c17f32Branch.PaymentPagesCheckoutSessionConsentCollection)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionConsentCollectionX71c17f32 {
      val inspection = inspectInlineCheckoutSessionConsentCollectionX71c17f32(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionConsentCollectionX71c17f32NoMatchException("InlineCheckoutSessionConsentCollectionX71c17f32 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionConsentCollectionX71c17f32(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionConsentCollectionX71c17f32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionConsentCollectionX71c17f32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionConsentCollectionX71c17f32")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionConsentCollectionX71c17f32) {
      encoder.requireJsonEncoder("InlineCheckoutSessionConsentCollectionX71c17f32").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionConsentCollectionX71c17f32(element: JsonElement): InlineCheckoutSessionConsentCollectionX71c17f32Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionConsentCollectionX71c17f32Inspection(
    matchesPaymentPagesCheckoutSessionConsentCollection = false,
    failures = listOf("PaymentPagesCheckoutSessionConsentCollection: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionConsentCollection = true
  return InlineCheckoutSessionConsentCollectionX71c17f32Inspection(
    matchesPaymentPagesCheckoutSessionConsentCollection = matchesPaymentPagesCheckoutSessionConsentCollection,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionConsentCollection) add("PaymentPagesCheckoutSessionConsentCollection: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
