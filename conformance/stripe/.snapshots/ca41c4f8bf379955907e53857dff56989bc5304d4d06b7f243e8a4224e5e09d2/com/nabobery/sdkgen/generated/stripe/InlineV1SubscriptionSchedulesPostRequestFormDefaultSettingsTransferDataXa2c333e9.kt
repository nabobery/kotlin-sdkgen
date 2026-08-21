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

public enum class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Branch {
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Inspection(
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00:
      Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/transfer_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/transfer_data
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Inspection,
) {
  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Inspection {
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1>()
  return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXa2c333e9Inspection(
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X6302bb00")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X0d74d9e1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
