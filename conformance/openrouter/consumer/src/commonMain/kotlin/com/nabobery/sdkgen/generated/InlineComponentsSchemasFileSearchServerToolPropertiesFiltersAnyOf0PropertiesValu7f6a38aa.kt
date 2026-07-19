package com.nabobery.sdkgen.generated

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

public enum class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaNoMatchException(
  message: String,
) : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaDecodingException(message)

internal data class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaInspection(
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
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa
  .Serializer::class)
public class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<Double>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesBranch1) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaBranch.Branch1)
      if (inspection
























































                                                                                                                        .matchesBranch2) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa {
      val inspection =
        inspectInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaNoMatchException("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa(element: JsonElement): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aaInspection(
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
