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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/samsung_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/samsung_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66cInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X90e7590f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
