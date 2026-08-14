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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Branch {
  InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf1Xf1e39861")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxAnyOf2Xcf4f3b1b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
