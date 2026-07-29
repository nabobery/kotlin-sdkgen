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

public enum class InlinePaymentMethodCardPresentOfflineXf940c1ceBranch {
  PaymentMethodDetailsCardPresentOffline,
}

public sealed class InlinePaymentMethodCardPresentOfflineXf940c1ceDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardPresentOfflineXf940c1ceNoMatchException(
  message: String,
) : InlinePaymentMethodCardPresentOfflineXf940c1ceDecodingException(message)

internal data class InlinePaymentMethodCardPresentOfflineXf940c1ceInspection(
  public val matchesPaymentMethodDetailsCardPresentOffline: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsCardPresentOffline).count { it }
}

/**
 * Details about payment methods collected offline.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_present/properties/offline
 */
@Serializable(with = InlinePaymentMethodCardPresentOfflineXf940c1ce.Serializer::class)
public class InlinePaymentMethodCardPresentOfflineXf940c1ce internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardPresentOfflineXf940c1ceInspection,
) {
  public val paymentMethodDetailsCardPresentOffline: PaymentMethodDetailsCardPresentOfflineView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsCardPresentOffline) json.decodeFromJsonElement<PaymentMethodDetailsCardPresentOfflineView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCardPresentOfflineXf940c1ceBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsCardPresentOffline) add(InlinePaymentMethodCardPresentOfflineXf940c1ceBranch.PaymentMethodDetailsCardPresentOffline)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardPresentOfflineXf940c1ce {
      val inspection = inspectInlinePaymentMethodCardPresentOfflineXf940c1ce(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardPresentOfflineXf940c1ceNoMatchException("InlinePaymentMethodCardPresentOfflineXf940c1ce matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardPresentOfflineXf940c1ce(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodCardPresentOfflineXf940c1ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardPresentOfflineXf940c1ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardPresentOfflineXf940c1ce")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardPresentOfflineXf940c1ce) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardPresentOfflineXf940c1ce").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardPresentOfflineXf940c1ce(element: JsonElement): InlinePaymentMethodCardPresentOfflineXf940c1ceInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardPresentOfflineXf940c1ceInspection(
    matchesPaymentMethodDetailsCardPresentOffline = false,
    failures = listOf("PaymentMethodDetailsCardPresentOffline: expected JSON object"),
  )
  val matchesPaymentMethodDetailsCardPresentOffline = true
  return InlinePaymentMethodCardPresentOfflineXf940c1ceInspection(
    matchesPaymentMethodDetailsCardPresentOffline = matchesPaymentMethodDetailsCardPresentOffline,
    failures = buildList {
      if (!matchesPaymentMethodDetailsCardPresentOffline) add("PaymentMethodDetailsCardPresentOffline: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
