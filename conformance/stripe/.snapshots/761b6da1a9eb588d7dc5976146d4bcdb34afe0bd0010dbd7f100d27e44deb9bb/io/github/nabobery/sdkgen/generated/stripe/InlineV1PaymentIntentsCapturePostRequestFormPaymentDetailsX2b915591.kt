package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Branch {
  InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f,
  InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591NoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591DecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Inspection(
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f:
      Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f, matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d).count { it }
}

/**
 * Provides industry-specific information about the charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Inspection,
) {
  public val inlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f:
      InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d:
      InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f) add(InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Branch.InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d) add(InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Branch.InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591 {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591NoMatchException("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Inspection {
  val matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d>()
  return InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsX2b915591Inspection(
    matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f = matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f,
    matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d = matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f) add("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f: value does not match InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d) add("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d: value does not match InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf2X9560517d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
