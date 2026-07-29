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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/affirm.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/affirm
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345bInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1Xbafcbe22")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2X8f74f3ce")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
