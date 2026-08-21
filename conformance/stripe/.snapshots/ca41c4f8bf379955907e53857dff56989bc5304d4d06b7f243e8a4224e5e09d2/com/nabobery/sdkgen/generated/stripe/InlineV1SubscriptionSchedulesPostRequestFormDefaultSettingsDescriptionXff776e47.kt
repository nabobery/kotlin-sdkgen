package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/description
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63>()
  return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsDescriptionXff776e47Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X9b95ed63")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
