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

public enum class InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cBranch {
  Branch1,
  InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab,
}

public sealed class InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cNoMatchException(
  message: String,
) : InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cDecodingException(message)

internal data class InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab:
      InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab) json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cBranch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab) add(InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cBranch.InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c {
      val inspection = inspectInlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cNoMatchException("InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c(element: JsonElement): InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab = element.isJsonDecodable<InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab>()
  return InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab = matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab) add("InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab: value does not match InlineV1BillingPortalConfigurationsPostRequestFormMetadataAnyOf2X3bb01dab")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
