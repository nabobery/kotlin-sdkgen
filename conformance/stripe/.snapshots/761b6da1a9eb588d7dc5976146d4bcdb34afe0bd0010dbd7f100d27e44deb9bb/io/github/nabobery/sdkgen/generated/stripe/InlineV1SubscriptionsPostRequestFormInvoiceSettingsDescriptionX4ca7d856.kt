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

public enum class InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f,
}

public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/description
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f:
      InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f) add(InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Branch.InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856NoMatchException("InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856(element: JsonElement): InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f>()
  return InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionX4ca7d856Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f = matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f) add("InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f: value does not match InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
