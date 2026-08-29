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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/revolut_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/revolut_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28debInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xef772454")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xca032489")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
