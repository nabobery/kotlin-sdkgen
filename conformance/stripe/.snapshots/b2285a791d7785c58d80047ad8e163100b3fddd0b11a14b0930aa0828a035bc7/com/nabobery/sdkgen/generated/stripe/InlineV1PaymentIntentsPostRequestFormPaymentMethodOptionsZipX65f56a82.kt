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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/zip.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/zip
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf1Xd9f690b2")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipAnyOf2Xc6d1e2ed")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
