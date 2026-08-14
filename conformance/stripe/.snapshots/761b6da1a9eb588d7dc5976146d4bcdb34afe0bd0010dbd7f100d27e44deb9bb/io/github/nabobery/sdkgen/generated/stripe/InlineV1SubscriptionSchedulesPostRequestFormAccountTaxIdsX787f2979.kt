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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482) add(InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482>()
  return InlineV1SubscriptionSchedulesPostRequestFormAccountTaxIdsX787f2979Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X1f253482")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
