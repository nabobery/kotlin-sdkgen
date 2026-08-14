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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/description
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc4b6a535Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionAnyOf2X917fbfa3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
