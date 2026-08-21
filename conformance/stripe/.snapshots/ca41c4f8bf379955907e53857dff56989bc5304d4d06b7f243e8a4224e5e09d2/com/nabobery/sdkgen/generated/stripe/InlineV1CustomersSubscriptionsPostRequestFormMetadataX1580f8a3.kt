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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077:
      InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077) add(InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Branch.InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077>()
  return InlineV1CustomersSubscriptionsPostRequestFormMetadataX1580f8a3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077 = matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077) add("InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077: value does not match InlineV1CustomersSubscriptionsPostRequestFormMetadataAnyOf2X1c3c9077")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
