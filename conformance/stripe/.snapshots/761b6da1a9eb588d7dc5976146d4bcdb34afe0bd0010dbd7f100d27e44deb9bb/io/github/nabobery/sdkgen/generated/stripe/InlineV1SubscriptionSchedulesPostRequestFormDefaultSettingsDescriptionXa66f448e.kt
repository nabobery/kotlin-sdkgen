package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/description
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eBranch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448e(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b>()
  return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXa66f448eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X59cadb8b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
