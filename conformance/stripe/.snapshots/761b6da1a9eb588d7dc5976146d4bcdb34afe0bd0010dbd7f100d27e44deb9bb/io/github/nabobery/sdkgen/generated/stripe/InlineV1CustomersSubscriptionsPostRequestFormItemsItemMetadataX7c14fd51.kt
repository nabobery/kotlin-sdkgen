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

public enum class InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/metadata
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Branch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50>()
  return InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50 = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xeb8fdb50")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
