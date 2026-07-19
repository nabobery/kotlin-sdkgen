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

public enum class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eBranch {
  Branch1,
  InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a,
}

public sealed class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eDecodingException(message)

internal data class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1,
      matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e
  .Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eInspection,
) {
  public val branch1: List<AnthropicWebSearchResultBlockParam>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<List<AnthropicWebSearchResultBlockParam>>(raw) else null }

  public val inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesBranch1) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eBranch.Branch1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a) add(InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eBranch.InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e {
      val inspection =
        inspectInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eNoMatchException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e(element: JsonElement): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eInspection {
  val matchesBranch1 = element.isJsonDecodable<List<AnthropicWebSearchResultBlockParam>>() &&
    (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a = element
    .isJsonDecodable<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a>()
  return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a =
      matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a: " +
        "value does not match InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
