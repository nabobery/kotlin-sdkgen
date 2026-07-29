package com.nabobery.sdkgen.github.generated

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

public enum class InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaBranch {
  Branch1,
  InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5,
  InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5,
}

public sealed class InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaNoMatchException(
  message: String,
) : InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaDecodingException(message)

internal data class InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5:
      Boolean,
  public val matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5, matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/requestBody/content/application~1js
 * on/schema/additionalProperties/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/requestBody/content/application~1js
 * on/schema/additionalProperties/items
 */
@Serializable(with = InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa.Serializer::class)
public class InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5:
      InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5) json.decodeFromJsonElement<InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5>(raw) else null }

  public val inlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5:
      InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5) json.decodeFromJsonElement<InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5>(raw) else null }

  public val matchedBranches:
      Set<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaBranch.Branch1)
      if (inspection.matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5) add(InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaBranch.InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5)
      if (inspection.matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5) add(InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaBranch.InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa {
      val inspection = inspectInlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa(raw)
      if (inspection.matchCount == 0) {
        throw InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaNoMatchException("InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa) {
      encoder.requireJsonEncoder("InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa(element: JsonElement): InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 = element.isJsonDecodable<InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5>()
  val matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 = element.isJsonDecodable<InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5>()
  return InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaaInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 = matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5,
    matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 = matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5) add("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5: value does not match InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5")
      if (!matchesInlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5) add("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5: value does not match InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
