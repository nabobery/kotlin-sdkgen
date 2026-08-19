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

public enum class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Branch {
  Branch1,
  Branch2,
}

public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93NoMatchException(
  message: String,
) : InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93DecodingException(message)

internal data class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2:
      List<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe>>(raw) else null }

  public val matchedBranches:
      Set<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93 {
      val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93) {
      encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93(element: JsonElement): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemX1e93d8fe>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentXcc337b93Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
