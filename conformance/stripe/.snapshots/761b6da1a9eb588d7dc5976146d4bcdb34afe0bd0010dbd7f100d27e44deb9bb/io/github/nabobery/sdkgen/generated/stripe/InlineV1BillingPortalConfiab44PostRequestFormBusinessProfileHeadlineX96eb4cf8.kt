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

public enum class InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Branch {
  Branch1,
  InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8NoMatchException(
  message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/business_profile/properties/headline.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/business_profile/properties/headline
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94:
      InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94) json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Branch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94) add(InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Branch.InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8 {
      val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8NoMatchException("InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8(element: JsonElement): InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94 = element.isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94>()
  return InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94 = matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94) add("InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94: value does not match InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X9a287f94")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
