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

public enum class InlineImageGenerationProviderPreferencesOrderItemX83723e2cBranch {
  ProviderName,
  Branch2,
}

public sealed class InlineImageGenerationProviderPreferencesOrderItemX83723e2cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineImageGenerationProviderPreferencesOrderItemX83723e2cNoMatchException(
  message: String,
) : InlineImageGenerationProviderPreferencesOrderItemX83723e2cDecodingException(message)

internal data class InlineImageGenerationProviderPreferencesOrderItemX83723e2cInspection(
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/order/items
 */
@Serializable(with = InlineImageGenerationProviderPreferencesOrderItemX83723e2c.Serializer::class)
public class InlineImageGenerationProviderPreferencesOrderItemX83723e2c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineImageGenerationProviderPreferencesOrderItemX83723e2cInspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json.decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineImageGenerationProviderPreferencesOrderItemX83723e2cBranch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineImageGenerationProviderPreferencesOrderItemX83723e2cBranch.ProviderName)
      if (inspection.matchesBranch2) add(InlineImageGenerationProviderPreferencesOrderItemX83723e2cBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineImageGenerationProviderPreferencesOrderItemX83723e2c {
      val inspection = inspectInlineImageGenerationProviderPreferencesOrderItemX83723e2c(raw)
      if (inspection.matchCount == 0) {
        throw InlineImageGenerationProviderPreferencesOrderItemX83723e2cNoMatchException("InlineImageGenerationProviderPreferencesOrderItemX83723e2c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineImageGenerationProviderPreferencesOrderItemX83723e2c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationProviderPreferencesOrderItemX83723e2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationProviderPreferencesOrderItemX83723e2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationProviderPreferencesOrderItemX83723e2c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationProviderPreferencesOrderItemX83723e2c) {
      encoder.requireJsonEncoder("InlineImageGenerationProviderPreferencesOrderItemX83723e2c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineImageGenerationProviderPreferencesOrderItemX83723e2c(element: JsonElement): InlineImageGenerationProviderPreferencesOrderItemX83723e2cInspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineImageGenerationProviderPreferencesOrderItemX83723e2cInspection(
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
