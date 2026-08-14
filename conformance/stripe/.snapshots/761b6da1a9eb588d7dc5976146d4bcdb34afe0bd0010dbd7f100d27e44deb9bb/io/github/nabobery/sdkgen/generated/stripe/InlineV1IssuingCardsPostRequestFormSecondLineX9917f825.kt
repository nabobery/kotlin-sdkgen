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

public enum class InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Branch {
  Branch1,
  InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d,
}

public sealed class InlineV1IssuingCardsPostRequestFormSecondLineX9917f825DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingCardsPostRequestFormSecondLineX9917f825NoMatchException(
  message: String,
) : InlineV1IssuingCardsPostRequestFormSecondLineX9917f825DecodingException(message)

internal data class InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d).count { it }
}

/**
 * The second line to print on the card. Max length: 24 characters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/second_line
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSecondLineX9917f825.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormSecondLineX9917f825 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d:
      InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d) json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d>(raw) else null }

  public val matchedBranches: Set<InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Branch.Branch1)
      if (inspection.matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d) add(InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Branch.InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingCardsPostRequestFormSecondLineX9917f825 {
      val inspection = inspectInlineV1IssuingCardsPostRequestFormSecondLineX9917f825(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingCardsPostRequestFormSecondLineX9917f825NoMatchException("InlineV1IssuingCardsPostRequestFormSecondLineX9917f825 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingCardsPostRequestFormSecondLineX9917f825(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSecondLineX9917f825> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSecondLineX9917f825 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormSecondLineX9917f825")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormSecondLineX9917f825) {
      encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormSecondLineX9917f825").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingCardsPostRequestFormSecondLineX9917f825(element: JsonElement): InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d = element.isJsonDecodable<InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d>()
  return InlineV1IssuingCardsPostRequestFormSecondLineX9917f825Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d = matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d) add("InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d: value does not match InlineV1IssuingCardsPostRequestFormSecondLineAnyOf2X37963e5d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
