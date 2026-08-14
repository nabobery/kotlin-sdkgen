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

public enum class InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Branch {
  PaymentMethodDetailsCardPresentOffline,
}

public sealed class InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2DecodingException(message)

internal data class InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Inspection(
  public val matchesPaymentMethodDetailsCardPresentOffline: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsCardPresentOffline).count { it }
}

/**
 * Details about payments collected offline.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present/properties/offline
 */
@Serializable(with = InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2.Serializer::class)
public class InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Inspection,
) {
  public val paymentMethodDetailsCardPresentOffline: PaymentMethodDetailsCardPresentOfflineView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsCardPresentOffline) json.decodeFromJsonElement<PaymentMethodDetailsCardPresentOfflineView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsCardPresentOffline) add(InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Branch.PaymentMethodDetailsCardPresentOffline)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2 {
      val inspection = inspectInlinePaymentMethodDetailsCardPresentOfflineX2bc680b2(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2NoMatchException("InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardPresentOfflineX2bc680b2(element: JsonElement): InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Inspection(
    matchesPaymentMethodDetailsCardPresentOffline = false,
    failures = listOf("PaymentMethodDetailsCardPresentOffline: expected JSON object"),
  )
  val matchesPaymentMethodDetailsCardPresentOffline = true
  return InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2Inspection(
    matchesPaymentMethodDetailsCardPresentOffline = matchesPaymentMethodDetailsCardPresentOffline,
    failures = buildList {
      if (!matchesPaymentMethodDetailsCardPresentOffline) add("PaymentMethodDetailsCardPresentOffline: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
