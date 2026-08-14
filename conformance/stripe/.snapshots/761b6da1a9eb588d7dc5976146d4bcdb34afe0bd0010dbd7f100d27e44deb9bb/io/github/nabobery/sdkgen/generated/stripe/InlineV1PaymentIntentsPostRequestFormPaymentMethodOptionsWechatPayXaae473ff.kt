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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/wechat_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ffInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2034bd6d")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X662237b1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
