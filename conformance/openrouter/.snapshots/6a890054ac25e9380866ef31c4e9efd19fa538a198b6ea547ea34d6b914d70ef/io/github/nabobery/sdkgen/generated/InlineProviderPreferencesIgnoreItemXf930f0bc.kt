package io.github.nabobery.sdkgen.generated

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

public enum class InlineProviderPreferencesIgnoreItemXf930f0bcBranch {
  ProviderName,
  Branch2,
}

public sealed class InlineProviderPreferencesIgnoreItemXf930f0bcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineProviderPreferencesIgnoreItemXf930f0bcNoMatchException(
  message: String,
) : InlineProviderPreferencesIgnoreItemXf930f0bcDecodingException(message)

internal data class InlineProviderPreferencesIgnoreItemXf930f0bcInspection(
  public val matchesProviderName: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderName, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/ignore/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/ignore/items
 */
@Serializable(with = InlineProviderPreferencesIgnoreItemXf930f0bc.Serializer::class)
public class InlineProviderPreferencesIgnoreItemXf930f0bc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineProviderPreferencesIgnoreItemXf930f0bcInspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json.decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineProviderPreferencesIgnoreItemXf930f0bcBranch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineProviderPreferencesIgnoreItemXf930f0bcBranch.ProviderName)
      if (inspection.matchesBranch2) add(InlineProviderPreferencesIgnoreItemXf930f0bcBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineProviderPreferencesIgnoreItemXf930f0bc {
      val inspection = inspectInlineProviderPreferencesIgnoreItemXf930f0bc(raw)
      if (inspection.matchCount == 0) {
        throw InlineProviderPreferencesIgnoreItemXf930f0bcNoMatchException("InlineProviderPreferencesIgnoreItemXf930f0bc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineProviderPreferencesIgnoreItemXf930f0bc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineProviderPreferencesIgnoreItemXf930f0bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProviderPreferencesIgnoreItemXf930f0bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProviderPreferencesIgnoreItemXf930f0bc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineProviderPreferencesIgnoreItemXf930f0bc) {
      encoder.requireJsonEncoder("InlineProviderPreferencesIgnoreItemXf930f0bc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineProviderPreferencesIgnoreItemXf930f0bc(element: JsonElement): InlineProviderPreferencesIgnoreItemXf930f0bcInspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineProviderPreferencesIgnoreItemXf930f0bcInspection(
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
