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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17cInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf1X25dc6083")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6461e28e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
