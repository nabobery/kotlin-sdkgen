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

public enum class InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Branch {
  Branch1,
  InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769,
}

public sealed class InlineV1WebhookEndpointsPostRequestFormMetadataXee719122DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1WebhookEndpointsPostRequestFormMetadataXee719122NoMatchException(
  message: String,
) : InlineV1WebhookEndpointsPostRequestFormMetadataXee719122DecodingException(message)

internal data class InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints~1{webhook_endpoint}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormMetadataXee719122.Serializer::class)
public class InlineV1WebhookEndpointsPostRequestFormMetadataXee719122 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769:
      InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769) json.decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769>(raw) else null }

  public val matchedBranches: Set<InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Branch.Branch1)
      if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769) add(InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Branch.InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1WebhookEndpointsPostRequestFormMetadataXee719122 {
      val inspection = inspectInlineV1WebhookEndpointsPostRequestFormMetadataXee719122(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1WebhookEndpointsPostRequestFormMetadataXee719122NoMatchException("InlineV1WebhookEndpointsPostRequestFormMetadataXee719122 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1WebhookEndpointsPostRequestFormMetadataXee719122(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormMetadataXee719122> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormMetadataXee719122 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsPostRequestFormMetadataXee719122")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1WebhookEndpointsPostRequestFormMetadataXee719122) {
      encoder.requireJsonEncoder("InlineV1WebhookEndpointsPostRequestFormMetadataXee719122").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1WebhookEndpointsPostRequestFormMetadataXee719122(element: JsonElement): InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769 = element.isJsonDecodable<InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769>()
  return InlineV1WebhookEndpointsPostRequestFormMetadataXee719122Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769 = matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769) add("InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769: value does not match InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2Xe80cc769")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
