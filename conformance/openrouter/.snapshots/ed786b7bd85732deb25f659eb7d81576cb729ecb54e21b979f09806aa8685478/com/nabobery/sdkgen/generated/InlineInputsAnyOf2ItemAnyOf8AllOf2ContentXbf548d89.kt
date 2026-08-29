package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Branch {
  Branch1,
  Branch2,
}

public sealed class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89NoMatchException(
  message: String,
) : InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89DecodingException(message)

internal data class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/7/allOf/1/properties/content.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/7/allOf/1/properties/content
 */
@Serializable(with = InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89.Serializer::class)
public class InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Inspection,
) {
  public val branch1: List<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881>>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89 {
      val inspection = inspectInlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89(raw)
      if (inspection.matchCount == 0) {
        throw InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89NoMatchException("InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89) {
      encoder.requireJsonEncoder("InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89(element: JsonElement): InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineInputsAnyOf2ItemAnyOf8AllOf2ContentAnyOf1ItemX3237a881>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineInputsAnyOf2ItemAnyOf8AllOf2ContentXbf548d89Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
