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

public enum class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsBranch {
  ProviderName,
  Branch2,
}

public sealed class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsDecodingException(message)

internal data class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsInspection(
  public val matchesProviderName: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderName, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/order/items.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems.Serializer::class)
public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsInspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json
        .decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsBranch>
    get() = buildSet {
      if (inspection
        .matchesProviderName) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsBranch
          .ProviderName)
      if (inspection
        .matchesBranch2) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsBranch
          .Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems {
      val inspection = inspectInlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsNoMatchException("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItems(element: JsonElement): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsInspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesOrderItemsInspection(
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
