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

public enum class InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cBranch {
  ProviderName,
  Branch2,
}

public sealed class InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cNoMatchException(
  message: String,
) : InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cDecodingException(message)

internal data class InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cInspection(
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/ignore/items
 */
@Serializable(with = InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c.Serializer::class)
public class InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cInspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json.decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cBranch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cBranch.ProviderName)
      if (inspection.matchesBranch2) add(InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c {
      val inspection = inspectInlineImageGenerationProviderPreferencesIgnoreItemX2a95795c(raw)
      if (inspection.matchCount == 0) {
        throw InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cNoMatchException("InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c) {
      encoder.requireJsonEncoder("InlineImageGenerationProviderPreferencesIgnoreItemX2a95795c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineImageGenerationProviderPreferencesIgnoreItemX2a95795c(element: JsonElement): InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cInspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineImageGenerationProviderPreferencesIgnoreItemX2a95795cInspection(
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
