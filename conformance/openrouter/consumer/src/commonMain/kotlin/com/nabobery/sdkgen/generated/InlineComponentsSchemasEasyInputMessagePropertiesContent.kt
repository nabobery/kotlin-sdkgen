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

public enum class InlineComponentsSchemasEasyInputMessagePropertiesContentBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineComponentsSchemasEasyInputMessagePropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasEasyInputMessagePropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasEasyInputMessagePropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasEasyInputMessagePropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/content.
 */
@Serializable(with = InlineComponentsSchemasEasyInputMessagePropertiesContent.Serializer::class)
public class InlineComponentsSchemasEasyInputMessagePropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasEasyInputMessagePropertiesContentInspection,
) {
  public val branch1: List<InlineComponentsSchemasEasyInputMessagePropertiesContentAnyOf0Items>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
























































                                                                                                                        .decodeFromJsonElement<List<InlineComponentsSchemasEasyInputMessagePropertiesContentAnyOf0Items>>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasEasyInputMessagePropertiesContentBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasEasyInputMessagePropertiesContentBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasEasyInputMessagePropertiesContentBranch.Branch2)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasEasyInputMessagePropertiesContentBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasEasyInputMessagePropertiesContent {
      val inspection = inspectInlineComponentsSchemasEasyInputMessagePropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasEasyInputMessagePropertiesContentNoMatchException("InlineComponentsSchemasEasyInputMessagePropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasEasyInputMessagePropertiesContent(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEasyInputMessagePropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEasyInputMessagePropertiesContent {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasEasyInputMessagePropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEasyInputMessagePropertiesContent) {
      encoder.requireJsonEncoder("InlineComponentsSchemasEasyInputMessagePropertiesContent").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasEasyInputMessagePropertiesContent(element: JsonElement): InlineComponentsSchemasEasyInputMessagePropertiesContentInspection {
  val matchesBranch1 = element
    .isJsonDecodable<List<InlineComponentsSchemasEasyInputMessagePropertiesContentAnyOf0Items>>() &&
      (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<String>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasEasyInputMessagePropertiesContentInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match String")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
