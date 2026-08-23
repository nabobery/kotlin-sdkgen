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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/billie.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/billie
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X4a8fe1ca")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xc85fd54a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
