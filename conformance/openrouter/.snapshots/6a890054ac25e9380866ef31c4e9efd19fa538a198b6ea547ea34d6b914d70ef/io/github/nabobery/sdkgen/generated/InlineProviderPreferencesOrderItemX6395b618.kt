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

public enum class InlineProviderPreferencesOrderItemX6395b618Branch {
  ProviderName,
  Branch2,
}

public sealed class InlineProviderPreferencesOrderItemX6395b618DecodingException(
  message: String,
) : SerializationException(message)

public class InlineProviderPreferencesOrderItemX6395b618NoMatchException(
  message: String,
) : InlineProviderPreferencesOrderItemX6395b618DecodingException(message)

internal data class InlineProviderPreferencesOrderItemX6395b618Inspection(
  public val matchesProviderName: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderName, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/order/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/order/items
 */
@Serializable(with = InlineProviderPreferencesOrderItemX6395b618.Serializer::class)
public class InlineProviderPreferencesOrderItemX6395b618 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineProviderPreferencesOrderItemX6395b618Inspection,
) {
  public val providerName: ProviderName? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderName) json.decodeFromJsonElement<ProviderName>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineProviderPreferencesOrderItemX6395b618Branch>
    get() = buildSet {
      if (inspection.matchesProviderName) add(InlineProviderPreferencesOrderItemX6395b618Branch.ProviderName)
      if (inspection.matchesBranch2) add(InlineProviderPreferencesOrderItemX6395b618Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineProviderPreferencesOrderItemX6395b618 {
      val inspection = inspectInlineProviderPreferencesOrderItemX6395b618(raw)
      if (inspection.matchCount == 0) {
        throw InlineProviderPreferencesOrderItemX6395b618NoMatchException("InlineProviderPreferencesOrderItemX6395b618 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineProviderPreferencesOrderItemX6395b618(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineProviderPreferencesOrderItemX6395b618> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProviderPreferencesOrderItemX6395b618 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProviderPreferencesOrderItemX6395b618")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineProviderPreferencesOrderItemX6395b618) {
      encoder.requireJsonEncoder("InlineProviderPreferencesOrderItemX6395b618").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineProviderPreferencesOrderItemX6395b618(element: JsonElement): InlineProviderPreferencesOrderItemX6395b618Inspection {
  val matchesProviderName = element.isJsonDecodable<ProviderName>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineProviderPreferencesOrderItemX6395b618Inspection(
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
