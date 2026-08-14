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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaBranch {
  Branch1,
  InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaNoMatchException(
  message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaDecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/customer_update/properties/allowed_updates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/customer_update/properties/allowed_updates
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaInspection,
) {
  public val branch1:
      List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109>>(raw) else null }

  public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2) json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaBranch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2) add(InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaBranch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba {
      val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaNoMatchException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaaba(element: JsonElement): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemXac643109>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2 = element.isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2>()
  return InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX1c9aaabaInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2 = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2) add("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xb0b8fdf2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
