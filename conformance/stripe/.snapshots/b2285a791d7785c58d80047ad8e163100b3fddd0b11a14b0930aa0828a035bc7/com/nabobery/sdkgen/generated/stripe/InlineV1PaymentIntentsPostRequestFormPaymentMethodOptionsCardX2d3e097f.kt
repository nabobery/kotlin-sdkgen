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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097fInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X8c54292c")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X9d9eaa28")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
