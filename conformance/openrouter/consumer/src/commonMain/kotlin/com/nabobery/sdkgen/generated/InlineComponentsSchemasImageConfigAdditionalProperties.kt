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

public enum class InlineComponentsSchemasImageConfigAdditionalPropertiesBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineComponentsSchemasImageConfigAdditionalPropertiesDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasImageConfigAdditionalPropertiesNoMatchException(
  message: String,
) : InlineComponentsSchemasImageConfigAdditionalPropertiesDecodingException(message)

internal data class InlineComponentsSchemasImageConfigAdditionalPropertiesInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/ImageConfig/additionalProperties.
 */
@Serializable(with = InlineComponentsSchemasImageConfigAdditionalProperties.Serializer::class)
public class InlineComponentsSchemasImageConfigAdditionalProperties internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasImageConfigAdditionalPropertiesInspection,
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

  public val matchedBranches: Set<InlineComponentsSchemasImageConfigAdditionalPropertiesBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasImageConfigAdditionalPropertiesBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasImageConfigAdditionalPropertiesBranch.Branch2)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasImageConfigAdditionalPropertiesBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasImageConfigAdditionalProperties {
      val inspection = inspectInlineComponentsSchemasImageConfigAdditionalProperties(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasImageConfigAdditionalPropertiesNoMatchException("InlineComponentsSchemasImageConfigAdditionalProperties " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasImageConfigAdditionalProperties(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageConfigAdditionalProperties> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageConfigAdditionalProperties {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasImageConfigAdditionalProperties")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageConfigAdditionalProperties) {
      encoder.requireJsonEncoder("InlineComponentsSchemasImageConfigAdditionalProperties").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasImageConfigAdditionalProperties(element: JsonElement): InlineComponentsSchemasImageConfigAdditionalPropertiesInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<List<JsonElement?>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  return InlineComponentsSchemasImageConfigAdditionalPropertiesInspection(
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
