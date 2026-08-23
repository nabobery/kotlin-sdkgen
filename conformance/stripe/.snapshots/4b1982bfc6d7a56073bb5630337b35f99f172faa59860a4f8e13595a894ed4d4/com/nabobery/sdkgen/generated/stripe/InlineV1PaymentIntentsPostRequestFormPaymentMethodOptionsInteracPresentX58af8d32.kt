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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/interac_present.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/interac_present
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X7229eb76")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
