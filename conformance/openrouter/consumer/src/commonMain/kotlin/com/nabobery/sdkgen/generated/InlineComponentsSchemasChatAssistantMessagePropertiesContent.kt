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

public enum class InlineComponentsSchemasChatAssistantMessagePropertiesContentBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineComponentsSchemasChatAssistantMessagePropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasChatAssistantMessagePropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasChatAssistantMessagePropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasChatAssistantMessagePropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Assistant message content
 */
@Serializable(with = InlineComponentsSchemasChatAssistantMessagePropertiesContent.Serializer::class)
public class InlineComponentsSchemasChatAssistantMessagePropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasChatAssistantMessagePropertiesContentInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentItems>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<ChatContentItems>>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasChatAssistantMessagePropertiesContentBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasChatAssistantMessagePropertiesContentBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasChatAssistantMessagePropertiesContentBranch.Branch2)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasChatAssistantMessagePropertiesContentBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasChatAssistantMessagePropertiesContent {
      val inspection = inspectInlineComponentsSchemasChatAssistantMessagePropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasChatAssistantMessagePropertiesContentNoMatchException("InlineComponentsSchemasChatAssistantMessagePropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasChatAssistantMessagePropertiesContent(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatAssistantMessagePropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatAssistantMessagePropertiesContent {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatAssistantMessagePropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatAssistantMessagePropertiesContent) {
      encoder.requireJsonEncoder("InlineComponentsSchemasChatAssistantMessagePropertiesContent")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasChatAssistantMessagePropertiesContent(element: JsonElement): InlineComponentsSchemasChatAssistantMessagePropertiesContentInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentItems>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasChatAssistantMessagePropertiesContentInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
