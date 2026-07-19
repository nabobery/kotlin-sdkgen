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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsBranch {
  ProviderName,
  Branch2,
}

public sealed class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsDecodingException(message)

internal data class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsInspection(
  public val matchesProviderName: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderName, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/ignore/items.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems.Serializer::class)
public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsInspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json
        .decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsBranch>
    get() = buildSet {
      if (inspection
        .matchesProviderName) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsBranch
          .ProviderName)
      if (inspection
        .matchesBranch2) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsBranch
          .Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems {
      val inspection = inspectInlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsNoMatchException("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItems(element: JsonElement): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsInspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesIgnoreItemsInspection(
    matchesProviderName = matchesProviderName,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesProviderName) add("ProviderName: value does not match ProviderName")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
