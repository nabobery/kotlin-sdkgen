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

public enum class InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Branch {
  ProviderName,
  Branch2,
}

public sealed class InlineImageGenerationProviderPreferencesOnlyItemX31f251f7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineImageGenerationProviderPreferencesOnlyItemX31f251f7NoMatchException(
  message: String,
) : InlineImageGenerationProviderPreferencesOnlyItemX31f251f7DecodingException(message)

internal data class InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Inspection(
  public val matchesProviderName: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderName, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/only/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/only/items
 */
@Serializable(with = InlineImageGenerationProviderPreferencesOnlyItemX31f251f7.Serializer::class)
public class InlineImageGenerationProviderPreferencesOnlyItemX31f251f7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Inspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json.decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Branch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Branch.ProviderName)
      if (inspection.matchesBranch2) add(InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineImageGenerationProviderPreferencesOnlyItemX31f251f7 {
      val inspection = inspectInlineImageGenerationProviderPreferencesOnlyItemX31f251f7(raw)
      if (inspection.matchCount == 0) {
        throw InlineImageGenerationProviderPreferencesOnlyItemX31f251f7NoMatchException("InlineImageGenerationProviderPreferencesOnlyItemX31f251f7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineImageGenerationProviderPreferencesOnlyItemX31f251f7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationProviderPreferencesOnlyItemX31f251f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationProviderPreferencesOnlyItemX31f251f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationProviderPreferencesOnlyItemX31f251f7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationProviderPreferencesOnlyItemX31f251f7) {
      encoder.requireJsonEncoder("InlineImageGenerationProviderPreferencesOnlyItemX31f251f7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineImageGenerationProviderPreferencesOnlyItemX31f251f7(element: JsonElement): InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Inspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineImageGenerationProviderPreferencesOnlyItemX31f251f7Inspection(
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
