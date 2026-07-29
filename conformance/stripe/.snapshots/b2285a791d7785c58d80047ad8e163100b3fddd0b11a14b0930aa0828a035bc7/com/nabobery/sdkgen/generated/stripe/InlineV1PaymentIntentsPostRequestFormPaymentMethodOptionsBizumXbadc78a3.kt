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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bizum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bizum
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X6e6142e4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
