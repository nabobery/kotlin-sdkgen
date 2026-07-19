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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueBranch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
}

public sealed class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueNoMatchException(
  message: String,
) : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueDecodingException(message)

internal data class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueInspection(
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
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue
  .Serializer::class)
public class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<Boolean>(raw) else null }

  public val branch4:
      List<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json
























































                                                                                                                        .decodeFromJsonElement<List<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa>>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueBranch
          .Branch1)
      if (inspection
        .matchesBranch2) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueBranch
          .Branch2)
      if (inspection
        .matchesBranch3) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueBranch
          .Branch3)
      if (inspection
        .matchesBranch4) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueBranch
          .Branch4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue {
      val inspection = inspectInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueNoMatchException("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue) {
      encoder.requireJsonEncoder("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValue(element: JsonElement): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Boolean>()
  val matchesBranch4 = element


























































                                                                                                                        .isJsonDecodable<List<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValu7f6a38aa>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0PropertiesValueInspection(
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
