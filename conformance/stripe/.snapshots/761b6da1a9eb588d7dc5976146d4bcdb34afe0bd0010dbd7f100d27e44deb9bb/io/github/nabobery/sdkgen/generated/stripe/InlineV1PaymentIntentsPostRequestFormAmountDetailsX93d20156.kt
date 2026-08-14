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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Branch {
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71).count { it }
}

/**
 * Provides industry-specific information about the amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsX93d20156Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf2X6e344e71")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
