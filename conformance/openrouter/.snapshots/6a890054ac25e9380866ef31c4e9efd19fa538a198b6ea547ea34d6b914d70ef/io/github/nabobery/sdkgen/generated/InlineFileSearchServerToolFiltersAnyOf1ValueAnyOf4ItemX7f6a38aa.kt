package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaBranch {
  Branch1,
  Branch2,
}

public sealed class InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaNoMatchException(
  message: String,
) : InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaDecodingException(message)

internal data class InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/value/any
 * Of/3/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/value/any
 * Of/3/items
 */
@Serializable(with = InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa.Serializer::class)
public class InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val matchedBranches:
      Set<InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa {
      val inspection = inspectInlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa(raw)
      if (inspection.matchCount == 0) {
        throw InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaNoMatchException("InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa) {
      encoder.requireJsonEncoder("InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa(element: JsonElement): InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  return InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aaInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
