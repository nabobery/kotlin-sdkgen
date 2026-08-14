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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/p24
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X56a065f9")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xb8bb5bd2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
