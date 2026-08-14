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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Branch {
  Branch1,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37) add(InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXe45dd565Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xe6e4af37")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
