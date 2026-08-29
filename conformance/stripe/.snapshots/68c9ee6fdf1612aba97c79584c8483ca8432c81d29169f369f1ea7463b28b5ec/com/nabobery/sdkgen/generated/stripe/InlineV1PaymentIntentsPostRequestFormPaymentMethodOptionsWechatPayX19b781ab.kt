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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/wechat_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/wechat_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781abInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X41b1112f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X67f5d426")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
