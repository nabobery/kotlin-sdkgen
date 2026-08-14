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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e:
      InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e) add(InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fBranch.InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e>()
  return InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e = matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e) add("InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e: value does not match InlineV1SubscriptionSchedulesPostRequestFormMetadataAnyOf2X7370dc8e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
