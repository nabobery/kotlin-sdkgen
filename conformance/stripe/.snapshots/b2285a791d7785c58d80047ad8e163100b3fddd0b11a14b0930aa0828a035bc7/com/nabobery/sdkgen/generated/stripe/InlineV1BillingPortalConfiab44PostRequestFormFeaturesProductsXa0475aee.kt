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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeBranch {
  Branch1,
  InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeNoMatchException(
  message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeDecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/products.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/products
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeInspection,
) {
  public val branch1: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3>>(raw) else null }

  public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0) json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeBranch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0) add(InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeBranch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee {
      val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeNoMatchException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee(element: JsonElement): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfa96c7e3>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0 = element.isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0>()
  return InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aeeInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0 = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0) add("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xd05735b0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
