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

public enum class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Branch {
  Branch1,
  InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26NoMatchException(
  message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/default_allowed
 * _updates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/default_allowed
 * _updates
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Inspection,
) {
  public val branch1: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfb48cb77>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfb48cb77>>(raw) else null }

  public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e) json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Branch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e) add(InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Branch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26 {
      val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26NoMatchException("InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26(element: JsonElement): InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXfb48cb77>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e = element.isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e>()
  return InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesX819d8f26Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e) add("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xa5f8204e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
