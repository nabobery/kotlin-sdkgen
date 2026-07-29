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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766,
}

public sealed class InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766).count { it }
}

/**
 * The list of payment method types to exclude from use with this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/excluded_payment_method_types
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Inspection,
) {
  public val branch1:
      List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMetho5c67AnyOf1ItemXbe63b3b6>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMetho5c67AnyOf1ItemXbe63b3b6>>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766:
      InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766) add(InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Branch.InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9NoMatchException("InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9(element: JsonElement): InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMetho5c67AnyOf1ItemXbe63b3b6>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766>()
  return InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesX74fbaaa9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766 = matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766) add("InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766: value does not match InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X879ec766")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
