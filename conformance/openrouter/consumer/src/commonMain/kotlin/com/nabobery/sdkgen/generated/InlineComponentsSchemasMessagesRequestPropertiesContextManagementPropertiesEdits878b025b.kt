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

public enum class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bDecodingException(message)

internal data class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/0/properties/clear_tool_inputs.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b
  .Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bInspection,
) {
  public val branch1: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<Boolean>(raw) else null }

  public val branch2: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<String>>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bBranch.Branch1)
      if (inspection
        .matchesBranch2) add(InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bBranch.Branch2)
      if (inspection
        .matchesBranch3) add(InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b {
      val inspection =
        inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025b(element: JsonElement): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bInspection {
  val matchesBranch1 = element.isJsonDecodable<Boolean>()
  val matchesBranch2 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let {
    it <= 2147483647 } == true
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits878b025bInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Boolean")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
