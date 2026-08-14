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

public enum class InlineV1SubscriptionsPostRequestFormMetadataX303ca204Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148,
}

public sealed class InlineV1SubscriptionsPostRequestFormMetadataX303ca204DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormMetadataX303ca204NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormMetadataX303ca204DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormMetadataX303ca204Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/metadata
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormMetadataX303ca204.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormMetadataX303ca204 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormMetadataX303ca204Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148:
      InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormMetadataX303ca204Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormMetadataX303ca204Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148) add(InlineV1SubscriptionsPostRequestFormMetadataX303ca204Branch.InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormMetadataX303ca204 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormMetadataX303ca204(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormMetadataX303ca204NoMatchException("InlineV1SubscriptionsPostRequestFormMetadataX303ca204 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormMetadataX303ca204(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormMetadataX303ca204> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormMetadataX303ca204 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormMetadataX303ca204")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormMetadataX303ca204) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormMetadataX303ca204").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormMetadataX303ca204(element: JsonElement): InlineV1SubscriptionsPostRequestFormMetadataX303ca204Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148>()
  return InlineV1SubscriptionsPostRequestFormMetadataX303ca204Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148 = matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148) add("InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148: value does not match InlineV1SubscriptionsPostRequestFormMetadataAnyOf2X1d1f3148")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
