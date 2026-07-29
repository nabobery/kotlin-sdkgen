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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbBranch {
  Branch1,
  InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7,
}

public sealed class InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbNoMatchException(
  message: String,
) : InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbDecodingException(message)

internal data class InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7).count { it }
}

/**
 * The name of the configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/name
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7:
      InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7) json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbBranch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7) add(InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbBranch.InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb {
      val inspection = inspectInlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbNoMatchException("InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb(element: JsonElement): InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7 = element.isJsonDecodable<InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7>()
  return InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debbInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7 = matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7) add("InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7: value does not match InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2X4450d7d7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
