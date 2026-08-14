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

public enum class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/description
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052:
      InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052) add(InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbBranch.InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acb(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052>()
  return InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsDescriptionX89dd4acbInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052 = matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052) add("InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052: value does not match InlineV1CustomersSubscriptionsPostRequestFormInvoiceSettingsAnyOf2X25ebf052")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
