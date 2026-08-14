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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eBranch {
  InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b,
  InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eNoMatchException(
  message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eDecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eInspection(
  public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b:
      Boolean,
  public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b, matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eInspection,
) {
  public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b) json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b>(raw) else null }

  public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27) json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b) add(InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b)
      if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27) add(InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e {
      val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eNoMatchException("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e(element: JsonElement): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eInspection {
  val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b = element.isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b>()
  val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27 = element.isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27>()
  return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2eInspection(
    matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b,
    matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27 = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b) add("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b")
      if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27) add("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X2c373c27")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
