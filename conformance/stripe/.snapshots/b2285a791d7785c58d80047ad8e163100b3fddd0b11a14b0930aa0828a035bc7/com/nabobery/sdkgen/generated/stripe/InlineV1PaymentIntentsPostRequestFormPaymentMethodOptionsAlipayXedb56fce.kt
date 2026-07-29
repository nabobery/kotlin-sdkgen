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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/alipay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/alipay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fceInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xade6fc1f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2X14c52426")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
