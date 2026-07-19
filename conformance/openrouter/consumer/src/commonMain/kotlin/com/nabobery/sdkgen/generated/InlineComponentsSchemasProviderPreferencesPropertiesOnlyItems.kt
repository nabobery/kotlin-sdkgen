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

public enum class InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsBranch {
  ProviderName,
  Branch2,
}

public sealed class InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsDecodingException(message)

internal data class InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsInspection(
  public val matchesProviderName: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderName, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/only/items.
 */
@Serializable(with = InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems.Serializer::class)
public class InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsInspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json
        .decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsBranch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsBranch
        .ProviderName)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems {
      val inspection = inspectInlineComponentsSchemasProviderPreferencesPropertiesOnlyItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsNoMatchException("InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasProviderPreferencesPropertiesOnlyItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasProviderPreferencesPropertiesOnlyItems(element: JsonElement): InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsInspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineComponentsSchemasProviderPreferencesPropertiesOnlyItemsInspection(
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
