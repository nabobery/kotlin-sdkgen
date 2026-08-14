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

public enum class InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Branch {
  PaymentIntentPaymentMethodOptionsLink,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Inspection(
  public val matchesPaymentIntentPaymentMethodOptionsLink: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptionsLink, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/link.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/link
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Inspection,
) {
  public val paymentIntentPaymentMethodOptionsLink: PaymentIntentPaymentMethodOptionsLinkView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptionsLink) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsLinkView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptionsLink) add(InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Branch.PaymentIntentPaymentMethodOptionsLink)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7NoMatchException("InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Inspection(
    matchesPaymentIntentPaymentMethodOptionsLink = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentIntentPaymentMethodOptionsLink: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptionsLink = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7Inspection(
    matchesPaymentIntentPaymentMethodOptionsLink = matchesPaymentIntentPaymentMethodOptionsLink,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptionsLink) add("PaymentIntentPaymentMethodOptionsLink: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
