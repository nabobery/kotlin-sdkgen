package io.github.nabobery.sdkgen.generated

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

public enum class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eBranch {
  Branch1,
  InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a,
}

public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eNoMatchException(
  message: String,
) : InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eDecodingException(message)

internal data class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eInspection,
) {
  public val branch1: List<AnthropicWebSearchResultBlockParam>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<AnthropicWebSearchResultBlockParam>>(raw) else null }

  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a:
      InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a) json.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a>(raw) else null }

  public val matchedBranches:
      Set<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eBranch.Branch1)
      if (inspection.matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a) add(InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eBranch.InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e {
      val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eNoMatchException("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e) {
      encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e(element: JsonElement): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eInspection {
  val matchesBranch1 = element.isJsonDecodable<List<AnthropicWebSearchResultBlockParam>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a = element.isJsonDecodable<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a>()
  return InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a = matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a: value does not match InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
