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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payco.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payco
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X5d74d171")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xde25ead5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
