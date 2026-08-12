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

public enum class InlineProviderPreferencesOnlyItemX90100337Branch {
  ProviderName,
  Branch2,
}

public sealed class InlineProviderPreferencesOnlyItemX90100337DecodingException(
  message: String,
) : SerializationException(message)

public class InlineProviderPreferencesOnlyItemX90100337NoMatchException(
  message: String,
) : InlineProviderPreferencesOnlyItemX90100337DecodingException(message)

internal data class InlineProviderPreferencesOnlyItemX90100337Inspection(
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/only/items
 */
@Serializable(with = InlineProviderPreferencesOnlyItemX90100337.Serializer::class)
public class InlineProviderPreferencesOnlyItemX90100337 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineProviderPreferencesOnlyItemX90100337Inspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json.decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineProviderPreferencesOnlyItemX90100337Branch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineProviderPreferencesOnlyItemX90100337Branch.ProviderName)
      if (inspection.matchesBranch2) add(InlineProviderPreferencesOnlyItemX90100337Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineProviderPreferencesOnlyItemX90100337 {
      val inspection = inspectInlineProviderPreferencesOnlyItemX90100337(raw)
      if (inspection.matchCount == 0) {
        throw InlineProviderPreferencesOnlyItemX90100337NoMatchException("InlineProviderPreferencesOnlyItemX90100337 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineProviderPreferencesOnlyItemX90100337(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineProviderPreferencesOnlyItemX90100337> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProviderPreferencesOnlyItemX90100337 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProviderPreferencesOnlyItemX90100337")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineProviderPreferencesOnlyItemX90100337) {
      encoder.requireJsonEncoder("InlineProviderPreferencesOnlyItemX90100337").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineProviderPreferencesOnlyItemX90100337(element: JsonElement): InlineProviderPreferencesOnlyItemX90100337Inspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineProviderPreferencesOnlyItemX90100337Inspection(
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
