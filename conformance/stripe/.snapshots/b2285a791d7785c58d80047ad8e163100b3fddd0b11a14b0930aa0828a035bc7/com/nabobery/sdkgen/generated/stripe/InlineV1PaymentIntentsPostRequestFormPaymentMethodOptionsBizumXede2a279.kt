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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bizum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bizum
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumAnyOf2X024593f5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
