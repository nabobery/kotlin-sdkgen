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

public enum class InlineComponentsSchemasChatSystemMessagePropertiesContentBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasChatSystemMessagePropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasChatSystemMessagePropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasChatSystemMessagePropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasChatSystemMessagePropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * System message content
 */
@Serializable(with = InlineComponentsSchemasChatSystemMessagePropertiesContent.Serializer::class)
public class InlineComponentsSchemasChatSystemMessagePropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasChatSystemMessagePropertiesContentInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentText>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<ChatContentText>>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasChatSystemMessagePropertiesContentBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasChatSystemMessagePropertiesContentBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasChatSystemMessagePropertiesContentBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasChatSystemMessagePropertiesContent {
      val inspection = inspectInlineComponentsSchemasChatSystemMessagePropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasChatSystemMessagePropertiesContentNoMatchException("InlineComponentsSchemasChatSystemMessagePropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasChatSystemMessagePropertiesContent(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatSystemMessagePropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatSystemMessagePropertiesContent {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatSystemMessagePropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatSystemMessagePropertiesContent) {
      encoder.requireJsonEncoder("InlineComponentsSchemasChatSystemMessagePropertiesContent").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasChatSystemMessagePropertiesContent(element: JsonElement): InlineComponentsSchemasChatSystemMessagePropertiesContentInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentText>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  return InlineComponentsSchemasChatSystemMessagePropertiesContentInspection(
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
