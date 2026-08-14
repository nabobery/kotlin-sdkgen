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

public enum class InlinePaymentLinkConsentCollectionX2d71e575Branch {
  PaymentLinksResourceConsentCollection,
}

public sealed class InlinePaymentLinkConsentCollectionX2d71e575DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkConsentCollectionX2d71e575NoMatchException(
  message: String,
) : InlinePaymentLinkConsentCollectionX2d71e575DecodingException(message)

internal data class InlinePaymentLinkConsentCollectionX2d71e575Inspection(
  public val matchesPaymentLinksResourceConsentCollection: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceConsentCollection).count { it }
}

/**
 * When set, provides configuration to gather active consent from customers.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/consent_collection
 */
@Serializable(with = InlinePaymentLinkConsentCollectionX2d71e575.Serializer::class)
public class InlinePaymentLinkConsentCollectionX2d71e575 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkConsentCollectionX2d71e575Inspection,
) {
  public val paymentLinksResourceConsentCollection: PaymentLinksResourceConsentCollectionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceConsentCollection) json.decodeFromJsonElement<PaymentLinksResourceConsentCollectionView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkConsentCollectionX2d71e575Branch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceConsentCollection) add(InlinePaymentLinkConsentCollectionX2d71e575Branch.PaymentLinksResourceConsentCollection)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkConsentCollectionX2d71e575 {
      val inspection = inspectInlinePaymentLinkConsentCollectionX2d71e575(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkConsentCollectionX2d71e575NoMatchException("InlinePaymentLinkConsentCollectionX2d71e575 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkConsentCollectionX2d71e575(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkConsentCollectionX2d71e575> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkConsentCollectionX2d71e575 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkConsentCollectionX2d71e575")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkConsentCollectionX2d71e575) {
      encoder.requireJsonEncoder("InlinePaymentLinkConsentCollectionX2d71e575").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkConsentCollectionX2d71e575(element: JsonElement): InlinePaymentLinkConsentCollectionX2d71e575Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkConsentCollectionX2d71e575Inspection(
    matchesPaymentLinksResourceConsentCollection = false,
    failures = listOf("PaymentLinksResourceConsentCollection: expected JSON object"),
  )
  val matchesPaymentLinksResourceConsentCollection = true
  return InlinePaymentLinkConsentCollectionX2d71e575Inspection(
    matchesPaymentLinksResourceConsentCollection = matchesPaymentLinksResourceConsentCollection,
    failures = buildList {
      if (!matchesPaymentLinksResourceConsentCollection) add("PaymentLinksResourceConsentCollection: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
