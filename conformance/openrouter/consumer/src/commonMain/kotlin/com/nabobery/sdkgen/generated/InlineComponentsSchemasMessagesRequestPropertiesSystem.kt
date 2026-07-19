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

public enum class InlineComponentsSchemasMessagesRequestPropertiesSystemBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasMessagesRequestPropertiesSystemDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesSystemNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesSystemDecodingException(message)

internal data class InlineComponentsSchemasMessagesRequestPropertiesSystemInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/system.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesSystem.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesSystem internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasMessagesRequestPropertiesSystemInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<AnthropicTextBlockParam>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<AnthropicTextBlockParam>>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasMessagesRequestPropertiesSystemBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasMessagesRequestPropertiesSystemBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasMessagesRequestPropertiesSystemBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasMessagesRequestPropertiesSystem {
      val inspection = inspectInlineComponentsSchemasMessagesRequestPropertiesSystem(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesSystemNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesSystem " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMessagesRequestPropertiesSystem(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesSystem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesSystem {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesSystem")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesSystem) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesSystem").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesSystem(element: JsonElement): InlineComponentsSchemasMessagesRequestPropertiesSystemInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<AnthropicTextBlockParam>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  return InlineComponentsSchemasMessagesRequestPropertiesSystemInspection(
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
