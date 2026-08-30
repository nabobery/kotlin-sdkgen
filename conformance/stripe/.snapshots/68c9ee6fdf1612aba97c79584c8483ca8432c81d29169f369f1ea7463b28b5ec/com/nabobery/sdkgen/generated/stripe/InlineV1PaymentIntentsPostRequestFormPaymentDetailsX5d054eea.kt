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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548,
  InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548, matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a).count { it }
}

/**
 * Provides industry-specific information about the charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548) add(InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaBranch.InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a) add(InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaBranch.InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eea(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a>()
  return InlineV1PaymentIntentsPostRequestFormPaymentDetailsX5d054eeaInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 = matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a = matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548) add("InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548: value does not match InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a) add("InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf2X6857f80a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
