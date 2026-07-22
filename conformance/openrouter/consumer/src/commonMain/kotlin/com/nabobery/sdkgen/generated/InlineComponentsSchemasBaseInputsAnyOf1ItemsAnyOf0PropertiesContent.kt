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

public enum class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentBranch {
  Branch1,
  Branch2,
}

public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentNoMatchException(
  message: String,
) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentDecodingException(message)

internal data class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/content.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent.Serializer::class)
public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentInspection,
) {
  public val branch1:
      List<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentAnyOf0Items>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<List<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentAnyOf0Items>>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentBranch
        .Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentBranch
        .Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent {
      val inspection = inspectInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentNoMatchException("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent) {
      encoder.requireJsonEncoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContent(element: JsonElement): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentInspection {
  val matchesBranch1 = element
    .isJsonDecodable<List<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentAnyOf0Items>>() &&
      (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesContentInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
