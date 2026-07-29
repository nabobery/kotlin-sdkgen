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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X9b92cade")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2X4c6dba68")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
