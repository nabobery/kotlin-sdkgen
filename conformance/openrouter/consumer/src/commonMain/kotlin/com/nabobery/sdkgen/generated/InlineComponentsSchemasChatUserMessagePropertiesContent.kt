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

public enum class InlineComponentsSchemasChatUserMessagePropertiesContentBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasChatUserMessagePropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasChatUserMessagePropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasChatUserMessagePropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasChatUserMessagePropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * User message content
 */
@Serializable(with = InlineComponentsSchemasChatUserMessagePropertiesContent.Serializer::class)
public class InlineComponentsSchemasChatUserMessagePropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasChatUserMessagePropertiesContentInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentItems>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<ChatContentItems>>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasChatUserMessagePropertiesContentBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasChatUserMessagePropertiesContentBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasChatUserMessagePropertiesContentBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasChatUserMessagePropertiesContent {
      val inspection = inspectInlineComponentsSchemasChatUserMessagePropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasChatUserMessagePropertiesContentNoMatchException("InlineComponentsSchemasChatUserMessagePropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasChatUserMessagePropertiesContent(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatUserMessagePropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatUserMessagePropertiesContent {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatUserMessagePropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatUserMessagePropertiesContent) {
      encoder.requireJsonEncoder("InlineComponentsSchemasChatUserMessagePropertiesContent").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasChatUserMessagePropertiesContent(element: JsonElement): InlineComponentsSchemasChatUserMessagePropertiesContentInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentItems>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  return InlineComponentsSchemasChatUserMessagePropertiesContentInspection(
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
