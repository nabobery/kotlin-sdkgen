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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Branch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
}

public sealed class InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2NoMatchException(
  message: String,
) : InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2DecodingException(message)

internal data class InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/value.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/value
 */
@Serializable(with = InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2.Serializer::class)
public class InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Boolean>(raw) else null }

  public val branch4: List<InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<List<InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa>>(raw) else null }

  public val matchedBranches: Set<InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Branch.Branch3)
      if (inspection.matchesBranch4) add(InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Branch.Branch4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2 {
      val inspection = inspectInlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2(raw)
      if (inspection.matchCount == 0) {
        throw InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2NoMatchException("InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2) {
      encoder.requireJsonEncoder("InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2(element: JsonElement): InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Boolean>()
  val matchesBranch4 = element.isJsonDecodable<List<InlineFileSearchServerToolFiltersAnyOf1ValueAnyOf4ItemX7f6a38aa>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Boolean")
      if (!matchesBranch4) add("Branch4: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
