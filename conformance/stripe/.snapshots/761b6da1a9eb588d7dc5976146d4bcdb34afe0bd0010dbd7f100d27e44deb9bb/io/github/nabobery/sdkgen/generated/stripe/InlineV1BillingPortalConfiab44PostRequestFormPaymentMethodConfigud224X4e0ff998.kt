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

public enum class InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Branch {
  Branch1,
  InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998NoMatchException(
  message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/payment_method_update/properties/payment_method_configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/payment_method_update/properties/payment_method_configuration
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff) json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Branch.Branch1)
      if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff) add(InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Branch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998 {
      val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998NoMatchException("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998) {
      encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998(element: JsonElement): InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff = element.isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff>()
  return InlineV1BillingPortalConfiab44PostRequestFormPaymentMethodConfigud224X4e0ff998Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff) add("InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X2dcd45ff")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
