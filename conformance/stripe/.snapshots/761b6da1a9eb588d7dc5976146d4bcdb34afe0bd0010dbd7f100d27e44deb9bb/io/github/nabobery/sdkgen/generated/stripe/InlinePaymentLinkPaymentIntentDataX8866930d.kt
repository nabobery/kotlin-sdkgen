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

public enum class InlinePaymentLinkPaymentIntentDataX8866930dBranch {
  PaymentLinksResourcePaymentIntentData,
}

public sealed class InlinePaymentLinkPaymentIntentDataX8866930dDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkPaymentIntentDataX8866930dNoMatchException(
  message: String,
) : InlinePaymentLinkPaymentIntentDataX8866930dDecodingException(message)

internal data class InlinePaymentLinkPaymentIntentDataX8866930dInspection(
  public val matchesPaymentLinksResourcePaymentIntentData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourcePaymentIntentData).count { it }
}

/**
 * Indicates the parameters to be passed to PaymentIntent creation during checkout.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/payment_intent_data
 */
@Serializable(with = InlinePaymentLinkPaymentIntentDataX8866930d.Serializer::class)
public class InlinePaymentLinkPaymentIntentDataX8866930d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkPaymentIntentDataX8866930dInspection,
) {
  public val paymentLinksResourcePaymentIntentData: PaymentLinksResourcePaymentIntentDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourcePaymentIntentData) json.decodeFromJsonElement<PaymentLinksResourcePaymentIntentDataView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkPaymentIntentDataX8866930dBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourcePaymentIntentData) add(InlinePaymentLinkPaymentIntentDataX8866930dBranch.PaymentLinksResourcePaymentIntentData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkPaymentIntentDataX8866930d {
      val inspection = inspectInlinePaymentLinkPaymentIntentDataX8866930d(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkPaymentIntentDataX8866930dNoMatchException("InlinePaymentLinkPaymentIntentDataX8866930d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkPaymentIntentDataX8866930d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkPaymentIntentDataX8866930d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkPaymentIntentDataX8866930d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkPaymentIntentDataX8866930d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkPaymentIntentDataX8866930d) {
      encoder.requireJsonEncoder("InlinePaymentLinkPaymentIntentDataX8866930d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkPaymentIntentDataX8866930d(element: JsonElement): InlinePaymentLinkPaymentIntentDataX8866930dInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkPaymentIntentDataX8866930dInspection(
    matchesPaymentLinksResourcePaymentIntentData = false,
    failures = listOf("PaymentLinksResourcePaymentIntentData: expected JSON object"),
  )
  val matchesPaymentLinksResourcePaymentIntentData = raw["metadata"] != null
  return InlinePaymentLinkPaymentIntentDataX8866930dInspection(
    matchesPaymentLinksResourcePaymentIntentData = matchesPaymentLinksResourcePaymentIntentData,
    failures = buildList {
      if (!matchesPaymentLinksResourcePaymentIntentData) add("PaymentLinksResourcePaymentIntentData: required properties 'metadata' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
