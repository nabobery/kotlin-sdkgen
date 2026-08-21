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

public enum class InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineImageGenerationServerToolConfigAdditionalValueXdf221d50DecodingException(
  message: String,
) : SerializationException(message)

public class InlineImageGenerationServerToolConfigAdditionalValueXdf221d50NoMatchException(
  message: String,
) : InlineImageGenerationServerToolConfigAdditionalValueXdf221d50DecodingException(message)

internal data class InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Inspection(
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerToolConfig/additionalProperties
 */
@Serializable(with = InlineImageGenerationServerToolConfigAdditionalValueXdf221d50.Serializer::class)
public class InlineImageGenerationServerToolConfigAdditionalValueXdf221d50 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: List<JsonElement?>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<List<JsonElement?>>(raw) else null }

  public val matchedBranches:
      Set<InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineImageGenerationServerToolConfigAdditionalValueXdf221d50 {
      val inspection = inspectInlineImageGenerationServerToolConfigAdditionalValueXdf221d50(raw)
      if (inspection.matchCount == 0) {
        throw InlineImageGenerationServerToolConfigAdditionalValueXdf221d50NoMatchException("InlineImageGenerationServerToolConfigAdditionalValueXdf221d50 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineImageGenerationServerToolConfigAdditionalValueXdf221d50(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolConfigAdditionalValueXdf221d50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolConfigAdditionalValueXdf221d50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationServerToolConfigAdditionalValueXdf221d50")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolConfigAdditionalValueXdf221d50) {
      encoder.requireJsonEncoder("InlineImageGenerationServerToolConfigAdditionalValueXdf221d50").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineImageGenerationServerToolConfigAdditionalValueXdf221d50(element: JsonElement): InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<List<JsonElement?>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineImageGenerationServerToolConfigAdditionalValueXdf221d50Inspection(
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
