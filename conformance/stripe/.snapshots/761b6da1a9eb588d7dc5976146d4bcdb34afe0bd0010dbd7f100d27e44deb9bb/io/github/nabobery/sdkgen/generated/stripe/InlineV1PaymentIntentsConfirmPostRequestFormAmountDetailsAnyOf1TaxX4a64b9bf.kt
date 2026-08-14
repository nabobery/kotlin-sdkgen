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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6,
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6, matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648>()
  return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bfInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X081172f6")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X937d3648")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
