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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Branch {
  Branch1,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/konbini
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b) add(InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsKonbiniX55ca6b41Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X92d4ae2b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
