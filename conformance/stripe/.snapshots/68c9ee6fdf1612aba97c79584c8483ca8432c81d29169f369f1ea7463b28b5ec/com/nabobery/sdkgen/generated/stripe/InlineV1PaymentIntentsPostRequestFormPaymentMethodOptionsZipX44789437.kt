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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/zip.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/zip
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd3b47959")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2X6267b52c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
