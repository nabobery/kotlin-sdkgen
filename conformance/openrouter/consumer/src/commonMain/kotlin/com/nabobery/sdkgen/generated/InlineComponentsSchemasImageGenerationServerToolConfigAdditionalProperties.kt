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

public enum class InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesNoMatchException(
  message: String,
) : InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesDecodingException(message)

internal data class InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerToolConfig/additionalProperties.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties.Serializer::class)
public class InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<Double>(raw) else null }

  public val branch3: List<JsonElement?>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<List<JsonElement?>>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesBranch.Branch1)
      if (inspection
        .matchesBranch2) add(InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesBranch.Branch2)
      if (inspection
        .matchesBranch3) add(InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties {
      val inspection = inspectInlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesNoMatchException("InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties) {
      encoder.requireJsonEncoder("InlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasImageGenerationServerToolConfigAdditionalProperties(element: JsonElement): InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<List<JsonElement?>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  return InlineComponentsSchemasImageGenerationServerToolConfigAdditionalPropertiesInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
