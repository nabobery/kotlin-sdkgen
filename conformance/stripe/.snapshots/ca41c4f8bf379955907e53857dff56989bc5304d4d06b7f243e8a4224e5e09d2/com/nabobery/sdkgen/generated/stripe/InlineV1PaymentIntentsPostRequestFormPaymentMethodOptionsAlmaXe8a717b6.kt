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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/alma.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/alma
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X5e2f69cf")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X38558a78")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
